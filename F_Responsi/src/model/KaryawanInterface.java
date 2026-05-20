/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public interface KaryawanInterface {
    public void insert(Karyawan karyawan);
    public void update(Karyawan karyawan);
    public void delete(String name);
    public List<Karyawan>getAll();
}

    
