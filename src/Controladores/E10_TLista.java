/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.E10_EncomiendasC;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Charlie Cordova
 * @version 1.0
 * @created 04-feb.-2024 09:09:47
 */
public class E10_TLista {

    public static List<E10_EncomiendasC> ListaEncomiendas = new ArrayList<E10_EncomiendasC>();

    public static void Insertar(E10_EncomiendasC en) {
        ListaEncomiendas.add(en);
    }

    public static void Editar(E10_EncomiendasC ec, int pos) {
        ListaEncomiendas.set(pos, ec);
    }

    public static void Eliminar(E10_EncomiendasC en) {
        ListaEncomiendas.remove(en);
    }

    public static int Buscar(int NumeroCamion) {
        int pos = -1;
        for (int i = 0; i < ListaEncomiendas.size(); i++) {
            if (ListaEncomiendas.get(i).getNumeroCamion() == NumeroCamion) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static E10_EncomiendasC getEncomiendas(int pos) {
        return ListaEncomiendas.get(pos);
    }

    public static DefaultTableModel Visualizar() {
        String[] Columnas = {"Num.Camion", "Encomienda1", "Encomienda2", "Encomienda3", "Encomienda4", "Encomienda5"};
        String[] Datos = new String[6];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (int i = 0; i < ListaEncomiendas.size(); i++) {
            Datos[0] = String.valueOf(ListaEncomiendas.get(i).getNumeroCamion());
            Datos[1] = String.valueOf(ListaEncomiendas.get(i).getEncomienda1());
            Datos[2] = String.valueOf(ListaEncomiendas.get(i).getEncomienda2());
            Datos[3] = String.valueOf(ListaEncomiendas.get(i).getEncomienda3());
            Datos[4] = String.valueOf(ListaEncomiendas.get(i).getEncomienda4());
            Datos[5] = String.valueOf(ListaEncomiendas.get(i).getEncomienda5());
            dt.addRow(Datos);
        }
        return dt;
    }

    public static void proced_LiteralA() {
        int PesoC1 = 0, PesoC2 = 0, PesoC3 = 0, PesoC4 = 0, PesoC5 = 0;
        for (int i = 0; i < ListaEncomiendas.size(); i++) {
            if (ListaEncomiendas.get(i).getNumeroCamion() == 1) {
                PesoC1 = ListaEncomiendas.get(i).getEncomienda1() + ListaEncomiendas.get(i).getEncomienda2() + ListaEncomiendas.get(i).getEncomienda3() + ListaEncomiendas.get(i).getEncomienda4() + ListaEncomiendas.get(i).getEncomienda5();
            }
            if (ListaEncomiendas.get(i).getNumeroCamion() == 2) {
                PesoC2 = ListaEncomiendas.get(i).getEncomienda1() + ListaEncomiendas.get(i).getEncomienda2() + ListaEncomiendas.get(i).getEncomienda3() + ListaEncomiendas.get(i).getEncomienda4() + ListaEncomiendas.get(i).getEncomienda5();
            }
            if (ListaEncomiendas.get(i).getNumeroCamion() == 3) {
                PesoC3 = ListaEncomiendas.get(i).getEncomienda1() + ListaEncomiendas.get(i).getEncomienda2() + ListaEncomiendas.get(i).getEncomienda3() + ListaEncomiendas.get(i).getEncomienda4() + ListaEncomiendas.get(i).getEncomienda5();
            }
            if (ListaEncomiendas.get(i).getNumeroCamion() == 4) {
                PesoC4 = ListaEncomiendas.get(i).getEncomienda1() + ListaEncomiendas.get(i).getEncomienda2() + ListaEncomiendas.get(i).getEncomienda3() + ListaEncomiendas.get(i).getEncomienda4() + ListaEncomiendas.get(i).getEncomienda5();
            }
            if (ListaEncomiendas.get(i).getNumeroCamion() == 5) {
                PesoC5 = ListaEncomiendas.get(i).getEncomienda1() + ListaEncomiendas.get(i).getEncomienda2() + ListaEncomiendas.get(i).getEncomienda3() + ListaEncomiendas.get(i).getEncomienda4() + ListaEncomiendas.get(i).getEncomienda5();
            }
        }
        if (PesoC1 > 200) {
            JOptionPane.showMessageDialog(null, "PRECAUACION,EL PESO DE SUS ENCOMIENDAS A EXCEDIDO LA CAPACIDAD DEL CAMION 1. REORGANIZE EL PESO");
        }
        if (PesoC2 > 200) {
            JOptionPane.showMessageDialog(null, "PRECAUACION,EL PESO DE SUS ENCOMIENDAS A EXCEDIDO LA CAPACIDAD DEL CAMION 2. REORGANIZE EL PESO");
        }
        if (PesoC3 > 200) {
            JOptionPane.showMessageDialog(null, "PRECAUACION,EL PESO DE SUS ENCOMIENDAS A EXCEDIDO LA CAPACIDAD DEL CAMION 3. REORGANIZE EL PESO");
        }
        if (PesoC4 > 200) {
            JOptionPane.showMessageDialog(null, "PRECAUACION,EL PESO DE SUS ENCOMIENDAS A EXCEDIDO LA CAPACIDAD DEL CAMION 4. REORGANIZE EL PESO");
        }
        if (PesoC5 > 200) {
            JOptionPane.showMessageDialog(null, "PRECAUACION,EL PESO DE SUS ENCOMIENDAS A EXCEDIDO LA CAPACIDAD DEL CAMION 5. REORGANIZE EL PESO");
        }
        JOptionPane.showMessageDialog(null, "NUMERO DE CAMION Y EL PESO TOTAL DE SUS ENCOMIENDAS" + "\n"
                + "Camion 1: " + PesoC1 + "\n"
                + "Camion 2: " + PesoC2 + "\n"
                + "Camion 3: " + PesoC3 + "\n"
                + "Camion 4: " + PesoC4 + "\n"
                + "Camion 5: " + PesoC5 + "\n");
    }

    public static void proced_LiteralB() {
        int CC1 = 0, CC2 = 0, CC3 = 0, CC4 = 0, CC5 = 0, CCME = 0;
        String CCME_ = "";
        for (int i = 0; i < ListaEncomiendas.size(); i++) {
            if (ListaEncomiendas.get(i).getNumeroCamion() == 1) {
                if (ListaEncomiendas.get(i).getEncomienda1() != 0) {
                    CC1++;
                    if (ListaEncomiendas.get(i).getEncomienda2() != 0) {
                        CC1++;
                        if (ListaEncomiendas.get(i).getEncomienda3() != 0) {
                            CC1++;
                            if (ListaEncomiendas.get(i).getEncomienda4() != 0) {
                                CC1++;
                                if (ListaEncomiendas.get(i).getEncomienda5() != 0) {
                                    CC1++;
                                }
                            }
                        }
                    }
                }
            }
            if (ListaEncomiendas.get(i).getNumeroCamion() == 2) {
                if (ListaEncomiendas.get(i).getEncomienda1() != 0) {
                    CC2++;
                    if (ListaEncomiendas.get(i).getEncomienda2() != 0) {
                        CC2++;
                        if (ListaEncomiendas.get(i).getEncomienda3() != 0) {
                            CC2++;
                            if (ListaEncomiendas.get(i).getEncomienda4() != 0) {
                                CC2++;
                                if (ListaEncomiendas.get(i).getEncomienda5() != 0) {
                                    CC2++;
                                }
                            }
                        }
                    }
                }
            }
            if (ListaEncomiendas.get(i).getNumeroCamion() == 3) {
                if (ListaEncomiendas.get(i).getEncomienda1() != 0) {
                    CC3++;
                    if (ListaEncomiendas.get(i).getEncomienda2() != 0) {
                        CC3++;
                        if (ListaEncomiendas.get(i).getEncomienda3() != 0) {
                            CC3++;
                            if (ListaEncomiendas.get(i).getEncomienda4() != 0) {
                                CC3++;
                                if (ListaEncomiendas.get(i).getEncomienda5() != 0) {
                                    CC3++;
                                }
                            }
                        }
                    }
                }
            }
            if (ListaEncomiendas.get(i).getNumeroCamion() == 4) {
                if (ListaEncomiendas.get(i).getEncomienda1() != 0) {
                    CC4++;
                    if (ListaEncomiendas.get(i).getEncomienda2() != 0) {
                        CC4++;
                        if (ListaEncomiendas.get(i).getEncomienda3() != 0) {
                            CC4++;
                            if (ListaEncomiendas.get(i).getEncomienda4() != 0) {
                                CC4++;
                                if (ListaEncomiendas.get(i).getEncomienda5() != 0) {
                                    CC4++;
                                }
                            }
                        }
                    }
                }
            }
            if (ListaEncomiendas.get(i).getNumeroCamion() == 5) {
                if (ListaEncomiendas.get(i).getEncomienda1() != 0) {
                    CC5++;
                    if (ListaEncomiendas.get(i).getEncomienda2() != 0) {
                        CC5++;
                        if (ListaEncomiendas.get(i).getEncomienda3() != 0) {
                            CC5++;
                            if (ListaEncomiendas.get(i).getEncomienda4() != 0) {
                                CC5++;
                                if (ListaEncomiendas.get(i).getEncomienda5() != 0) {
                                    CC5++;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (CC1 > CCME) {
            CCME = CC1;
            CCME_ = "Camion 1";
        }
        if (CC2 > CCME) {
            CCME = CC2;
            CCME_ = "Camion 2";
        }
        if (CC3 > CCME) {
            CCME = CC3;
            CCME_ = "Camion 3";
        }
        if (CC4 > CCME) {
            CCME = CC4;
            CCME_ = "Camion 4";
        }
        if (CC5 > CCME) {
            CCME = CC5;
            CCME_ = "Camion 5";
        }
        JOptionPane.showMessageDialog(null, "El camion con mayor numero de encomiendas es: " + CCME_);
    }
}
