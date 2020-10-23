package javaLearn.geeksforgeeks;

//package jwtsample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.UUID;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Base64;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;

import org.jose4j.jws.JsonWebSignature;
import org.jose4j.lang.JoseException;


public class GenJWT
{

	
	

    String mAlgID;
    KeyFactory mKeyFactory;
    PrivateKey mPvtKey;
    PublicKey mPubKey;
    JsonWebSignature mJws;

    public GenJWT( String algId ) throws Exception
    {
        mAlgID = algId;
        mJws = new JsonWebSignature();
        mJws.setAlgorithmHeaderValue( algId );
        
        Security.addProvider( new BouncyCastleProvider() );        
        mKeyFactory = KeyFactory.getInstance( getKeyType(algId), "BC" );
    }

    // Test user:
    /*
     * { "type": "user",
  		 "id": "277134353",
  		 "name": "Tommy P.F. Test",
  		 "login": "AppUser_234162_J7e70FG82D@boxdevedition.com",
  		 "created_at": "2016-05-09T17:56:42-07:00",
		 "modified_at": "2016-05-09T17:56:42-07:00",
		 "language": "en",
		 "timezone": "America/Los_Angeles",
		 "space_amount": 10737418240,
		 "space_used": 0,
		 "max_upload_size": 2147483648,
		 "status": "active",
		 "job_title": "",
		 "phone": "",
		 "address": "",
		 "avatar_url": "https://app.box.com/api/avatar/large/277134353"
	  }
     */
 
    public static void main( String[] ARGV ) throws Exception
    {
    	final String workingDir = "C:/code/box-jwt/";
    	final String pvtKey = workingDir + "boxtest.pipefitters.pvt.key.der";
    	final String pubKey = workingDir + "boxtest.pipefitters.pub.key.der";
    	final String keyId = "nxknxy0l";
    	final String issuer = "ghyu0kurertjstoy8czmqll4h2s571n2";	// Box API Key
    	final String subject = "277134353"; // Enterprise ID "965181"
    	final String boxSubjectType = "user";	// "user" or "enterprise"
    	final String audience = "https://api.box.com/oauth2/token";
    	final String tokenId = UUID.randomUUID().toString();
    	final int issuedAt = (int)( System.currentTimeMillis() / 1000L );
    	final int expiresAt = issuedAt + 59;	// Just shy of 1 minute max for Box
    	KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
    	keyGen.initialize(2048);
    	KeyPair pair = keyGen.generateKeyPair();
    	PrivateKey priv = pair.getPrivate();
    	PublicKey pub = pair.getPublic();
    	final String claimsFormat = "{\"iss\":\"%s\", \"sub\":\"%s\", \"box_sub_type\":\"%s\", \"aud\":\"%s\", \"jti\":\"%s\", \"exp\": %d, \"iat\":%d}";
    	final String claims = String.format( claimsFormat, issuer, subject, boxSubjectType, audience, tokenId, expiresAt, issuedAt );
    	System.out.printf( "Generating box token for claims: %s\n", claims );
    	
    	GenJWT jwtGen = new GenJWT( "RS256" );
    	jwtGen.loadPrivateKey( priv );
    	jwtGen.setKeyID( keyId );
    	jwtGen.setHeaderValue("typ", "JWT");
    	jwtGen.setClaims( claims );
    	
    	String token = jwtGen.generateToken();
    	System.out.printf( "Box token for %s: \n%s\n", subject, token );
    	
    	GenJWT jwtVer = new GenJWT( "RS256" );
    	jwtVer.loadPublicKey( pub );
    	jwtGen.setKeyID( keyId );
    	
    	boolean sigOk = jwtVer.verifyToken( token );
    	String verHeader = jwtVer.getHeader();
    	String verClaims = jwtVer.getClaims();
    	System.out.printf( "Box token %s: %s - %s\n", sigOk, verHeader, verClaims );
    }

	public void loadPrivateKey( PrivateKey mPvtKey ) throws Exception 
    {
       
    	mJws.setKey( mPvtKey );
    }
    
    public void loadPublicKey( PublicKey mPubKey ) throws Exception 
    {
       
    	mJws.setKey( mPubKey );
    }

    public void setHeaderValue( String aHeaderName, String aHeaderValue ) {
    	mJws.setHeader( aHeaderName, aHeaderValue );
    }
    public void setKeyID( String aKeyID ) {
    
    		mJws.setKeyIdHeaderValue( aKeyID );
    	
    }
    

    public String getClaims() throws Exception {
		return mJws.getPayload();
	}
    public void setClaims( String aClaimsJson ) {
        mJws.setPayload( aClaimsJson );
    }

