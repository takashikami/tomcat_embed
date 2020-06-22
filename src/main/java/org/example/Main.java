/* -*- tab-width: 4 -*-
   Created on 2020/06/22 by kami
 */
package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(HelloServlet.class.getCanonicalName());

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.setBaseDir("/tmp/tomcatBase");//CATALINA_BASE
        Connector con = tomcat.getConnector();

        Context ctx = tomcat.addContext("/hello", "/tmp/tomcatBase");
        tomcat.addServlet(ctx, "hello", HelloServlet.class.getCanonicalName());
        ctx.addServletMappingDecoded("/Hello", "hello");

        System.out.println(ctx.getCatalinaBase());

        tomcat.start();
        tomcat.getServer().await();
    }
}
