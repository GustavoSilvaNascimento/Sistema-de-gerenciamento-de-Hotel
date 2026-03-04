package view;

import controller.CheckinController;
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

public class CheckView extends javax.swing.JFrame {
    String cargo;
    public CheckView(String cargo) throws SQLException {
        initComponents();
        setExtendedState(CheckView.MAXIMIZED_BOTH);
        this.cargo=cargo;
        preencherComboBoxClientes();
        preencherComboBoxQuartosVagos();
        preencherComboBoxClientesOut();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnFazerIn = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxQuartosVagos = new javax.swing.JComboBox<>();
        comboBoxCliente = new javax.swing.JComboBox<>();
        txtDate = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnFazerOut = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        comboMetodoPagamento = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        comboBoxClienteOut = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        comboBoxQuartosOcupados = new javax.swing.JComboBox<>();
        txtOutData = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 535));
        setSize(new java.awt.Dimension(950, 535));

        jPanel1.setBackground(new java.awt.Color(92, 225, 230));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 535));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 535));

        jTabbedPane1.setBackground(new java.awt.Color(68, 159, 163));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(68, 159, 163));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Checkin");

        btnFazerIn.setBackground(new java.awt.Color(92, 225, 230));
        btnFazerIn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnFazerIn.setForeground(new java.awt.Color(255, 255, 255));
        btnFazerIn.setText("Fazer Checkin");
        btnFazerIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFazerIn.setContentAreaFilled(false);
        btnFazerIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFazerIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFazerInMouseClicked(evt);
            }
        });
        btnFazerIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFazerInActionPerformed(evt);
            }
        });

        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar Cliente");
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Selecione o cliente:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data de chegada:");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resoursers/250,250.png"))); // NOI18N
        jLabel12.setOpaque(true);
        jLabel12.setPreferredSize(new java.awt.Dimension(290, 380));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quartos Disponiveis");

        comboBoxQuartosVagos.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxQuartosVagos.setMaximumRowCount(10);
        comboBoxQuartosVagos.setBorder(null);
        comboBoxQuartosVagos.setPreferredSize(new java.awt.Dimension(72, 25));
        comboBoxQuartosVagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxQuartosVagosActionPerformed(evt);
            }
        });

        comboBoxCliente.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxCliente.setMaximumRowCount(10);
        comboBoxCliente.setBorder(null);
        comboBoxCliente.setPreferredSize(new java.awt.Dimension(72, 25));
        comboBoxCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxClienteItemStateChanged(evt);
            }
        });
        comboBoxCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comboBoxClienteMouseExited(evt);
            }
        });
        comboBoxCliente.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                comboBoxClienteInputMethodTextChanged(evt);
            }
        });
        comboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxClienteActionPerformed(evt);
            }
        });

        txtDate.setBorder(null);
        txtDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setPreferredSize(new java.awt.Dimension(64, 25));
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(btnFazerIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxQuartosVagos, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxQuartosVagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnFazerIn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addGap(83, 83, 83))
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Fazer Checkin", jPanel2);

        jPanel3.setBackground(new java.awt.Color(68, 159, 163));
        jPanel3.setPreferredSize(new java.awt.Dimension(623, 405));
        jPanel3.setVerifyInputWhenFocusTarget(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Checkout");
        jLabel2.setPreferredSize(new java.awt.Dimension(125, 48));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nome do cliente:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Data de saida:");

        btnFazerOut.setBackground(new java.awt.Color(92, 225, 230));
        btnFazerOut.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnFazerOut.setForeground(new java.awt.Color(255, 255, 255));
        btnFazerOut.setText("Fazer Checkout");
        btnFazerOut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFazerOut.setContentAreaFilled(false);
        btnFazerOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFazerOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFazerOutActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Metodo de pagamento");

        comboMetodoPagamento.setForeground(new java.awt.Color(255, 255, 255));
        comboMetodoPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartão de Crédito", "pix", "Cartão de Débito", "Dinheiro" }));
        comboMetodoPagamento.setBorder(null);
        comboMetodoPagamento.setPreferredSize(new java.awt.Dimension(72, 25));
        comboMetodoPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMetodoPagamentoActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resoursers/250,250.png"))); // NOI18N
        jLabel13.setOpaque(true);
        jLabel13.setPreferredSize(new java.awt.Dimension(290, 380));

        comboBoxClienteOut.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxClienteOut.setMaximumRowCount(10);
        comboBoxClienteOut.setBorder(null);
        comboBoxClienteOut.setPreferredSize(new java.awt.Dimension(72, 25));
        comboBoxClienteOut.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxClienteOutItemStateChanged(evt);
            }
        });
        comboBoxClienteOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comboBoxClienteOutMouseExited(evt);
            }
        });
        comboBoxClienteOut.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                comboBoxClienteOutInputMethodTextChanged(evt);
            }
        });
        comboBoxClienteOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxClienteOutActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quartos Ocupados:");

        comboBoxQuartosOcupados.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxQuartosOcupados.setMaximumRowCount(10);
        comboBoxQuartosOcupados.setBorder(null);
        comboBoxQuartosOcupados.setPreferredSize(new java.awt.Dimension(72, 25));
        comboBoxQuartosOcupados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxQuartosOcupadosActionPerformed(evt);
            }
        });

        txtOutData.setBorder(null);
        txtOutData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtOutData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOutData.setPreferredSize(new java.awt.Dimension(64, 25));
        txtOutData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOutDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboMetodoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnFazerOut, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtOutData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBoxClienteOut, 0, 294, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboBoxQuartosOcupados, 0, 294, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboMetodoPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboBoxClienteOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOutData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxQuartosOcupados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnFazerOut, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Fazer Checkout", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 45, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorderPainted(false);

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
    
    Quartos quartoSelecionado=new Quartos();
    Quartos quartoSelecionadoOut=new Quartos();
    ArrayList<Cliente>listaClienteNomeOut=new ArrayList<>();
    ArrayList<Reservas> reservas=new ArrayList<>();
    ArrayList<Reservas> reservasOut=new ArrayList<>();
    ArrayList<Quartos>quarto=new ArrayList<>();
    ArrayList<Quartos>quartoOut=new ArrayList<>();

    CheckinController checkin=new CheckinController();
    int id;
    int idOut;
    int idQuarto;
    int idQuartoOut;
    int idReservasOut;
    
    
    
    private void preencherComboBoxClientes(){
        comboBoxCliente.removeAllItems();  
        comboBoxCliente.addItem("<Selecione um Cliente>");
        try {
            ArrayList<Cliente> listaClientes = checkin.listarCliente();
            for (Cliente c : listaClientes) {
                comboBoxCliente.addItem(c);  
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaClientesView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void preencherComboBoxClientesOut() throws SQLException {
        listaClienteNomeOut.clear(); 
        comboBoxClienteOut.removeAllItems();
        comboBoxClienteOut.addItem("<Selecione um Cliente>");

        reservasOut = checkin.listarReservaPorStatus(Quartos.Status.OCUPADO);
        ArrayList<Cliente> listaClientes = checkin.listarCliente();

        for (Reservas reserva : reservasOut) {
            for (Cliente cliente : listaClientes) {
                if (cliente.getId() == reserva.getId_cliente()) {
                    if (!listaClienteNomeOut.contains(cliente) && reserva.getStatus().equals(Reservas.StatusReserva.Ativo)) {  // Evita duplicatas
                        listaClienteNomeOut.add(cliente);
                        comboBoxClienteOut.addItem(cliente);
                    }
                }
            }
        }
    }

    private void preencherComboBoxQuartosVagos() {
        

        try {
            quarto = checkin.listarQuartosPorStatus(Quartos.Status.DISPONIVEL);
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi possível listar quartos vagos");
            return;
        }

        if (quarto == null || quarto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum quarto disponível no momento.");
            return;
        }

        for (Quartos q : quarto) {
            comboBoxQuartosVagos.addItem(q);
        }
    }
   
    private void comboBoxQuartosVagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxQuartosVagosActionPerformed
            if(comboBoxQuartosVagos.getSelectedIndex()>0){
                int qSelecionado=comboBoxQuartosVagos.getSelectedIndex();
                quartoSelecionado= (Quartos) comboBoxQuartosVagos.getItemAt(qSelecionado);
                idQuarto = quartoSelecionado.getId();
            }
    }//GEN-LAST:event_comboBoxQuartosVagosActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        new FormularioClienteView(cargo).setVisible(true);
        CheckView.this.dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void comboMetodoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMetodoPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMetodoPagamentoActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        new MenusView(cargo).setVisible(true);
        CheckView.this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

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

            reservas = checkin.listarReserva(id);
            if (reservas != null && !reservas.isEmpty()) {
                for (Reservas reserva : reservas) {
                    if(reserva.getStatus().equals(Reservas.StatusReserva.Ativo)){
                               Quartos quartosReserva = checkin.listarQuarto(reserva.getId_quarto());
                               if (quartosReserva.getStatus().equals(Quartos.Status.RESERVADO)) {
                                    comboBoxQuartosVagos.addItem(quartosReserva);
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

    private void comboBoxClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxClienteMouseExited
        
    }//GEN-LAST:event_comboBoxClienteMouseExited

    private void comboBoxClienteInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_comboBoxClienteInputMethodTextChanged
        
    }//GEN-LAST:event_comboBoxClienteInputMethodTextChanged

    private void comboBoxClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxClienteItemStateChanged
        
    }//GEN-LAST:event_comboBoxClienteItemStateChanged

    private void btnFazerInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFazerInMouseClicked

    }//GEN-LAST:event_btnFazerInMouseClicked

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void btnFazerInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFazerInActionPerformed
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
                if(checkin.listarQuarto(idQuarto).getStatus().equals(Quartos.Status.DISPONIVEL)){
                    checkin.adicionarReserva(reservaSelecionado);
                    quartoSelecionado=checkin.listarQuarto(idQuarto);
                    quartoSelecionado.setStatus(Quartos.Status.OCUPADO);
                    checkin.atualizarQuarto(quartoSelecionado);
                    JOptionPane.showMessageDialog(null, "Checkin efetuado com sucesso!");
                    new CheckView(cargo).setVisible(true);
                    CheckView.this.dispose();
                }
                if(checkin.listarQuarto(idQuarto).getStatus().equals(Quartos.Status.RESERVADO)){
                    checkin.atualizarReserva(reservaSelecionado);
                    quartoSelecionado=checkin.listarQuarto(idQuarto);
                    quartoSelecionado.setStatus(Quartos.Status.OCUPADO);
                    checkin.atualizarQuarto(quartoSelecionado);
                    JOptionPane.showMessageDialog(null, "Checkin efetuado com sucesso!");
                    new CheckView(cargo).setVisible(true);
                    CheckView.this.dispose();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

        }
    }//GEN-LAST:event_btnFazerInActionPerformed

    private void comboBoxClienteOutItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxClienteOutItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxClienteOutItemStateChanged

    private void comboBoxClienteOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxClienteOutMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxClienteOutMouseExited

    private void comboBoxClienteOutInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_comboBoxClienteOutInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxClienteOutInputMethodTextChanged

    private void comboBoxClienteOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxClienteOutActionPerformed
        try {
            comboBoxQuartosOcupados.removeAllItems();
            reservasOut = checkin.listarReservaPorStatus(Quartos.Status.OCUPADO);

            if (comboBoxClienteOut.getSelectedIndex() == 0) {
                return;
            }

            
            comboBoxQuartosOcupados.removeAllItems();
            comboBoxQuartosOcupados.addItem("<Selecione um Quarto>");
            quartoOut.clear();
            int c=comboBoxClienteOut.getSelectedIndex();
            
            Cliente clienteSelecionadoOut = (Cliente) comboBoxClienteOut.getItemAt(c);
            
            idOut = clienteSelecionadoOut.getId() ;

            for (Reservas reserva : reservasOut) {
                    if(reserva.getStatus().equals(Reservas.StatusReserva.Ativo)){
                            if (reserva.getId_cliente() == idOut) {
                                Quartos q = checkin.listarQuarto(reserva.getId_quarto());
                                quartoOut.add(q);
                                comboBoxQuartosOcupados.addItem("Numero: " + q.getNumero() + " Tipo: " + q.getTipo());
                            }
                    }
            }

        } catch (SQLException ex) {
            Logger.getLogger(CheckView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboBoxClienteOutActionPerformed

    private void comboBoxQuartosOcupadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxQuartosOcupadosActionPerformed
        int qSelecionado=comboBoxQuartosOcupados.getSelectedIndex();
            if(qSelecionado>0){
                if(!quartoOut.isEmpty()){
                    try {
                        quartoSelecionadoOut = quartoOut.get(qSelecionado - 1);
                        idQuartoOut = quartoSelecionadoOut.getId();
                        ArrayList<Reservas> re=new ArrayList<>();
                        re.addAll(checkin.listarPorQuarto(idQuartoOut));
                        for(Reservas reserva : re){
                            if(reserva.getStatus().equals(Reservas.StatusReserva.Ativo))
                                idReservasOut=reserva.getId();
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(CheckView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }   
            }
    }//GEN-LAST:event_comboBoxQuartosOcupadosActionPerformed

    private void btnFazerOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFazerOutActionPerformed
        
        if (comboBoxClienteOut.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente!");
            id = 0;
            return;
        }
        if (comboBoxQuartosOcupados.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione um Quarto!");
            idQuarto = 0;
            return;
        }
        if (comboMetodoPagamento.getSelectedIndex() <0) { 
            JOptionPane.showMessageDialog(null, "Selecione um Método de pagamento!");
            return;
        }

        Object valor = txtOutData.getValue();
        if (!(valor instanceof Date)) {
            JOptionPane.showMessageDialog(null, "Data inválida!");
            return;
        }
        Date dataDigitadaOut = (Date) valor;
        java.sql.Date dataConvertOut = new java.sql.Date(dataDigitadaOut.getTime());

        try {
            int metodo = comboMetodoPagamento.getSelectedIndex();
            
            Reservas re = checkin.listarPorId(idReservasOut);
            Quartos qo = checkin.listarQuarto(idQuartoOut);
            
            re.setData_checkout(dataConvertOut);
            qo.setStatus(Quartos.Status.DISPONIVEL);
            
            checkin.atualizarReserva(re);
            checkin.atualizarQuarto(qo);
            
            new PagamentoView(idQuartoOut, idOut, idReservasOut, metodo, cargo).setVisible(true);
            CheckView.this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados: " + ex.getMessage());
            Logger.getLogger(CheckView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnFazerOutActionPerformed

    private void txtOutDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOutDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOutDataActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnFazerIn;
    private javax.swing.JButton btnFazerOut;
    private javax.swing.JComboBox<Object> comboBoxCliente;
    private javax.swing.JComboBox<Object> comboBoxClienteOut;
    private javax.swing.JComboBox<String> comboBoxQuartosOcupados;
    private javax.swing.JComboBox<Object> comboBoxQuartosVagos;
    private javax.swing.JComboBox<String> comboMetodoPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JFormattedTextField txtDate;
    private javax.swing.JFormattedTextField txtOutData;
    // End of variables declaration//GEN-END:variables


    
}
