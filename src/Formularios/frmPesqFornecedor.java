
package Formularios;

import Classes.Dados;
import Classes.Utilidades;
import javax.swing.table.DefaultTableModel;

public class frmPesqFornecedor extends javax.swing.JDialog {

    private Dados msDados;
  private DefaultTableModel mTabela;
  private String resposta ="";
    
    public void setDados(Dados msDados){
        this.msDados = msDados;
    }
    
    public String getResposta(){
        return resposta;
    }
    
    private void preencherTabela(){
        String titulos[]= {"ID Fornecedor","Nome","Sobrenome"};
        String registro[]= new String[3];
        mTabela = new DefaultTableModel(null,titulos);
        if(txtpesq.getText().equals("")){
        for(int i =0; i<msDados.numeroClientes();i++){
            
            registro[0]= msDados.getClientes()[i].getIdcliente();
            registro[1]= msDados.getClientes()[i].getNome();
            registro[2]= msDados.getClientes()[i].getSnome();
            mTabela.addRow(registro);
            }
            tblTabela.setModel(mTabela);
            return;
        }
            if(radionome.isSelected()){
            for(int i =0; i<msDados.numeroClientes();i++){    
            if(msDados.getClientes()[i].getNome().startsWith(txtpesq.getText())){
            registro[0]= msDados.getClientes()[i].getIdcliente();
            registro[1]= msDados.getClientes()[i].getNome();
            registro[2]= msDados.getClientes()[i].getSnome();  
            mTabela.addRow(registro);
                }
            }
            tblTabela.setModel(mTabela);
            return;
        }
            
            if(radiosnome.isSelected()){
            for(int i =0; i<msDados.numeroClientes();i++){    
            if(msDados.getClientes()[i].getSnome().startsWith(txtpesq.getText())){
            registro[0]= msDados.getClientes()[i].getIdcliente();
            registro[1]= msDados.getClientes()[i].getNome();
            registro[2]= msDados.getClientes()[i].getSnome();  
            mTabela.addRow(registro);
                }
            }
            tblTabela.setModel(mTabela);
            return;
        }
        if(radioid.isSelected()){
            for(int i =0; i<msDados.numeroClientes();i++){    
            if(msDados.getClientes()[i].getIdcliente().startsWith(txtpesq.getText())){
            registro[0]= msDados.getClientes()[i].getIdcliente();
            registro[1]= msDados.getClientes()[i].getNome();
            registro[2]= msDados.getClientes()[i].getSnome();  
            mTabela.addRow(registro);
                }
            }
            tblTabela.setModel(mTabela);
            
        }
    }
    
    
    
    public frmPesqFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        bgtipopesq.add(radioid);
        bgtipopesq.add(radionome);
        bgtipopesq.add(radiosnome);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgtipopesq = new javax.swing.ButtonGroup();
        radioid = new javax.swing.JRadioButton();
        radionome = new javax.swing.JRadioButton();
        radiosnome = new javax.swing.JRadioButton();
        txtpesq = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        btnsair = new javax.swing.JButton();
        btnpesq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Fornecedor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        radioid.setSelected(true);
        radioid.setText("ID Fornecedor ");
        radioid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioidActionPerformed(evt);
            }
        });

        radionome.setText("Nome Fornecedor");
        radionome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radionomeActionPerformed(evt);
            }
        });

        radiosnome.setText("Sobrenome");
        radiosnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiosnomeActionPerformed(evt);
            }
        });

        txtpesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesqActionPerformed(evt);
            }
        });

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblTabela);

        btnsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-fechar-janela-24.png"))); // NOI18N
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        btnpesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar-20.png"))); // NOI18N
        btnpesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpesq)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radionome)
                        .addGap(54, 54, 54)
                        .addComponent(radiosnome)))
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnpesq)
                        .addGap(18, 18, 18)
                        .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioid)
                    .addComponent(radionome)
                    .addComponent(radiosnome))
                .addGap(18, 18, 18)
                .addComponent(txtpesq, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpesq, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesqActionPerformed
       preencherTabela();
    }//GEN-LAST:event_txtpesqActionPerformed

    private void btnpesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqActionPerformed
        int num = tblTabela.getRowCount();
        if(num== 0){
        resposta="";
        dispose();
        return;
        }
        for (int i = 0; i < num; i++){
            if(tblTabela.isRowSelected(i)){
            resposta = Utilidades.objectToString(tblTabela.getValueAt(i, 0));           
            dispose();
            return;
            } 
        }
        resposta = Utilidades.objectToString(tblTabela.getValueAt(0, 0));          
        dispose();
    }//GEN-LAST:event_btnpesqActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtpesq.requestFocusInWindow();
        preencherTabela();
        
    }//GEN-LAST:event_formWindowOpened

    private void radionomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radionomeActionPerformed
        txtpesq.setText("");
        txtpesq.requestFocusInWindow();
        preencherTabela();
    }//GEN-LAST:event_radionomeActionPerformed

    private void radiosnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiosnomeActionPerformed
        txtpesq.setText("");
        txtpesq.requestFocusInWindow();
        preencherTabela();
    }//GEN-LAST:event_radiosnomeActionPerformed

    private void radioidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioidActionPerformed
        txtpesq.setText("");
        txtpesq.requestFocusInWindow();
        preencherTabela();
    }//GEN-LAST:event_radioidActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        resposta="";
        dispose();
    }//GEN-LAST:event_btnsairActionPerformed

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
            java.util.logging.Logger.getLogger(frmPesqFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPesqFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPesqFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPesqFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPesqFornecedor dialog = new frmPesqFornecedor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgtipopesq;
    private javax.swing.JButton btnpesq;
    private javax.swing.JButton btnsair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioid;
    private javax.swing.JRadioButton radionome;
    private javax.swing.JRadioButton radiosnome;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtpesq;
    // End of variables declaration//GEN-END:variables
}
