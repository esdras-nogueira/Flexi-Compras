

package Formularios;


import Classes.BackGround;
import Classes.Dados;
import Classes.Opcoes;

public class frmPrincipal extends javax.swing.JFrame {
    
    private int perfil;
    private String senha;
    private String usuario;
    private Dados msDados;
    
    public void setDados(Dados msDados){
        this.msDados = msDados;
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    
    
    public void setPerfil(int perfil){
        this.perfil = perfil;
    }
    public frmPrincipal() {
        initComponents();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnDesk = new BackGround();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuArquivoFornecedores = new javax.swing.JMenuItem();
        mnuArquivoProdutos = new javax.swing.JMenuItem();
        mnuArquivoUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuArquivotSenha = new javax.swing.JMenuItem();
        mnuArquivotUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuArquivoSair = new javax.swing.JMenuItem();
        mnuMovimentos = new javax.swing.JMenu();
        mnuMovimentosnovaCompra = new javax.swing.JMenuItem();
        mnuMovimentosFormularios = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        mnuAjudaSobre = new javax.swing.JMenuItem();
        mnuAjudaAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Siatema de Compras");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        dpnDesk.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout dpnDeskLayout = new javax.swing.GroupLayout(dpnDesk);
        dpnDesk.setLayout(dpnDeskLayout);
        dpnDeskLayout.setHorizontalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 847, Short.MAX_VALUE)
        );
        dpnDeskLayout.setVerticalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        mnuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-arquivo-24.png"))); // NOI18N
        mnuArquivo.setText("Arquivo");

