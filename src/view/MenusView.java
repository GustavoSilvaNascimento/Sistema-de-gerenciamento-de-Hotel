package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class MenusView extends javax.swing.JFrame {
        String cargo;

        public MenusView(String cargo) {
            
            initComponents();
            setExtendedState(MenusView.MAXIMIZED_BOTH);
            this.cargo=cargo;
            
            if(cargo.equals("Gerente") || cargo.equals("Mestre")){
                btnGestao.setEnabled(true);
                btnGestao.setVisible(true);
            }else{
                admCadastrarFuncionario.setEnabled(false);
                admCadastrarNovoQuarto.setEnabled(false);
                admCadastrarFuncionario.setVisible(false);
                admCadastrarNovoQuarto.setVisible(false);
                btnGestao.setVisible(false);
                btnGestao.setEnabled(false);
            }
            
        }
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnListarClientes = new javax.swing.JToggleButton();
        btnListarQuartos = new javax.swing.JToggleButton();
        btnCheck = new javax.swing.JToggleButton();
        btncadastrarCliente = new javax.swing.JToggleButton();
        btnReservas = new javax.swing.JToggleButton();
        btnPagamentos = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        btnGestao = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        admCadastrarNovoQuarto = new javax.swing.JMenu();
        admExcluirQuarto = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        admCadastrarFuncionario = new javax.swing.JMenu();
        admexcluirFuncionario = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 535));

        jPanel1.setBackground(new java.awt.Color(92, 225, 230));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 535));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 535));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnListarClientes.setBackground(new java.awt.Color(68, 159, 163));
        btnListarClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnListarClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnListarClientes.setText("Listar clientes");
        btnListarClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListarClientes.setBorderPainted(false);
        btnListarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarClientes.setMaximumSize(new java.awt.Dimension(182, 25));
        btnListarClientes.setMinimumSize(new java.awt.Dimension(182, 25));
        btnListarClientes.setPreferredSize(new java.awt.Dimension(182, 25));
        btnListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarClientesActionPerformed(evt);
            }
        });

        btnListarQuartos.setBackground(new java.awt.Color(68, 159, 163));
        btnListarQuartos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnListarQuartos.setForeground(new java.awt.Color(255, 255, 255));
        btnListarQuartos.setText("Listar Quartos");
        btnListarQuartos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListarQuartos.setBorderPainted(false);
        btnListarQuartos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarQuartos.setMaximumSize(new java.awt.Dimension(182, 25));
        btnListarQuartos.setMinimumSize(new java.awt.Dimension(182, 25));
        btnListarQuartos.setPreferredSize(new java.awt.Dimension(182, 25));
        btnListarQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarQuartosActionPerformed(evt);
            }
        });

        btnCheck.setBackground(new java.awt.Color(68, 159, 163));
        btnCheck.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCheck.setForeground(new java.awt.Color(255, 255, 255));
        btnCheck.setText("Fazer Checkin/Checkout");
        btnCheck.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCheck.setBorderPainted(false);
        btnCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheck.setMaximumSize(new java.awt.Dimension(182, 25));
        btnCheck.setMinimumSize(new java.awt.Dimension(182, 25));
        btnCheck.setPreferredSize(new java.awt.Dimension(182, 25));
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btncadastrarCliente.setBackground(new java.awt.Color(68, 159, 163));
        btncadastrarCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btncadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btncadastrarCliente.setText("Cadastrar novo cliente");
        btncadastrarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncadastrarCliente.setBorderPainted(false);
        btncadastrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncadastrarCliente.setMaximumSize(new java.awt.Dimension(182, 25));
        btncadastrarCliente.setMinimumSize(new java.awt.Dimension(182, 25));
        btncadastrarCliente.setPreferredSize(new java.awt.Dimension(182, 25));
        btncadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarClienteActionPerformed(evt);
            }
        });

        btnReservas.setBackground(new java.awt.Color(68, 159, 163));
        btnReservas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReservas.setForeground(new java.awt.Color(255, 255, 255));
        btnReservas.setText("Reservas");
        btnReservas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReservas.setBorderPainted(false);
        btnReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReservas.setMaximumSize(new java.awt.Dimension(182, 25));
        btnReservas.setMinimumSize(new java.awt.Dimension(182, 25));
        btnReservas.setPreferredSize(new java.awt.Dimension(182, 25));
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });

        btnPagamentos.setBackground(new java.awt.Color(68, 159, 163));
        btnPagamentos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPagamentos.setForeground(new java.awt.Color(255, 255, 255));
        btnPagamentos.setText("Relatorio de Pagamento");
        btnPagamentos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPagamentos.setBorderPainted(false);
        btnPagamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagamentos.setMaximumSize(new java.awt.Dimension(182, 25));
        btnPagamentos.setMinimumSize(new java.awt.Dimension(182, 25));
        btnPagamentos.setPreferredSize(new java.awt.Dimension(182, 25));
        btnPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentosActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resoursers/250,250.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnListarQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btncadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btnGestao.setText("Gestão");
        btnGestao.setEnabled(false);
        btnGestao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu4.setText("Quarto");

        admCadastrarNovoQuarto.setText("Cadastrar novo Quarto");
        admCadastrarNovoQuarto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admCadastrarNovoQuartoMouseClicked(evt);
            }
        });
        admCadastrarNovoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admCadastrarNovoQuartoActionPerformed(evt);
            }
        });
        jMenu4.add(admCadastrarNovoQuarto);

        admExcluirQuarto.setText("Excluir quarto");
        admExcluirQuarto.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                admExcluirQuartoMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        admExcluirQuarto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admExcluirQuartoMouseClicked(evt);
            }
        });
        admExcluirQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admExcluirQuartoActionPerformed(evt);
            }
        });
        jMenu4.add(admExcluirQuarto);

        btnGestao.add(jMenu4);

        jMenu5.setText("Funcionario");

        admCadastrarFuncionario.setText("Cadastrar novo funcionario");
        admCadastrarFuncionario.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                admCadastrarFuncionarioMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        admCadastrarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admCadastrarFuncionarioMouseClicked(evt);
            }
        });
        admCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admCadastrarFuncionarioActionPerformed(evt);
            }
        });
        jMenu5.add(admCadastrarFuncionario);

        admexcluirFuncionario.setText("Excluir funcionario");
        admexcluirFuncionario.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                admexcluirFuncionarioMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        admexcluirFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admexcluirFuncionarioMouseClicked(evt);
            }
        });
        admexcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admexcluirFuncionarioActionPerformed(evt);
            }
        });
        jMenu5.add(admexcluirFuncionario);

        btnGestao.add(jMenu5);

        jMenuBar2.add(btnGestao);

        jMenu3.setText("Sair");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarClientesActionPerformed
            new ConsultaClientesView(cargo).setVisible(true);
            MenusView.this.dispose();
    }//GEN-LAST:event_btnListarClientesActionPerformed

    private void btnListarQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarQuartosActionPerformed
        new ConsultaQuartoView(cargo).setVisible(true);
        MenusView.this.dispose();
    }//GEN-LAST:event_btnListarQuartosActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
            try {
                new CheckView(cargo).setVisible(true);
                
                MenusView.this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(MenusView.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btncadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarClienteActionPerformed
        new FormularioClienteView(cargo).setVisible(true);
        MenusView.this.dispose();
    }//GEN-LAST:event_btncadastrarClienteActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
            try {
                new ReservasView(cargo).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(MenusView.class.getName()).log(Level.SEVERE, null, ex);
            }
            MenusView.this.dispose();
    }//GEN-LAST:event_btnReservasActionPerformed

    private void btnPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentosActionPerformed
        new ConsultaPagamentoView(cargo).setVisible(true);
        MenusView.this.dispose();
    }//GEN-LAST:event_btnPagamentosActionPerformed

    private void admCadastrarFuncionarioMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_admCadastrarFuncionarioMenuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_admCadastrarFuncionarioMenuKeyPressed

    private void admCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admCadastrarFuncionarioActionPerformed
        
        
    }//GEN-LAST:event_admCadastrarFuncionarioActionPerformed

    private void admCadastrarNovoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admCadastrarNovoQuartoActionPerformed
        
    }//GEN-LAST:event_admCadastrarNovoQuartoActionPerformed

    private void admCadastrarFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admCadastrarFuncionarioMouseClicked
        new FormularioFuncionarioView(cargo).setVisible(true);
        MenusView.this.dispose();
    }//GEN-LAST:event_admCadastrarFuncionarioMouseClicked

    private void admCadastrarNovoQuartoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admCadastrarNovoQuartoMouseClicked
        new FormularioQuartoView(cargo).setVisible(true);
        MenusView.this.dispose();
    }//GEN-LAST:event_admCadastrarNovoQuartoMouseClicked

    private void admExcluirQuartoMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_admExcluirQuartoMenuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_admExcluirQuartoMenuKeyPressed

    private void admExcluirQuartoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admExcluirQuartoMouseClicked
            try {
                new excluirQuartoView(cargo).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(MenusView.class.getName()).log(Level.SEVERE, null, ex);
            }
        MenusView.this.dispose();
    }//GEN-LAST:event_admExcluirQuartoMouseClicked

    private void admExcluirQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admExcluirQuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admExcluirQuartoActionPerformed

    private void admexcluirFuncionarioMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_admexcluirFuncionarioMenuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_admexcluirFuncionarioMenuKeyPressed

    private void admexcluirFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admexcluirFuncionarioMouseClicked
            try {
                new excluirFuncionarioView(cargo).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(MenusView.class.getName()).log(Level.SEVERE, null, ex);
            }
        MenusView.this.dispose();
    }//GEN-LAST:event_admexcluirFuncionarioMouseClicked

    private void admexcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admexcluirFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admexcluirFuncionarioActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        new LoginView().setVisible(true);
        MenusView.this.dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu admCadastrarFuncionario;
    private javax.swing.JMenu admCadastrarNovoQuarto;
    private javax.swing.JMenu admExcluirQuarto;
    private javax.swing.JMenu admexcluirFuncionario;
    private javax.swing.JToggleButton btnCheck;
    private javax.swing.JMenu btnGestao;
    private javax.swing.JToggleButton btnListarClientes;
    private javax.swing.JToggleButton btnListarQuartos;
    private javax.swing.JToggleButton btnPagamentos;
    private javax.swing.JToggleButton btnReservas;
    private javax.swing.JToggleButton btncadastrarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
