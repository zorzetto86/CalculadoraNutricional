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
public class EditExigencia extends javax.swing.JFrame {

    /**
     * Creates new form CadExigencia
     */
    public EditExigencia() {
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

        javax.swing.JButton Menu = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextFieldId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        javax.swing.JButton Menu1 = new javax.swing.JButton();
        jLabelFundoExigencia = new javax.swing.JLabel();

        Menu.setText("Menu");
        Menu.setToolTipText("");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(108, 266, 33, 20);

        jButton2.setText("Cadastrar");
        getContentPane().add(jButton2);
        jButton2.setBounds(264, 236, 100, 23);
        getContentPane().add(jTextFieldId);
        jTextFieldId.setBounds(108, 36, 46, 20);

        jLabel4.setText("Descrição:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(54, 105, 50, 14);

        jLabel8.setText("Gordura:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(61, 269, 43, 14);

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(108, 105, 256, 61);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar Exigência");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 0, 250, 30);
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(108, 74, 256, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(108, 184, 33, 20);

        jLabel2.setText("Id:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 39, 14, 14);

        jLabel5.setText("Cálcio:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(72, 187, 32, 14);

        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(73, 77, 31, 14);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(108, 210, 33, 20);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(197, 210, 33, 20);

        jLabel6.setText("Proieína:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(62, 213, 42, 14);

        jLabel11.setText("Vitaminas:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(144, 213, 49, 14);

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10);
        jTextField10.setBounds(197, 184, 33, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(108, 237, 33, 20);

        jLabel12.setText("Calorias:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(151, 187, 42, 14);

        jLabel7.setText("Carboidratos:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(38, 240, 66, 14);

        jButton1.setText("Limpar");
        getContentPane().add(jButton1);
        jButton1.setBounds(284, 265, 80, 23);

        Menu1.setText("Menu");
        Menu1.setToolTipText("");
        Menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu1ActionPerformed(evt);
            }
        });
        getContentPane().add(Menu1);
        Menu1.setBounds(320, 10, 70, 23);

        jLabelFundoExigencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundologin.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoExigencia);
        jLabelFundoExigencia.setBounds(0, 0, 400, 300);

        setSize(new java.awt.Dimension(410, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        TelaPrincipal form = new TelaPrincipal();
        form.setVisible(true);
        form.setSize(700,600);
        dispose();
    }//GEN-LAST:event_MenuActionPerformed

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
            java.util.logging.Logger.getLogger(EditExigencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditExigencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditExigencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditExigencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditExigencia().setVisible(true);
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
    private javax.swing.JLabel jLabelFundoExigencia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
