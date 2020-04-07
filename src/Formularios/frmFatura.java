
package Formularios;


import Classes.Dados;
import Classes.Opcoes;
import Classes.Utilidades;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;


public class frmFatura extends javax.swing.JInternalFrame{
  private Dados msDados;
  private DefaultTableModel mTabela;
    
    public void setDados(Dados msDados){
        this.msDados = msDados;
    }
    public frmFatura() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdata = new javax.swing.JTextField();
        cmbcliente = new javax.swing.JComboBox<>();
        cmbproduto = new javax.swing.JComboBox<>();
        txtquantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldetalhes = new javax.swing.JTable();
        btnpesqcliente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnadicionar = new javax.swing.JButton();
        btndeletar = new javax.swing.JButton();
        btndeletartodos = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        txtquant = new javax.swing.JTextField();
        btnpesqproduto = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("FORMULARIO DE COMPRAS");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Data:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Fornecedor:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Produto:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Quantidade:");

        txtdata.setEnabled(false);
        txtdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdataActionPerformed(evt);
            }
        });

        cmbcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbclienteActionPerformed(evt);
            }
        });

        cmbproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbprodutoActionPerformed(evt);
            }
        });

        tbldetalhes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbldetalhes);

        btnpesqcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar-20.png"))); // NOI18N
        btnpesqcliente.setToolTipText("PESQUISAR FORNECEDOR");
        btnpesqcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesqclienteActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo-flexi-sem fundo.png"))); // NOI18N

        btnadicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/adicionar compra.png"))); // NOI18N
        btnadicionar.setToolTipText("ADICIONAR PRODUTO");
        btnadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadicionarActionPerformed(evt);
            }
        });

        btndeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-cancelar-33.png"))); // NOI18N
        btndeletar.setToolTipText("DELETAR PRODUTO");
        btndeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletarActionPerformed(evt);
            }
        });

        btndeletartodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/apagar tudo compra.png"))); // NOI18N
        btndeletartodos.setToolTipText("DELETAR TODOS OS PRODUTOS");
        btndeletartodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletartodosActionPerformed(evt);
            }
        });

        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar compra.png"))); // NOI18N
        btnsalvar.setToolTipText("SALVAR COMPRA");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("TOTAL:");

        txtvalor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtvalor.setEnabled(false);

        txtquant.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtquant.setEnabled(false);

        btnpesqproduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar-20.png"))); // NOI18N
        btnpesqproduto.setToolTipText("PESQUISAR PRODUTO");
        btnpesqproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesqprodutoActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("QUANT");

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("VALOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbcliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbproduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnpesqcliente, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnpesqproduto, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(54, 54, 54)
                                        .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(36, 36, 36))))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btndeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(btndeletartodos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btnsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtquant, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(162, 162, 162)
                        .addComponent(jLabel8)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(cmbcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cmbproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addComponent(btnpesqproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnpesqcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndeletartodos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdataActionPerformed

    private void btndeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletarActionPerformed
        if(cmbproduto.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "FAVOR SELECIONAR PRODUTO!");
            cmbproduto.requestFocusInWindow();
            return;
        }
        try{
            DefaultTableModel modelo = (DefaultTableModel)tbldetalhes.getModel();
            int Linha = tbldetalhes.getRowCount();
            for(int i = 0 ; Linha> i; i++){
                String idTabela = Utilidades.objectToString(tbldetalhes.getValueAt(i, 0));
                String idCombo =((Opcoes)cmbproduto.getSelectedItem()).getValor();
                if(idTabela.equals(idCombo)){
                modelo.removeRow(i);
                totais();
                return;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    
        
    }//GEN-LAST:event_btndeletarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Opcoes opc = new Opcoes("esdrasfn@gmail.com", "SELECIONE UM FORNECEDOR");
        cmbcliente.addItem(opc);
        for( int i =0; i<msDados.numeroClientes();i++){
            opc = new Opcoes(
                    msDados.getClientes()[i].getIdcliente(),
                    msDados.getClientes()[i].getNome()+""+
                    msDados.getClientes()[i].getSnome());
                    cmbcliente.addItem(opc);
        }
        opc = new Opcoes("esdrasfn@gmail.com", "SELECIONE UM PRODUTO");
        cmbproduto.addItem(opc);
        for( int i =0; i<msDados.numeroProdutos();i++){
            opc = new Opcoes(
                    msDados.getProdutos()[i].getIdProduto(),
                    msDados.getProdutos()[i].getDescricao());
                    cmbproduto.addItem(opc);
        }
        txtdata.setText(Utilidades.formatDate(new Date()));
        txtquant.setText("0");
        txtvalor.setText("0");
        
        preencherTabela();
    }//GEN-LAST:event_formInternalFrameOpened
    
    private void cmbclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbclienteActionPerformed

    private void cmbprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbprodutoActionPerformed

    private void btnadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadicionarActionPerformed
        if(cmbproduto.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "FAVOR SELECIONAR PRODUTO!");
            cmbproduto.requestFocusInWindow();
            return;
        }
        if(txtquantidade.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "FAVOR DIGITAR QUANTIDADE!");
            cmbproduto.requestFocusInWindow(); 
            return;
        }
        if(!Utilidades.isNumeric(txtquantidade.getText())){
            JOptionPane.showMessageDialog(rootPane, "FAVOR DIGITAR APENAS NÚMEROS");
            txtquantidade.setText("");
            txtquantidade.requestFocusInWindow();
            return;
        }
        
        int quantidade = Integer.parseInt(txtquantidade.getText());
        if (quantidade <= 0){
            JOptionPane.showMessageDialog(rootPane, "FAVOR DIGITAR UM NUMERO ACIMA DE ZERO ");
            txtquantidade.setText(""); 
            txtquantidade.requestFocusInWindow();
            return;
        }
        int pos = msDados.posicaoProduto(((Opcoes)cmbproduto.getSelectedItem()).getValor());
        
        String registro[] = new String[5];
        registro[0]=msDados.getProdutos()[pos].getIdProduto();
        registro[1]=msDados.getProdutos()[pos].getDescricao();
        registro[2]=""+ msDados.getProdutos()[pos].getPreco();
        registro[3]=""+ quantidade;
        registro[4]=""+ (quantidade* msDados.getProdutos()[pos].getPreco());
        mTabela.addRow(registro);
        
        cmbproduto.setSelectedIndex(0);
        txtquantidade.setText("");
        cmbproduto.requestFocusInWindow();
        totais();
    }//GEN-LAST:event_btnadicionarActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        if (cmbcliente.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "FAVOR SELECIONAR UM FORNECEDOR");
            cmbcliente.requestFocusInWindow();
            return;
        }
        int totalquant = new Integer(txtquant.getText());  
        if(totalquant==0){
            JOptionPane.showMessageDialog(rootPane, "FAVOR SELECIONAR PRODUTOS PARA COMPRA");
            cmbproduto.requestFocusInWindow();
            return;
        }
        
        int resposta = JOptionPane.showConfirmDialog(rootPane, "DESEJA CONFIRMAR COMPRA?");
        if(resposta !=0){
           return;
        }
        
        int numFatura = msDados.getNumeroFatura()+1;
        
        FileWriter fw =null;
        PrintWriter pw =null;
    
    try{
        fw= new FileWriter("Dadosbd/fatura.txt", true);
        pw= new PrintWriter(fw);
        
        String aux = "1|"
                +numFatura+"|"
                +((Opcoes)cmbcliente.getSelectedItem()).getValor()+"-"
                +((Opcoes)cmbcliente.getSelectedItem()).getDescricao()+"-"
                +txtdata.getText();
        pw.println(aux);
                
        int num = tbldetalhes.getRowCount();
       
        for (int i = 0; i < num; i++){
            aux ="2-"
            +Utilidades.objectToString(tbldetalhes.getValueAt(i, 0))+"-"
            +Utilidades.objectToString(tbldetalhes.getValueAt(i, 1))+"-"
            +Utilidades.objectToString(tbldetalhes.getValueAt(i, 2))+"-"
            +Utilidades.objectToString(tbldetalhes.getValueAt(i, 3))+"-"
            +Utilidades.objectToString(tbldetalhes.getValueAt(i, 4));
            
            pw.println(aux);
        }
        
    }catch(Exception e1){
        e1.printStackTrace();
    }finally{
        try{
            if (fw != null){
                fw.close();
            }
    }catch(Exception e2){
        e2.printStackTrace();
    }       
}
    JOptionPane.showMessageDialog(rootPane, "COMPRA REALIZADA COM SUCESSO!");
    msDados.setNumeroFatura();
    cmbcliente.setSelectedIndex(0);
    Limpartabela();
    totais();
    cmbcliente.requestFocusInWindow();
                
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btndeletartodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletartodosActionPerformed
       int resposta = JOptionPane.showConfirmDialog(rootPane, "DESEJA REALMENTE DELETAR ESTA COMPRA?");
        if(resposta !=0){
           return;
    }//GEN-LAST:event_btndeletartodosActionPerformed
    }
    private void btnpesqclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqclienteActionPerformed
        frmPesqFornecedor mpesqFornecedor = new frmPesqFornecedor(null, closable);
        mpesqFornecedor.setDados(msDados);
        mpesqFornecedor.setLocationRelativeTo(null);
        mpesqFornecedor.setVisible(true);
        String rta = mpesqFornecedor.getResposta();
        if(rta.equals("")){
            return;
        }
        for(int i = 0; i<cmbcliente.getItemCount();i++){
            if(((Opcoes)cmbcliente.getItemAt(i)).getValor().equals(rta)){
                cmbcliente.setSelectedIndex(i);
                return;
            }
        }
    }//GEN-LAST:event_btnpesqclienteActionPerformed

    private void btnpesqprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqprodutoActionPerformed
       frmpesqProdutos mpesqProdutos = new frmpesqProdutos(null, closable);
        mpesqProdutos.setDados(msDados);
        mpesqProdutos.setLocationRelativeTo(null);
        mpesqProdutos.setVisible(true);
        String rta = mpesqProdutos.getResposta();
        if(rta.equals("")){
            return;
        }
        for(int i = 0; i<cmbproduto.getItemCount();i++){
            if(((Opcoes)cmbproduto.getItemAt(i)).getValor().equals(rta)){
                cmbproduto.setSelectedIndex(i);
                return;
            }
        }
    }//GEN-LAST:event_btnpesqprodutoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadicionar;
    private javax.swing.JButton btndeletar;
    private javax.swing.JButton btndeletartodos;
    private javax.swing.JButton btnpesqcliente;
    private javax.swing.JButton btnpesqproduto;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JComboBox<Object> cmbcliente;
    private javax.swing.JComboBox<Object> cmbproduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbldetalhes;
    private javax.swing.JTextField txtdata;
    private javax.swing.JTextField txtquant;
    private javax.swing.JTextField txtquantidade;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
    
    private void preencherTabela(){
    String titulos[]= {"ID PROD","DESC","PRECO","QUANT","VALOR"};
    String registro[] = new String[5];
    mTabela = new DefaultTableModel(null,titulos);
    tbldetalhes.setModel(mTabela);
         
    }
    private void totais(){
        int num = tbldetalhes.getRowCount();
        int somQuant = 0, somVal= 0;
        for (int i = 0; i < num; i++){
            somQuant += Utilidades.objectToInt(tbldetalhes.getValueAt(i, 3));
            somVal += Utilidades.objectToInt(tbldetalhes.getValueAt(i, 4));
            
        }
        txtquant.setText(""+somQuant);
        txtvalor.setText(""+somVal);
        
    }
    
    public void Limpartabela(){
        try{
            DefaultTableModel modelo = (DefaultTableModel)tbldetalhes.getModel();
            int Linha = tbldetalhes.getRowCount();
            for(int i = 0 ; Linha> i; i++){
                modelo.removeRow(0);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
    

