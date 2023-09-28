/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author prioariefgunawan
 */
public class Bank {
    int saldo;
    
    public Bank(int saldo) {
        this.saldo = saldo;
    }
    
    void getSaldo() {
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + this.saldo);
    }
    
    void simpanUang(int saldo) {
        this.saldo += saldo;
        
        System.out.println("Simpan uang: Rp. " + saldo);
        System.out.println("Saldo saat ini: Rp. " + this.saldo);
    }
    
    void ambilUang(int saldo) {
        this.saldo -= saldo;
        
        System.out.println("Ambil uang: Rp. " + saldo);
        System.out.println("Saldo saat ini: Rp. " + this.saldo);
    }
    
}
