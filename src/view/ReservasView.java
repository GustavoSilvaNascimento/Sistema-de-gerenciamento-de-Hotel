package view;

import controller.ReservasController;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Quartos;
import model.Reservas;

public class ReservasView extends javax.swing.JFrame {
   String cargo;
    public ReservasView(String cargo) throws SQLException {
        initComponents();
        setExtendedState(ReservasView.MAXIMIZED_BOTH);
        this.cargo=cargo;
        preencherComboBoxClientes();
        preencherComboBoxQuartosVagos();
        preencherComboReserva();
    }

    
    @SuppressWarnings("unchecked")
    ReservasController reControll = new ReservasController();
    Quartos quartoSelecionado=new Quartos();
    Quartos quartoSelecionadoN=new Quartos();
    ArrayList<Reservas> reservas=new ArrayList<>();
    ArrayList<Quartos>quarto=new ArrayList<>();
    ArrayList<Quartos>quartoN =reControll.listarQuartosPorStatus(Quartos.Status.RESERVADO);
    ArrayList<Reservas> reservaN = reControll.listarPorStatus(Reservas.StatusReserva.Ativo);
    int id;
    int idQuarto;
    int idQuartoNovo;
    int idReservaNovo;
    int idClienteNovo;
    
    
    
   private void preencherComboReserva() throws SQLException{
        comboQuartoAlterar.addItem( "<selecione um quarto>" );
        for(Quartos q: quartoN){
            comboQuartoAlterar.addItem(q);
            comboExcluir.addItem(q);
        }
   };
   private void preencherComboBoxClientes(){
        comboBoxCliente.removeAllItems();  
        comboBoxCliente.addItem("<Selecione um Cliente>");
        try {
            ArrayList<Cliente> listaClientes = reControll.listarCliente();
            for (Cliente c : listaClientes) {
                comboBoxCliente.addItem(c);  
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaClientesView.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
   private void preencherComboBoxQuartosVagos() {
        comboBoxQuartosVagos.removeAllItems();
        comboBoxQuartosVagos.addItem("<Selecione um quarto>");

        try {
            quarto = reControll.listarQuartosPorStatus(Quartos.Status.DISPONIVEL);
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi possível listar quartos vagos");
            return;
        }

        if (quarto == null || quarto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum quarto disponível no momento.");
            return;
        }

        for (Quartos q : quarto) {
            comboBoxQuartosVagos.addItem(
                "Quarto " + q.getNumero() +
                " | Status: " + q.getStatus() +
                " | Diária: R$ " + q.getValor_diaria()
            );
        }
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCadastarUsuario = new javax.swing.JToggleButton();
        comboBoxCliente = new javax.swing.JComboBox<>();
        comboBoxQuartosVagos = new javax.swing.JComboBox<>();
        btncadastrarCliente = new javax.swing.JLabel();
        txtDate = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        comboQuartoAlterar = new javax.swing.JComboBox<>();
        comboClienteAlterar = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAlterarReserva = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        DataNova = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        comboExcluir = new javax.swing.JComboBox<>();
        btnExcluir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 540));
        setSize(new java.awt.Dimension(950, 535));

        jPanel1.setBackground(new java.awt.Color(92, 225, 230));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 540));

        jPanel5.setBackground(new java.awt.Color(68, 159, 163));