        mnuArquivoFornecedores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivoFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-fornecedor-24.png"))); // NOI18N
        mnuArquivoFornecedores.setText("Fornecedores");
        mnuArquivoFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoFornecedoresActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoFornecedores);

        mnuArquivoProdutos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-produto-24.png"))); // NOI18N
        mnuArquivoProdutos.setText("Produtos");
        mnuArquivoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoProdutosActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoProdutos);

        mnuArquivoUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivoUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-adicionar-grupo-de-usuários-mulher-homem-24.png"))); // NOI18N
        mnuArquivoUsuarios.setText("Usuarios");
        mnuArquivoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoUsuariosActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoUsuarios);
        mnuArquivo.add(jSeparator1);

        mnuArquivotSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivotSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-privacidade-24.png"))); // NOI18N
        mnuArquivotSenha.setText("Trocar Senha");
        mnuArquivotSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivotSenhaActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivotSenha);

        mnuArquivotUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivotUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-grupo-de-usuário-homem-mulher-24.png"))); // NOI18N
        mnuArquivotUsuario.setText("Trocar Usuario");
        mnuArquivotUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivotUsuarioActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivotUsuario);
        mnuArquivo.add(jSeparator2);

        mnuArquivoSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-fechar-janela-24.png"))); // NOI18N
        mnuArquivoSair.setText("Sair");
        mnuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoSairActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoSair);

        jMenuBar1.add(mnuArquivo);

        mnuMovimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-tarefa-de-sistema-24.png"))); // NOI18N
        mnuMovimentos.setText("Movimentos");

        mnuMovimentosnovaCompra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuMovimentosnovaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-adicionar-o-carrinho-de-compras-24.png"))); // NOI18N
        mnuMovimentosnovaCompra.setText("Nova Compra");
        mnuMovimentosnovaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMovimentosnovaCompraActionPerformed(evt);
            }
        });
        mnuMovimentos.add(mnuMovimentosnovaCompra);

        mnuMovimentosFormularios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuMovimentosFormularios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-boletim-24.png"))); // NOI18N
        mnuMovimentosFormularios.setText("Relatórios");
        mnuMovimentosFormularios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMovimentosFormulariosActionPerformed(evt);
            }
        });
        mnuMovimentos.add(mnuMovimentosFormularios);

        jMenuBar1.add(mnuMovimentos);

        mnuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-por-que-nós-masculino-24.png"))); // NOI18N
        mnuAjuda.setText("Ajuda");

        mnuAjudaSobre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuAjudaSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-informações-24.png"))); // NOI18N
        mnuAjudaSobre.setText("Sobre");
        mnuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAjudaSobreActionPerformed(evt);
            }
        });
        mnuAjuda.add(mnuAjudaSobre);

        mnuAjudaAjuda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuAjudaAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-ajuda-24.png"))); // NOI18N
        mnuAjudaAjuda.setText("Ajuda");
        mnuAjudaAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAjudaAjudaActionPerformed(evt);
            }
        });
        mnuAjuda.add(mnuAjudaAjuda);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArquivoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoUsuariosActionPerformed
        // CAMPO USUARIO
        frmUsuarios mUsuarios = new frmUsuarios();
        mUsuarios.setDados(msDados);
        dpnDesk.add(mUsuarios);
        mUsuarios.show();
        
    }//GEN-LAST:event_mnuArquivoUsuariosActionPerformed

    private void mnuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoSairActionPerformed
        // BOTAO SAIR
        msDados.salvarTodo();
        System.exit(0);
    }//GEN-LAST:event_mnuArquivoSairActionPerformed

    private void mnuArquivoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoProdutosActionPerformed
    
        frmProdutos msProdutos = new frmProdutos();
        msProdutos.setDados(msDados);
        dpnDesk.add(msProdutos);
        msProdutos.show();
        
    }//GEN-LAST:event_mnuArquivoProdutosActionPerformed

    private void mnuArquivoFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoFornecedoresActionPerformed
        // MENU FORNECEDOR
        
        frmClientes msClientes = new frmClientes();
        msClientes.setDados(msDados);
        dpnDesk.add(msClientes);
        msClientes.show();
         
    }//GEN-LAST:event_mnuArquivoFornecedoresActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 
            ((BackGround)dpnDesk).setImagen("/imagens/compras1.jpg");
            
            if ( perfil ==2){
            mnuArquivoFornecedores.setEnabled(false);
            mnuArquivoProdutos.setEnabled(false);
            mnuArquivoUsuarios.setEnabled(false);
            mnuMovimentosFormularios.setEnabled(false);
        
    }
        
    }//GEN-LAST:event_formWindowOpened

    private void mnuArquivotUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivotUsuarioActionPerformed
        // TODO add your handling code here
        this.setVisible(false);
        frmLogin mLogin = new frmLogin();
        mLogin.setDados(msDados);
        mLogin.setLocationRelativeTo(null);
        mLogin.setVisible(true);
    }//GEN-LAST:event_mnuArquivotUsuarioActionPerformed

    private void mnuMovimentosnovaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMovimentosnovaCompraActionPerformed
        // TODO add your handling code here:
        frmFatura mFatura = new frmFatura();
        mFatura.setDados(msDados);
        dpnDesk.add(mFatura);
        mFatura.show();
    }//GEN-LAST:event_mnuMovimentosnovaCompraActionPerformed

    private void mnuArquivotSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivotSenhaActionPerformed
        // Trocar senha
        frmTrocarSenha msSenha = new frmTrocarSenha(this, rootPaneCheckingEnabled);
        msSenha.setLocationRelativeTo(null);
        msSenha.setSenha(senha);
        msSenha.setUsuario(usuario);
        msSenha.setDados(msDados);
        msSenha.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuArquivotSenhaActionPerformed

    private void mnuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAjudaSobreActionPerformed
        // BOTÃO SOBRE
        frmSobre mSobre = new frmSobre(this, rootPaneCheckingEnabled);
        mSobre.setLocationRelativeTo(this);
        mSobre.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuAjudaSobreActionPerformed

    private void mnuAjudaAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAjudaAjudaActionPerformed
        // BOTÃO AJUDA
        frmAjuda mAjuda = new frmAjuda(this, rootPaneCheckingEnabled);
        mAjuda.setLocationRelativeTo(this);
        mAjuda.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuAjudaAjudaActionPerformed

    private void mnuMovimentosFormulariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMovimentosFormulariosActionPerformed
     frmRelatorios mFormulario = new frmRelatorios();
     dpnDesk.add(mFormulario);
     mFormulario.show();
    }//GEN-LAST:event_mnuMovimentosFormulariosActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmPrincipal().setVisible(true);
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnDesk;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenuItem mnuAjudaAjuda;
    private javax.swing.JMenuItem mnuAjudaSobre;
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenuItem mnuArquivoFornecedores;
    private javax.swing.JMenuItem mnuArquivoProdutos;
    private javax.swing.JMenuItem mnuArquivoSair;
    private javax.swing.JMenuItem mnuArquivoUsuarios;
    private javax.swing.JMenuItem mnuArquivotSenha;
    private javax.swing.JMenuItem mnuArquivotUsuario;
    private javax.swing.JMenu mnuMovimentos;
    private javax.swing.JMenuItem mnuMovimentosFormularios;
    private javax.swing.JMenuItem mnuMovimentosnovaCompra;
    // End of variables declaration//GEN-END:variables

}
