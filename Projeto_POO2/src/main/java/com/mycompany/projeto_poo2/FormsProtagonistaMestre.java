/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_poo2;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author bruno
 */
public class FormsProtagonistaMestre extends javax.swing.JFrame {

    /**
     * Creates new form FormsProtagonista
     */
    public FormsProtagonistaMestre() {
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

        rtClasse = new javax.swing.JLabel();
        cxClasse = new javax.swing.JTextField();
        cxEfeito = new javax.swing.JTextField();
        btConsPersonagem = new javax.swing.JButton();
        btExcPersonagem = new javax.swing.JButton();
        btLimparForm = new javax.swing.JButton();
        btSairForm = new javax.swing.JButton();
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
        rtTitulo = new javax.swing.JLabel();
        cxExperiencia = new javax.swing.JTextField();
        rtSubtitulo = new javax.swing.JLabel();
        rtEfeito = new javax.swing.JLabel();
        rtCaracteristicas = new javax.swing.JLabel();
        rtNome = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        rtRaca = new javax.swing.JLabel();
        cxRaca = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        cbxEquipamento = new javax.swing.JComboBox();
        rtEquipamento = new javax.swing.JLabel();
        rtHabilidade = new javax.swing.JLabel();
        cbxHabilidade = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rtClasse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtClasse.setText("Classe:");

        cxEfeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEfeitoActionPerformed(evt);
            }
        });

        btConsPersonagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btConsPersonagem.setText("Consultar");
        btConsPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsPersonagemActionPerformed(evt);
            }
        });

        btExcPersonagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btExcPersonagem.setText("Excluir");
        btExcPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcPersonagemActionPerformed(evt);
            }
        });

        btLimparForm.setText("Limpar");
        btLimparForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparFormActionPerformed(evt);
            }
        });

        btSairForm.setText("Sair");
        btSairForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairFormActionPerformed(evt);
            }
        });

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

        cxCarisma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCarismaActionPerformed(evt);
            }
        });

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

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rtTitulo.setText("Personagem");

        rtSubtitulo.setText("(consultas, alterações e exclusões por nome do personagem)");

        rtEfeito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtEfeito.setText("Buff/Debuff:");

        rtCaracteristicas.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        rtCaracteristicas.setText("Características:");

        rtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtNome.setText("Nome:");

        rtRaca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtRaca.setText("Raça:");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        cbxEquipamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        cbxEquipamento.setToolTipText("");
        cbxEquipamento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbxEquipamentoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbxEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEquipamentoActionPerformed(evt);
            }
        });

        rtEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtEquipamento.setText("Equipamento:");

        rtHabilidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtHabilidade.setText("Habilidade:");

        cbxHabilidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        cbxHabilidade.setToolTipText("");
        cbxHabilidade.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbxHabilidadeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbxHabilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxHabilidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(rtAtributos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rtCarisma)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxCarisma, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rtDestreza)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxDestreza, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(rtForca)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxForca, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(rtInteligencia)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxInteligencia, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rtDinheiro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rtEquipamento)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cbxEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(84, 84, 84)
                                            .addComponent(rtHabilidade)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cbxHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cxDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rtExperiencia)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cxExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(rtEfeito)
                                            .addGap(18, 18, 18)
                                            .addComponent(cxEfeito, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btConsPersonagem)
                                    .addGap(18, 18, 18)
                                    .addComponent(btExcPersonagem))))
                        .addGap(0, 19, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimparForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSairForm)
                .addContainerGap())
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rtEfeito)
                        .addComponent(cxEfeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rtDinheiro)
                        .addComponent(cxDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rtExperiencia)
                        .addComponent(cxExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtEquipamento)
                    .addComponent(rtHabilidade)
                    .addComponent(cbxHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btConsPersonagem)
                        .addComponent(btExcPersonagem))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btLimparForm)
                        .addComponent(btSairForm)
                        .addComponent(btVoltar)))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxEfeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEfeitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxEfeitoActionPerformed

    private void cxPntManaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPntManaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPntManaActionPerformed

    private void cxPntVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPntVidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPntVidaActionPerformed

    private void cxCarismaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCarismaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCarismaActionPerformed

    private void btSairFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairFormActionPerformed
        sair();
    }//GEN-LAST:event_btSairFormActionPerformed

    private void btLimparFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparFormActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparFormActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        voltar();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void cbxEquipamentoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbxEquipamentoAncestorAdded
        EquipamentoDAO dao = new EquipamentoDAO();
        List<Equipamento> lista = dao.listaEquipamento();
        cbxEquipamento.removeAllItems();
        for(Equipamento e: lista){
            cbxEquipamento.addItem(e);
        }
    }//GEN-LAST:event_cbxEquipamentoAncestorAdded

    private void cbxEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEquipamentoActionPerformed

    }//GEN-LAST:event_cbxEquipamentoActionPerformed

    private void cbxHabilidadeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbxHabilidadeAncestorAdded
        HabilidadeDAO dao = new HabilidadeDAO();
        List<Habilidade> lista = dao.listaHabilidade();
        cbxHabilidade.removeAllItems();
        for(Habilidade e: lista){
            cbxHabilidade.addItem(e);
        }
    }//GEN-LAST:event_cbxHabilidadeAncestorAdded

    private void cbxHabilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHabilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxHabilidadeActionPerformed

    private void btExcPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcPersonagemActionPerformed
        String nome = cxNome.getText();
        ProtagonistaDAO dao = new ProtagonistaDAO();
        dao.excluir(nome);            // TODO add your handling code here:
    }//GEN-LAST:event_btExcPersonagemActionPerformed

    private void btConsPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsPersonagemActionPerformed
        String nome = cxNome.getText(); 
        ProtagonistaDAO dao = new ProtagonistaDAO();
        Protagonista protag = dao.consultar(nome);
        if (protag != null){
            cxRaca.setText(protag.getRaca());
            cxClasse.setText(protag.getClasse());
            cxNivel.setText(Integer.toString(protag.getNivel()));
            cxPntMana.setText(Integer.toString(protag.getPontoMana()));
            cxPntVida.setText(Integer.toString(protag.getPontoVida()));
            cxCarisma.setText(Integer.toString(protag.getCarisma()));
            cxDestreza.setText(Integer.toString(protag.getDestreza()));
            cxForca.setText(Integer.toString(protag.getForca()));
            cxInteligencia.setText(Integer.toString(protag.getInteligencia()));
            cxDinheiro.setText(Integer.toString(protag.getDinheiro()));
            cxExperiencia.setText(Integer.toString(protag.getExperiencia()));
            cxEfeito.setText(protag.getEfeito());            
            cbxEquipamento.setSelectedItem(protag.getEquipamento());
            cbxHabilidade.setSelectedItem(protag.getHabilidade());            
        } else {
            JOptionPane.showMessageDialog(null,"Personagem não encontrado", "Aviso", JOptionPane.WARNING_MESSAGE);
            cxRaca.setText("");
            cxNome.setText("");
            cxClasse.setText("");
            cxNivel.setText("");
            cxPntMana.setText("");
            cxPntVida.setText("");
            cxCarisma.setText("");
            cxDestreza.setText("");
            cxForca.setText("");
            cxInteligencia.setText("");
            cxDinheiro.setText("");
            cxExperiencia.setText("");
            cxEfeito.setText("");            
            cbxEquipamento.setSelectedIndex(-1);
            cbxHabilidade.setSelectedIndex(-1);
           }          // TODO add your handling code here:
    }//GEN-LAST:event_btConsPersonagemActionPerformed

    /**
     * @param args the command line arguments
     */

    public void voltar(){
        FrameMestre frameMestre = new FrameMestre();
        frameMestre.setLocationRelativeTo(frameMestre);
        frameMestre.setVisible(true);
        dispose();
    }
    
    public void limpar(){
        cxNome.setText("");
        cxRaca.setText("");
        cxClasse.setText("");
        cxNivel.setText("");   
        cxPntMana.setText("");
        cxPntVida.setText("");
        cxCarisma.setText("");
        cxDestreza.setText("");
        cxForca.setText("");
        cxInteligencia.setText("");
        cxDinheiro.setText("");
        cxExperiencia.setText("");
        cxEfeito.setText("");
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
            java.util.logging.Logger.getLogger(FormsProtagonistaMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormsProtagonistaMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormsProtagonistaMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormsProtagonistaMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormsProtagonistaMestre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsPersonagem;
    private javax.swing.JButton btExcPersonagem;
    private javax.swing.JButton btLimparForm;
    private javax.swing.JButton btSairForm;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox cbxEquipamento;
    private javax.swing.JComboBox cbxHabilidade;
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
    private javax.swing.JLabel rtEquipamento;
    private javax.swing.JLabel rtExperiencia;
    private javax.swing.JLabel rtForca;
    private javax.swing.JLabel rtHabilidade;
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
