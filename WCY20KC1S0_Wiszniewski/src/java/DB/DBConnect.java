/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateful;

/**
 *
 * @author student
 */
@Stateful
public class DBConnect {

    public static final String DRIVER = "org.mariadb.jdbc.Driver";
    public static final String JDBC_URL = "jdbc:mariadb://10.103.1.26:3306/studenci_2020";
    private static java.sql.Connection conn = null;

    public static Connection connect(){
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(JDBC_URL, "student", "student-TJEE");
        }catch(ClassNotFoundException | SQLException e){
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, e);
        }
        return conn;
    } 
    
}
