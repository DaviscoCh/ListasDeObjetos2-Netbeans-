/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.E09_RegistroN;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Charlie Cordova
 * @version 1.0
 * @created 03-feb.-2024 18:17:15
 */
public class E09_TLista {

    public static List<E09_RegistroN> ListaRegistro = new ArrayList<E09_RegistroN>();

    public static void Insertar(E09_RegistroN re) {
        ListaRegistro.add(re);
    }

    public static void Editar(E09_RegistroN re, int pos) {
        ListaRegistro.set(pos, re);
    }

    public static void Eliminar(E09_RegistroN re) {
        ListaRegistro.remove(re);
    }

    public static int Buscar(int NumeroProvincia) {
        int pos = -1;
        for (int i = 0; i < ListaRegistro.size(); i++) {
            if (ListaRegistro.get(i).getNumeroProvincia() == NumeroProvincia) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static E09_RegistroN getRegistroN(int pos) {
        return ListaRegistro.get(pos);
    }

    public static DefaultTableModel Visualizar() {
        String[] Columnas = {"Num.Provincia", "Num.Partido", "Num.Localidad", "C.H.M", "C.H.H"};
        String[] Datos = new String[5];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (int i = 0; i < ListaRegistro.size(); i++) {
            Datos[0] = String.valueOf(ListaRegistro.get(i).getNumeroProvincia());
            Datos[1] = ListaRegistro.get(i).getNumeroPartido();
            Datos[2] = ListaRegistro.get(i).getNumeroLocalidad();
            Datos[3] = String.valueOf(ListaRegistro.get(i).getCHM());
            Datos[4] = String.valueOf(ListaRegistro.get(i).getCHH());
            dt.addRow(Datos);
        }
        return dt;
    }

    public static void proced_LiteralA() {
        int NHP1 = 0, NHP_1 = 0, NHP2 = 0, NHP_2 = 0;
        int TotalP1 = 0, TotalP2 = 0;
        int MNHPP = 0, MNHPP2 = 0;
        String MayorNL = "", MayorNL2 = "";
        for (int i = 0; i < ListaRegistro.size(); i++) {
            if (ListaRegistro.get(i).getNumeroPartido().equals("Partido 1")) {
                if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 1")) {
                    NHP1 += ListaRegistro.get(i).getCHH() + ListaRegistro.get(i).getCHM();
                } else if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 2")) {
                    NHP_1 += ListaRegistro.get(i).getCHH() + ListaRegistro.get(i).getCHM();
                }
            }
            TotalP1 = NHP1 + NHP_1;
            if (ListaRegistro.get(i).getNumeroPartido().equals("Partido 2")) {
                if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 1")) {
                    NHP2 += ListaRegistro.get(i).getCHH() + ListaRegistro.get(i).getCHM();
                } else if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 2")) {
                    NHP_2 += ListaRegistro.get(i).getCHH() + ListaRegistro.get(i).getCHM();
                }
            }
            TotalP2 = NHP2 + NHP_2;
        }
        if (NHP1 > MNHPP) {
            MNHPP = NHP1;
            MayorNL = "Localidad 1";
        }
        if (NHP_1 > MNHPP) {
            MNHPP = NHP_1;
            MayorNL = "Localidad 2";
        }
        if (NHP2 > MNHPP2) {
            MNHPP2 = NHP2;
            MayorNL2 = "Localidad 1";
        }
        if (NHP_2 > MNHPP2) {
            MNHPP2 = NHP_2;
            MayorNL2 = "Localidad 2";
        }

        JOptionPane.showMessageDialog(null, "CANTIDAD TOTAL DE HABITANTES POR PARTIDO:" + "\n"
                + "Partido 1: " + TotalP1 + "\n"
                + "Partido 2: " + TotalP2);

        JOptionPane.showMessageDialog(null, "LOCALIDAD DE CADA PARTIDO CON MAYOR CANTIDAD DE HABITANTES" + "\n"
                + "Partido 1: " + MayorNL + "\n"
                + "Partido 2: " + MayorNL2);
    }

    public static void proced_LiteralB() {
        int NHP1 = 0, NHP2 = 0, NHP3 = 0, NHP4 = 0, NHP5 = 0;
        int MNHPP = 0;
        String MayorNP = "";
        for (int i = 0; i < ListaRegistro.size(); i++) {
            if (ListaRegistro.get(i).getNumeroProvincia() == 1) {
                NHP1 += ListaRegistro.get(i).getCHH() + ListaRegistro.get(i).getCHM();
            }
            if (ListaRegistro.get(i).getNumeroProvincia() == 2) {
                NHP2 += ListaRegistro.get(i).getCHH() + ListaRegistro.get(i).getCHM();
            }
            if (ListaRegistro.get(i).getNumeroProvincia() == 3) {
                NHP3 += ListaRegistro.get(i).getCHH() + ListaRegistro.get(i).getCHM();
            }
            if (ListaRegistro.get(i).getNumeroProvincia() == 4) {
                NHP4 += ListaRegistro.get(i).getCHH() + ListaRegistro.get(i).getCHM();
            }
            if (ListaRegistro.get(i).getNumeroProvincia() == 5) {
                NHP5 += ListaRegistro.get(i).getCHH() + ListaRegistro.get(i).getCHM();
            }
        }
        if (NHP1 > MNHPP) {
            MNHPP = NHP1;
            MayorNP = "Provincia 1";
        }
        if (NHP2 > MNHPP) {
            MNHPP = NHP2;
            MayorNP = "Provincia 2";
        }
        if (NHP3 > MNHPP) {
            MNHPP = NHP3;
            MayorNP = "Provincia 3";
        }
        if (NHP4 > MNHPP) {
            MNHPP = NHP4;
            MayorNP = "Provincia 4";
        }
        if (NHP5 > MNHPP) {
            MNHPP = NHP5;
            MayorNP = "Provincia 5";
        }
        JOptionPane.showMessageDialog(null, "El numero de Provincia con mayor cantidad de habitantes es: " + MayorNP);
    }

    public static void proced_LiteralC() {
        int NHP1 = 0, NHP2 = 0, NHP3 = 0, NHP4 = 0, NHP5 = 0;
        int MNHPP = Integer.MAX_VALUE;
        String MenorNP = "";
        for (int i = 0; i < ListaRegistro.size(); i++) {
            if (ListaRegistro.get(i).getNumeroProvincia() == 1) {
                NHP1++;
            }
            if (ListaRegistro.get(i).getNumeroProvincia() == 2) {
                NHP2++;
            }
            if (ListaRegistro.get(i).getNumeroProvincia() == 3) {
                NHP3++;
            }
            if (ListaRegistro.get(i).getNumeroProvincia() == 4) {
                NHP4++;
            }
            if (ListaRegistro.get(i).getNumeroProvincia() == 5) {
                NHP5++;
            }
        }
        if (MNHPP >= NHP1) {
            MNHPP = NHP1;
            MenorNP = "Provincia 1";
        }
        if (MNHPP >= NHP2) {
            MNHPP = NHP2;
            MenorNP = "Provincia 2";
        }
        if (MNHPP >= NHP3) {
            MNHPP = NHP3;
            MenorNP = "Provincia 3";
        }
        if (MNHPP >= NHP4) {
            MNHPP = NHP4;
            MenorNP = "Provincia 4";
        }
        if (MNHPP >= NHP5) {
            MNHPP = NHP5;
            MenorNP = "Provincia 5";
        }
        JOptionPane.showMessageDialog(null, "El numero de Provincia con menor cantidad de localidades censadas es: " + MenorNP);
    }

    public static void proced_LiteralD() {
        int CHMP1P1L1 = 0, CHMP1P1L2 = 0;
        int CHMP1P2L1 = 0, CHMP1P2L2 = 0;
        int CHMP2P1L1 = 0, CHMP2P1L2 = 0;
        int CHMP2P2L1 = 0, CHMP2P2L2 = 0;
        int CHMP3P1L1 = 0, CHMP3P1L2 = 0;
        int CHMP3P2L1 = 0, CHMP3P2L2 = 0;
        int CHMP4P1L1 = 0, CHMP4P1L2 = 0;
        int CHMP4P2L1 = 0, CHMP4P2L2 = 0;
        int CHMP5P1L1 = 0, CHMP5P1L2 = 0;
        int CHMP5P2L1 = 0, CHMP5P2L2 = 0;
        int MCHM = 0;
        String MayorL = "", MayorP = "";
        int MayorPro = 0;
        for (int i = 0; i < ListaRegistro.size(); i++) {
            if (ListaRegistro.get(i).getNumeroProvincia() == 1) {
                if (ListaRegistro.get(i).getNumeroPartido().equals("Partido 1")) {
                    if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 1")) {
                        CHMP1P1L1 += ListaRegistro.get(i).getCHM();
                    } else if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 2")) {
                        CHMP1P1L2 += ListaRegistro.get(i).getCHM();
                    }
                }
                if (ListaRegistro.get(i).getNumeroPartido().equals("Partido 2")) {
                    if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 1")) {
                        CHMP1P2L1 += ListaRegistro.get(i).getCHM();
                    } else if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 2")) {
                        CHMP1P2L2 += ListaRegistro.get(i).getCHM();
                    }
                }
            }
            if (ListaRegistro.get(i).getNumeroProvincia() == 2) {
                if (ListaRegistro.get(i).getNumeroPartido().equals("Partido 1")) {
                    if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 1")) {
                        CHMP2P1L1 += ListaRegistro.get(i).getCHM();
                    } else if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 2")) {
                        CHMP2P1L2 += ListaRegistro.get(i).getCHM();
                    }
                }
                if (ListaRegistro.get(i).getNumeroPartido().equals("Partido 2")) {
                    if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 1")) {
                        CHMP2P2L1 += ListaRegistro.get(i).getCHM();
                    } else if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 2")) {
                        CHMP2P2L2 += ListaRegistro.get(i).getCHM();
                    }
                }
            }
            if (ListaRegistro.get(i).getNumeroProvincia() == 3) {
                if (ListaRegistro.get(i).getNumeroPartido().equals("Partido 1")) {
                    if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 1")) {
                        CHMP3P1L1 += ListaRegistro.get(i).getCHM();
                    } else if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 2")) {
                        CHMP3P1L2 += ListaRegistro.get(i).getCHM();
                    }
                }
                if (ListaRegistro.get(i).getNumeroPartido().equals("Partido 2")) {
                    if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 1")) {
                        CHMP3P2L1 += ListaRegistro.get(i).getCHM();
                    } else if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 2")) {
                        CHMP3P2L2 += ListaRegistro.get(i).getCHM();
                    }
                }
            }
            if (ListaRegistro.get(i).getNumeroProvincia() == 4) {
                if (ListaRegistro.get(i).getNumeroPartido().equals("Partido 1")) {
                    if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 1")) {
                        CHMP4P1L1 += ListaRegistro.get(i).getCHM();
                    } else if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 2")) {
                        CHMP4P1L2 += ListaRegistro.get(i).getCHM();
                    }
                }
                if (ListaRegistro.get(i).getNumeroPartido().equals("Partido 2")) {
                    if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 1")) {
                        CHMP4P2L1 += ListaRegistro.get(i).getCHM();
                    } else if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 2")) {
                        CHMP4P2L2 += ListaRegistro.get(i).getCHM();
                    }
                }
            }
            if (ListaRegistro.get(i).getNumeroProvincia() == 5) {
                if (ListaRegistro.get(i).getNumeroPartido().equals("Partido 1")) {
                    if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 1")) {
                        CHMP5P1L1 += ListaRegistro.get(i).getCHM();
                    } else if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 2")) {
                        CHMP5P1L2 += ListaRegistro.get(i).getCHM();
                    }
                }
                if (ListaRegistro.get(i).getNumeroPartido().equals("Partido 2")) {
                    if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 1")) {
                        CHMP5P2L1 += ListaRegistro.get(i).getCHM();
                    } else if (ListaRegistro.get(i).getNumeroLocalidad().equals("Localidad 2")) {
                        CHMP5P2L2 += ListaRegistro.get(i).getCHM();
                    }
                }
            }
        }
        if (CHMP1P1L1 > MCHM) {
            MCHM = CHMP1P1L1;
            MayorL = "Localidad 1";
            MayorP = "Partido 1";
            MayorPro = 1;
        }
        if (CHMP1P1L2 > MCHM) {
            MCHM = CHMP1P1L2;
            MayorL = "Localidad 2";
            MayorP = "Partido 1";
            MayorPro = 1;
        }
        if (CHMP1P2L1 > MCHM) {
            MCHM = CHMP1P2L1;
            MayorL = "Localidad 1";
            MayorP = "Partido 2";
            MayorPro = 1;
        }
        if (CHMP1P2L2 > MCHM) {
            MCHM = CHMP1P2L2;
            MayorL = "Localidad 2";
            MayorP = "Partido 2";
            MayorPro = 1;
        }

        if (CHMP2P1L1 > MCHM) {
            MCHM = CHMP2P1L1;
            MayorL = "Localidad 1";
            MayorP = "Partido 1";
            MayorPro = 2;
        }
        if (CHMP2P1L2 > MCHM) {
            MCHM = CHMP2P1L2;
            MayorL = "Localidad 2";
            MayorP = "Partido 1";
            MayorPro = 2;
        }
        if (CHMP2P2L1 > MCHM) {
            MCHM = CHMP2P2L1;
            MayorL = "Localidad 1";
            MayorP = "Partido 2";
            MayorPro = 2;
        }
        if (CHMP2P2L2 > MCHM) {
            MCHM = CHMP2P2L2;
            MayorL = "Localidad 2";
            MayorP = "Partido 2";
            MayorPro = 2;
        }

        if (CHMP3P1L1 > MCHM) {
            MCHM = CHMP3P1L1;
            MayorL = "Localidad 1";
            MayorP = "Partido 1";
            MayorPro = 3;
        }
        if (CHMP3P1L2 > MCHM) {
            MCHM = CHMP3P1L2;
            MayorL = "Localidad 2";
            MayorP = "Partido 1";
            MayorPro = 3;
        }
        if (CHMP3P2L1 > MCHM) {
            MCHM = CHMP3P2L1;
            MayorL = "Localidad 1";
            MayorP = "Partido 2";
            MayorPro = 3;
        }
        if (CHMP3P2L2 > MCHM) {
            MCHM = CHMP3P2L2;
            MayorL = "Localidad 2";
            MayorP = "Partido 2";
            MayorPro = 3;
        }

        if (CHMP4P1L1 > MCHM) {
            MCHM = CHMP4P1L1;
            MayorL = "Localidad 1";
            MayorP = "Partido 1";
            MayorPro = 4;
        }
        if (CHMP4P1L2 > MCHM) {
            MCHM = CHMP4P1L2;
            MayorL = "Localidad 2";
            MayorP = "Partido 1";
            MayorPro = 4;
        }
        if (CHMP4P2L1 > MCHM) {
            MCHM = CHMP4P2L1;
            MayorL = "Localidad 1";
            MayorP = "Partido 2";
            MayorPro = 4;
        }
        if (CHMP4P2L2 > MCHM) {
            MCHM = CHMP4P2L2;
            MayorL = "Localidad 2";
            MayorP = "Partido 2";
            MayorPro = 4;
        }

        if (CHMP5P1L1 > MCHM) {
            MCHM = CHMP5P1L1;
            MayorL = "Localidad 1";
            MayorP = "Partido 1";
            MayorPro = 5;
        }
        if (CHMP5P1L2 > MCHM) {
            MCHM = CHMP5P1L2;
            MayorL = "Localidad 2";
            MayorP = "Partido 1";
            MayorPro = 5;
        }
        if (CHMP5P2L1 > MCHM) {
            MCHM = CHMP5P2L1;
            MayorL = "Localidad 1";
            MayorP = "Partido 2";
            MayorPro = 5;
        }
        if (CHMP5P2L2 > MCHM) {
            MCHM = CHMP5P2L2;
            MayorL = "Localidad 2";
            MayorP = "Partido 2";
            MayorPro = 5;
        }

        JOptionPane.showMessageDialog(null, "La Localidad con mayor cantidad de habitantes mujeres es: " + MayorL + "\n"
                + "El partido donde se encuentra dicha localidad es: " + MayorP + "\n"
                + "La provincia en la que se encuentra dicha localida es: " + MayorPro);

    }

}
