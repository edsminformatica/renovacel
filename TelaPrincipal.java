import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaPrincipal extends javax.swing.JFrame {

   
    public TelaPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btncadastrar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnlistar = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        cliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        txtcliente = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        txtproblema = new javax.swing.JTextField();
        celular = new javax.swing.JLabel();
        problema = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        renovacel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RENOVA CEL");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncadastrar.setBackground(new java.awt.Color(255, 255, 0));
        btncadastrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btncadastrar.setText("Cadastrar");
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 690, 120, 40));

        btnexcluir.setBackground(new java.awt.Color(255, 255, 0));
        btnexcluir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnexcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 700, 120, 40));

        btneditar.setBackground(new java.awt.Color(255, 255, 0));
        btneditar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        getContentPane().add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 740, 120, 40));

        btnlistar.setBackground(new java.awt.Color(255, 255, 0));
        btnlistar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnlistar.setText("Listar");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 730, 120, 40));

        btnsair.setBackground(new java.awt.Color(255, 255, 0));
        btnsair.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnsair.setText("Sair");
        btnsair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsairMouseClicked(evt);
            }
        });
        getContentPane().add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 780, 120, 40));

        cliente.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        cliente.setForeground(new java.awt.Color(255, 255, 255));
        cliente.setText("Cliente");
        getContentPane().add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, -1, -1));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Cliente", "Celular", "Problema"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 870, 810, 110));

        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 640, 230, -1));
        getContentPane().add(txtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 720, 230, -1));
        getContentPane().add(txtproblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 800, 230, -1));

        celular.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        celular.setForeground(new java.awt.Color(255, 255, 255));
        celular.setText("Celular (Modelo)");
        getContentPane().add(celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 690, -1, -1));

        problema.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        problema.setForeground(new java.awt.Color(255, 255, 255));
        problema.setText("Problema");
        getContentPane().add(problema, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 770, -1, -1));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gerenciamento dos Problemas ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        renovacel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/renovacel.JPG"))); // NOI18N
        getContentPane().add(renovacel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, 360));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -120, -1, 1220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclienteActionPerformed

    private void btnsairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsairMouseClicked
       // BOTÃO SAIR
        System.exit(0);
    }//GEN-LAST:event_btnsairMouseClicked

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
      // BOTÃO CADASTRAR
        Itens itens = new Itens();
        itens.setCliente(txtcliente.getText());
        itens.setCelular(txtcelular.getText());
        itens.setProblema(txtproblema.getText());

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcc", "root", "");
        } catch (SQLException e) {
            
        }
        Conexao.getConexao();

        String sql = "INSERT INTO renovacel (cliente,celular,problema)  values (?, ?, ?)";

        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, itens.getCliente());
            pstmt.setString(2, itens.getCelular());
            pstmt.setString(3, itens.getProblema());
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Problema foi cadastrado com sucesso, " + txtcliente.getText() + "!!!");

        } catch (SQLException e) {
            System.err.println("Erro");
        }
    }//GEN-LAST:event_btncadastrarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
       // BOTÃO EXCLUIR
        Itens itens = new Itens();
        itens.setCliente(txtcliente.getText());
        itens.setCelular(txtcelular.getText());
        itens.setProblema(txtproblema.getText());

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcc", "root", "");
        } catch (SQLException e) {
            
        }
        Conexao.getConexao();

        String sql = "DELETE FROM renovacel WHERE (cliente,celular,problema) = (?, ?, ?)";

        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, itens.getCliente());
            pstmt.setString(2, itens.getCelular());
            pstmt.setString(3, itens.getProblema());
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Problema foi excluído com sucesso " + txtcliente.getText() + "!!!");

        } catch (SQLException e) {
            System.err.println("Erro");
        }
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // BOTÃO EDITAR
        Itens itens = new Itens();
        itens.setCliente(txtcliente.getText());
        itens.setCelular(txtcelular.getText());
        itens.setProblema(txtproblema.getText());
       
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcc", "root", "");
        } catch (SQLException e) {
            
        }
        Conexao.getConexao();

        String sql = "UPDATE renovacel SET" + " cliente=?, celular=?, problema=?";

        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, itens.getCliente());
            pstmt.setString(2, itens.getCelular());
            pstmt.setString(3, itens.getProblema());
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Problema foi editado com sucesso " + txtcliente.getText() + "!!!");

        } catch (SQLException e) {
            System.err.println("Erro");
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
       // BOTÃO LISTAR
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcc", "root", "");
        } catch (SQLException ex) {
           
        }
        Conexao.getConexao();

        String sql = "SELECT * FROM renovacel";

        PreparedStatement pstmt;
        ResultSet rs;
        ArrayList<Itens> lista = new ArrayList<>();

        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while(rs.next()){

                Itens itens = new Itens();
                itens.setId(rs.getInt("id"));
                itens.setCliente(rs.getString("cliente"));
                itens.setCelular(rs.getString("celular"));
                itens.setProblema(rs.getString("problema"));
                

                lista.add(itens);
                DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
                modelo.setNumRows(0);

                for (int i = 0; i < lista.size(); i++) {
                    modelo.addRow(new Object[]{
                       
                        lista.get(i).getId(),
                      lista.get(i).getCliente(),
                    lista.get(i).getCelular(),
                   lista.get(i).getProblema()});
                   
                }
            }

        } catch (SQLException e) {
            System.err.println("Erro");
        }     
    }//GEN-LAST:event_btnlistarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncadastrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnlistar;
    private javax.swing.JButton btnsair;
    private javax.swing.JLabel celular;
    private javax.swing.JLabel cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel problema;
    private javax.swing.JLabel renovacel;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtproblema;
    // End of variables declaration//GEN-END:variables
}