        jTabbedPane1.setBackground(new java.awt.Color(68, 159, 163));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(68, 159, 163));
        jPanel2.setForeground(new java.awt.Color(68, 159, 163));
        jPanel2.setPreferredSize(new java.awt.Dimension(290, 380));

        jLabel2.setBackground(new java.awt.Color(102, 255, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastrar Reserva");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cliente:");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quarto:");

        btnCadastarUsuario.setBackground(new java.awt.Color(92, 225, 230));
        btnCadastarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCadastarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastarUsuario.setText("Cadastrar");
        btnCadastarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastarUsuario.setContentAreaFilled(false);
        btnCadastarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastarUsuarioActionPerformed(evt);
            }
        });

        comboBoxCliente.setPreferredSize(new java.awt.Dimension(72, 25));
        comboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxClienteActionPerformed(evt);
            }
        });

        comboBoxQuartosVagos.setPreferredSize(new java.awt.Dimension(72, 25));
        comboBoxQuartosVagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxQuartosVagosActionPerformed(evt);
            }
        });

        btncadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btncadastrarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btncadastrarCliente.setText("Cadastrar Cliente");
        btncadastrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncadastrarClienteMouseClicked(evt);
            }
        });

        txtDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setPreferredSize(new java.awt.Dimension(72, 25));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data da reservas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(comboBoxQuartosVagos, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 64, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCadastarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addComponent(btncadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(comboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(9, 9, 9)
                .addComponent(comboBoxQuartosVagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btncadastrarCliente)
                .addGap(57, 57, 57))
        );

        jTabbedPane1.addTab("Nova reserva", jPanel2);

        jPanel3.setBackground(new java.awt.Color(68, 159, 163));

        comboQuartoAlterar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboQuartoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboQuartoAlterarActionPerformed(evt);
            }
        });

        comboClienteAlterar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboClienteAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClienteAlterarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reserva:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Alterar Cliente");

        btnAlterarReserva.setBackground(new java.awt.Color(68, 159, 163));
        btnAlterarReserva.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAlterarReserva.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarReserva.setText("Alterar");
        btnAlterarReserva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlterarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarReservaMouseClicked(evt);
            }
        });
        btnAlterarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarReservaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Alterar Informações");

        DataNova.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        DataNova.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Alterar Data da Reserva");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboQuartoAlterar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboClienteAlterar, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DataNova)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnAlterarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboQuartoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboClienteAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DataNova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnAlterarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar Reserva", jPanel3);

        jPanel4.setBackground(new java.awt.Color(68, 159, 163));

        comboExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboExcluirActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(68, 159, 163));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Cancelar");
        btnExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cancelar Reserva");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Reserva:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboExcluir, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(48, 48, 48)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jTabbedPane1.addTab("Cancelar reserva", jPanel4);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resoursers/250,250.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(290, 200));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        new MenusView(cargo).setVisible(true);
        ReservasView.this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void btncadastrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncadastrarClienteMouseClicked
        new FormularioClienteView(cargo).setVisible(true);
        ReservasView.this.dispose();
    }//GEN-LAST:event_btncadastrarClienteMouseClicked

    private void comboBoxQuartosVagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxQuartosVagosActionPerformed
        int qSelecionado=comboBoxQuartosVagos.getSelectedIndex();
        if(qSelecionado>0){
            if(!quarto.isEmpty()){
                quartoSelecionado = quarto.get(qSelecionado - 1);
                idQuarto = quartoSelecionado.getId();
            }
        }
    }//GEN-LAST:event_comboBoxQuartosVagosActionPerformed

    private void comboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxClienteActionPerformed
        try {
            int cSelecionado = comboBoxCliente.getSelectedIndex();

            comboBoxQuartosVagos.removeAllItems();
            comboBoxQuartosVagos.addItem("<Selecione um quarto>");

            if (cSelecionado <= 0) {
                return;
            }

            Cliente clienteSelecionado = (Cliente) comboBoxCliente.getItemAt(cSelecionado);
            id = clienteSelecionado.getId();

            reservas = reControll.listarReserva(id);

            if (reservas != null && !reservas.isEmpty()) {
                for (Reservas reserva : reservas) {
                    if(reserva.getStatus().equals(Reservas.StatusReserva.Ativo)){
                        Quartos quartosReserva = reControll.listarQuarto(reserva.getId_quarto());
                        if (quartosReserva.getStatus().equals(Quartos.Status.DISPONIVEL)) {
                            String descricao = "Quarto " + quartosReserva.getNumero() +
                            " | Status: " + quartosReserva.getStatus() +
                            " | Diária: R$ " + quartosReserva.getValor_diaria();
                            comboBoxQuartosVagos.addItem(descricao);
                        }
                    }
                }
            }

            preencherComboBoxQuartosVagos();

        } catch (SQLException ex) {
            Logger.getLogger(CheckView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao carregar quartos: " + ex.getMessage());
        }
    }//GEN-LAST:event_comboBoxClienteActionPerformed

    private void btnCadastarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastarUsuarioActionPerformed
        if (comboBoxCliente.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente!");
            id = 0;
            return;
        }
        if (comboBoxQuartosVagos.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione um Quarto!");
            idQuarto = 0;
            return;
        }
        if (comboBoxQuartosVagos.getSelectedIndex() > 0) {
            Date dataDigitada = (Date) txtDate.getValue();
            if (dataDigitada == null) {
                JOptionPane.showMessageDialog(null, "Data inválida!");
                return;
            }
            BigDecimal v = new BigDecimal("0");
            java.sql.Date dataConvert = new java.sql.Date(dataDigitada.getTime());
            Reservas reservaSelecionado =new Reservas();
            reservaSelecionado.setData_checkin(dataConvert);
            reservaSelecionado.setData_checkout(dataConvert);
            reservaSelecionado.setId_cliente(id);
            reservaSelecionado.setId_quarto(idQuarto);
            reservaSelecionado.setValor_total(v);
            reservaSelecionado.setStatus(Reservas.StatusReserva.Ativo);

            try {
                if(reControll.listarQuarto(idQuarto).getStatus().equals(Quartos.Status.DISPONIVEL)){
                    reControll.adicionarReserva(reservaSelecionado);
                    quartoSelecionado=reControll.listarQuarto(idQuarto);
                    quartoSelecionado.setStatus(Quartos.Status.RESERVADO);
                    reControll.atualizarQuarto(quartoSelecionado);
                    JOptionPane.showMessageDialog(null, "Reserva efetuada com sucesso!");
                    new ReservasView(cargo).setVisible(true);
                    ReservasView.this.dispose();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

        }
    }//GEN-LAST:event_btnCadastarUsuarioActionPerformed

    private void btnAlterarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarReservaActionPerformed
        try {
            Reservas r=reControll.listarReservaPorId(idReservaNovo);
            if(r.getId_cliente() !=idClienteNovo || !r.getData_checkin().equals((Date) DataNova.getValue())){
                r.setData_checkin((Date) DataNova.getValue());
                r.setId_cliente(idClienteNovo);
                reControll.atualizarReserva(r);
                JOptionPane.showMessageDialog(null, "Reserva atualizada!");
            }
            
            new ReservasView(cargo).setVisible(true);
            ReservasView.this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(ReservasView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAlterarReservaActionPerformed

    private void comboQuartoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboQuartoAlterarActionPerformed
       comboClienteAlterar.removeAllItems();
       int sele=comboQuartoAlterar.getSelectedIndex();
       if(comboQuartoAlterar.getSelectedIndex()==0){
           comboClienteAlterar.removeAllItems();
           return;}
       quartoSelecionadoN = (Quartos) comboQuartoAlterar.getItemAt(sele);
       
     
       for(Reservas re:reservaN){
           if(re.getId_quarto()==quartoSelecionadoN.getId()){
               try {
                   comboClienteAlterar.addItem(reControll.buscarPorId(re.getId_cliente()));
                   idQuartoNovo=re.getId_cliente();
                   idReservaNovo=re.getId();
                   DataNova.setValue(re.getData_checkin());
                   break;
               } catch (SQLException ex) {
                   Logger.getLogger(ReservasView.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
       }
       
        try {
            ArrayList<Cliente>listar;
            listar = reControll.listarCliente();
            for(Cliente c:listar){
                if(c.getId() !=idQuartoNovo){
                    comboClienteAlterar.addItem(c);
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ReservasView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboQuartoAlterarActionPerformed

    private void comboClienteAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClienteAlterarActionPerformed

           int select=comboClienteAlterar.getSelectedIndex();
           Cliente c= (Cliente) comboClienteAlterar.getItemAt(select);
           idClienteNovo=c.getId();
    }//GEN-LAST:event_comboClienteAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
     
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void comboExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboExcluirActionPerformed
        
    }//GEN-LAST:event_comboExcluirActionPerformed

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
        int select=comboExcluir.getSelectedIndex();
        Quartos q=(Quartos) comboExcluir.getItemAt(select);
        for(Reservas r: reservaN){
            if(q.getId()==r.getId_quarto()){
                try {
                    reControll.excluirReserva(r.getId());
                    q.setStatus(Quartos.Status.DISPONIVEL);
                    reControll.atualizarQuarto(q);
                } catch (SQLException ex) {
                    Logger.getLogger(ReservasView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        try {
            new ReservasView(cargo).setVisible(true);
            ReservasView.this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(ReservasView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirMouseClicked

    private void btnAlterarReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarReservaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarReservaMouseClicked

    /**
     * @param args the command line arguments
     */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField DataNova;
    private javax.swing.JButton btnAlterarReserva;
    private javax.swing.JToggleButton btnCadastarUsuario;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel btncadastrarCliente;
    private javax.swing.JComboBox<Object> comboBoxCliente;
    private javax.swing.JComboBox<String> comboBoxQuartosVagos;
    private javax.swing.JComboBox<Object> comboClienteAlterar;
    private javax.swing.JComboBox<Object> comboExcluir;
    private javax.swing.JComboBox<Object> comboQuartoAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JFormattedTextField txtDate;
    // End of variables declaration//GEN-END:variables
}
