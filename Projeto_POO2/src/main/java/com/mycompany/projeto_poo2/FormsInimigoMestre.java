/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_poo2;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class FormsInimigoMestre extends javax.swing.JFrame {

    /**
     * Creates new form FormsInimigo
     */
    public FormsInimigoMestre() {
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

        btAltInimigo = new javax.swing.JButton();
        btConsInimigo = new javax.swing.JButton();
        rtNome = new javax.swing.JLabel();
        btExcInimigo = new javax.swing.JButton();
        cxNome = new javax.swing.JTextField();
        btLimparForm = new javax.swing.JButton();
        rtRaca = new javax.swing.JLabel();
        btSairForm = new javax.swing.JButton();
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
        rtFraqueza = new javax.swing.JLabel();
        cxFraqueza = new javax.swing.JTextField();
        rtExpDrop = new javax.swing.JLabel();
        cxExpDrop = new javax.swing.JTextField();
        rtChefe = new javax.swing.JLabel();
        checkChefe = new javax.swing.JCheckBox();
        rtTitulo = new javax.swing.JLabel();
        btCadInimigo = new javax.swing.JButton();
        rtSubtitulo = new javax.swing.JLabel();
        rtCaracteristicas = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        rtEquipamento = new javax.swing.JLabel();
        cbxEquipamentos = new javax.swing.JComboBox();
        rtHabilidade = new javax.swing.JLabel();
        cbxHabilidade = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btAltInimigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btAltInimigo.setText("Alterar");
        btAltInimigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltInimigoActionPerformed(evt);
            }
        });

        btConsInimigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btConsInimigo.setText("Consultar");
        btConsInimigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsInimigoActionPerformed(evt);
            }
        });

        rtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtNome.setText("Nome:");

        btExcInimigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btExcInimigo.setText("Excluir");
        btExcInimigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcInimigoActionPerformed(evt);
            }
        });

        btLimparForm.setText("Limpar");
        btLimparForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparFormActionPerformed(evt);
            }
        });

        rtRaca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtRaca.setText("Raça:");

        btSairForm.setText("Sair");
        btSairForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairFormActionPerformed(evt);
            }
        });

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

        rtFraqueza.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtFraqueza.setText("Fraqueza:");

        rtExpDrop.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtExpDrop.setText("Experiência dropada:");

        rtChefe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtChefe.setText("Chefe");

        checkChefe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rtTitulo.setText("Inimigo");

        btCadInimigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCadInimigo.setText("Cadastrar");
        btCadInimigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadInimigoActionPerformed(evt);
            }
        });

        rtSubtitulo.setText("(consultas, alterações e exclusões por nome do Inimigo)");

        rtCaracteristicas.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        rtCaracteristicas.setText("Características:");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        rtEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtEquipamento.setText("Equipamento:");

        cbxEquipamentos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        cbxEquipamentos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbxEquipamentosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbxEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEquipamentosActionPerformed(evt);
            }
        });

        rtHabilidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtHabilidade.setText("Habilidade:");

        cbxHabilidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
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
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(rtCaracteristicas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rtTitulo)
                .addGap(308, 308, 308))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(rtSubtitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadInimigo)
                                .addGap(18, 18, 18)
                                .addComponent(btAltInimigo)
                                .addGap(18, 18, 18)
                                .addComponent(btConsInimigo)
                                .addGap(18, 18, 18)
                                .addComponent(btExcInimigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                .addComponent(btLimparForm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btVoltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSairForm))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtNivel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(239, 239, 239)
                                        .addComponent(rtAtributos))
                                    .addGroup(layout.createSequentialGroup()
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
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rtFraqueza)
                                                .addGap(18, 18, 18)
                                                .addComponent(cxFraqueza, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(24, 24, 24)
                                                .addComponent(rtExpDrop)
                                                .addGap(18, 18, 18)
                                                .addComponent(cxExpDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rtChefe))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(rtEquipamento)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbxEquipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(105, 105, 105)
                                                .addComponent(rtHabilidade)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbxHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkChefe)))
                                .addGap(22, 22, 22)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rtTitulo)
                .addGap(12, 12, 12)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkChefe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rtChefe)
                        .addComponent(cxExpDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rtExpDrop)
                        .addComponent(cxFraqueza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rtFraqueza)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtEquipamento)
                    .addComponent(cbxEquipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtHabilidade)
                    .addComponent(cbxHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadInimigo)
                    .addComponent(btAltInimigo)
                    .addComponent(btConsInimigo)
                    .addComponent(btExcInimigo)
                    .addComponent(btLimparForm)
                    .addComponent(btSairForm)
                    .addComponent(btVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxPntManaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPntManaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPntManaActionPerformed

    private void cxPntVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPntVidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPntVidaActionPerformed

    private void btCadInimigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadInimigoActionPerformed
        
        Equipamento equip = new Equipamento(0,false,"","","","");
        Habilidade habil = new Habilidade(0,"","","");
        Inimigo inimigo = new Inimigo(0,false,0,"","",0,"",0,0,"",equip, habil);

        try {
            String t1 = cxNome.getText();
            String t2 = cxPntVida.getText();
            String t3 = cxPntMana.getText();
            String t4 = cxNivel.getText();
            String t5 = cxRaca.getText();
            String t6 = cxClasse.getText();
            boolean t7 = checkChefe.isSelected();           
            String t8 = cxExpDrop.getText();
            String t9 = cxFraqueza.getText();
            equip = (Equipamento) cbxEquipamentos.getSelectedItem();
            habil = (Habilidade) cbxHabilidade.getSelectedItem();
  
            if (t4.isEmpty() || t3.isEmpty() || t2.isEmpty() || t8.isEmpty()) {
                throw new IllegalArgumentException("Os campos numéricos não podem estar vazios.");
            }
            
            inimigo.setNome(t1);
            inimigo.setPontoVida(Integer.parseInt(t2));
            inimigo.setPontoMana(Integer.parseInt(t3));
            inimigo.setNivel(Integer.parseInt(t4));
            inimigo.setRaca(t5);
            inimigo.setClasse(t6);
            inimigo.setChefe(t7);
            inimigo.setExperienciaDrop(Integer.parseInt(t8));
            inimigo.setFraqueza(t9);
            inimigo.setEquipamento(equip);
            inimigo.setHabilidade(habil);

            if(t6.isEmpty() || t9.isEmpty() || t1.isEmpty() || t5.isEmpty()){
                throw new NullPointerException("Um ou mais campos estão vazios.");
            }
             if (cbxEquipamentos.getItemCount() == 0) {
            // ComboBox está vazia, exibe mensagem de erro ao usuário
            JOptionPane.showMessageDialog(null, "Erro: É necessário cadastrar um equipamento primeiro.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
            }
             if (cbxHabilidade.getItemCount() == 0) {
            // ComboBox está vazia, exibe mensagem de erro ao usuário
            JOptionPane.showMessageDialog(null, "Erro: É necessário cadastrar uma habilidade primeiro.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
            }             
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro: Por favor, insira números inteiros válidos.");
            return;
        }catch (IllegalArgumentException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return;
        }
        
        InimigoDAO dao = new InimigoDAO();
        dao.inserir(inimigo);
    }//GEN-LAST:event_btCadInimigoActionPerformed

    private void btSairFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairFormActionPerformed
        sair();
    }//GEN-LAST:event_btSairFormActionPerformed

    private void btLimparFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparFormActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparFormActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        voltar();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void cbxEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEquipamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEquipamentosActionPerformed

    private void cbxEquipamentosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbxEquipamentosAncestorAdded
       EquipamentoDAO dao = new EquipamentoDAO();
       List<Equipamento> lista = dao.listaEquipamento();
       cbxEquipamentos.removeAllItems();
       for(Equipamento e: lista){
           cbxEquipamentos.addItem(e);
       }
    }//GEN-LAST:event_cbxEquipamentosAncestorAdded

    private void cbxHabilidadeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbxHabilidadeAncestorAdded
       HabilidadeDAO dao = new HabilidadeDAO();
       List<Habilidade> lista = dao.listaHabilidade();
       cbxHabilidade.removeAllItems();
       for(Habilidade e: lista){
           cbxHabilidade.addItem(e);
       }
    }//GEN-LAST:event_cbxHabilidadeAncestorAdded

    private void btExcInimigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcInimigoActionPerformed
        String nome = cxNome.getText();
        InimigoDAO dao = new InimigoDAO();
        dao.excluir(nome);          // TODO add your handling code here:
    }//GEN-LAST:event_btExcInimigoActionPerformed

    private void btConsInimigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsInimigoActionPerformed
        String nome = cxNome.getText();
        InimigoDAO dao = new InimigoDAO();
        Inimigo inimigo = dao.consultar(nome);
        Equipamento equip = new Equipamento(0,false,"","","","");
        EquipamentoDAO dao1 = new EquipamentoDAO();
        Habilidade habil = new Habilidade(0,"","","");        
        if (inimigo != null){
            cxRaca.setText(inimigo.getRaca());
            cxClasse.setText(inimigo.getClasse());
            cxNivel.setText(Integer.toString(inimigo.getNivel()));
            cxPntMana.setText(Integer.toString(inimigo.getPontoMana()));
            cxPntVida.setText(Integer.toString(inimigo.getPontoVida()));
            cxFraqueza.setText(inimigo.getFraqueza());
            cxExpDrop.setText(Integer.toString(inimigo.getExperienciaDrop()));
            checkChefe.setSelected(inimigo.isChefe());
            cbxEquipamentos.setSelectedItem(inimigo.getEquipamento());
            cbxHabilidade.setSelectedItem(inimigo.getHabilidade());
        } else {
            JOptionPane.showMessageDialog(null,"Inimigo não encontrado", "Aviso", JOptionPane.WARNING_MESSAGE);
            cxRaca.setText("");
            cxNome.setText("");
            cxClasse.setText("");
            cxNivel.setText("");
            cxPntMana.setText("");
            cxPntVida.setText("");
            cxFraqueza.setText("");
            cxExpDrop.setText("");
            cbxEquipamentos.setSelectedIndex(-1);
            cbxHabilidade.setSelectedIndex(-1);
            checkChefe.setSelected(false);
           }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_btConsInimigoActionPerformed

    private void cbxHabilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHabilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxHabilidadeActionPerformed
        InimigoDAO dao = new InimigoDAO();      
        private Inimigo inimigo;
    private void btAltInimigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltInimigoActionPerformed
        if (inimigo == null) {
            String nome = cxNome.getText();
            inimigo = dao.consultar(nome);

            if (inimigo != null) {
                cxRaca.setText(inimigo.getRaca());
                cxClasse.setText(inimigo.getClasse());
                cxNivel.setText(Integer.toString(inimigo.getNivel()));
                cxPntMana.setText(Integer.toString(inimigo.getPontoMana()));
                cxPntVida.setText(Integer.toString(inimigo.getPontoVida()));
                cxFraqueza.setText(inimigo.getFraqueza());
                cxExpDrop.setText(Integer.toString(inimigo.getExperienciaDrop()));
                checkChefe.setSelected(inimigo.isChefe());
                cbxEquipamentos.setSelectedItem(inimigo.getEquipamento());
                cbxHabilidade.setSelectedItem(inimigo.getHabilidade());
            } else {
                JOptionPane.showMessageDialog(null, "Inimigo não encontrado", "Aviso", JOptionPane.WARNING_MESSAGE);
                limpar();
            }
            
        }else {
                    if (!inimigo.getNome().equals(cxNome.getText())) {
                        JOptionPane.showMessageDialog(null, "O nome do inimigo não pode ser alterado", "Aviso", JOptionPane.WARNING_MESSAGE);
                        cxNome.setText(inimigo.getNome()); // Reseta o nome para o original
                    }else {
                        inimigo.setRaca(cxRaca.getText());
                        inimigo.setClasse(cxClasse.getText());
                        inimigo.setNivel(Integer.parseInt(cxNivel.getText()));
                        inimigo.setPontoMana(Integer.parseInt(cxPntMana.getText()));
                        inimigo.setPontoVida(Integer.parseInt(cxPntVida.getText()));
                        inimigo.setFraqueza(cxFraqueza.getText());
                        inimigo.setExperienciaDrop(Integer.parseInt(cxExpDrop.getText()));                        
                        inimigo.setChefe(checkChefe.isSelected());
                        inimigo.setEquipamento((Equipamento) cbxEquipamentos.getSelectedItem());
                        inimigo.setHabilidade((Habilidade) cbxHabilidade.getSelectedItem());
                        dao.atualizar(inimigo);
                        JOptionPane.showMessageDialog(null, "Inimigo atualizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        resetForm();
                }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btAltInimigoActionPerformed

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
        cxFraqueza.setText("");
        cxExpDrop.setText("");
        cbxEquipamentos.setSelectedIndex(-1);
        cbxHabilidade.setSelectedIndex(-1);        
        checkChefe.setSelected(false);
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
    
    private void resetForm() {
        inimigo = null;
        cxNome.setText("");
        limpar();
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
            java.util.logging.Logger.getLogger(FormsInimigoMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormsInimigoMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormsInimigoMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormsInimigoMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormsInimigoMestre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltInimigo;
    private javax.swing.JButton btCadInimigo;
    private javax.swing.JButton btConsInimigo;
    private javax.swing.JButton btExcInimigo;
    private javax.swing.JButton btLimparForm;
    private javax.swing.JButton btSairForm;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox cbxEquipamentos;
    private javax.swing.JComboBox cbxHabilidade;
    private javax.swing.JCheckBox checkChefe;
    private javax.swing.JTextField cxClasse;
    private javax.swing.JTextField cxExpDrop;
    private javax.swing.JTextField cxFraqueza;
    private javax.swing.JTextField cxNivel;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPntMana;
    private javax.swing.JTextField cxPntVida;
    private javax.swing.JTextField cxRaca;
    private javax.swing.JLabel rtAtributos;
    private javax.swing.JLabel rtCaracteristicas;
    private javax.swing.JLabel rtChefe;
    private javax.swing.JLabel rtClasse;
    private javax.swing.JLabel rtEquipamento;
    private javax.swing.JLabel rtExpDrop;
    private javax.swing.JLabel rtFraqueza;
    private javax.swing.JLabel rtHabilidade;
    private javax.swing.JLabel rtNivel;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtPntMana;
    private javax.swing.JLabel rtPntVida;
    private javax.swing.JLabel rtRaca;
    private javax.swing.JLabel rtSubtitulo;
    private javax.swing.JLabel rtTitulo;
    // End of variables declaration//GEN-END:variables
}
