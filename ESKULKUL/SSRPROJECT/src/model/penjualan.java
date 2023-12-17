package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class penjualan {
    private String idPenjualan;
    private pembeli pembeli;
    private penjual penjual;
    private int total;
    private LocalDate tanggal;
    private ArrayList<detailpenjualan> detilPenjualans;
    
    

    /**
     * @return String return the idPenjualan
     */
    public String getIdPenjualan() {
        return idPenjualan;
    }

    /**
     * @param idPenjualan the idPenjualan to set
     */
    public penjualan setIdPenjualan(String idPenjualan) {
        this.idPenjualan = idPenjualan;
        return this;
    }

    /**
     * @return Pembeli return the pembeli
     */
    public pembeli getPembeli() {
        return pembeli;
    }

    /**
     * @param pembeli the pembeli to set
     */
    public penjualan setPembeli(pembeli pembeli) {
        this.pembeli = pembeli;
        return this;
    }

    /**
     * @return Penjual return the penjual
     */
    public penjual getPenjual() {
        return penjual;
    }

    /**
     * @param penjual the penjual to set
     */
    public penjualan setPenjual(penjual penjual) {
        this.penjual = penjual;
        return this;
    }

    /**
     * @return int return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public penjualan setTotal(int total) {
        this.total = total;
        return this;
    }

    /**
     * @return LocalDate return the tanggal
     */
    public LocalDate getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public penjualan setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
        return this;
    }


    /**
     * @return ArrayList<DetilPenjualan> return the detilPenjualans
     */
    public ArrayList<detailpenjualan> getDetilPenjualans() {
        return detilPenjualans;
    }

    /**
     * @param detilPenjualans the detilPenjualans to set
     */
    public penjualan setDetilPenjualans(ArrayList<detailpenjualan> detilPenjualans) {
        this.detilPenjualans = detilPenjualans;
        return this;
    }

}

