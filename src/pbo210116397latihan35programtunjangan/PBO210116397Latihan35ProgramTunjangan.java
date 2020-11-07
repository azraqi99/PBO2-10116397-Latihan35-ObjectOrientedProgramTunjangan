/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Program Tunjangan
 */
package pbo210116397latihan35programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gaPok;
        String status;

        Scanner in = new Scanner(System.in);
        Tunjangan tun = new Tunjangan();
        System.out.println("====== Program Tunjangan ======");
        System.out.print("Berapa Gaji Pokok Anda Perbulan?\t: " + "Rp.");
        gaPok = in.nextDouble();
        System.out.print("Status Anda?(Menikah/Belum)\t: ");
        status = in.next();
        System.out.println("");

        tun.Tunjangan(gaPok, status);
        System.out.println("(Developed by : Muhammad Azraqi Saputra)");

    }
    
}
