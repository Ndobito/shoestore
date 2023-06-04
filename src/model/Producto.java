package model;

public class Producto {
    //Atributos 

    private int idprod;
    private String nomprod;
    private int cantprod;
    private double precprod;
    private String desprod;
    private int ivaprod;
    private int stateprod;

    public Producto() {
        this.idprod = 0; 
        this.nomprod = "";
        this.cantprod = 0;
        this.precprod = 0.0;
        this.desprod = "";
        this.ivaprod = 0;
        this.stateprod = 0;
    }

    public Producto(int idprod, String nomprod, int cantprod, double precprod, String desprod, int ivaprod, int stateprod) {
        this.idprod = idprod;
        this.nomprod = nomprod;
        this.cantprod = cantprod;
        this.precprod = precprod;
        this.desprod = desprod;
        this.ivaprod = ivaprod;
        this.stateprod = stateprod;
    }

    public int getIdprod() {
        return idprod;
    }

    public void setIdprod(int idprod) {
        this.idprod = idprod;
    }

    public String getNomprod() {
        return nomprod;
    }

    public void setNomprod(String nomprod) {
        this.nomprod = nomprod;
    }

    public int getCantprod() {
        return cantprod;
    }

    public void setCantprod(int cantprod) {
        this.cantprod = cantprod;
    }

    public double getPrecprod() {
        return precprod;
    }

    public void setPrecprod(double precprod) {
        this.precprod = precprod;
    }

    public String getDesprod() {
        return desprod;
    }

    public void setDesprod(String desprod) {
        this.desprod = desprod;
    }

    public int getIvaprod() {
        return ivaprod;
    }

    public void setIvaprod(int ivaprod) {
        this.ivaprod = ivaprod;
    }

    public int getStateprod() {
        return stateprod;
    }

    public void setStateprod(int stateprod) {
        this.stateprod = stateprod;
    }
    
   
}
