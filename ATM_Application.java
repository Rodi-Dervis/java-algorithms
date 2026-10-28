package com.mycompany.ders;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 300;

        System.out.println("ATM YE HOS GELDINIZ");
        System.out.println("01-BAKIYE SORGULAMA ");
        System.out.println("1-PARA CEKME");
        System.out.println("2-BAKIYE YUKLE");
        System.out.println("4-KART IADESI");
        System.out.println("3 CIKIS YAP");

        String secim = scanner.nextLine();

        if (secim.equals("1")) {
            System.out.print("BAKIYENIZ: " + bakiye);
        } else if (secim.equals("2")) {
            System.out.println("cekmek istediginiz bakiyeyi giriniz");
            int cekmek_istediginiz_bakiye = scanner.nextInt();
            System.out.println("guncel bakiye" + (bakiye - cekmek_istediginiz_bakiye));
        } else if (secim.equals("3")) {
            System.out.println("CIKIS YAPMAK ICIN 3 BASINIZ");
            int CIKIS = scanner.nextInt();
            System.out.println("CIKIS YAPILDI" + CIKIS);
        }
    }
}  
