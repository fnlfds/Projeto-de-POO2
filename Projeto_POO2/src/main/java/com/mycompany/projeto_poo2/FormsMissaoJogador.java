/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_poo2;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class FormsMissaoJogador extends javax.swing.JFrame {

    /**
     * Creates new form FormsMissaoJogador
     */
    public FormsMissaoJogador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtObjetivo = new javax.swing.JLabel();
        btConsMissao = new javax.swing.JButton();
        rtTitulo = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        rtNome = new javax.swing.JLabel();
        cxObjetivo = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        rtRecompensa = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxRecompensa = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        rtSubtitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rtObjetivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtObjetivo.setText("Objetivo:");

        btConsMissao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btConsMissao.setText("Consultar");
        btConsMissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsMissaoActionPerformed(evt);
            }
        });

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rtTitulo.setText("Missão");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        rtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtNome.setText("Nome:");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        rtRecompensa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtRecompensa.setText("Recompensa:");

        cxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        rtSubtitulo.setText("(consultas por nome da Missão)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(rtTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(btConsMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(rtRecompensa)
                                        .addGap(18, 18, 18)
                                        .addComponent(cxRecompensa))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rtObjetivo)
                                        .addGap(18, 18, 18)
                                        .addComponent(cxObjetivo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rtNome)
                                        .addGap(18, 18, 18)
                                        .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 103, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rtSubtitulo)
                .addGap(204, 204, 204))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtSubtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtObjetivo)
                    .addComponent(cxObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtRecompensa)
                    .addComponent(cxRecompensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btConsMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair)
                    .addComponent(btVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void cxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        voltar();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btConsMissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsMissaoActionPerformed
        String nome = cxNome.getText();
        MissaoDAO dao = new MissaoDAO();
        Missao missao = dao.consultar(nome);
        if (missao != null){
            cxObjetivo.setText(missao.getObjetivo());
            cxRecompensa.setText(missao.getRecompensa());
        } else {
            JOptionPane.showMessageDialog(null,"Missão não encontrada", "Aviso", JOptionPane.WARNING_MESSAGE);
            cxObjetivo.setText("");
            cxNome.setText("");
            cxRecompensa.setText("");
           }        // TODO add your handling code here:
    }//GEN-LAST:event_btConsMissaoActionPerformed

    /**
     * @param args the command line arguments
     */

    public void voltar(){
        FrameJogador frameJogador = new FrameJogador();
        frameJogador.setLocationRelativeTo(frameJogador);
        frameJogador.setVisible(true);
        dispose();
    }
    
    public void limpar(){
        cxNome.setText("");
        cxObjetivo.setText("");
        cxRecompensa.setText(""); 
    }       
      
    public void sair(){
            int respSair = JOptionPane.showConfirmDialog(
                        null,
                        "Deseja sair?",
                        "Saida",
                        JOptionPane.YES_NO_OPTION
                );
        if(respSair == 0){
            //System.exit(0);
            dispose();
        }
    }
        
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
            java.util.logging.Logger.getLogger(FormsMissaoJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormsMissaoJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormsMissaoJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormsMissaoJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormsMissaoJogador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsMissao;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxObjetivo;
    private javax.swing.JTextField cxRecompensa;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtObjetivo;
    private javax.swing.JLabel rtRecompensa;
    private javax.swing.JLabel rtSubtitulo;
    private javax.swing.JLabel rtTitulo;
    // End of variables declaration//GEN-END:variables
}