    private String getHeader() {
		return mJws.getHeader();
	}


    public String generateToken() throws Exception {
    	return mJws.getCompactSerialization();
    }

    public boolean verifyToken( String aToken ) throws Exception 
    {
    	mJws.setCompactSerialization( aToken );
    	try {
    		return mJws.verifySignature();
    	}
    	catch ( JoseException ex ) {
    		
    	}
    	return false;
    }

    /**
     * Only RSA keys supported.   
     * Key file must not be password protected.
     * 
     * @param pvtKeyFilePEM
     * @return
     * @throws Exception 
     */
    PrivateKey loadPrivateKeyDER( String pvtKeyFileDER ) throws Exception
    {
    	byte[] der = loadFileBytes( pvtKeyFileDER );
    	return createPrivateKey( der );
    }

    /**
     * Only RSA keys supported.   
     * Key file must not be password protected.
     * 
     * @param pvtKeyFilePEM
     * @return
     * @throws Exception 
     */
    PrivateKey loadPrivateKeyPEM( String pvtKeyFilePEM ) throws Exception
    {
    	PemObject pem = loadPEM( pvtKeyFilePEM );
    	return createPrivateKey( pem.getContent() );
    }

    PrivateKey createPrivateKey( byte[] aKey ) throws Exception
    {
    	PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec( aKey );
    	return mKeyFactory.generatePrivate( keySpec );    	
    }

    /**
     * Only RSA keys supported.   
     * Key file must not be password protected.
     * 
     * @param pvtKeyFileDER
     * @return
     * @throws Exception 
     */
    PublicKey loadPublicKeyDER( String pubKeyFileDER ) throws Exception
    {
    	byte[] der = loadFileBytes( pubKeyFileDER );
    	return createPublicKey( der );
    }

    /**
     * Only RSA keys supported.   
     * Key file must not be password protected.
     * 
     * @param pvtKeyFilePEM
     * @return
     * @throws Exception 
     */
    PublicKey loadPublicKeyPEM( String pubKeyFilePEM, String aAlgID ) throws Exception
    {
    	PemObject pem = loadPEM( pubKeyFilePEM );
    	return createPublicKey( pem.getContent() );
    }
    
    PublicKey createPublicKey( byte[] aKey ) throws Exception
    {
    	X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec( aKey );
    	return mKeyFactory.generatePublic( pubKeySpec );
    }

    /**
     * Only RSA keys supported.
     * @param aAlgID
     * @return	Key type parameter to KeyFactory.getInstance() or throws 
     * @throws UnsupportedOperationException
     */
    static String getKeyType( String aAlgID ) throws UnsupportedOperationException
    {
    	String algId = aAlgID.toUpperCase();
    	if ( !algId.matches("RS[0-9][0-9][0-9]") ) {
    		throw new UnsupportedOperationException( "Only RSA key type supported: " + aAlgID );
    	}
    	return "RSA";
    }
    
    static byte[] loadPEM( String fileName, String prefix, String suffix ) throws IOException 
    {
    	String pem = loadFile( fileName );
    	pem = pem.replace( prefix, "" );
    	pem = pem.replace( suffix, "" );
    	return Base64.decode( pem );
    }
    
    static byte[] loadFileBytes( String fileName ) throws IOException 
    {
    	File inputFile = new File( fileName );
    	int fileSize = (int) inputFile.length();
    	byte[] buffer = new byte[ fileSize ];
    	FileInputStream fis = new FileInputStream( inputFile );
    	int offset = 0, remain = fileSize;
    	while ( remain > 0 ) 
    	{
    		int nRead = fis.read( buffer, offset, remain );
    		if ( nRead <= 0 ) {
    			break;
    		}
    		offset += nRead;
    		remain -= nRead;
    	}
    	fis.close();
    	return buffer;
    }
    
    static String loadFile( String fileName ) throws IOException 
    {
    	BufferedReader reader = new BufferedReader( new FileReader(fileName) );
    	StringBuilder sb = new StringBuilder( 4096 );
    	String line;
    	while ( (line = reader.readLine()) != null ) {
    		sb.append( line ).append("\n");
    	}
    	reader.close();
    	return sb.toString();
    }
    
    // http://www.txedo.me/blog/java-read-rsa-keys-pem-file/
    public static PemObject loadPEM(String filename) throws IOException 
    {
		 PemReader pemReader = new PemReader(new InputStreamReader(new FileInputStream(filename)));
		 try {
			 return pemReader.readPemObject();
		 } 
		 finally {
			 pemReader.close();
		 }
    }    
}
