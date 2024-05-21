/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 * @author Charlie Cordova
 * @version 1.0
 * @created 31-ene.-2024 15:31:36
 */
public class E08_EmpresaE {
    private int NumeroUsuario;
    private String NumeroZona;
    private char TipoUsuario;
    private int ConsumoKW;

    public E08_EmpresaE() {
    }

    public E08_EmpresaE(int NumeroUsuario, String NumeroZona, char TipoUsuario, int ConsumoKW) {
        this.NumeroUsuario = NumeroUsuario;
        this.NumeroZona = NumeroZona;
        this.TipoUsuario = TipoUsuario;
        this.ConsumoKW = ConsumoKW;
    }

    public int getNumeroUsuario() {
        return NumeroUsuario;
    }

    public void setNumeroUsuario(int NumeroUsuario) {
        this.NumeroUsuario = NumeroUsuario;
    }

    public String getNumeroZona() {
        return NumeroZona;
    }

    public void setNumeroZona(String NumeroZona) {
        this.NumeroZona = NumeroZona;
    }

    public char getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(char TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }

    public int getConsumoKW() {
        return ConsumoKW;
    }

    public void setConsumoKW(int ConsumoKW) {
        this.ConsumoKW = ConsumoKW;
    }
}
