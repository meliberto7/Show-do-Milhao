
package telas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import model.bean.Global;
import model.bean.GlobalUser;
import model.bean.Perguntas;
import model.bean.Ranking;
import model.dao.PerguntasDAO;
import model.dao.RankingDAO;


public class TelaPerguntas extends javax.swing.JFrame {
Perguntas perguntaAtual = new Perguntas();
int pontuacao = 0;  
int usuarioId;
Random random = new Random();
boolean very = false;
String num = null;
List<String> list = new ArrayList();

    public TelaPerguntas() {
        initComponents();
        setTitle("Perguntas");
        setLocationRelativeTo(null);
         
       // Carregar perguntas do banco de dados
        //carregarPerguntas();
       
        
        //int numeroPerguntaAtual = Global.getNumeroPergunta();
        
        int numeroPerguntaAtual = random.nextInt(9 + 1);
        System.out.println("Numero: " + numeroPerguntaAtual);
        
        if (Global.getNumeros().size() > 0) {
                 
            for (int i = 0; i < Global.getNumeros().size(); i++) {
            
                if (Global.getNumeros().get(i).equals(String.valueOf(numeroPerguntaAtual))) {
                
                    very = true;
                    num = Global.getNumeros().get(i);
                
                }
                
            } 
            
            if (very) {
            
                while (very) {
                    
                    boolean very2 = false;
                    numeroPerguntaAtual = random.nextInt(9 + 1);
                    
                    for (int i = 0; i < Global.getNumeros().size(); i++) {
            
                        if (Global.getNumeros().get(i).equals(String.valueOf(numeroPerguntaAtual))) {
                
                        very2 = true;
                        num = Global.getNumeros().get(i);
                
                        }
                
                    } 
                    
                    if (!very2) {
                        
                        very = false;
                        
                    }
                    
                    
                }
            
            }
            
        }
        
        list.add(String.valueOf(numeroPerguntaAtual));
        Global.setNumeros(list);
        System.out.println("Numeros: " + Global.getNumeros());
 
        perguntaAtual = Global.getPerguntas().get(numeroPerguntaAtual);
        labelPergunta.setText(perguntaAtual.getPergunta());
        
        switch(random.nextInt(4 + 1)) {
            
            case 1: 
                System.out.println("case 1");
                btnA.setText(perguntaAtual.getAlternativa1());
                btnB.setText(perguntaAtual.getAlternativa2());
                btnC.setText(perguntaAtual.getAlternativa3());
                btnD.setText(perguntaAtual.getAlternativa4());
                
                break;
            case 2: 
                System.out.println("case 2");
                btnA.setText(perguntaAtual.getAlternativa3());
                btnB.setText(perguntaAtual.getAlternativa1());
                btnC.setText(perguntaAtual.getAlternativa2());
                btnD.setText(perguntaAtual.getAlternativa4());
                
                break;
            case 3: 
                System.out.println("case 3");
                btnA.setText(perguntaAtual.getAlternativa4());
                btnB.setText(perguntaAtual.getAlternativa3());
                btnC.setText(perguntaAtual.getAlternativa2());
                btnD.setText(perguntaAtual.getAlternativa1());
                
                break;
            case 4: 
                System.out.println("case 4");
                btnA.setText(perguntaAtual.getAlternativa4());
                btnB.setText(perguntaAtual.getAlternativa2());
                btnC.setText(perguntaAtual.getAlternativa1());
                btnD.setText(perguntaAtual.getAlternativa3());
                
                break;
                
            default:
                btnA.setText(perguntaAtual.getAlternativa2());
                btnB.setText(perguntaAtual.getAlternativa1());
                btnC.setText(perguntaAtual.getAlternativa4());
                btnD.setText(perguntaAtual.getAlternativa3());
                break;
            
        }
        
        
    }
   
