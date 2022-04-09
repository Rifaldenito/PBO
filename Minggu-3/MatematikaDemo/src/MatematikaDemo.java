/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rifaldenito
 */
class matematika{
    int hasil;

    public void tambah(int a, int b){
        hasil = a + b;
        System.out.println("Pertambahan :" + a + "+" + b + "=" + hasil);
    }
    public void kurang(int a, int b){
        hasil = a - b;
        System.out.println("Pengurangan :" + a + "-" + b + "=" + hasil);
    }
    public void kali(int a, int b){
        hasil = a * b;
        System.out.println("Perkalian   :" + a + "*" + b + "=" + hasil);
    }
    public void bagi(int a, int b){
        hasil = a / b;
        System.out.println("Permbagian  :" + a + "/" + b + "=" + hasil);
    }
}
public class MatematikaDemo {
    public static void main(String[] args){
    matematika mtk = new matematika();
    mtk.tambah(20, 20);
    mtk.kurang(10, 5);
    mtk.kali(10, 20);
    mtk.bagi(20, 2);
    }
}
