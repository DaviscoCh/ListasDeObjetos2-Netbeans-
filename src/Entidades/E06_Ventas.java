/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 * @author Charlie Cordova
 * @version 1.0
 * @created 30-ene.-2024 10:28:01
 */
public class E06_Ventas {
    private String NumeroPieza;
    private String NombrePieza;
    private int NCS;
    private int CPV;

    public E06_Ventas() {
    }

    public E06_Ventas(String NumeroPieza, String NombrePieza, int NCS, int CPV) {
        this.NumeroPieza = NumeroPieza;
        this.NombrePieza = NombrePieza;
        this.NCS = NCS;
        this.CPV = CPV;
    }

    public String getNumeroPieza() {
        return NumeroPieza;
    }

    public void setNumeroPieza(String NumeroPieza) {
        this.NumeroPieza = NumeroPieza;
    }

    public String getNombrePieza() {
        return NombrePieza;
    }

    public void setNombrePieza(String NombrePieza) {
        this.NombrePieza = NombrePieza;
    }

    public int getNCS() {
        return NCS;
    }

    public void setNCS(int NCS) {
        this.NCS = NCS;
    }

    public int getCPV() {
        return CPV;
    }

    public void setCPV(int CPV) {
        this.CPV = CPV;
    }
}
