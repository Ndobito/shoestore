/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jcuel
 */
public class Cliente {
    private int idCli;
    private String namCli; 
    private String surNameCli; 
    private String dniCli; 
    private String telCli; 
    private String dirCli; 
    private int stateCli;
    
    
    public Cliente(){
        idCli = 0;
        namCli = ""; 
        surNameCli = ""; 
        dniCli = ""; 
        telCli = ""; 
        dirCli = ""; 
        stateCli = 0;
    }

    public Cliente(int idCli, String namCli, String surNameCli, String dniCli, String telCli, String dirCli, int stateCli) {
        this.idCli = idCli;
        this.namCli = namCli;
        this.surNameCli = surNameCli;
        this.dniCli = dniCli;
        this.telCli = telCli;
        this.dirCli = dirCli;
        this.stateCli = stateCli;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNamCli() {
        return namCli;
    }

    public void setNamCli(String namCli) {
        this.namCli = namCli;
    }

    public String getSurNameCli() {
        return surNameCli;
    }

    public void setSurNameCli(String surNameCli) {
        this.surNameCli = surNameCli;
    }

    public String getDniCli() {
        return dniCli;
    }

    public void setDniCli(String dniCli) {
        this.dniCli = dniCli;
    }

    public String getTelCli() {
        return telCli;
    }

    public void setTelCli(String telCli) {
        this.telCli = telCli;
    }

    public String getDirCli() {
        return dirCli;
    }

    public void setDirCli(String dirCli) {
        this.dirCli = dirCli;
    }

    public int getStateCli() {
        return stateCli;
    }

    public void setStateCli(int stateCli) {
        this.stateCli = stateCli;
    }
    
    
    
}
