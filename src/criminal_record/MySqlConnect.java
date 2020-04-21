/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminal_record;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Aishwarya Waghchoure
 */
public class MySqlConnect {
    static Connection conn=null;
   
    public static Connection ConnectDB(){
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection Success");
        }
        catch(ClassNotFoundException cnfe){
            System.out.println("Connection Fail" + cnfe);
        }
       
            try {
             conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/criminal_record","root","root123");
            System.out.println("Database Connected");
            }
            catch (SQLException se){
                    System.out.println("No Database"+se);
                    }
            return conn;
        }
    }

    

