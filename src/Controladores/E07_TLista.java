/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.E07_Comercio;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Charlie Cordova
 * @version 1.0
 * @created 30-ene.-2024 10:28:01
 */
public class E07_TLista {

    public static List<E07_Comercio> ListaComercio = new ArrayList<E07_Comercio>();

    public static void Insertar(E07_Comercio co) {
        ListaComercio.add(co);
    }

    public static void Editar(E07_Comercio co, int pos) {
        ListaComercio.set(pos, co);
    }

    public static void Eliminar(E07_Comercio co) {
        ListaComercio.remove(co);
    }

    public static int Buscar(int dia) {
        int pos = -1;
        for (int i = 0; i < ListaComercio.size(); i++) {
            if (ListaComercio.get(i).getDia() == dia) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static E07_Comercio getComercio(int pos) {
        return ListaComercio.get(pos);
    }

    public static DefaultTableModel Visualizar() {
        String[] Columnas = {"Dia", "Mes", "Cant.Facturas(Fecha)", "Total de Pesos vendidos (Fecha)", "Importe"};
        String[] Datos = new String[5];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (int i = 0; i < ListaComercio.size(); i++) {
            Datos[0] = String.valueOf(ListaComercio.get(i).getDia());
            Datos[1] = String.valueOf(ListaComercio.get(i).getMes());
            Datos[2] = String.valueOf(ListaComercio.get(i).getCantFactxfecha());
            Datos[3] = String.valueOf(ListaComercio.get(i).getTPVxfecha());
            Datos[4] = String.valueOf(ListaComercio.get(i).proced_Importe());
            dt.addRow(Datos);
        }
        return dt;
    }

    public static void proced_LiteralA() {
        double RE = 0, RF = 0, RM = 0, RA = 0, RMA = 0, RJ = 0, RJU = 0, RAG = 0, RS = 0, RO = 0, RN = 0, RD = 0;
        for (int i = 0; i < ListaComercio.size(); i++) {
            if (ListaComercio.get(i).getMes() == Month.JANUARY) {
                RE += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.FEBRUARY) {
                RF += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.MARCH) {
                RM += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.APRIL) {
                RA += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.MAY) {
                RMA += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.JUNE) {
                RJ += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.JULY) {
                RJU += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.AUGUST) {
                RAG += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.SEPTEMBER) {
                RS += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.OCTOBER) {
                RO += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.NOVEMBER) {
                RN += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.DECEMBER) {
                RD += ListaComercio.get(i).proced_Importe();
            }
        }
        JOptionPane.showMessageDialog(null, "TOTAL RECAUDADO POR CADA MES" + "\n"
                + "Total del mes de Enero: " + RE + "\n"
                + "Total del mes de Febrero: " + RF + "\n"
                + "Total del mes de Marzo: " + RM + "\n"
                + "Total del mes de Abril: " + RA + "\n"
                + "Total del mes de Mayo: " + RMA + "\n"
                + "Total del mes de Junio: " + RJ + "\n"
                + "Total del mes de Julio: " + RJU + "\n"
                + "Total del mes de Agosto: " + RAG + "\n"
                + "Total del mes de Septiembre: " + RS + "\n"
                + "Total del mes de Octubre: " + RO + "\n"
                + "Total del mes de Noviembre: " + RN + "\n"
                + "Total del mes de Diciembre: " + RD + "\n");
    }

    public static void proced_LiteralB() {
        double MVIE = 0, MVIF = 0, MVIM = 0, MVIA = 0, MVIMA = 0, MVIJ = 0, MVIJU = 0, MVIAG = 0, MVISE = 0, MVIOC = 0, MVINO = 0, MVIDI = 0;
        int mvie = 0, mvif = 0, mvim = 0, mvia = 0, mvima = 0, mvij = 0, mviju = 0, mviag = 0, mvise = 0, mvioc = 0, mvino = 0, mvidi = 0;
        for (int i = 0; i < ListaComercio.size(); i++) {
            if (ListaComercio.get(i).getMes() == Month.JANUARY) {
                if (ListaComercio.get(i).proced_Importe() > MVIE) {
                    MVIE = ListaComercio.get(i).proced_Importe();
                    mvie = ListaComercio.get(i).getDia();
                }
            }
        }
        for (int i = 0; i < ListaComercio.size(); i++) {
            if (ListaComercio.get(i).getMes() == Month.FEBRUARY) {
                if (ListaComercio.get(i).proced_Importe() > MVIF) {
                    MVIF = ListaComercio.get(i).proced_Importe();
                    mvif = ListaComercio.get(i).getDia();
                }
            }
        }
        for (int i = 0; i < ListaComercio.size(); i++) {
            if (ListaComercio.get(i).getMes() == Month.MARCH) {
                if (ListaComercio.get(i).proced_Importe() > MVIM) {
                    MVIM = ListaComercio.get(i).proced_Importe();
                    mvim = ListaComercio.get(i).getDia();
                }
            }
        }
        for (int i = 0; i < ListaComercio.size(); i++) {
            if (ListaComercio.get(i).getMes() == Month.APRIL) {
                if (ListaComercio.get(i).proced_Importe() > MVIA) {
                    MVIA = ListaComercio.get(i).proced_Importe();
                    mvia = ListaComercio.get(i).getDia();
                }
            }
        }
        for (int i = 0; i < ListaComercio.size(); i++) {
            if (ListaComercio.get(i).getMes() == Month.MAY) {
                if (ListaComercio.get(i).proced_Importe() > MVIMA) {
                    MVIMA = ListaComercio.get(i).proced_Importe();
                    mvima = ListaComercio.get(i).getDia();
                }
            }
        }
        for (int i = 0; i < ListaComercio.size(); i++) {
            if (ListaComercio.get(i).getMes() == Month.JUNE) {
                if (ListaComercio.get(i).proced_Importe() > MVIJ) {
                    MVIJ = ListaComercio.get(i).proced_Importe();
                    mvij = ListaComercio.get(i).getDia();
                }
            }
        }
        for (int i = 0; i < ListaComercio.size(); i++) {
            if (ListaComercio.get(i).getMes() == Month.JULY) {
                if (ListaComercio.get(i).proced_Importe() > MVIJU) {
                    MVIJU = ListaComercio.get(i).proced_Importe();
                    mviju = ListaComercio.get(i).getDia();
                }
            }
        }
        for (int i = 0; i < ListaComercio.size(); i++) {
            if (ListaComercio.get(i).getMes() == Month.AUGUST) {
                if (ListaComercio.get(i).proced_Importe() > MVIAG) {
                    MVIAG = ListaComercio.get(i).proced_Importe();
                    mviag = ListaComercio.get(i).getDia();
                }
            }
        }
        for (int i = 0; i < ListaComercio.size(); i++) {
            if (ListaComercio.get(i).getMes() == Month.SEPTEMBER) {
                if (ListaComercio.get(i).proced_Importe() > MVISE) {
                    MVISE = ListaComercio.get(i).proced_Importe();
                    mvise = ListaComercio.get(i).getDia();
                }
            }
        }
        for (int i = 0; i < ListaComercio.size(); i++) {
            if (ListaComercio.get(i).getMes() == Month.OCTOBER) {
                if (ListaComercio.get(i).proced_Importe() > MVIOC) {
                    MVIOC = ListaComercio.get(i).proced_Importe();
                    mvioc = ListaComercio.get(i).getDia();
                }
            }
        }
        for (int i = 0; i < ListaComercio.size(); i++) {
            if (ListaComercio.get(i).getMes() == Month.NOVEMBER) {
                if (ListaComercio.get(i).proced_Importe() > MVINO) {
                    MVINO = ListaComercio.get(i).proced_Importe();
                    mvino = ListaComercio.get(i).getDia();
                }
            }
        }
        for (int i = 0; i < ListaComercio.size(); i++) {
            if (ListaComercio.get(i).getMes() == Month.DECEMBER) {
                if (ListaComercio.get(i).proced_Importe() > MVIDI) {
                    MVIDI = ListaComercio.get(i).proced_Importe();
                    mvidi = ListaComercio.get(i).getDia();
                }
            }
        }
        JOptionPane.showMessageDialog(null, "La venta individual de mayor importe de cada mes y en que día fue" + "\n"
                + "Enero: " + MVIE + " ----- " + "Dia: " + mvie + "\n"
                + "Febrero: " + MVIF + " ----- " + "Dia: " + mvif + "\n"
                + "Marzo: " + MVIM + " ----- " + "Dia: " + mvim + "\n"
                + "Abril: " + MVIA + " ----- " + "Dia: " + mvia + "\n"
                + "Mayo: " + MVIMA + " ----- " + "Dia: " + mvima + "\n"
                + "Junio: " + MVIJ + " ----- " + "Dia: " + mvij + "\n"
                + "Julio: " + MVIJU + " ----- " + "Dia: " + mviju + "\n"
                + "Agosto: " + MVIAG + " ----- " + "Dia: " + mviag + "\n"
                + "Septiembre: " + MVISE + " ----- " + "Dia: " + mvise + "\n"
                + "Octubre: " + MVIOC + " ----- " + "Dia: " + mvioc + "\n"
                + "Noviembre: " + MVINO + " ----- " + "Dia: " + mvino + "\n"
                + "Diciembre: " + MVIDI + " ----- " + "Dia: " + mvidi);
    }

    public static int funcion_LiteralC() {
        int CDAFI = 0;
        for (int i = 0; i < ListaComercio.size(); i++) {
            if (ListaComercio.get(i).getCantFactxfecha() < 16) {
                CDAFI++;
            }
        }
        return CDAFI;
    }

    public static double funcion_LiteralD() {
        double TRE = 0, TRF = 0, TRM = 0, TRA = 0, TRMA = 0, TRJ = 0, TRJU = 0, TRAG = 0, TRSE = 0, TROC = 0, TRNO = 0, TRDI = 0;
        double TRAño = 0;
        for (int i = 0; i < ListaComercio.size(); i++) {
            if (ListaComercio.get(i).getMes() == Month.JANUARY) {
                TRE += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.FEBRUARY) {
                TRF += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.MARCH) {
                TRM += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.APRIL) {
                TRA += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.MAY) {
                TRMA += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.JUNE) {
                TRJ += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.JULY) {
                TRJU += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.AUGUST) {
                TRAG += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.SEPTEMBER) {
                TRSE += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.OCTOBER) {
                TROC += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.NOVEMBER) {
                TRNO += ListaComercio.get(i).proced_Importe();
            }
            if (ListaComercio.get(i).getMes() == Month.DECEMBER) {
                TRDI += ListaComercio.get(i).proced_Importe();
            }
        }
        return TRAño = TRE + TRF + TRM + TRA + TRMA + TRJ + TRJU + TRAG + TRSE + TROC + TRNO + TRDI;
    }

}
