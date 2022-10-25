/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alkarizqy
 */
public class Bank {
    int saldo = 100000;
   public void ambilDuit(int b){
       saldo = saldo - b;
    System.out.println("Saldo saat ini : " + saldo);
            
   }
   public void simpanDuit(int b){
       saldo = saldo + b;
     System.out.println("Saldo saat ini : " + saldo);      
   }
    public void getSaldo(){
    System.out.println("Saldo saat ini : " + saldo);      
   }  
}
