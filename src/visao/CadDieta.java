/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author Fabio
 */
public class CadDieta extends javax.swing.JFrame {

    /**
     * Creates new form CadDieta
     */
    public CadDieta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JButton Menu1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField9 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        javax.swing.JButton Menu2 = new javax.swing.JButton();
        jLabelFundoDieta = new javax.swing.JLabel();

        Menu1.setText("Menu");
        Menu1.setToolTipText("");
        Menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel15.setText("g");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(317, 444, 6, 14);

        jLabel16.setText("g");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(317, 470, 6, 14);

        jLabel7.setText("Carboidratos:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(220, 247, 66, 14);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel17.setText("Ingredientes");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(134, 308, 98, 22);

        jLabel2.setText("Id:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(49, 54, 14, 14);

        jButton1.setText("Limpar");
        getContentPane().add(jButton1);
        jButton1.setBounds(253, 505, 63, 23);

        jLabel5.setText("Cálcio:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(44, 247, 32, 14);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(290, 270, 33, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dieta", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(67, 218, 256, 20);

        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(32, 92, 31, 14);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliete", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(67, 192, 256, 20);

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(176, 505, 71, 23);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingredientes" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(80, 365, 135, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(80, 270, 33, 20);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingredientes" }));
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(80, 389, 135, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(67, 51, 46, 20);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingredientes" }));
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(80, 415, 135, 20);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(169, 270, 33, 20);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingredientes" }));
        getContentPane().add(jComboBox6);
        jComboBox6.setBounds(80, 441, 135, 20);

        jLabel4.setText("Descrição:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(13, 120, 50, 14);

        jLabel6.setText("Proieína:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(34, 273, 42, 14);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingredientes" }));
        getContentPane().add(jComboBox7);
        jComboBox7.setBounds(80, 467, 135, 20);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(233, 365, 80, 20);

        jLabel8.setText("Gordura:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(243, 273, 43, 14);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(233, 389, 80, 20);

        jLabel11.setText("Vitaminas:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(116, 273, 49, 14);
        getContentPane().add(jTextField11);
        jTextField11.setBounds(233, 415, 80, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(67, 120, 256, 61);
        getContentPane().add(jTextField12);
        jTextField12.setBounds(233, 441, 80, 20);
        getContentPane().add(jTextField13);
        jTextField13.setBounds(233, 467, 80, 20);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(169, 244, 33, 20);

        jLabel9.setText("Quant.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(260, 345, 34, 14);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(290, 244, 33, 20);

        jLabel10.setText("g");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(317, 368, 6, 14);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar Dieta");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 10, 167, 29);

        jLabel13.setText("g");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(317, 392, 6, 14);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(67, 89, 256, 20);

        jLabel14.setText("g");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(317, 418, 6, 14);

        jLabel12.setText("Calorias:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(123, 247, 42, 14);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(80, 244, 33, 20);

        Menu2.setText("Menu");
        Menu2.setToolTipText("");
        Menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu2ActionPerformed(evt);
            }
        });
        getContentPane().add(Menu2);
        Menu2.setBounds(260, 10, 70, 23);

        jLabelFundoDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoprincipal.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoDieta);
        jLabelFundoDieta.setBounds(-510, 0, 1060, 540);

        setSize(new java.awt.Dimension(358, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FormDieta formin = new FormDieta();
        formin.setVisible(true);
        formin.setSize(700,600);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu1ActionPerformed
        TelaPrincipal form = new TelaPrincipal();
        form.setVisible(true);
        form.setSize(700,600);
        dispose();
    }//GEN-LAST:event_Menu1ActionPerformed

    private void Menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu2ActionPerformed
        TelaPrincipal form = new TelaPrincipal();
        form.setVisible(true);
        form.setSize(700,600);
        dispose();
    }//GEN-LAST:event_Menu2ActionPerformed

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
            java.util.logging.Logger.getLogger(CadDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadDieta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadDieta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFundoDieta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
