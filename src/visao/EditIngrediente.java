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
public class EditIngrediente extends javax.swing.JFrame {

    /**
     * Creates new form CadIngrediente
     */
    public EditIngrediente() {
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

        jTextField9 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        javax.swing.JButton Menu1 = new javax.swing.JButton();
        jLabelFundoIngrediente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField9.setToolTipText("");
        getContentPane().add(jTextField9);
        jTextField9.setBounds(197, 210, 33, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(108, 105, 256, 61);

        jLabel11.setText("Vitaminas:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(144, 213, 60, 14);

        jTextField10.setToolTipText("");
        getContentPane().add(jTextField10);
        jTextField10.setBounds(197, 184, 33, 20);

        jTextField3.setToolTipText("");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(108, 184, 33, 20);

        jLabel12.setText("Calorias:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(151, 187, 50, 14);

        jLabel5.setText("Cálcio:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(72, 187, 40, 14);

        jButton1.setText("Limpar");
        getContentPane().add(jButton1);
        jButton1.setBounds(294, 265, 70, 23);

        jTextField4.setToolTipText("");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(108, 210, 33, 20);

        jButton2.setText("Cadastrar");
        getContentPane().add(jButton2);
        jButton2.setBounds(274, 236, 90, 23);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(108, 36, 46, 20);

        jLabel6.setText("Proieína:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(62, 213, 50, 14);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar Ingrediente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 0, 260, 29);

        jTextField5.setToolTipText("");
        getContentPane().add(jTextField5);
        jTextField5.setBounds(108, 237, 33, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(108, 74, 256, 20);

        jLabel7.setText("Carboidratos:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(38, 240, 80, 14);

        jLabel2.setText("Id:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 39, 14, 14);

        jTextField6.setToolTipText("");
        getContentPane().add(jTextField6);
        jTextField6.setBounds(108, 266, 33, 20);

        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(73, 77, 31, 14);

        jLabel8.setText("Gordura:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(61, 269, 50, 14);

        jLabel4.setText("Descrição:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(54, 105, 50, 14);

        Menu1.setText("Menu");
        Menu1.setToolTipText("");
        Menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu1ActionPerformed(evt);
            }
        });
        getContentPane().add(Menu1);
        Menu1.setBounds(320, 10, 70, 23);

        jLabelFundoIngrediente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundologin.jpg"))); // NOI18N
        jLabelFundoIngrediente.setToolTipText("");
        getContentPane().add(jLabelFundoIngrediente);
        jLabelFundoIngrediente.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(414, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu1ActionPerformed
        TelaPrincipal form = new TelaPrincipal();
        form.setVisible(true);
        form.setSize(700,600);
        dispose();
    }//GEN-LAST:event_Menu1ActionPerformed

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
            java.util.logging.Logger.getLogger(EditIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditIngrediente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFundoIngrediente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
