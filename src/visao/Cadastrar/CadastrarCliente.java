/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.Cadastrar;

/**
 *
 * @author MANUEL GUSTAVO
 */
public class CadastrarCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarCliente
     */
    public CadastrarCliente() {
        initComponents();
        setSize(678, 450);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();

        jLabel11.setText("BAIRRO:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setText("CADASTRO DE CLIENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 660, 70);

        jLabel2.setText("CEP:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 250, 60, 20);

        jLabel3.setText("Nº DO CLIENTE:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 100, 100, 20);

        jLabel4.setText("NOME:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 130, 100, 20);

        jLabel5.setText("RG:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 160, 50, 20);

        jFormattedTextField1.setText("'    -");
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(80, 160, 210, 20);

        jFormattedTextField2.setText("   .   .  -");
        getContentPane().add(jFormattedTextField2);
        jFormattedTextField2.setBounds(360, 160, 170, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(80, 130, 450, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 100, 60, 20);

        jLabel6.setText("CPF:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 160, 40, 20);

        jLabel7.setText("TELEFONE:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 190, 70, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(410, 190, 120, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(110, 190, 140, 20);

        jLabel8.setText("DATA DE NASCIMENTO:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(270, 190, 140, 20);

        jLabel9.setText("RUA:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 220, 50, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(430, 220, 100, 20);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(80, 220, 310, 20);

        jLabel10.setText("Nº:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(410, 220, 30, 20);

        jLabel12.setText("EMAIL:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 280, 60, 20);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(400, 250, 130, 20);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(100, 250, 260, 20);

        jLabel13.setText("BAIRRO:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 250, 60, 20);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(90, 280, 440, 20);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("LIMPAR");

        jToggleButton2.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("CANCELAR");

        jToggleButton3.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setText("CADASTRAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 320, 640, 100);

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
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
}