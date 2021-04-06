//NaoviMagfiroh 20090135

package Searching;

import java.util.Scanner;

public class No2Binary {
    public static void main(String[] args) {
        System.out.println("***** TUGAS PRAKTIKUM 3 *****");
        int B[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int cari;
        int IndeksAwal = 0;
        int IndeksAkhir = B.length - 1;
        int ketemu = 0;
        int point = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan data yang akan dicari:");
        cari = scan.nextInt();
        System.out.println("Isi data adalah:");

        for (int i = 0; i < B.length; i++) {

            System.out.print(B[i] + " ");
        }
        System.out.println("");
        System.out.println("");


        while ((IndeksAwal <= IndeksAkhir) && (ketemu == 0)) {
            point = (IndeksAwal + IndeksAkhir) / 2;
            System.out.println("Indeks pointer : " + point);
            if (cari == B[point]) {
                ketemu = 1;
                System.out.println("Data" +
                        cari + "Telah ditemukan pada indeks ke " + point);
            } else if (cari < B[point]) {
                System.out.println("Cari dari kiri");
                IndeksAkhir = point - 1;
            } else {
                IndeksAwal = point + 1;
                System.out.println("Cari dari kanan");
            }
        }
        if (ketemu == 1)
            System.out.println("Kesimpulan data ditemukan");
        else
            System.out.println("Kesimpulan data tidak ditemukan");

    }
}


