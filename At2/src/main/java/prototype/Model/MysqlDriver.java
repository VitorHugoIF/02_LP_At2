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
public class MysqlDriver implements Cloneable{
    public String name;

    public MysqlDriver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MysqlDriver{name=").append(name);
        sb.append('}');
        return sb.toString();
    }
}
