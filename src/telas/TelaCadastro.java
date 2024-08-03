/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import javax.swing.JOptionPane;
import model.bean.Global;
import model.bean.Usuarios;
import model.dao.UsuariosDAO;

/**
 *
 * @author Senai
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
        setTitle("Cadastro");
        setLocationRelativeTo(null);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        inputLoginc = new javax.swing.JTextField();
        inputSenhac = new javax.swing.JTextField();
        inputCadastrar = new javax.swing.JButton();
        inputNomeC = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputLoginc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(inputLoginc, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 270, 70));

        inputSenhac.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(inputSenhac, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, 270, 70));

        inputCadastrar.setBackground(new java.awt.Color(0, 0, 255));
        inputCadastrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inputCadastrar.setForeground(new java.awt.Color(255, 204, 0));
        inputCadastrar.setText("Confirmar");
        inputCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(inputCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 210, 70));

        inputNomeC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inputNomeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeCActionPerformed(evt);
            }
        });
        jPanel2.add(inputNomeC, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 270, 70));

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 204, 0));
        jButton2.setText("Voltar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 730, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ShowdoMilhaC.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        }); dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void inputCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCadastrarActionPerformed
      
        String novoLogin = inputLoginc.getText();
String novoNome = inputNomeC.getText();
String novaSenha = inputSenhac.getText();

if (novoLogin.isEmpty() || novoNome.isEmpty() || novaSenha.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
} else {
    UsuariosDAO usuariosDAO = new UsuariosDAO();
    Usuarios usuarioNovo = new Usuarios();
    usuarioNovo.setIdUsuario(Global.getId());
    usuarioNovo.setUsuario(novoLogin);
    usuarioNovo.setNome(novoNome);
    usuarioNovo.setSenha(novaSenha);
    
    usuariosDAO.cadastrar(usuarioNovo);
    
    JOptionPane.showMessageDialog(null, "Novo usuário cadastrado com sucesso.");
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        }); dispose();
}




    }//GEN-LAST:event_inputCadastrarActionPerformed

    private void inputNomeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeCActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inputCadastrar;
    private javax.swing.JTextField inputLoginc;
    private javax.swing.JTextField inputNomeC;
    private javax.swing.JTextField inputSenhac;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
