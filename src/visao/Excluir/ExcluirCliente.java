/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.Excluir;

import DAO.ClienteDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cliente;

/**
 *
 * @author MANUEL GUSTAVO
 */
public class ExcluirCliente extends javax.swing.JFrame {

    /**
     * Creates new form ExcluirCliente
     */
    public ExcluirCliente() {
        initComponents();
        setSize(350, 250);
        setLocationRelativeTo(this);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        AtualizaCombo();
    }
    
    private void AtualizaCombo(){
        Connection con = Conexao.AbrirConexao();
        ClienteDAO sql = new ClienteDAO(con);
        List<Cliente> lista = new ArrayList<>();
        lista = sql.ListarComboCliente();
        jCB_Nome.addItem("");
        
        for(Cliente b : lista){
            jCB_Nome.addItem(b.getNome());
        }
        Conexao.FecharConexao(con);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCB_Nome = new javax.swing.JComboBox<>();
        jTF_codigo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Star Jedi", 1, 14)); // NOI18N
        jLabel2.setText("excluir cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 315, 59);

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 70, 31, 30);

        jCB_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_NomeActionPerformed(evt);
            }
        });
        getContentPane().add(jCB_Nome);
        jCB_Nome.setBounds(100, 70, 160, 30);
        getContentPane().add(jTF_codigo);
        jTF_codigo.setBounds(60, 70, 30, 30);

        jButton1.setText("CANCELAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 140, 100, 23);

        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(50, 140, 90, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCB_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_NomeActionPerformed
        Connection con = Conexao.AbrirConexao();
        ClienteDAO sql = new ClienteDAO(con);
        List<Cliente> lista = new ArrayList<>();
        String nome = jCB_Nome.getSelectedItem().toString();
        
        lista = sql.ConsultaCodigoCliente(nome);
        
        for(Cliente b : lista){
            int a = b.getCodigo();
            jTF_codigo.setText("" + a);
            
        }
        Conexao.FecharConexao(con);
    }//GEN-LAST:event_jCB_NomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        String codigo = jTF_codigo.getText();
        String nome = jCB_Nome.getSelectedItem().toString();
        
        Connection con = Conexao.AbrirConexao();
        ClienteDAO sql = new ClienteDAO(con);
        Cliente a = new Cliente();
        if(nome.equals("")){
            int b = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir" + " \n ( " + codigo + ") ( " +nome+ " ) ", "Video Locadora", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(b == 0){
            int cod = Integer.parseInt(codigo);
            a.setNome(nome);
            a.setCodigo(cod);
            sql.Excluir_Cliente(a);
            Conexao.FecharConexao(con);
            dispose();
        }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(ExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCB_Nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTF_codigo;
    // End of variables declaration//GEN-END:variables
}
