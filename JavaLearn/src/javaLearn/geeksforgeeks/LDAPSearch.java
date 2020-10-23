package javaLearn.geeksforgeeks;

public class LDAPSearch {
	public static void main(String args[]) {
		java.util.Hashtable env = new java.util.Hashtable(11);
		env.put(javax.naming.Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(javax.naming.Context.PROVIDER_URL, "");

		env.put(javax.naming.Context.SECURITY_PRINCIPAL, "");
		env.put(javax.naming.Context.SECURITY_CREDENTIALS, "");

		try {
			javax.naming.directory.DirContext ctx = new javax.naming.directory.InitialDirContext(env);
			javax.naming.directory.Attributes attrs = ctx
					.getAttributes("");
			//System.out.println(attrs);
			javax.naming.directory.SearchControls searchControls = new javax.naming.directory.SearchControls();
			searchControls.setReturningAttributes(null);
			searchControls.setSearchScope(javax.naming.directory.SearchControls.SUBTREE_SCOPE);
			searchControls.setReturningObjFlag(true);

			String principalName = "";
			String searchBase = "";
			String[] parts = principalName.split("@");
			String[] parts2 = parts[1].split("\\.");
			for (String s : parts2) {
				searchBase += ",dc=" + s;
			}
			searchBase = searchBase.substring(1);

			javax.naming.NamingEnumeration res = ctx.search(searchBase, "(|(userPrincipalName=)(sAMAccountName=))",
			//javax.naming.NamingEnumeration res = ctx.search(searchBase, "(userPrincipalName=)",
					searchControls);
			javax.naming.directory.SearchResult sr = (javax.naming.directory.SearchResult) res.next();
			System.out.println(sr.getAttributes());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}