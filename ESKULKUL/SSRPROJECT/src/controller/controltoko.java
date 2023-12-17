package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.barang;
import model.detailpenjualan;
import model.pembeli;
import model.penjual;
import model.penjualan;

public class controltoko {
    HashMap<String, barang> barangs = new HashMap();
    ArrayList<penjualan> penjualans = new ArrayList<>();
    HashMap<String, pembeli> pembelis = new HashMap();
    HashMap<String, penjual> penjuals = new HashMap();

    public void setUp() {
        barang barang1 = new barang();
        barang barang2 = new barang();
        barang barang3 = new barang();
        barang barang4 = new barang();
        barang barang5 = new barang();
        barang1
                .setIdBarang("1")
                .setNamBarang("Buah Pisang")
                .setHargaBarang(2000)
                .setIsAvailable(true);
        barang2
                .setIdBarang("2")
                .setNamBarang("Buah Strawberry")
                .setHargaBarang(2500)
                .setIsAvailable(true);
        barang3
                .setIdBarang("3")
                .setNamBarang("Buah Melon")
                .setHargaBarang(3000)
                .setIsAvailable(true);
        barang4
                .setIdBarang("4")
                .setNamBarang("Buah Pepaya")
                .setHargaBarang(2000)
                .setIsAvailable(true);
        barang5
                .setIdBarang("5")
                .setNamBarang("Buah Mangga")
                .setHargaBarang(3000)
                .setIsAvailable(true);

        barangs.put(barang1.getIdBarang(), barang1);
        barangs.put(barang2.getIdBarang(), barang2);
        barangs.put(barang3.getIdBarang(), barang3);
        barangs.put(barang4.getIdBarang(), barang4);
        barangs.put(barang5.getIdBarang(), barang5);

        pembeli pembeli1 = new pembeli();
        pembeli pembeli2 = new pembeli();
        pembeli pembeli3 = new pembeli();
        pembeli1
                .setIdPembeli("1")
                .setName("Salman Muhammad R ")
                .setAlamat("Bogor")
                .setEmail("salman@gmail.com");
        pembeli2
                .setIdPembeli("2")
                .setName("Sarah Nurul Y")
                .setAlamat("Garut")
                .setEmail("sarahnuruly@gmail.com");
        pembeli3
                .setIdPembeli("3")
                .setName("Rizki Maulana")
                .setAlamat("Sukabumi")
                .setEmail("rm.rizki.mauln@gmail.com");
        pembelis.put(pembeli1.getIdPembeli(), pembeli1);
        pembelis.put(pembeli2.getIdPembeli(), pembeli2);
        pembelis.put(pembeli3.getIdPembeli(), pembeli3);

        penjual penjual1 = new penjual();
        penjual penjual2 = new penjual();
        penjual penjual3 = new penjual();

        penjual1
                .setIdPenjual("1")
                .setAlamat("Bandung")
                .setEmail("ridwan@gmail.com")
                .setName("Ridwan");
        penjual2.setIdPenjual("2")
                .setAlamat("Bandung")
                .setEmail("sarah@gmail.com")
                .setName("Sarah");
        penjual3.setIdPenjual("3")
                .setAlamat("Bandung")
                .setEmail("mauln@gmail.com")
                .setName("Maul");
        penjuals.put(penjual1.getIdPenjual(), penjual1);
        penjuals.put(penjual2.getIdPenjual(), penjual2);
        penjuals.put(penjual3.getIdPenjual(), penjual3);
    }

    public void lihatDaftarBarang() {
        System.out.println();
        System.out.println("==== Daftar Barang ====");
        for (Map.Entry<String, barang> barang : barangs.entrySet()) {
            String key = barang.getKey();
            barang tBarang = barang.getValue();
            if (tBarang.isIsAvailable()) {
                System.out.println("Kode Barang \t :" + key);
                System.out.println("Nama \t\t :" + tBarang.getNamaBarang());
                System.out.println("Harga \t\t :" + tBarang.getHargaBarang());
                System.out.println();
            }

        }
    }

