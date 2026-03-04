package view;
import controller.FuncionarioController;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FormularioFuncionarioView extends javax.swing.JFrame {
    String cargo;
    public FormularioFuncionarioView(String cargo) {
        initComponents();
        setExtendedState(FormularioFuncionarioView.MAXIMIZED_BOTH);
        this.cargo=cargo;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCargoFuncionario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLoginFuncionario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSenhaFuncionario = new javax.swing.JTextField();
        btnCadastarFuncionario = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 540));
        setSize(new java.awt.Dimension(950, 535));

        jPanel1.setBackground(new java.awt.Color(92, 225, 230));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 540));

        jPanel2.setBackground(new java.awt.Color(68, 159, 163));
        jPanel2.setForeground(new java.awt.Color(68, 159, 163));
        jPanel2.setPreferredSize(new java.awt.Dimension(290, 380));

        jLabel2.setBackground(new java.awt.Color(102, 255, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastrar Funcionario");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtNomeFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomeFuncionario.setBorder(null);
        txtNomeFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFuncionarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cargo:");

        txtCargoFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        txtCargoFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCargoFuncionario.setBorder(null);
        txtCargoFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCargoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoFuncionarioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login:");

        txtLoginFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        txtLoginFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoginFuncionario.setBorder(null);
        txtLoginFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginFuncionarioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha");

        txtSenhaFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        txtSenhaFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenhaFuncionario.setBorder(null);

        btnCadastarFuncionario.setBackground(new java.awt.Color(92, 225, 230));
        btnCadastarFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCadastarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastarFuncionario.setText("Cadastrar");
        btnCadastarFuncionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastarFuncionario.setContentAreaFilled(false);
        btnCadastarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(txtNomeFuncionario)
                            .addComponent(jLabel4)
                            .addComponent(txtCargoFuncionario)
                            .addComponent(txtLoginFuncionario)
                            .addComponent(txtSenhaFuncionario)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnCadastarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLoginFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resoursers/250,250.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(290, 380));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("Voltar ao menu");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastarFuncionarioActionPerformed
          if(txtNomeFuncionario.getText().trim().isEmpty()==true){
                    JOptionPane.showInternalMessageDialog(null, "Digite um nome");
                    return;
          } 
          if(txtCargoFuncionario.getText().trim().isEmpty()==true){
                    JOptionPane.showInternalMessageDialog(null, "Digite um cargo");
                    return;
          }
          if(txtLoginFuncionario.getText().trim().isEmpty()==true){
                    JOptionPane.showInternalMessageDialog(null, "Digite um login");
                    return;
          }
          if(txtSenhaFuncionario.getText().trim().isEmpty()==true){
                    JOptionPane.showInternalMessageDialog(null, "Digite um senha");
                    return;
            }
          try {
                    FuncionarioController fc1=new FuncionarioController();
                    fc1.cadastrarFuncionario(txtNomeFuncionario.getText(), txtCargoFuncionario.getText(), txtLoginFuncionario.getText(), txtSenhaFuncionario.getText());
                    FormularioFuncionarioView.this.dispose();
                    new MenusView(cargo).setVisible(true);
          } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionario");
          }
                    
        
    }//GEN-LAST:event_btnCadastarFuncionarioActionPerformed

    private void txtLoginFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginFuncionarioActionPerformed

    private void txtNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFuncionarioActionPerformed

    private void txtCargoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoFuncionarioActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        new MenusView(cargo).setVisible(true);
        FormularioFuncionarioView.this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    /**
     * @param args the command line arguments
     */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCadastarFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCargoFuncionario;
    private javax.swing.JTextField txtLoginFuncionario;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtSenhaFuncionario;
    // End of variables declaration//GEN-END:variables
}
