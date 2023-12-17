import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import controller.controltoko;
import model.barang;
import model.pembeli;
import model.penjual;

public class App {
    public static void main(String[] args) throws Exception {
        controltoko controller = new controltoko();
        controller.setUp();
        boolean lanjut = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (lanjut) {
            tampilkanMenu();
            System.out.print("Pilih menu:");
            String pilihan = reader.readLine();
            switch (pilihan) {
                case "1":
                    controller.lihatDaftarBarang();
                    break;
                case "2":
                    controller.belanja();
                    break;
                case "3":
                    controller.tampilkanLaporanPenjualan();
                    break;
                default:
                    lanjut = false;
                    break;
            }
        }

        System.out.println("Sampai Jumpa");

    }

    public static void tampilkanMenu() {
        System.out.println("1. Lihat daftar barang");
        System.out.println("2. Belanja");
        System.out.println("3. Laporan Penjualan");
        System.out.println("4. Keluar");
    }
}