    public barang getBarang(String idBarang) {
        return barangs.get(idBarang);
    }

    public penjual getPenjual(String idPenjual) {
        return penjuals.get(idPenjual);
    }

    public pembeli getPembeli(String idPembeli) {
        return pembelis.get(idPembeli);
    }

    public void belanja() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<detailpenjualan> tDetilPenjualans = new ArrayList<>();
        int increment = 0;
        String lanjut = "";
        try {
            do {
                increment++;
                System.out.println();
                System.out.print("Silahkan masukkan kode barang\t: ");
                String kodeBarang = input.readLine();
                System.out.print("Jumlah yang akan dibeli\t: ");
                int jumlah = Integer.valueOf(input.readLine());
                System.out.print("Kembali berbelanja (Y/N)?\t: ");
                lanjut = input.readLine();

                detailpenjualan dp = new detailpenjualan();
                barang tBarang = getBarang(kodeBarang);
                dp.setIdDetilPenjualan("dp" + increment);
                dp.setBarang(tBarang);
                dp.setHargaJual(tBarang.getHargaBarang());
                dp.setJumlahBeli(jumlah);
                dp.setSubTotal(tBarang.getHargaBarang() * jumlah);
                tDetilPenjualans.add(dp);

            } while (lanjut.equalsIgnoreCase("Y"));

            System.out.println("");
            System.out.println("===Berikut Daftar Belanjaan Anda===");
            tampilkanDaftarBelanjaan(tDetilPenjualans);
            System.out.println("TOTAL: " + hitungTotalBelanja(tDetilPenjualans));
            BufferedReader inputKonfirmasi = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Konfirmasi pembelian (Y/N)?");
            String konfirm = "n";
            konfirm = inputKonfirmasi.readLine();
            if (konfirm.equalsIgnoreCase("y")) {
                penjualan penjualan = new penjualan();
                penjualan.setDetilPenjualans(tDetilPenjualans)
                        .setIdPenjualan("P" + penjualans.size() + 1)
                        .setPembeli(getPembeli("01"))
                        .setPenjual(getPenjual("02"))
                        .setTanggal(LocalDate.now())
                        .setTotal(hitungTotalBelanja(tDetilPenjualans));
                penjualans.add(penjualan);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void tampilkanDaftarBelanjaan(ArrayList<detailpenjualan> dp) {
        for (detailpenjualan detilPenjualan : dp) {
            System.out.println("Nama Barang \t :" + detilPenjualan.getBarang().getNamaBarang());
            System.out.println("Harga \t :" + detilPenjualan.getHargaJual());
            System.out.println("Jumlah \t :" + detilPenjualan.getJumlahBeli());
            System.out.println("");
        }
    }

    public int hitungTotalBelanja(ArrayList<detailpenjualan> dp) {
        int total = 0;
        for (detailpenjualan detilPenjualan : dp) {
            total += detilPenjualan.getSubTotal();
        }
        return total;
    }

    public void tampilkanLaporanPenjualan() {
        for (penjualan penjualan : penjualans) {
            System.err.println();
            System.out.println("Kode Penjualan \t :" + penjualan.getIdPenjualan());
            System.out.println("Tanggal transaksi \t :" + penjualan.getTanggal());
            System.out.println("Penjual \t \t : " + penjualan.getPenjual().getNama());
            System.out.println("Pembeli \t \t : " + penjualan.getPembeli().getNama());
            System.out.println("=========================");
            ArrayList<detailpenjualan> detilPenjualans = penjualan.getDetilPenjualans();
            for (detailpenjualan dp : detilPenjualans) {
                System.out.println("Nama barang \t \t : " + dp.getBarang().getNamaBarang());
                System.out.println("Jumlah beli \t \t : " + dp.getJumlahBeli());
                System.out.println("Subtotal \t \t : " + dp.getSubTotal());
            }
            System.out.println("=========================");
            System.out.println("Total \t \t : " + penjualan.getTotal());
        }
    }

}
