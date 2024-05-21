/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 * @author Charlie Cordova
 * @version 1.0
 * @created 03-feb.-2024 18:17:15
 */
public class E09_RegistroN {
    private int NumeroProvincia;
    private String NumeroPartido;
    private String NumeroLocalidad;
    private int CHM;
    private int CHH;

    public E09_RegistroN() {
    }

    public E09_RegistroN(int NumeroProvincia, String NumeroPartido, String NumeroLocalidad, int CHM, int CHH) {
        this.NumeroProvincia = NumeroProvincia;
        this.NumeroPartido = NumeroPartido;
        this.NumeroLocalidad = NumeroLocalidad;
        this.CHM = CHM;
        this.CHH = CHH;
    }

    public int getNumeroProvincia() {
        return NumeroProvincia;
    }

    public void setNumeroProvincia(int NumeroProvincia) {
        this.NumeroProvincia = NumeroProvincia;
    }

    public String getNumeroPartido() {
        return NumeroPartido;
    }

    public void setNumeroPartido(String NumeroPartido) {
        this.NumeroPartido = NumeroPartido;
    }

    public String getNumeroLocalidad() {
        return NumeroLocalidad;
    }

    public void setNumeroLocalidad(String NumeroLocalidad) {
        this.NumeroLocalidad = NumeroLocalidad;
    }

    public int getCHM() {
        return CHM;
    }

    public void setCHM(int CHM) {
        this.CHM = CHM;
    }

    public int getCHH() {
        return CHH;
    }

    public void setCHH(int CHH) {
        this.CHH = CHH;
    }
    
}
