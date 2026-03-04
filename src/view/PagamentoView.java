
package view;
import controller.PagamentoController;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Pagamento;
import model.Quartos;
import model.Reservas;
import controller.CheckinController;


public final class PagamentoView extends javax.swing.JFrame {
    String cargo;
    private int idQuarto, IdCliente, idReserva, meioPagamento;
    private BigDecimal totalS;
    private String pagamento;
    
    PagamentoController conp=new PagamentoController();

   
    public PagamentoView(int idQuarto, int IdCliente, int idReserva, int meioPagamento, String cargo) throws SQLException {
        initComponents();
        this.idQuarto = idQuarto;
        this.IdCliente = IdCliente;
        this.idReserva = idReserva;
        this.meioPagamento = meioPagamento;
        this.cargo=cargo;
        
        setExtendedState(PagamentoView.MAXIMIZED_BOTH);
        pe();
    }
    
    public PagamentoView() {
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        tQuarto = new javax.swing.JTextField();
        tdataIn = new javax.swing.JTextField();
        tvalor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tforma = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tdataOut = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 535));
        setSize(new java.awt.Dimension(950, 535));

        jPanel1.setBackground(new java.awt.Color(92, 225, 230));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 535));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 535));

        jPanel2.setBackground(new java.awt.Color(68, 159, 163));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quarto:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data de chegada:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor Total:");

        tNome.setEditable(false);
        tNome.setBackground(new java.awt.Color(255, 255, 255));
        tNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tNome.setForeground(new java.awt.Color(0, 0, 0));
        tNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tNome.setBorder(null);
        tNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNomeActionPerformed(evt);
            }
        });

        tQuarto.setEditable(false);
        tQuarto.setBackground(new java.awt.Color(255, 255, 255));
        tQuarto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tQuarto.setForeground(new java.awt.Color(0, 0, 0));
        tQuarto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tQuarto.setBorder(null);

        tdataIn.setEditable(false);
        tdataIn.setBackground(new java.awt.Color(255, 255, 255));
        tdataIn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tdataIn.setForeground(new java.awt.Color(0, 0, 0));
        tdataIn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tdataIn.setBorder(null);

        tvalor.setEditable(false);
        tvalor.setBackground(new java.awt.Color(255, 255, 255));
        tvalor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tvalor.setForeground(new java.awt.Color(0, 0, 0));
        tvalor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tvalor.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Forma de pagamento:");

        tforma.setEditable(false);
        tforma.setBackground(new java.awt.Color(255, 255, 255));
        tforma.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tforma.setForeground(new java.awt.Color(0, 0, 0));
        tforma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tforma.setBorder(null);

        jButton1.setBackground(new java.awt.Color(68, 159, 163));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Confirmar pagamento");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Resumo de pagamento");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data de saída:");

        tdataOut.setEditable(false);
        tdataOut.setBackground(new java.awt.Color(255, 255, 255));
        tdataOut.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tdataOut.setForeground(new java.awt.Color(0, 0, 0));
        tdataOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tdataOut.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                        .addComponent(tNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tQuarto, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tdataIn, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tvalor, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tforma, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tdataOut, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tdataIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tdataOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(273, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(4, Short.MAX_VALUE))
        );

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
    CheckinController ch=new CheckinController();
    public void pe() throws SQLException{
            
            Cliente c=conp.listarCliente(IdCliente);
            Reservas r=conp.listarPorId(idReserva);
            Quartos q=conp.listarQuarto(idQuarto);
            tNome.setText(c.getNome());
            tQuarto.setText("numero: "+q.getNumero()+" Tipo: "+q.getTipo());
        
            Date dataCheckin = r.getData_checkin();
            Date dataCheckOut = r.getData_checkout();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            String dataFormatadaIn = sdf.format(dataCheckin);
            String dataFormatadaOut=sdf.format(dataCheckOut);
        
        tdataIn.setText(dataFormatadaIn);
        tdataOut.setText(dataFormatadaOut);
        
            long diferencaEmMillis = dataCheckOut.getTime() - dataCheckin.getTime();
            long dias = diferencaEmMillis / (1000 * 60 * 60 * 24);

            BigDecimal total = q.getValor_diaria().multiply(BigDecimal.valueOf(dias));
            totalS=total;
        tvalor.setText("Total: "+total);
        
        switch (meioPagamento) {
        case 0 -> {
            tforma.setText("Cartão de Crédito");
            pagamento = "Cartão de Crédito";
            }
        case 1 -> {
            tforma.setText("Pix");
            pagamento = "Pix";
            }
        case 2 -> {
            tforma.setText("Cartão de débito");
            pagamento = "Cartão de débito";
            }
        case 3 -> {
            tforma.setText("Dinheiro");
            pagamento = "Dinheiro";
            }
        default -> {
            tforma.setText("Método desconhecido");
            pagamento = "Método desconhecido";
            }
        }
    }
    
    private void tNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        
        Pagamento p = new Pagamento();
        Reservas r = conp.listarPorId(idReserva);

        // dataPagamento recebe o data_checkout da reserva
        p.setDataPagamento((java.sql.Date) r.getData_checkout());
        // idReserva
        p.setIdReserva(idReserva);
        // conversão correta de String para Enum
        String metodoStr = pagamento;
        Pagamento.MetodoPagamento metodo = Pagamento.MetodoPagamento.fromString(metodoStr);
        p.setMetodo(metodo);
        // valor
        p.setValor(totalS);
        conp.adicionarPagamento(p);
        
        r.setValor_total(totalS);
        r.setStatus(Reservas.StatusReserva.Finalizado);
        ch.atualizarReserva(r);
        JOptionPane.showMessageDialog(null, "Pagamento registrado");

        // navegação
        new MenusView(cargo).setVisible(true);
        PagamentoView.this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, idReserva+" "+ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tQuarto;
    private javax.swing.JTextField tdataIn;
    private javax.swing.JTextField tdataOut;
    private javax.swing.JTextField tforma;
    private javax.swing.JTextField tvalor;
    // End of variables declaration//GEN-END:variables
}
