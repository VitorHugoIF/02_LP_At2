/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.Model;

/**
 *
 * @author vitor.marcelino
 */
public class Connection implements Cloneable {
    private String server;
    private String database;
    private String port;
    private String user;
    private String pass;
    private MysqlDriver mysqlDriver;

    public Connection(String server, String database, String port, String user, String pass, MysqlDriver mysqlDriver) {
        this.server = server;
        this.database = database;
        this.port = port;
        this.user = user;
        this.pass = pass;
        this.mysqlDriver = mysqlDriver;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public MysqlDriver getMysqlDriver() {
        return mysqlDriver;
    }

    public void setMysqlDriver(MysqlDriver mysqlDriver) {
        this.mysqlDriver = mysqlDriver;
    }
    
    @Override
    public Connection clone() throws CloneNotSupportedException {
        Connection cloneConnection = (Connection) super.clone();
        cloneConnection.mysqlDriver = (MysqlDriver) cloneConnection.mysqlDriver.clone();
        return cloneConnection;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{server=").append(server);
        sb.append(", database=").append(database);
        sb.append(", port=").append(port);
        sb.append(", user=").append(user);
        sb.append(", pass=").append(pass);
        sb.append(", mysqlDriver=").append(mysqlDriver);
        sb.append('}');
        return sb.toString();
    }
}
