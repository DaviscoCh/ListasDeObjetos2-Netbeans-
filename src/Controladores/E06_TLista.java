/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.E06_Ventas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Charlie Cordova
 * @version 1.0
 * @created 30-ene.-2024 10:28:01
 */
public class E06_TLista {

    public static List<E06_Ventas> ListaVentas = new ArrayList<E06_Ventas>();

    public static void Insertar(E06_Ventas ve) {
        ListaVentas.add(ve);
    }

    public static void Editar(E06_Ventas ve, int pos) {
        ListaVentas.set(pos, ve);
    }

    public static void Eliminar(E06_Ventas ve) {
        ListaVentas.remove(ve);
    }

    public static int Buscar(String NumeroPieza) {
        int pos = -1;
        for (int i = 0; i < ListaVentas.size(); i++) {
            if (ListaVentas.get(i).getNumeroPieza().equals(NumeroPieza)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static E06_Ventas getVentas(int pos) {
        return ListaVentas.get(pos);
    }

    public static DefaultTableModel Visualizar() {
        String[] Columna = {"Numero de Pieza", "Nombre de Pieza", "NCS", "CPV"};
        String[] Datos = new String[4];
        DefaultTableModel dt = new DefaultTableModel(null, Columna);
        for (int i = 0; i < ListaVentas.size(); i++) {
            Datos[0] = ListaVentas.get(i).getNumeroPieza();
            Datos[1] = ListaVentas.get(i).getNombrePieza();
            Datos[2] = String.valueOf(ListaVentas.get(i).getNCS());
            Datos[3] = String.valueOf(ListaVentas.get(i).getCPV());
            dt.addRow(Datos);
        }
        return dt;
    }

    public static void proced_LiteralA() {
        int CS1 = 0, CS2 = 0, CS3 = 0;
        int PS1 = 0, PS2 = 0, PS3 = 0;
        for (int i = 0; i < ListaVentas.size(); i++) {
            if (ListaVentas.get(i).getNumeroPieza().equals("001")) {
                CS1 += ListaVentas.get(i).getNCS();
                PS1 += ListaVentas.get(i).getCPV();
            }
            if (ListaVentas.get(i).getNumeroPieza().equals("002")) {
                CS2 += ListaVentas.get(i).getNCS();
                PS2 += ListaVentas.get(i).getCPV();
            }
            if (ListaVentas.get(i).getNumeroPieza().equals("003")) {
                CS3 += ListaVentas.get(i).getNCS();
                PS3 += ListaVentas.get(i).getCPV();
            }
            if (ListaVentas.get(i).getNumeroPieza().equals("004")) {
                JOptionPane.showMessageDialog(null, "Disuclpe, del Numero de Pieza 004 en adelante no tenemos");
            }
        }
        JOptionPane.showMessageDialog(null, "Numero de Pieza: 1 " + "\n"
                + "Nombre de la Pieza: " + "1 Algodon" + "\n"
                + "Cuantos clientes la socilitaron: " + CS1 + "\n"
                + "Total de Piezas Vendidas: " + PS1);
        JOptionPane.showMessageDialog(null, "Numero de Pieza: 2 " + "\n"
                + "Nombre de la Pieza: " + "2 Nilon" + "\n"
                + "Cuantos clientes la socilitaron: " + CS2 + "\n"
                + "Total de Piezas Vendidas: " + PS2);
        JOptionPane.showMessageDialog(null, "Numero de Pieza: 3 " + "\n"
                + "Nombre de la Pieza: " + "3 Poliestrer" + "\n"
                + "Cuantos clientes la socilitaron: " + CS3 + "\n"
                + "Total de Piezas Vendidas: " + PS3);
    }

    public static List funcion_LiteralB() {
        List<String> NumeroPiezas = new ArrayList<>();
        for (int i = 0; i < ListaVentas.size(); i++) {
            if (ListaVentas.get(i).getNumeroPieza().equals("001")) {
                if (ListaVentas.get(i).getNCS() > 10) {
                    NumeroPiezas.add(ListaVentas.get(i).getNumeroPieza());
                }
            }
            if (ListaVentas.get(i).getNumeroPieza().equals("002")) {
                if (ListaVentas.get(i).getNCS() > 10) {
                    NumeroPiezas.add(ListaVentas.get(i).getNumeroPieza());
                }
            }
            if (ListaVentas.get(i).getNumeroPieza().equals("003")) {
                if (ListaVentas.get(i).getNCS() > 10) {
                    NumeroPiezas.add(ListaVentas.get(i).getNumeroPieza());
                }
            }
        }
        return NumeroPiezas;
    }

    public static String funcion_LiteralC() {
        int NPS = Integer.MAX_VALUE;
        int NPS1 = 0, NPS2 = 0, NPS3 = 0;
        String NumeroPS = "";
        for (int i = 0; i < ListaVentas.size(); i++) {
            if (ListaVentas.get(i).getNumeroPieza().equals("001")) {
                NPS1 += ListaVentas.get(i).getNCS();
            }
            if (ListaVentas.get(i).getNumeroPieza().equals("002")) {
                NPS2 += ListaVentas.get(i).getNCS();
            }
            if (ListaVentas.get(i).getNumeroPieza().equals("003")) {
                NPS3 += ListaVentas.get(i).getNCS();
            }
        }
        if (NPS >= NPS1) {
            NPS = NPS1;
            NumeroPS = "001";
        }
        if (NPS >= NPS2) {
            NPS = NPS2;
            NumeroPS = "002";
        }
        if (NPS >= NPS3) {
            NPS = NPS3;
            NumeroPS = "003";
        }
        return NumeroPS;
    }

}
