package view;

import controller.QuartosController;
import java.math.BigDecimal;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FormularioQuartoView extends javax.swing.JFrame {
    String cargo;
    public FormularioQuartoView(String cargo) {
        initComponents();
        setExtendedState(FormularioQuartoView.MAXIMIZED_BOTH);
        this.cargo=cargo;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTipoQuarto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnCadastarFuncionario = new javax.swing.JToggleButton();
        txtNumeroQuarto = new javax.swing.JFormattedTextField();
        txtValorQuarto = new javax.swing.JFormattedTextField();
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
        jLabel2.setText("Cadastrar Quarto");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero:");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo:");

        txtTipoQuarto.setBackground(new java.awt.Color(255, 255, 255));
        txtTipoQuarto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTipoQuarto.setBorder(null);
        txtTipoQuarto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTipoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoQuartoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Valor da Diária:");

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

        txtNumeroQuarto.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroQuarto.setBorder(null);
        txtNumeroQuarto.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroQuarto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtNumeroQuarto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroQuartoActionPerformed(evt);
            }
        });

        txtValorQuarto.setBackground(new java.awt.Color(255, 255, 255));
        txtValorQuarto.setBorder(null);
        txtValorQuarto.setForeground(new java.awt.Color(0, 0, 0));
        txtValorQuarto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtValorQuarto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(txtTipoQuarto)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(txtNumeroQuarto)
                            .addComponent(txtValorQuarto)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
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
                .addComponent(txtNumeroQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnCadastarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(44, 44, 44))
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
      if (txtNumeroQuarto.getText().trim().isEmpty()) {
          JOptionPane.showInternalMessageDialog(null, "Digite um número");
          return;
      }
      if (txtTipoQuarto.getText().trim().isEmpty()) {
          JOptionPane.showInternalMessageDialog(null, "Digite um tipo");
          return;
      }
      if (txtValorQuarto.getText().trim().isEmpty()) {
          JOptionPane.showInternalMessageDialog(null, "Digite um valor");
          return;
      }  
                        
        QuartosController qc1=new QuartosController();
                            
        int n = Integer.parseInt(txtNumeroQuarto.getText());
        BigDecimal valor = new BigDecimal(txtValorQuarto.getText());
                            
        try {
        qc1.adicionarQuarto(n, txtTipoQuarto.getText(), valor);
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro ao adicionar novo quarto");
        }
          JOptionPane.showMessageDialog(null, "Novo quarto adicionado!");                
          FormularioQuartoView.this.dispose();
          new MenusView(cargo).setVisible(true);
                    
                            
            
        
    }//GEN-LAST:event_btnCadastarFuncionarioActionPerformed

    private void txtTipoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoQuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoQuartoActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        new MenusView(cargo).setVisible(true);
        FormularioQuartoView.this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void txtNumeroQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroQuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroQuartoActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField txtNumeroQuarto;
    private javax.swing.JTextField txtTipoQuarto;
    private javax.swing.JFormattedTextField txtValorQuarto;
    // End of variables declaration//GEN-END:variables
}
