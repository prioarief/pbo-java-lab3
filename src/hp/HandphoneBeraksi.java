/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hp;

/**
 *
 * @author prioariefgunawan
 */
public class HandphoneBeraksi {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Handphone handphone = new Handphone();
        
        handphone.hidupkan();
        handphone.lakukanPanggilan();
        handphone.kirimSMS();
        handphone.matikan();
    }
}
