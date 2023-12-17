package model;

public class barang {
    private String idBarang;
    private String namaBarang;
    private int hargaBarang;
    private boolean isAvailable;

    public barang setIdBarang(String idBarang){
        this.idBarang = idBarang;
        return this;
    }
    public barang setNamBarang(String namaBarang){
        this.namaBarang = namaBarang;
        return this;
    }
    public barang setHargaBarang(int hargaBarang){
        this.hargaBarang = hargaBarang;
        return this;
    }
    public barang setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
        return this;
    }


    /**
     * @return String return the idBarang
     */
    public String getIdBarang() {
        return idBarang;
    }

    /**
     * @return String return the namaBarang
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * @return int return the hargaBarang
     */
    public int getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @return boolean return the isAvailable
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }
}
