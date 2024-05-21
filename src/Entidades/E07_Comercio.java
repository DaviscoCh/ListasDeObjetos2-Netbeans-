/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.Month;


/**
 * @author Charlie Cordova
 * @version 1.0
 * @created 31-ene.-2024 10:50:01
 */
public class E07_Comercio {
    private int dia;
    private Month Mes;
    private int CantFactxfecha;
    private double TPVxfecha;

    public E07_Comercio() {
    }

    public E07_Comercio(int dia, Month Mes, int CantFactxfecha, double TPVxfecha) {
        this.dia = dia;
        this.Mes = Mes;
        this.CantFactxfecha = CantFactxfecha;
        this.TPVxfecha = TPVxfecha;
    }

    public Month getMes() {
        return Mes;
    }

    public void setMes(Month Mes) {
        this.Mes = Mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getCantFactxfecha() {
        return CantFactxfecha;
    }

    public void setCantFactxfecha(int CantFactxfecha) {
        this.CantFactxfecha = CantFactxfecha;
    }

    public double getTPVxfecha() {
        return TPVxfecha;
    }

    public void setTPVxfecha(double TPVxfecha) {
        this.TPVxfecha = TPVxfecha;
    }
    
    public double proced_Importe(){
        return TPVxfecha * 2;
    }
    
}
