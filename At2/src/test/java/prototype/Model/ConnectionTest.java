/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class ConnectionTest {
    /**
     * Test of getServer method, of class Connection.
     */
    @Test
    public void testClone() throws CloneNotSupportedException {
        Connection connection = new Connection("localhost", "lpvDb", "8080", "root", "123", new MysqlDriver("driver.mysql"));

        Connection cloneConnection = connection.clone();
        cloneConnection.setUser("admin");
        cloneConnection.setPort("4200");
        cloneConnection.getMysqlDriver().setName("com.driver.mysql2");

        assertEquals("Connection{server=localhost, database=lpvDb, port=8080, user=root, pass=123, mysqlDriver=MysqlDriver{name=driver.mysql}}", connection.toString());
        assertEquals("Connection{server=localhost, database=lpvDb, port=4200, user=admin, pass=123, mysqlDriver=MysqlDriver{name=com.driver.mysql2}}", cloneConnection.toString());
    }    
}
