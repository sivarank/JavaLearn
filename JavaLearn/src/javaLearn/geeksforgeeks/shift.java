package javaLearn.geeksforgeeks;

import java.util.Properties;
import java.net.MalformedURLException;
import java.util.Hashtable;
import javax.management.MBeanServerConnection;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import javax.naming.Context;

class shift {
    public static void main(String args[])  {
       int x = -4;
       System.out.println(x>>1);
       System.out.println(x>>>1);   
       int y = 4;
       System.out.println(y>>1);
       System.out.println(y>>>1);
       
       Properties p = System.getProperties();
       p.list(System.out);
       
       MBeanServerConnection connection;
       JMXConnector connector;
       try {
       ObjectName service = new ObjectName("com.bea:Name=DomainRuntimeService,Type=weblogic.management.mbeanservers.domainruntime.DomainRuntimeServiceMBean");
             String protocol = "t3";
             Integer portInteger = Integer.valueOf("7001");
             int port = portInteger.intValue();
             String jndiroot = "/jndi/";
             String mserver = "weblogic.management.mbeanservers.domainruntime";
             JMXServiceURL serviceURL = new JMXServiceURL(protocol, "localhost",
                port, jndiroot + mserver);
             Hashtable h = new Hashtable();
             h.put(Context.SECURITY_PRINCIPAL, "weblogic");
             h.put(Context.SECURITY_CREDENTIALS, "Password~1");
             h.put(JMXConnectorFactory.PROTOCOL_PROVIDER_PACKAGES,
                "weblogic.management.remote");
             connector = JMXConnectorFactory.connect(serviceURL, h);
             connection = connector.getMBeanServerConnection();

       ObjectName[] serverRT = (ObjectName[]) connection.getAttribute(service, "ServerRuntimes");
       System.out.println("got server runtimes");
             int length = (int) serverRT.length;
             for (int i = 0; i < length; i++) {
                String name = (String) connection.getAttribute(serverRT[i],
                   "Name");
                String state = (String) connection.getAttribute(serverRT[i],
                   "State");
                System.out.println("Server name: " + name + ".   Server state: "+ state);
                
                System.out.println("Server CustomIdentityKeyStoreFileName: " + (String) connection.getAttribute(serverRT[i],"CustomIdentityKeyStoreFileName"));
                System.out.println("Server DomainsFile: " + (String) connection.getAttribute(serverRT[i],"DomainsFile"));
                
             }
       }
       catch(Exception ex){
    	   System.out.println(ex.getMessage());
       }
    }    
}
