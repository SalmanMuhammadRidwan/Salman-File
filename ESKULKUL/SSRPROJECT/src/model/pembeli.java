package model;

public class pembeli extends akun{
    private String idPembeli;

    public pembeli setIdPembeli(String idPembeli){
        this.idPembeli = idPembeli;
        return this;
    }
    public String getIdPembeli(){
        return this.idPembeli;
    }
}