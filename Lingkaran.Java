/*
 * File : Lingkaran.java  17/05/2023
 * Penulis : Ihsan ALif Lazuardi Anwar (24060121140162)
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
*/

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2 * 3.14 * jejari;
    }
}