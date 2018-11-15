package visao.Consultar;

import DAO.ClienteDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public class ConsultarCliente extends javax.swing.JFrame {
    
    public ConsultarCliente() {
        initComponents();
        setSize(900, 490);  
        setLocationRelativeTo(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public void AtualizaTable(){
        Connection con = Conexao.AbrirConexao();
        ClienteDAO bd = new ClienteDAO(con);
        List<Cliente> lista = new ArrayList<>();
        lista = bd.ListarCliente();
        DefaultTableModel tbm = (DefaultTableModel) jTable.getModel();
    
    while(tbm.getRowCount() > 0){
        tbm.removeRow(0);
    }
    
        int i = 0;
        for (Cliente tab : lista){
            tbm.addRow(new String[i]);
            jTable.setValueAt(tab.getCodigo(), i, 0);
            jTable.setValueAt(tab.getNome(), i, 1);
            jTable.setValueAt(tab.getRG(), i, 2);
            jTable.setValueAt(tab.getCPF(), i, 3);
            jTable.setValueAt(tab.getTelefone(), i, 4);
            jTable.setValueAt(tab.getEmail(), i, 5);
            i++;
        }
        Conexao.FecharConexao(con);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Pesquisa por nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(25, 11, 140, 40);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(127, 15, 200, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa1.png"))); // NOI18N
        getContentPane().add(jButton1);
        jButton1.setBounds(600, 10, 40, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(520, 10, 60, 30);

        jLabel2.setText("Pesquisa por Código:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 10, 120, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa1.png"))); // NOI18N
        getContentPane().add(jButton3);
        jButton3.setBounds(340, 13, 40, 30);

        jButton2.setText("TODOS");
        getContentPane().add(jButton2);
        jButton2.setBounds(777, 10, 80, 23);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Cliente", "RG", "CPF", "Telefone", "Email"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 870, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
