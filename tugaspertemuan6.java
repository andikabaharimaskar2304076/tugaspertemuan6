/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan6;

/**
 *
 * @author Acer Nitro 5
 */
public class tugaspertemuan6 {
    
    public static void main(String[] args) {
        
        
        PersegiPanjang objekPersegiPanjang1 = new PersegiPanjang();
        System.out.println("Panjang : " + objekPersegiPanjang1.panjang);
        System.out.println("Lebar : " + objekPersegiPanjang1.lebar);
        System.out.println("Luas : " + objekPersegiPanjang1.getLuas());
        System.out.println("Keliling : " + objekPersegiPanjang1.getKeliling());
        System.out.println("");
        
        PersegiPanjang objekPersegiPanjang2 = new PersegiPanjang(30, 40);
        System.out.println("Panjang : " + objekPersegiPanjang2.panjang);
        System.out.println("Lebar : " + objekPersegiPanjang2.lebar);
        System.out.println("Luas : " + objekPersegiPanjang2.getLuas());
        System.out.println("Keliling : " + objekPersegiPanjang2.getKeliling());
        System.out.println("");
        
        PersegiPanjang objekPersegiPanjang3 = new PersegiPanjang();
        objekPersegiPanjang3.setPanjang(25);
        objekPersegiPanjang3.setLebar(35);
        System.out.println("Panjang : " + objekPersegiPanjang3.panjang);
        System.out.println("Lebar : " + objekPersegiPanjang3.lebar);
        System.out.println("Luas : " + objekPersegiPanjang3.getLuas());
        System.out.println("Keliling : " + objekPersegiPanjang3.getKeliling());
        System.out.println("");
    }
}
