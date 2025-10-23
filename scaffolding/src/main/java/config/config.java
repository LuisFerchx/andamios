/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author luixg
 */
public class config {
    
    Connection con = null;
    
    public static Connection connectDB(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:student.sqlite");
            System.out.println("Connection Success");
            return con;
        } catch (Exception e) {
            System.out.println("errorcito diosmio!");
            return null;
        }
    }
    
    public static void main(String[] args) {
        connectDB();
    }
}
