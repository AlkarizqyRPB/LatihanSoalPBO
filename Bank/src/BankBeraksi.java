/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alkarizqy
 */

import static java.lang.Integer.parseInt;


public class BankBeraksi {
public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Bank operasi = new Bank();
    System.out.println("Selamat Datang di Bank ABC");
    operasi.getSaldo();
    
    System.out.println("Simpan Uang : Rp. " );
    int input=parseInt(scanner.nextLine());
    operasi.simpanDuit(input);
    
    System.out.println("Ambil Uang : Rp. ");
    input=parseInt(scanner.nextLine());
    operasi.ambilDuit(input);
    
    }
}
