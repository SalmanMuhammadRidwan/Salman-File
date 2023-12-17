package model;

public class detailpenjualan {
    private String iddetailPenjualan;
    private penjualan penjualan;
    private barang barang;
    private int hargaJual;
    private int jumlahBeli;
    private int subTotal;

    
    /**
     * @return String return the idDetilPenjualan
     */
    public String getIdDetilPenjualan() {
        return iddetailPenjualan;
    }

    /**
     * @param idDetilPenjualan the idDetilPenjualan to set
     */
    public void setIdDetilPenjualan(String idDetilPenjualan) {
        this.iddetailPenjualan = idDetilPenjualan;
    }

    /**
     * @return Penjualan return the penjualan
     */
    public penjualan getPenjualan() {
        return penjualan;
    }

    /**
     * @param penjualan the penjualan to set
     */
    public void setPenjualan(penjualan penjualan) {
        this.penjualan = penjualan;
    }

    /**
     * @return Barang return the barang
     */
    public barang getBarang() {
        return barang;
    }

    /**
     * @param barang the barang to set
     */
    public void setBarang(barang barang) {
        this.barang = barang;
    }

    /**
     * @return int return the hargaJual
     */
    public int getHargaJual() {
        return hargaJual;
    }

    /**
     * @param hargaJual the hargaJual to set
     */
    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }

    /**
     * @return int return the jumlahBeli
     */
    public int getJumlahBeli() {
        return jumlahBeli;
    }

    /**
     * @param jumlahBeli the jumlahBeli to set
     */
    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    /**
     * @return int return the subTotal
     */
    public int getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }
}
