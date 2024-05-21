/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 * @author Charlie Cordova
 * @version 1.0
 * @created 29-ene.-2024 21:24:45
 */
public class E04_RestauranteM {
    private int NumeroMozo;
    private String NumeroMesa;
    private double Importe;
    private int CPC;

    public E04_RestauranteM() {
    }

    public E04_RestauranteM(int NumeroMozo, String NumeroMesa, double Importe, int CPC) {
        this.NumeroMozo = NumeroMozo;
        this.NumeroMesa = NumeroMesa;
        this.Importe = Importe;
        this.CPC = CPC;
    }

    public int getNumeroMozo() {
        return NumeroMozo;
    }

    public void setNumeroMozo(int NumeroMozo) {
        this.NumeroMozo = NumeroMozo;
    }

    public String getNumeroMesa() {
        return NumeroMesa;
    }

    public void setNumeroMesa(String NumeroMesa) {
        this.NumeroMesa = NumeroMesa;
    }

    public double getImporte() {
        return Importe;
    }

    public void setImporte(double Importe) {
        this.Importe = Importe;
    }

    public int getCPC() {
        return CPC;
    }

    public void setCPC(int CPC) {
        this.CPC = CPC;
    }
}
