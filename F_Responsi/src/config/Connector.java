/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lab Informatika
 */
public class Connector {
    private static final String URL = "jdbc:mysql//localhost:3306/employee_db";
    private static final String USER = "root";
    private static final String PASSWORD ="";
    private static Connection connection;
    
    public static Connection getConnection(){
        if(connection == null){
            try {
                Class.forName("com.mysql,cj.jdbc.Driver");
                connection = DriverManager.getConnection(Connection(URL, USER, PASSWORD);
                System.out.println("Koneksi Gagal: "+ e.get.Message());
                          
            }
        }
        return connection;
    }
    
}
