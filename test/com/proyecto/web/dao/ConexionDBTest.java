package com.proyecto.web.dao;

import java.sql.Connection;
import static jdk.nashorn.internal.objects.Global.instance;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.jboss.weld.Container.instance;
import static org.junit.Test;
import static  org.junit.Assert.*;

public class ConexionDBTest {

    private Object result;

    public ConexionDBTest() {
    }

   @Test
    public void testGetConexion() throws Exception {
        System.out.println("getConexion");
        ConexionDB instance = null;
       Connection result = instance.getConexion();
  assertNotNull(result);
    }

    /**
     * Test of desconectar method, of class ConexionDB.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDesconectar() throws Exception {
        System.out.println("desconectar");
        ConexionDB instance = null;
  instance.desconectar();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}
