/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan63.gradiengarislurus;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Handphone
 */
public class PBOIF210119056Latihan63GradienGarisLurus {

    public static void main(String[] args) {
        Koordinat koordinat1=new Koordinat(2,10,5,7);
        System.out.println("Garis yang melalui titik" + "(" + koordinat1.getX1() + "," + koordinat1.getY1()+") dan (" + koordinat1.getX2() + "," + koordinat1.getY2()+")");
        System.out.println("memiliki gradient sebesar : "+koordinat1.hitungGradient());
        
        Koordinat koordinat2=new Koordinat(5,1,3,12);
        System.out.println("Garis yang melalui titik" + "(" + koordinat2.getX1() + "," + koordinat2.getY1()+") dan (" + koordinat2.getX2() + "," + koordinat2.getY2()+")");
        System.out.println("memiliki gradient sebesar : "+koordinat2.hitungGradient());
    }
    
}
