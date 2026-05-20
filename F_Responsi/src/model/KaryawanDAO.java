/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import config.Connector;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Lab Informatika
 */
public class KaryawanDAO implements KaryawanInterface{
    private Connection connection;
    public KaryawanDAO(){
        connection = Connector.getConnection();
    }
    @Override
    public void insert(Karyawan karyawan){
        String sql = "INSERT INTO employee (nama, divisi, nilai_target, nilai_disiplin, nilai_inovasi, nilai_akhir, status) 
        VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            if (connection != null){
                connection.setAutoCommit(true);
                try (PreparedStatement statement = connection.prepareStatement(sql)){
                    statement.setString(1,karyawan.getName());
                    statement.setString(2,karyawan.getDivisi());
                    statement.setDouble(3,karyawan.getNilai_target());
                    statement.setDouble(4,karyawan.getNilai_disiplin());
                    statement.setDouble(5,karyawan.getNilai_inovasi());
                    statement.setString(6,karyawan.getNilai_akhir());
                    statement.setString(7,karyawan.getStatus());
                    statement.executeUpdate();
                }
            }
        }catch (SQLException e){
            System.err.println("Gagal Insert: " +e.getMessage());
        }
    }
    @Override
    public void update(Karyawan karyawan){
        WHERE nama=? (bukan WHERE name=?) String sql = "Update employee SET divisi=?, nilai_target=?, nilai_disiplin=?, nilai_akhir=?, status=? WHERE nama=?";
        try {
            if (connection != null){
                connection.setAutoCommit(true);
                try (PreparedStatement statement = connection.prepareStatement(sql)){
                    statement.setString(1,karyawan.getDivisi());
                    statement.setDouble(2,karyawan.getNilai_target());
                    statement.setDouble(3,karyawan.getNilai_disiplin());
                    statement.setDouble(4,karyawan.getNilai_inovasi());
                    statement.setString(5,karyawan.getNilai_akhir());
                    statement.setString(6,karyawan.getStatus());
                    statement.setString(7,karyawan.getName());
                    statement.executeUpdate();
                }
            }
        }catch (SQLException e){
            System.err.println("Gagal Insert: " +e.getMessage());
        }
    }
    @Override
    public void delete(String name){
        String sql = "DELETE FROM employee WHERE nama=?";
         try {
            if (connection != null){
                connection.setAutoCommit(true);
                try (PreparedStatement statement = connection.prepareStatement(sql)){
                    statement.setString(1,name);
                    statement.executeUpdate();
                }
            }
            }catch (SQLException e){
            System.err.println("Gagal Delete: " +e.getMessage());
        }
    }
    
    @Override
    public List<Karyawan> getAll(){
    List <Karyawan> list = new ArrayList<>();
    String sql = "SELECT*FROM employee";
    try {
        if (connection !=null)
            try (Statement statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(sql)){
                while (rs.next()){
                    Karyawan kaeryawan = new Karyawan(
                    rs.getString("nama"),
                    rs.getString("divisi"),
                    rs.getDouble("nilai_target"),
                    rs.getDouble("nilai_disiplin"),
                    rs.getDouble("nilai_inovasi"),
                    rs.getDouble("nilai_akhir"),
                    rs.getString("status"),
                    );
                    list.add(karyawan);
                }
            }
        }catch (SQLException e){
            System.err.println("Gagal mengambil data: " +e.getMessage());
        }
    return list;
    }
}
                    
    
    
    
        
                    
        
        
                    
                    
                    
                }
            }
        }
        
    })
    
}
