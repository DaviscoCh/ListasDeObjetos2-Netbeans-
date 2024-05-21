/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 * @author Charlie Cordova
 * @version 1.0
 * @created 29-ene.-2024 23:09:58
 */
public class E05_EmpresaM {

    private int NumeroTicket;
    private String NumeroDestino;
    private String NumeroClase;
    private int CantidadP;

    public E05_EmpresaM() {
    }

    public E05_EmpresaM(int NumeroTicket, String NumeroDestino, String NumeroClase, int CantidadP) {
        this.NumeroTicket = NumeroTicket;
        this.NumeroDestino = NumeroDestino;
        this.NumeroClase = NumeroClase;
        this.CantidadP = CantidadP;
    }

    public int getNumeroTicket() {
        return NumeroTicket;
    }

    public void setNumeroTicket(int NumeroTicket) {
        this.NumeroTicket = NumeroTicket;
    }

    public String getNumeroDestino() {
        return NumeroDestino;
    }

    public void setNumeroDestino(String NumeroDestino) {
        this.NumeroDestino = NumeroDestino;
    }

    public String getNumeroClase() {
        return NumeroClase;
    }

    public void setNumeroClase(String NumeroClase) {
        this.NumeroClase = NumeroClase;
    }

    public int getCantidadP() {
        return CantidadP;
    }

    public void setCantidadP(int CantidadP) {
        this.CantidadP = CantidadP;
    }

    public double proced_TotalPasajes() {
        double Total = 0, ImporteTotal = 0;
        double descuento = 0;
        if (NumeroDestino.equals("1 Mendoza")) {
            if (NumeroClase.equals("1 Comun")) {
                Total = 43 * CantidadP;
            } else if (NumeroClase.equals("2 Diferencial")) {
                Total = 55 * CantidadP;
            }
        } else if (NumeroDestino.equals("2 Neuquen")) {
            if (NumeroClase.equals("1 Comun")) {
                Total = 43 * CantidadP;
            } else if (NumeroClase.equals("2 Diferencial")) {
                Total = 55 * CantidadP;
            }
        } else if (NumeroDestino.equals("3 Corrientes")) {
            if (NumeroClase.equals("1 Comun")) {
                Total = 43 * CantidadP;
            } else if (NumeroClase.equals("2 Diferencial")) {
                Total = 55 * CantidadP;
            }
        }
        if (CantidadP >= 10) {
            descuento = Total * 0.10;
        }
        ImporteTotal = Total - descuento;
        System.out.println(Total);
        System.out.println(descuento);
        return ImporteTotal;
    }
}
