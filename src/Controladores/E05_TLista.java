/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.E05_EmpresaM;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Charlie Cordova
 * @version 1.0
 * @created 29-ene.-2024 23:09:58
 */
public class E05_TLista {

    public static List<E05_EmpresaM> ListaMicros = new ArrayList<E05_EmpresaM>();

    public static void Insertar(E05_EmpresaM em) {
        ListaMicros.add(em);
    }

    public static void Editar(E05_EmpresaM em, int pos) {
        ListaMicros.set(pos, em);
    }

    public static void Eliminar(int pos) {
        ListaMicros.remove(pos);
    }

    public static int Buscar(int NumeroTicket) {
        int pos = -1;
        for (int i = 0; i < ListaMicros.size(); i++) {
            if (ListaMicros.get(i).getNumeroTicket() == NumeroTicket) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static E05_EmpresaM getMicros(int pos) {
        return ListaMicros.get(pos);
    }

    public static DefaultTableModel Visualizar() {
        String[] Columnas = {"Numero.Ticket", "Destino", "Clase", "Cantidad.Pasajes", "Total a Pagar"};
        String[] Datos = new String[5];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (int i = 0; i < ListaMicros.size(); i++) {
            Datos[0] = String.valueOf(ListaMicros.get(i).getNumeroTicket());
            Datos[1] = ListaMicros.get(i).getNumeroDestino();
            Datos[2] = ListaMicros.get(i).getNumeroClase();
            Datos[3] = String.valueOf(ListaMicros.get(i).getCantidadP());
            Datos[4] = String.valueOf(ListaMicros.get(i).proced_TotalPasajes());
            dt.addRow(Datos);
        }
        return dt;
    }

    public static void proced_LiteralA() {
        int CPVM = 0, CPVN = 0, CPVC = 0;
        for (int i = 0; i < ListaMicros.size(); i++) {
            if (ListaMicros.get(i).getNumeroDestino().equals("1 Mendoza")) {
                CPVM += ListaMicros.get(i).getCantidadP();
            }
            if (ListaMicros.get(i).getNumeroDestino().equals("2 Neuquen")) {
                CPVN += ListaMicros.get(i).getCantidadP();
            }
            if (ListaMicros.get(i).getNumeroDestino().equals("3 Corrientes")) {
                CPVC += ListaMicros.get(i).getCantidadP();
            }
        }
        JOptionPane.showMessageDialog(null, "Cantidad de pasajes vendidos para cada uno de los destinos" + "\n"
                + "1 Mendoza: " + CPVM + "\n"
                + "2 Neuquen: " + CPVN + "\n"
                + "3 Corrientes: " + CPVC);
    }

    public static void proced_LiteralB() {
        double RTC = 0, RTD = 0;
        for (int i = 0; i < ListaMicros.size(); i++) {
            if (ListaMicros.get(i).getNumeroClase().equals("1 Comun")) {
                RTC += ListaMicros.get(i).proced_TotalPasajes();
            }
            if (ListaMicros.get(i).getNumeroClase().equals("2 Diferencial")) {
                RTD += ListaMicros.get(i).proced_TotalPasajes();
            }
        }
        JOptionPane.showMessageDialog(null, "Recaudación total para las clases común y diferencial" + "\n"
                + "Clase Comun: " + RTC + "$\n"
                + "Clase Diferencial: " + RTD + "$");
    }

    public static int funcion_LiteralC() {
        double MayorImporte = 0;
        int NumueroTMayorImporte = 0;
        for (int i = 0; i < ListaMicros.size(); i++) {
            if (ListaMicros.get(i).proced_TotalPasajes() > MayorImporte) {
                MayorImporte = ListaMicros.get(i).proced_TotalPasajes();
                NumueroTMayorImporte = ListaMicros.get(i).getNumeroTicket();
            }
        }
        return NumueroTMayorImporte;
    }

    public static void proced_LiteralD() {
        int CTPC = 0, CPVD = 0;
        for (int i = 0; i < ListaMicros.size(); i++) {
            if (ListaMicros.get(i).getNumeroClase().equals("1 Comun")) {
                CTPC += ListaMicros.get(i).getCantidadP();
            }
            if (ListaMicros.get(i).getNumeroClase().equals("2 Diferencial")) {
                CPVD += ListaMicros.get(i).getCantidadP();
            }
        }
        JOptionPane.showMessageDialog(null, "Cantidad total de pasajes vendidos en clase común y diferencial" + "\n"
                + "CLASE COMUN: " + CTPC + "\n"
                + "CLASE DIFERENCIAL: " + CPVD);
    }

    public static String funcion_LiteralE() {
        String NumeroDestMayorR = "";
        double DestMayorR = 0;
        double RTM = 0, RTN = 0, RTC = 0;
        for (int i = 0; i < ListaMicros.size(); i++) {
            if (ListaMicros.get(i).getNumeroDestino().equals("1 Mendoza")) {
                RTM += ListaMicros.get(i).proced_TotalPasajes();

            }
            if (ListaMicros.get(i).getNumeroDestino().equals("2 Neuquen")) {
                RTN += ListaMicros.get(i).proced_TotalPasajes();

            }
            if (ListaMicros.get(i).getNumeroDestino().equals("3 Corrientes")) {
                RTC += ListaMicros.get(i).proced_TotalPasajes();

            }
            if (RTM > ListaMicros.get(i).proced_TotalPasajes()) {
                DestMayorR = ListaMicros.get(i).proced_TotalPasajes();
                NumeroDestMayorR = "1 Mendoza";
            }
            if (RTN > ListaMicros.get(i).proced_TotalPasajes()) {
                DestMayorR = ListaMicros.get(i).proced_TotalPasajes();
                NumeroDestMayorR = "2 Neuquen";
            }
            if (RTC > ListaMicros.get(i).proced_TotalPasajes()) {
                DestMayorR = ListaMicros.get(i).proced_TotalPasajes();
                NumeroDestMayorR = "3 Corrientes";
            }
        }
        return NumeroDestMayorR;
    }

    public static void proced_LiteralF() {
        int CPVM = 0, CPVN = 0, CPVC = 0, RTotal = 0, PM = 0, PN = 0, PC = 0;
        for (int i = 0; i < ListaMicros.size(); i++) {
            if (ListaMicros.get(i).getNumeroDestino().equals("1 Mendoza")) {
                CPVM += ListaMicros.get(i).getCantidadP();
            }
            if (ListaMicros.get(i).getNumeroDestino().equals("2 Neuquen")) {
                CPVN += ListaMicros.get(i).getCantidadP();
            }
            if (ListaMicros.get(i).getNumeroDestino().equals("3 Corrientes")) {
                CPVC += ListaMicros.get(i).getCantidadP();
            }
        }
        RTotal = CPVM + CPVN + CPVC;
        PM = (CPVM * 100) / RTotal;
        PN = (CPVN * 100) / RTotal;
        PC = (CPVC * 100) / RTotal;
        JOptionPane.showMessageDialog(null, "PORCENTAJE DE VENTAS POR CADA DESTINO" + "\n"
                + "Porcentaje de Mendoza: " + PM + "%\n"
                + "Porcentaje de Neuquen: " + PN + "%\n"
                + "Porcentaje de Corrientes: " + PC + "%\n");
    }

    public static int funcion_LiteralG() {
        int CPD = 0;
        for (int i = 0; i < ListaMicros.size(); i++) {
            if (ListaMicros.get(i).getNumeroDestino().equals("1 Mendoza")) {
                if (ListaMicros.get(i).getNumeroClase().equals("2 Diferencial")) {
                    CPD++;
                }
            }
        }
        return CPD;
    }
}
