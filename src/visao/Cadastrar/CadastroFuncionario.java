package visao.Cadastrar;

import DAO.ClienteDAO;
import DAO.Conexao;
import DAO.FuncionarioDAO;
import java.sql.Connection;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Funcionario;

public class CadastroFuncionario extends javax.swing.JFrame {
    public CadastroFuncionario() {
        initComponents();
        setSize(678, 530);  
        setLocationRelativeTo(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTF_Nome = new javax.swing.JTextField();
        jTF_Codigo = new javax.swing.JTextField();
        jTF_Senha = new javax.swing.JTextField();
        jTF_Login = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel5.setText("LOGIN:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setText("CADASTRO DE FUNCIONÁRIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 621, 83);

        jLabel2.setText("CÓDIGO:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(51, 101, 61, 24);

        jLabel3.setText("NOME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(51, 148, 33, 14);
        getContentPane().add(jTF_Nome);
        jTF_Nome.setBounds(125, 143, 204, 24);

        jTF_Codigo.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTF_Codigo);
        jTF_Codigo.setBounds(122, 101, 64, 24);
        getContentPane().add(jTF_Senha);
        jTF_Senha.setBounds(128, 227, 204, 24);
        getContentPane().add(jTF_Login);
        jTF_Login.setBounds(128, 185, 204, 24);

        jLabel4.setText("LOGIN:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(51, 185, 48, 14);

        jLabel6.setText("SENHA:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(51, 232, 48, 14);

        jToggleButton1.setText("LIMPAR");
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(51, 291, 95, 23);

        jToggleButton2.setText("CANCELAR");
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(337, 291, 105, 23);

        jToggleButton3.setText("CADASTRAR");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(203, 291, 93, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pass_key.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(450, 129, 130, 130);

        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("*somente numeros");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 250, 150, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
           String nome = jTF_Nome.getText();
           String login = jTF_Login.getText();
           String senha = jTF_Senha.getText();
           String codigo = jTF_Codigo.getText();
           if(nome.equals("") || login.equals("") || senha.equals("")){
               JOptionPane.showMessageDialog(null, "nenhum campo pode esta vazio", "Video Locadora", JOptionPane.WARNING_MESSAGE);
               
           }else{
               Connection con = Conexao.AbrirConexao();
               FuncionarioDAO sql = new FuncionarioDAO(con);
               int s = Integer.parseInt(senha);
               Funcionario a = new Funcionario();
               
               //a.setCodigo(codigo);
               a.setNome(nome);
               a.setLogin(login);
               a.setSenha(senha);
               
               sql.Inserir_Funcionario(a);
               Conexao.FecharConexao(con);
               
               jTF_Nome.setText("");
               jTF_Login.setText("");
               jTF_Senha.setText("");
               jTF_Codigo.setText("");
               JOptionPane.showMessageDialog(null, "Cadastro realizado com Sucesso", "Video Locadora", JOptionPane.INFORMATION_MESSAGE);
               dispose();          
               
           }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTF_Codigo;
    private javax.swing.JTextField jTF_Login;
    private javax.swing.JTextField jTF_Nome;
    private javax.swing.JTextField jTF_Senha;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
}
