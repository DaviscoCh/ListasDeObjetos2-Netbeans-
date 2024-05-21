/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.E04_RestauranteM;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Charlie Cordova
 * @version 1.0
 * @created 29-ene.-2024 21:24:45
 */
public class E04_TLista {

    public static List<E04_RestauranteM> ListaMozos = new ArrayList<E04_RestauranteM>();

    public static void Insertar(E04_RestauranteM re) {
        ListaMozos.add(re);
    }

    public static void Editar(E04_RestauranteM re, int pos) {
        ListaMozos.set(pos, re);
    }

    public static void Eliminar(E04_RestauranteM re) {
        ListaMozos.remove(re);
    }

    public static int Buscar(int NumeroMozo) {
        int pos = -1;
        for (int i = 0; i < ListaMozos.size(); i++) {
            if (ListaMozos.get(i).getNumeroMozo() == NumeroMozo) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static E04_RestauranteM getRestaurante(int pos) {
        return ListaMozos.get(pos);
    }

    public static DefaultTableModel Visualizar() {
        String[] Columnas = {"Numero.Mozo", "Numero.Mesa", "Importe", "C.P.C"};
        String[] Datos = new String[4];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (int i = 0; i < ListaMozos.size(); i++) {
            Datos[0] = String.valueOf(ListaMozos.get(i).getNumeroMozo());
            Datos[1] = ListaMozos.get(i).getNumeroMesa();
            Datos[2] = String.valueOf(ListaMozos.get(i).getImporte());
            Datos[3] = String.valueOf(ListaMozos.get(i).getCPC());
            dt.addRow(Datos);
        }
        return dt;
    }

    public static void proced_literalA() {
        int M1 = 0, M2 = 0, M3 = 0;
        for (int i = 0; i < ListaMozos.size(); i++) {
            if (ListaMozos.get(i).getNumeroMozo() == 1) {
                M1 += ListaMozos.get(i).getCPC();
            }
            if (ListaMozos.get(i).getNumeroMozo() == 2) {
                M2 += ListaMozos.get(i).getCPC();
            }
            if (ListaMozos.get(i).getNumeroMozo() == 3) {
                M3 += ListaMozos.get(i).getCPC();
            }
        }
        JOptionPane.showMessageDialog(null, "CANTIDAD DE PERSONAS ATENDIDAS POR LOS TRES MOZOS" + "\n"
                + "Mozo 1: " + M1 + "\n"
                + "Mozo 2 " + M2 + "\n"
                + "Mozo 3: " + M3 + "\n");
    }

    public static void proced_literalB() {
        double RM1 = 0, RM2 = 0, RM3 = 0;
        for (int i = 0; i < ListaMozos.size(); i++) {
            if (ListaMozos.get(i).getNumeroMozo() == 1) {
                RM1 += ListaMozos.get(i).getImporte();
            }
            if (ListaMozos.get(i).getNumeroMozo() == 2) {
                RM2 += ListaMozos.get(i).getImporte();
            }
            if (ListaMozos.get(i).getNumeroMozo() == 3) {
                RM3 += ListaMozos.get(i).getImporte();
            }
        }
        JOptionPane.showMessageDialog(null, "RECAUDACION TOTAL DE LOS TRES MOZOS" + "\n"
                + "Recaudacion Total del Mozo 1: " + RM1 + "$\n"
                + "Recaudacion Total del Mozo 2: " + RM2 + "$\n"
                + "Recaudacion Total del Mozo 3: " + RM3 + "$\n");
    }

    public static String funcion_literalC() {
        double Numero_MesaMIm = 0;
        String Numero_MesaMI = "";
        for (int i = 0; i < ListaMozos.size(); i++) {
            if (ListaMozos.get(i).getImporte() > Numero_MesaMIm) {
                Numero_MesaMIm = ListaMozos.get(i).getImporte();
                Numero_MesaMI = ListaMozos.get(i).getNumeroMesa();
            }
        }
        return Numero_MesaMI;
    }

    public static void proced_LiteralD() {
        int CPC1 = 0, CPC2 = 0, CPC3 = 0;
        for (int i = 0; i < ListaMozos.size(); i++) {
            if (ListaMozos.get(i).getNumeroMesa().equals("Mesa 1")) {
                CPC1 += ListaMozos.get(i).getCPC();
            }
            if (ListaMozos.get(i).getNumeroMesa().equals("Mesa 2")) {
                CPC2 += ListaMozos.get(i).getCPC();
            }
            if (ListaMozos.get(i).getNumeroMesa().equals("Mesa 3")) {
                CPC3 += ListaMozos.get(i).getCPC();
            }
        }
        JOptionPane.showMessageDialog(null, "CANTIDAD DE PEROSNAS QUE COMIERON EN CADA UNA DE LAS TRES MESAS" + "\n"
                + "MESA 1: " + CPC1 + "\n"
                + "MESA 2: " + CPC2 + "\n"
                + "Mesa 3: " + CPC3 + "\n");
    }

    public static int funcion_LiteralE() {
        int MAmenos = Integer.MAX_VALUE;
        int NMAmenos = 0;
        int PAM1 = 0, PAM2 = 0, PAM3 = 0;
        for (int i = 0; i < ListaMozos.size(); i++) {
            if (ListaMozos.get(i).getNumeroMozo() == 1) {
                PAM1 += ListaMozos.get(i).getCPC();
            }
            if (ListaMozos.get(i).getNumeroMozo() == 2) {
                PAM2 += ListaMozos.get(i).getCPC();
            }
            if (ListaMozos.get(i).getNumeroMozo() == 3) {
                PAM3 += ListaMozos.get(i).getCPC();
            }
        }
        if (MAmenos >= PAM1) {
            MAmenos = PAM1;
            NMAmenos = 1;
        }
        if (MAmenos >= PAM2) {
            MAmenos = PAM2;
            NMAmenos = 2;
        }
        if (MAmenos >= PAM3) {
            MAmenos = PAM3;
            NMAmenos = 3;
        }
        return NMAmenos;
    }

    public static void proced_LiteralF() {
        double RM1 = 0, RM2 = 0, RM3 = 0, RTotal = 0;
        double PM1 = 0, PM2 = 0, PM3 = 0;
        for (int i = 0; i < ListaMozos.size(); i++) {
            if (ListaMozos.get(i).getNumeroMozo() == 1) {
                RM1 += ListaMozos.get(i).getImporte();
            }
            if (ListaMozos.get(i).getNumeroMozo() == 2) {
                RM2 += ListaMozos.get(i).getImporte();
            }
            if (ListaMozos.get(i).getNumeroMozo() == 3) {
                RM3 += ListaMozos.get(i).getImporte();
            }
        }
        RTotal = RM1 + RM2 + RM3;
        PM1 = (RM1 * 100) / RTotal;
        PM2 = (RM2 * 100) / RTotal;
        PM3 = (RM3 * 100) / RTotal;
        JOptionPane.showMessageDialog(null, "PORCENTAJE DE RECAUDACION DE CADA UNO DE LOS MOZOS" + "\n"
                + "Porcentaje del Mozo 1: " + PM1 + "%\n"
                + "Porcentaje del Mozo 2: " + PM2 + "%\n"
                + "Porcentaje del Mozo 3: " + PM3 + "%\n");
    }

    public static int funcion_LiteralG() {
        int CC = 0;
        for (int i = 0; i < ListaMozos.size(); i++) {
            if (ListaMozos.get(i).getImporte() < 50) {
                CC++;
            }
        }
        return CC;
    }

}
