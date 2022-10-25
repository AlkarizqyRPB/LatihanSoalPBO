/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematika operasi = new Matematika();
        operasi.pertambahan(20, 20);
        operasi.pengurangan(10, 5);
        operasi.perkalian(10, 20);
        operasi.pembagian(21, 2);
     System.out.println("---------------");
    MatematikaCanggih p = new MatematikaCanggih();
        p.pertambahan(12.5, 28.7, 14.2);
        p.pertambahan(23, 34);
        p.pertambahan(12, 28, 14);
        //p.pertambahan(3.4, 4.9);
    }
}
