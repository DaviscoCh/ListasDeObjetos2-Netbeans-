/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Controladores.E09_TLista;
import Entidades.E09_RegistroN;
import javax.swing.JOptionPane;

/**
 *
 * @author Charlie Cordova
 */
public class E09_frm_EditRegistroN extends javax.swing.JFrame {

    /**
     * Creates new form E09_frm_EditRegistroN
     */
    public String Funcion;
    public E09_frm_EditRegistroN(String fun) {
        this.Funcion = fun;
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Insertar Registro de Provincia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setText("Num.Provincia:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setText("Num.Partido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel4.setText("Num.Localidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel5.setText("Cant.Mujeres:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel6.setText("Cant.Hombres:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione uno>", "1", "2", "3", "4", "5" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 120, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione uno>", "Partido 1", "Partido 2" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 120, 30));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione uno>", "Localidad 1", "Localidad 2" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 120, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 120, 30));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, 30));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void SetDatos(E09_RegistroN re){
        jComboBox1.setSelectedItem(String.valueOf(re.getNumeroProvincia()));
        jComboBox2.setSelectedItem(re.getNumeroPartido());
        jComboBox3.setSelectedItem(re.getNumeroLocalidad());
        jTextField1.setText(String.valueOf(re.getCHM()));
        jTextField2.setText(String.valueOf(re.getCHH()));
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!jTextField1.getText().equals("")
                && !jTextField2.getText().equals("")
                && jComboBox1.getSelectedIndex() >= 0
                && jComboBox2.getSelectedIndex() >= 0
                && jComboBox3.getSelectedIndex() >= 0){
            int NumeroProvincia = Integer.parseInt(jComboBox1.getSelectedItem().toString());
            String NumeroPartido = jComboBox2.getSelectedItem().toString();
            String NumeroLocalidad = jComboBox3.getSelectedItem().toString();
            int NHM = Integer.parseInt(jTextField1.getText());
            int NHH = Integer.parseInt(jTextField2.getText());
            E09_RegistroN re = new E09_RegistroN(NumeroProvincia, NumeroPartido, NumeroLocalidad, NHM, NHH);
            if(Funcion.equals("Insertar")){
                E09_TLista.Insertar(re);
            }
            if(Funcion.equals("Modificar")){
                E09_TLista.Editar(re,E09_TLista.Buscar(NumeroProvincia));
            }
            E09_frmRegistroN.ListarDatos();
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Ingrese correctamente los datos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(E09_frm_EditRegistroN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(E09_frm_EditRegistroN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(E09_frm_EditRegistroN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(E09_frm_EditRegistroN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new E09_frm_EditRegistroN("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}