/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Customizer.java to edit this template
 */
package com.mycompany.projeto_poo2;

/**
 *
 * @author bruno
 */
public class FrameProtagonista extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;

    /**
     * Creates new customizer FrameProtagonista
     */
    public FrameProtagonista() {
        initComponents();
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtTitulo = new javax.swing.JLabel();
        rtSubtitulo = new javax.swing.JLabel();
        rtCaracteristicas = new javax.swing.JLabel();
        rtNome = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        rtRaca = new javax.swing.JLabel();
        cxRaca = new javax.swing.JTextField();
        rtClasse = new javax.swing.JLabel();
        cxClasse = new javax.swing.JTextField();
        rtNivel = new javax.swing.JLabel();
        cxNivel = new javax.swing.JTextField();
        rtPntMana = new javax.swing.JLabel();
        cxPntMana = new javax.swing.JTextField();
        rtPntVida = new javax.swing.JLabel();
        cxPntVida = new javax.swing.JTextField();
        rtAtributos = new javax.swing.JLabel();
        rtCarisma = new javax.swing.JLabel();
        cxCarisma = new javax.swing.JTextField();
        rtDestreza = new javax.swing.JLabel();
        cxDestreza = new javax.swing.JTextField();
        rtForca = new javax.swing.JLabel();
        cxForca = new javax.swing.JTextField();
        rtInteligencia = new javax.swing.JLabel();
        cxInteligencia = new javax.swing.JTextField();
        rtDinheiro = new javax.swing.JLabel();
        cxDinheiro = new javax.swing.JTextField();
        rtExperiencia = new javax.swing.JLabel();
        cxExperiencia = new javax.swing.JTextField();
        rtEfeito = new javax.swing.JLabel();
        cxEfeito = new javax.swing.JTextField();
        btCadPersonagem = new javax.swing.JButton();
        btAltPersonagem = new javax.swing.JButton();
        btConsPersonagem = new javax.swing.JButton();
        btExcPersonagem = new javax.swing.JButton();
        btLimparForm = new javax.swing.JButton();
        btSairForm = new javax.swing.JButton();

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rtTitulo.setText("Personagem");

        rtSubtitulo.setText("(consultas, alterações e exclusões por nome do personagem)");

        rtCaracteristicas.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        rtCaracteristicas.setText("Características:");

        rtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtNome.setText("Nome:");

        rtRaca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtRaca.setText("Raça:");

        rtClasse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtClasse.setText("Classe:");

        rtNivel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtNivel.setText("Nível:");

        rtPntMana.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtPntMana.setText("Pontos de mana:");

        cxPntMana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPntManaActionPerformed(evt);
            }
        });

        rtPntVida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtPntVida.setText("Pontos de vida:");

        cxPntVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPntVidaActionPerformed(evt);
            }
        });

        rtAtributos.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        rtAtributos.setText("Atributos:");

        rtCarisma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtCarisma.setText("Carisma:");

        rtDestreza.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtDestreza.setText("Destreza:");

        rtForca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtForca.setText("Força:");

        rtInteligencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtInteligencia.setText("Inteligência:");

        rtDinheiro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtDinheiro.setText("Dinheiro:");

        rtExperiencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtExperiencia.setText("Experiência:");

        rtEfeito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtEfeito.setText("Buff/Debuff:");

        cxEfeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEfeitoActionPerformed(evt);
            }
        });

        btCadPersonagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCadPersonagem.setText("Cadastrar");
        btCadPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadPersonagemActionPerformed(evt);
            }
        });

        btAltPersonagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btAltPersonagem.setText("Alterar");

        btConsPersonagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btConsPersonagem.setText("Consultar");

        btExcPersonagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btExcPersonagem.setText("Excluir");

        btLimparForm.setText("Limpar");

        btSairForm.setText("Sair");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(rtAtributos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtDinheiro)
                                .addGap(18, 18, 18)
                                .addComponent(cxDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rtExperiencia)
                                .addGap(18, 18, 18)
                                .addComponent(cxExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtEfeito)
                                .addGap(18, 18, 18)
                                .addComponent(cxEfeito, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadPersonagem)
                        .addGap(18, 18, 18)
                        .addComponent(btAltPersonagem)
                        .addGap(18, 18, 18)
                        .addComponent(btConsPersonagem)
                        .addGap(18, 18, 18)
                        .addComponent(btExcPersonagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimparForm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSairForm)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(cxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rtPntMana)
                                .addGap(18, 18, 18)
                                .addComponent(cxPntMana, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(rtPntVida)
                                .addGap(18, 18, 18)
                                .addComponent(cxPntVida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(rtCarisma)
                                .addGap(18, 18, 18)
                                .addComponent(cxCarisma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rtDestreza)
                                .addGap(18, 18, 18)
                                .addComponent(cxDestreza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rtForca)
                                .addGap(18, 18, 18)
                                .addComponent(cxForca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rtInteligencia)
                                .addGap(18, 18, 18)
                                .addComponent(cxInteligencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rtNivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(rtCaracteristicas)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(rtRaca)
                                .addGap(18, 18, 18)
                                .addComponent(cxRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rtClasse)
                                .addGap(18, 18, 18)
                                .addComponent(cxClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rtSubtitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(rtTitulo)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtSubtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rtCaracteristicas)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtRaca)
                    .addComponent(cxRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtClasse)
                    .addComponent(cxClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtNivel)
                    .addComponent(cxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtPntMana)
                    .addComponent(cxPntMana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtPntVida)
                    .addComponent(cxPntVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rtAtributos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtCarisma)
                    .addComponent(cxCarisma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtDestreza)
                    .addComponent(cxDestreza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtForca)
                    .addComponent(cxForca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtInteligencia)
                    .addComponent(cxInteligencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtDinheiro)
                    .addComponent(cxDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtExperiencia)
                    .addComponent(cxExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtEfeito)
                    .addComponent(cxEfeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btLimparForm)
                        .addComponent(btSairForm))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btCadPersonagem)
                        .addComponent(btAltPersonagem)
                        .addComponent(btConsPersonagem)
                        .addComponent(btExcPersonagem)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cxPntManaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPntManaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPntManaActionPerformed

    private void cxPntVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPntVidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPntVidaActionPerformed

    private void cxEfeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEfeitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxEfeitoActionPerformed

    private void btCadPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadPersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCadPersonagemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltPersonagem;
    private javax.swing.JButton btCadPersonagem;
    private javax.swing.JButton btConsPersonagem;
    private javax.swing.JButton btExcPersonagem;
    private javax.swing.JButton btLimparForm;
    private javax.swing.JButton btSairForm;
    private javax.swing.JTextField cxCarisma;
    private javax.swing.JTextField cxClasse;
    private javax.swing.JTextField cxDestreza;
    private javax.swing.JTextField cxDinheiro;
    private javax.swing.JTextField cxEfeito;
    private javax.swing.JTextField cxExperiencia;
    private javax.swing.JTextField cxForca;
    private javax.swing.JTextField cxInteligencia;
    private javax.swing.JTextField cxNivel;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPntMana;
    private javax.swing.JTextField cxPntVida;
    private javax.swing.JTextField cxRaca;
    private javax.swing.JLabel rtAtributos;
    private javax.swing.JLabel rtCaracteristicas;
    private javax.swing.JLabel rtCarisma;
    private javax.swing.JLabel rtClasse;
    private javax.swing.JLabel rtDestreza;
    private javax.swing.JLabel rtDinheiro;
    private javax.swing.JLabel rtEfeito;
    private javax.swing.JLabel rtExperiencia;
    private javax.swing.JLabel rtForca;
    private javax.swing.JLabel rtInteligencia;
    private javax.swing.JLabel rtNivel;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtPntMana;
    private javax.swing.JLabel rtPntVida;
    private javax.swing.JLabel rtRaca;
    private javax.swing.JLabel rtSubtitulo;
    private javax.swing.JLabel rtTitulo;
    // End of variables declaration//GEN-END:variables
}
