/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Program Tunjangan
 */
package pbo210116397latihan35programtunjangan;

/**
 *
 * @author Zetro
 */
class Tunjangan {
        public double tunjangan;
        public double totGaji;
        
        public void Tunjangan(Double gaPok, String status) {
        System.out.println("=========Hasil Perhitungan Gaji==========");
        System.out.println("Gaji Pokok\t: Rp. " + gaPok);

        tunjangan = (status.equals("Menikah")) ? 0.35 * gaPok : 0;
        System.out.println("Tunjangan\t: Rp. " + tunjangan);
        
        totGaji = gaPok + tunjangan;
        System.out.println("Total Gaji\t: Rp. " + totGaji);
    }
}
