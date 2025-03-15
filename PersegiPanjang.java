/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan6;

/**
 *
 * @author Acer Nitro 5
 */
public class PersegiPanjang {
    
    int panjang, lebar;
    
    PersegiPanjang(){
        panjang = 1;
        lebar = 1;
    }
    
    PersegiPanjang(int PanjangBaru, int LebarBaru){
        panjang = PanjangBaru;
        lebar = LebarBaru;
    }
    
    int getLuas(){
        return panjang * lebar;
    }
    
    int getKeliling(){
        return 2 * (panjang + lebar);
    }
    
    void setPanjang(int panjangBaru){
        panjang = panjangBaru;
    }
    
    void setLebar(int lebarBaru){
        lebar = lebarBaru;
    }
}
