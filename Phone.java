/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b01_b04;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Phone {
    int type;
    int choice;
    String e;
    
    Scanner sc = new Scanner(System.in);
    public void nhapLoai() {
        System.out.print("Nhap loai DT(1, 2, 3): ");
        type = sc.nextInt();
        if (type < 1 || type > 3) {
            System.out.println("Xin moi nhap lai!");
            nhapLoai();
        }
    }
    
    public void chon() {
        System.out.println("Chon hanh dong: ");
        System.out.println("1.Xem hang");
        System.out.println("2.Xem mau");
        System.out.println("3.Xem gia");
        
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Hang DT da chon: ");
                if (type == 1){
                    e = "Iphone";
                    System.out.println(e);
                } else if (type == 2) {
                    e = "Samsung";
                    System.out.println(e);
                } else {
                    e = "Oppo";
                    System.out.println(e);
                }
                break;
                
            case 2:
                if (type == 1){
                    System.out.println("Mau co san: Xanh, Do, Den");
                } else if (type == 2) {   
                    System.out.println("Mau co san: Bac, Do, Den");
                } else {
                    System.out.println("Mau co san: Xanh, Do, Xam");
                } 
                break;
                
            case 3:
                if (type == 1){
                    System.out.println("Gia loai " + type + " la: 6,500,000VND");
                } else if (type == 2) {   
                    System.out.println("Gia loai " + type + " la: 3,500,000VND");
                } else {
                    System.out.println("Gia loai " + type + " la: 2,500,000VND");
                } 
                break;
            default:
                throw new AssertionError("Khong thoa man!");
                
        }
    }
    
    
    
    
    public static void main(String[] args) {
        Phone B1 = new Phone();
        B1.nhapLoai();
        B1.chon();
    }
    
}
