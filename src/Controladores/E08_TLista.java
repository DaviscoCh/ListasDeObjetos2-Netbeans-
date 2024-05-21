/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.E08_EmpresaE;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * @author Charlie Cordova
 * @version 1.0
 * @created 31-ene.-2024 15:31:36
 */
public class E08_TLista {

    public static List<E08_EmpresaE> ListaEmpresa = new ArrayList<E08_EmpresaE>();

    public static void Insertar(E08_EmpresaE em) {
        ListaEmpresa.add(em);
    }

    public static void Editar(E08_EmpresaE em, int pos) {
        ListaEmpresa.set(pos, em);
    }

    public static void Eliminar(E08_EmpresaE em) {
        ListaEmpresa.remove(em);
    }

    public static int Buscar(int NumeroUsuario) {
        int pos = -1;
        for (int i = 0; i < ListaEmpresa.size(); i++) {
            if (ListaEmpresa.get(i).getNumeroUsuario() == NumeroUsuario) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static E08_EmpresaE getEmpresa(int pos) {
        return ListaEmpresa.get(pos);
    }

    public static DefaultTableModel Visualizar() {
        String[] Columnas = {"Num.Usuaurio", "Num.Zona", "Tipo.U", "Consumo KW"};
        String[] Datos = new String[4];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (int i = 0; i < ListaEmpresa.size(); i++) {
            Datos[0] = String.valueOf(ListaEmpresa.get(i).getNumeroUsuario());
            Datos[1] = ListaEmpresa.get(i).getNumeroZona();
            Datos[2] = String.valueOf(ListaEmpresa.get(i).getTipoUsuario());
            Datos[3] = String.valueOf(ListaEmpresa.get(i).getConsumoKW());
            dt.addRow(Datos);
        }
        return dt;
    }

    public static String Funcion_LiteralA() {
        int Z1 = 0, Z2 = 0, Z3 = 0, Z4 = 0, Z5 = 0, Z6 = 0, Z7 = 0, Z8 = 0, Z9 = 0, Z10 = 0;
        int ZonaM = 0;
        String zonaMayor = "";
        for (int i = 0; i < ListaEmpresa.size(); i++) {
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 1")) {
                if (ListaEmpresa.get(i).getTipoUsuario() == 'C') {
                    Z1++;
                }
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 2")) {
                if (ListaEmpresa.get(i).getTipoUsuario() == 'C') {
                    Z2++;
                }
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 3")) {
                if (ListaEmpresa.get(i).getTipoUsuario() == 'C') {
                    Z3++;
                }
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 4")) {
                if (ListaEmpresa.get(i).getTipoUsuario() == 'C') {
                    Z4++;
                }
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 5")) {
                if (ListaEmpresa.get(i).getTipoUsuario() == 'C') {
                    Z5++;
                }
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 6")) {
                if (ListaEmpresa.get(i).getTipoUsuario() == 'C') {
                    Z6++;
                }
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 7")) {
                if (ListaEmpresa.get(i).getTipoUsuario() == 'C') {
                    Z7++;
                }
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 8")) {
                if (ListaEmpresa.get(i).getTipoUsuario() == 'C') {
                    Z8++;
                }
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 9")) {
                if (ListaEmpresa.get(i).getTipoUsuario() == 'C') {
                    Z9++;
                }
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 10")) {
                if (ListaEmpresa.get(i).getTipoUsuario() == 'C') {
                    Z10++;
                }
            }
            if (Z1 > ZonaM) {
                ZonaM = Z1;
                zonaMayor = "Zona 1";
            }
            if (Z2 > ZonaM) {
                ZonaM = Z2;
                zonaMayor = "Zona 2";
            }
            if (Z3 > ZonaM) {
                ZonaM = Z3;
                zonaMayor = "Zona 3";
            }
            if (Z4 > ZonaM) {
                ZonaM = Z4;
                zonaMayor = "Zona 4";
            }
            if (Z5 > ZonaM) {
                ZonaM = Z5;
                zonaMayor = "Zona 5";
            }
            if (Z6 > ZonaM) {
                ZonaM = Z6;
                zonaMayor = "Zona 6";
            }
            if (Z7 > ZonaM) {
                ZonaM = Z7;
                zonaMayor = "Zona 7";
            }
            if (Z8 > ZonaM) {
                ZonaM = Z8;
                zonaMayor = "Zona 8";
            }
            if (Z9 > ZonaM) {
                ZonaM = Z9;
                zonaMayor = "Zona 9";
            }
            if (Z10 > ZonaM) {
                ZonaM = Z10;
                zonaMayor = "Zona 10";
            }
        }
        return zonaMayor;
    }

    public static String Funcion_LiteralB() {
        int CZ1 = 0, CZ2 = 0, CZ3 = 0, CZ4 = 0, CZ5 = 0, CZ6 = 0, CZ7 = 0, CZ8 = 0, CZ9 = 0, CZ10 = 0;
        int ZonaMenor = Integer.MAX_VALUE;
        String zonamenor = "";
        for (int i = 0; i < ListaEmpresa.size(); i++) {
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 1")) {
                CZ1 += ListaEmpresa.get(i).getConsumoKW();
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 2")) {
                CZ2 += ListaEmpresa.get(i).getConsumoKW();
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 3")) {
                CZ3 += ListaEmpresa.get(i).getConsumoKW();
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 4")) {
                CZ4 += ListaEmpresa.get(i).getConsumoKW();
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 5")) {
                CZ5 += ListaEmpresa.get(i).getConsumoKW();
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 6")) {
                CZ6 += ListaEmpresa.get(i).getConsumoKW();
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 7")) {
                CZ7 += ListaEmpresa.get(i).getConsumoKW();
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 8")) {
                CZ8 += ListaEmpresa.get(i).getConsumoKW();
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 9")) {
                CZ9 += ListaEmpresa.get(i).getConsumoKW();
            }
            if (ListaEmpresa.get(i).getNumeroZona().equals("Zona 10")) {
                CZ10 += ListaEmpresa.get(i).getConsumoKW();
            }
        }
        if (ZonaMenor >= CZ1) {
            ZonaMenor = CZ1;
            zonamenor = "Zona 1";
        }
        if (ZonaMenor >= CZ2) {
            ZonaMenor = CZ2;
            zonamenor = "Zona 2";
        }
        if (ZonaMenor >= CZ3) {
            ZonaMenor = CZ3;
            zonamenor = "Zona 3";
        }
        if (ZonaMenor >= CZ4) {
            ZonaMenor = CZ4;
            zonamenor = "Zona 4";
        }
        if (ZonaMenor >= CZ5) {
            ZonaMenor = CZ5;
            zonamenor = "Zona 5";
        }
        if (ZonaMenor >= CZ6) {
            ZonaMenor = CZ6;
            zonamenor = "Zona 6";
        }
        if (ZonaMenor >= CZ7) {
            ZonaMenor = CZ7;
            zonamenor = "Zona 7";
        }
        if (ZonaMenor >= CZ8) {
            ZonaMenor = CZ8;
            zonamenor = "Zona 8";
        }
        if (ZonaMenor >= CZ9) {
            ZonaMenor = CZ9;
            zonamenor = "Zona 9";
        }
        if (ZonaMenor >= CZ10) {
            ZonaMenor = CZ10;
            zonamenor = "Zona 10";
        }
        return zonamenor;
    }

    public static int funcion_LiteralC() {
        int UMCT = 0;
        int UMC = 0;
        for (int i = 0; i < ListaEmpresa.size(); i++) {
            if (ListaEmpresa.get(i).getConsumoKW() > UMCT) {
                UMCT = ListaEmpresa.get(i).getConsumoKW();
                UMC = ListaEmpresa.get(i).getNumeroUsuario();
            }
        }
        return UMC;
    }

}
