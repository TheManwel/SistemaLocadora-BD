package principal;

import DAO.Conexao;
import DAO.FuncionarioDAO;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        setSize(690, 500);
        dispose();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pfSenha = new javax.swing.JPasswordField();
        tfUsuario = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Cracked Johnnie", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("USUÁRIO:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 160, 120, 30);

        jLabel3.setFont(new java.awt.Font("Cracked Johnnie", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("SENHA:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 200, 100, 40);

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ENTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 250, 110, 40);

        pfSenha.setFont(new java.awt.Font("Cracked Johnnie", 0, 10)); // NOI18N
        pfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(pfSenha);
        pfSenha.setBounds(350, 200, 130, 30);

        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(tfUsuario);
        tfUsuario.setBounds(350, 160, 130, 30);

        jProgressBar1.setBackground(new java.awt.Color(204, 0, 0));
        jProgressBar1.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(220, 300, 260, 20);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SAIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(370, 250, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/fundo completi.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfSenhaActionPerformed
       
    }//GEN-LAST:event_pfSenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con = Conexao.AbrirConexao();
        FuncionarioDAO sql = new FuncionarioDAO(con);
        String login = tfUsuario.getText();
        String senha = pfSenha.getText();
        if(login.equalsIgnoreCase("") || senha.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Nenhum campo pode esta vazio!", "Video Locadora", JOptionPane.WARNING_MESSAGE);
        tfUsuario.setText("");
        pfSenha.setText("");
        }else{
            if(sql.Logar(login, senha) == true){
                new Thread(){
                    public void run(){
                        for(int i = 0; i< 101; i++){
                            jProgressBar1.setValue(i);
                            try{
                                Thread.sleep(35);
                            }catch (Exception ex){
                                ex.getMessage();
                                
                            }
                        }
                        new Menu().setVisible(true);
                        dispose();
                    }
                }.start();
            }else{
                JOptionPane.showMessageDialog(null, "Usuario ou Senha invalidos!", "Video Locadora", JOptionPane.ERROR_MESSAGE);
                tfUsuario.setText("");
                pfSenha.setText("");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