     public void ValidaResposta(String resposta) {
         
         very = false;
         
         if(perguntaAtual.getCorreta().equals(resposta)) {
            JOptionPane.showMessageDialog(null, "Certo");
            
            Global.setNumeroPergunta(Global.getNumeroPergunta() + 1);
            // if e else vai ser só para quem for fazer o esquema show do milhão
            if(Global.getNumeroPergunta() > 9) {
                JOptionPane.showMessageDialog(null, "Parabens você ganhou");
                
                RankingDAO dao = new RankingDAO();
                Ranking user = new Ranking();
                user.setNome(GlobalUser.getNome());
                user.setPontuacao(Global.getNumeroPergunta());
                user.setUsuario_Id(GlobalUser.getId());
                dao.adicionarPontuacao(user);
                Global.setNumeroPergunta(0);
                
                dispose();
                new TelaGanhador().setVisible(true);
            } else {
                
                int numeroPerguntaAtual = random.nextInt(9 + 1);
        
                System.out.println("Numero: " + numeroPerguntaAtual);
                
                if (Global.getNumeros().size() > 0) {
                 
            for (int i = 0; i < Global.getNumeros().size(); i++) {
            
                if (Global.getNumeros().get(i).equals(String.valueOf(numeroPerguntaAtual))) {
                
                    very = true;
                    num = Global.getNumeros().get(i);
                
                }
                
            } 
            
            if (very) {
            
                while (very) {
                    
                    boolean very2 = false;
                    numeroPerguntaAtual = random.nextInt(9 + 1);
                    
                    for (int i = 0; i < Global.getNumeros().size(); i++) {
            
                        if (Global.getNumeros().get(i).equals(String.valueOf(numeroPerguntaAtual))) {
                
                        very2 = true;
                        num = Global.getNumeros().get(i);
                
                        }
                
                    } 
                    
                    if (!very2) {
                        
                        very = false;
                        
                    }
                    
                    
                }
            
            }
            
        }        
                list.add(String.valueOf(numeroPerguntaAtual));
                Global.setNumeros(list);
                System.out.println("Numeros: " + Global.getNumeros());
                
                
            
        
                
                perguntaAtual = Global.getPerguntas().get(numeroPerguntaAtual);
                labelPergunta.setText(perguntaAtual.getPergunta());
                
                switch(random.nextInt(4 + 1)) {
            
            case 1: 
                System.out.println("case 1");
                btnA.setText(perguntaAtual.getAlternativa1());
                btnB.setText(perguntaAtual.getAlternativa2());
                btnC.setText(perguntaAtual.getAlternativa3());
                btnD.setText(perguntaAtual.getAlternativa4());
                
                break;
            case 2: 
                System.out.println("case 2");
                btnA.setText(perguntaAtual.getAlternativa3());
                btnB.setText(perguntaAtual.getAlternativa1());
                btnC.setText(perguntaAtual.getAlternativa2());
                btnD.setText(perguntaAtual.getAlternativa4());
                
                break;
            case 3: 
                System.out.println("case 3");
                btnA.setText(perguntaAtual.getAlternativa4());
                btnB.setText(perguntaAtual.getAlternativa3());
                btnC.setText(perguntaAtual.getAlternativa2());
                btnD.setText(perguntaAtual.getAlternativa1());
                
                break;
            case 4: 
                System.out.println("case 4");
                btnA.setText(perguntaAtual.getAlternativa4());
                btnB.setText(perguntaAtual.getAlternativa2());
                btnC.setText(perguntaAtual.getAlternativa1());
                btnD.setText(perguntaAtual.getAlternativa3());
                
                break;
                
            default:
                btnA.setText(perguntaAtual.getAlternativa2());
                btnB.setText(perguntaAtual.getAlternativa1());
                btnC.setText(perguntaAtual.getAlternativa4());
                btnD.setText(perguntaAtual.getAlternativa3());
                break;    
            
        }
                
                pontuacao ++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Errado");
            RankingDAO dao = new RankingDAO();
            Ranking user = new Ranking();
            user.setNome(GlobalUser.getNome());
            user.setPontuacao(Global.getNumeroPergunta());
            user.setUsuario_Id(GlobalUser.getId());
            dao.adicionarPontuacao(user);
            Global.setNumeroPergunta(0); // Resetar o número de pergunta para 0
            dispose();
            

            new TelaRanking().setVisible(true);
            JOptionPane.showMessageDialog(null, "Pontuação: "+pontuacao);
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnA = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        labelPergunta = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnA.setBackground(new java.awt.Color(0, 0, 255));
        btnA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnA.setForeground(new java.awt.Color(255, 204, 0));
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        jPanel1.add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 470, 60));

        btnC.setBackground(new java.awt.Color(0, 0, 255));
        btnC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnC.setForeground(new java.awt.Color(255, 204, 0));
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel1.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 470, 60));

        btnB.setBackground(new java.awt.Color(0, 0, 255));
        btnB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnB.setForeground(new java.awt.Color(255, 204, 0));
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        jPanel1.add(btnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 470, 60));

        btnD.setBackground(new java.awt.Color(0, 0, 255));
        btnD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnD.setForeground(new java.awt.Color(255, 204, 0));
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        jPanel1.add(btnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 470, 60));

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Parar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 660, 140, 30));

        labelPergunta.setEditable(false);
        labelPergunta.setBackground(new java.awt.Color(0, 0, 0, 0));
        labelPergunta.setColumns(20);
        labelPergunta.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        labelPergunta.setLineWrap(true);
        labelPergunta.setRows(5);
        labelPergunta.setBorder(null);
        jPanel1.add(labelPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 700, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ShowPergunta.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
           ValidaResposta(btnA.getText());  
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
         ValidaResposta(btnB.getText());
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
         ValidaResposta(btnC.getText());
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
         ValidaResposta(btnD.getText());
    }//GEN-LAST:event_btnDActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        RankingDAO dao = new RankingDAO();
            Ranking user = new Ranking();
            user.setNome(GlobalUser.getNome());
            user.setPontuacao(Global.getNumeroPergunta());
            user.setUsuario_Id(GlobalUser.getId());
            dao.adicionarPontuacao(user);
            
        Global.setNumeroPergunta(0); // Resetar o número de pergunta para 0
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerdedor().setVisible(true);
            }
        }); dispose();
    }//GEN-LAST:event_jButton5ActionPerformed


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
            java.util.logging.Logger.getLogger(TelaPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerguntas().setVisible(true);
            }
        });
    }
    

   
    
    


   
    
   
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea labelPergunta;
    // End of variables declaration//GEN-END:variables

   
}
