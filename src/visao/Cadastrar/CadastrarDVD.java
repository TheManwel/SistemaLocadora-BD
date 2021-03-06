/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.Cadastrar;

import DAO.CategoriaDAO;
import DAO.Conexao;
import DAO.DVDDAO;
import DAO.FilmeDAO;
import static java.awt.Frame.CROSSHAIR_CURSOR;
import static java.awt.Frame.HAND_CURSOR;
import static java.awt.image.ImageObserver.ABORT;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.DVD;
import modelo.Filme;

/**
 *
 * @author MANUEL GUSTAVO
 */
public class CadastrarDVD extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarDVD
     */
    public CadastrarDVD() {
        initComponents();
        setSize(678, 530);    
        setLocationRelativeTo(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void AtualizaCombo(){
        Connection con = Conexao.AbrirConexao();
        FilmeDAO sql = new FilmeDAO(con);
        List<Filme> lista = new ArrayList<>();
        lista = sql.ListarComboFilme();
        jCB_Filme.addItem("");
        
        for(Filme b : lista){
            jCB_Filme.addItem(b.getTitulo());
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

        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTF_cod = new javax.swing.JTextField();
        jCB_Filme = new javax.swing.JComboBox<>();
        jTF_Situacao = new javax.swing.JTextField();
        jTF_Filme = new javax.swing.JTextField();
        jtfdatacompra = new javax.swing.JTextField();
        jtfprecocompra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btncad = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("DATA DA COMPRA:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 170, 120, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Star Jedi", 1, 18)); // NOI18N
        jLabel2.setText("cadastro de dvd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 20, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 20, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 500, 70);

        jLabel3.setText("SITUAÇÃO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 90, 70, 30);

        jLabel4.setText("FILME:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 130, 60, 30);

        jLabel5.setText("PREÇO DA COMPRA:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 170, 130, 30);

        jLabel6.setText("CÓDIGO:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 90, 60, 30);
        getContentPane().add(jTF_cod);
        jTF_cod.setBounds(110, 90, 70, 30);

        jCB_Filme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_FilmeActionPerformed(evt);
            }
        });
        getContentPane().add(jCB_Filme);
        jCB_Filme.setBounds(200, 130, 250, 30);
        getContentPane().add(jTF_Situacao);
        jTF_Situacao.setBounds(290, 90, 160, 30);
        getContentPane().add(jTF_Filme);
        jTF_Filme.setBounds(110, 130, 70, 30);
        getContentPane().add(jtfdatacompra);
        jtfdatacompra.setBounds(380, 170, 70, 30);
        getContentPane().add(jtfprecocompra);
        jtfprecocompra.setBounds(170, 170, 70, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DVD_VIDEO_logo.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 220, 270, 200);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jButton2.setText("CANCELAR");

        btncad.setText("CADASTRAR");
        btncad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadActionPerformed(evt);
            }
        });

        jButton4.setText("LIMPAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btncad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncad)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(-90, 430, 610, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCB_FilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_FilmeActionPerformed
        Connection con = Conexao.AbrirConexao();
        FilmeDAO sql = new FilmeDAO(con);
        List<Filme> lista = new ArrayList<>();
        String nome = jCB_Filme.getSelectedItem().toString();
        
        lista = sql.ConsultaCodigoFilme(nome);
        
        for(Filme b : lista){
            int a = b.getCodigo();
            jTF_cod.setText("" + a);
        }
        Conexao.FecharConexao(con);
    }//GEN-LAST:event_jCB_FilmeActionPerformed

    private void btncadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadActionPerformed
        String Titulo = jTF_Filme.getText();
           String situacao = jTF_Situacao.getText();
           String preco = jtfprecocompra.getText();
           String data = jtfdatacompra.getText();
           
           
            if(Titulo.equals("") || situacao.equals("") || preco.equals("") || data.equals("")){
               JOptionPane.showMessageDialog(null, "nenhum campo pode esta vazio", "Video Locadora", JOptionPane.WARNING_MESSAGE);
               
           }else{
               Connection con = Conexao.AbrirConexao();
               DVDDAO sql = new DVDDAO(con);
               DVD a = new DVD();
               
               //a.setCodigo(WIDTH);
               a.setCod_filme(ICONIFIED);
               a.setSituacao(situacao);
               a.setData_compra(data);
               a.setPreco(ERROR);
              
               sql.Inserir_DVD(a);
               Conexao.FecharConexao(con);
               
               jTF_Filme.setText("");
               jTF_Situacao.setText("");
               jtfprecocompra.setText("");
               jtfdatacompra.setText("");
               JOptionPane.showMessageDialog(null, "Cadastro realizado com Sucesso", "Video Locadora", JOptionPane.INFORMATION_MESSAGE);
               dispose();
               
           }
    }//GEN-LAST:event_btncadActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarDVD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarDVD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarDVD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarDVD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarDVD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncad;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jCB_Filme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTF_Filme;
    private javax.swing.JTextField jTF_Situacao;
    private javax.swing.JTextField jTF_cod;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jtfdatacompra;
    private javax.swing.JTextField jtfprecocompra;
    // End of variables declaration//GEN-END:variables
}
