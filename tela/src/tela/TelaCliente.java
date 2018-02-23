/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import Cliente.Cliente;
import Exception.ClienteException;
import Exception.DataSourceException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author victor.rslucca
 * 
 * 
 */
public class TelaCliente extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    Cliente clienteClie = new Cliente();

    public TelaCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        novo();
    }

    public void novo() {
        AlterarCadastroButton.setEnabled(false);
        ExcluirCadastroButton.setEnabled(false);
        CadastrarButton.setEnabled(true);
        NomeText.setText("");
        bairroText.setText("");
        cepText.setText("");
        cidadeText.setText("");
        compText.setText("");
        cpfText.setText("");
        data.setText("");
        emailText.setText("");
        endText.setText("");
        jComboBox1.setSelectedIndex(0);
        numEndText.setText("");
        sobreNomeText.setText("");
        telText.setText("");
        clienteClie = new Cliente();
    }

    public void alteraClientes() {
        AlterarCadastroButton.setEnabled(true);
        ExcluirCadastroButton.setEnabled(true);
        CadastrarButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        endText = new javax.swing.JTextField();
        cidadeText = new javax.swing.JTextField();
        telText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CadastrarButton = new javax.swing.JButton();
        NomeText = new javax.swing.JTextField();
        AlterarCadastroButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ExcluirCadastroButton = new javax.swing.JButton();
        BuscarClienteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cpfText = new javax.swing.JTextField();
        cepText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sobreNomeText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bairroText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        numEndText = new javax.swing.JTextField();
        CancelarButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        compText = new javax.swing.JTextField();
        data = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel14.setText("*CEP");

        jLabel3.setText("*Data Nascimento(dd/mm/aaaa)");

        CadastrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group_add.png"))); // NOI18N
        CadastrarButton.setText("Cadastrar");
        CadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarButtonActionPerformed(evt);
            }
        });

        AlterarCadastroButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_edit.png"))); // NOI18N
        AlterarCadastroButton.setText("Alterar Cadastro");
        AlterarCadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarCadastroButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("*CPF/CNPJ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cliente");

        ExcluirCadastroButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        ExcluirCadastroButton.setText("Excluir Cadastro");
        ExcluirCadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirCadastroButtonActionPerformed(evt);
            }
        });

        BuscarClienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/magnifier.png"))); // NOI18N
        BuscarClienteButton.setText("Buscar Cliente");
        BuscarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarClienteButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("*Nome");

        jLabel7.setText("Complemento");

        jLabel5.setText("*Endereço");

        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        jLabel6.setText("*Número");

        cepText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepTextActionPerformed(evt);
            }
        });

        jLabel8.setText("*Cidade");

        sobreNomeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreNomeTextActionPerformed(evt);
            }
        });

        jLabel9.setText("*Estado");

        jLabel10.setText("Email");

        jLabel11.setText("*Telefone");

        jLabel12.setText("*Bairro");

        CancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });

        jLabel13.setText("*Sobrenome");

        data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CancelarButton)
                                .addGap(147, 147, 147)
                                .addComponent(CadastrarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                                .addComponent(AlterarCadastroButton)
                                .addGap(8, 8, 8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExcluirCadastroButton)
                            .addComponent(BuscarClienteButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel10))
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(telText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpfText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(emailText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(data, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel12)))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel13)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sobreNomeText)
                            .addComponent(endText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numEndText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bairroText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cidadeText)
                                    .addComponent(compText))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cepText, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarClienteButton)
                    .addComponent(jLabel1))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel13)
                    .addComponent(sobreNomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cpfText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(telText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(numEndText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(bairroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(cepText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(compText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cidadeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarButton)
                    .addComponent(AlterarCadastroButton)
                    .addComponent(ExcluirCadastroButton)
                    .addComponent(CancelarButton))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void cepTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepTextActionPerformed

    private void CadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarButtonActionPerformed
        clienteClie.setBairro(bairroText.getText());
        clienteClie.setCPFCNPJ(cpfText.getText());
        clienteClie.setCep(cepText.getText());
        clienteClie.setCidade(cidadeText.getText());
        clienteClie.setComplemento(compText.getText());
        Date a = new Date();
        a = (Date) data.getValue();
        clienteClie.setDataNascimento(a);
        clienteClie.setEmail(emailText.getText());
        clienteClie.setEndereco(endText.getText());
        String o = jComboBox1.getSelectedItem().toString();
            if (o.compareTo("Selecionar")==0) {
                clienteClie.setEstado("");
            }else{
                clienteClie.setEstado((String)jComboBox1.getSelectedItem());
            }
        clienteClie.setNome(NomeText.getText());
        clienteClie.setNumEnd(numEndText.getText());
        clienteClie.setSobrenome(sobreNomeText.getText());
        clienteClie.setTelefone(telText.getText());
        try {
            Servico.ServicoCliente.cadastrarCliente(clienteClie);
        } catch (ClienteException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            return;
        } catch (DataSourceException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            return;
        }
        JOptionPane.showMessageDialog(rootPane, "Cliente Cadastrado com Sucesso!");
        novo();
        //finalizado
    }//GEN-LAST:event_CadastrarButtonActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void BuscarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClienteButtonActionPerformed
        // TODO add your handling code here:
        alteraClientes();
        BuscarCliente dlg = new BuscarCliente(this, true);
        clienteClie = dlg.buscarCliVenda();
        if (clienteClie != null) {
            NomeText.setText(clienteClie.getNome());
            bairroText.setText(clienteClie.getBairro());
            cepText.setText(clienteClie.getCep());
            cidadeText.setText(clienteClie.getCidade());
            compText.setText(clienteClie.getComplemento());
            cpfText.setText(clienteClie.getCPFCNPJ());
            String dataFormatada;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataFormatada = (String) sdf.format(clienteClie.getDataNascimento());
            data.setText(dataFormatada);
            emailText.setText(clienteClie.getEmail());
            endText.setText(clienteClie.getEndereco());
            jComboBox1.setSelectedItem(clienteClie.getEstado());
            numEndText.setText(clienteClie.getNumEnd());
            sobreNomeText.setText(clienteClie.getSobrenome());
            telText.setText(clienteClie.getTelefone());
        } else {
            novo();
            JOptionPane.showMessageDialog(rootPane, "Cliente esta vazio");
        }
        //finalizado
    }//GEN-LAST:event_BuscarClienteButtonActionPerformed

    private void ExcluirCadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirCadastroButtonActionPerformed
        int escolha = JOptionPane.showOptionDialog(null, "Deseja excluir o cadastro?", "Exclusão", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (escolha == JOptionPane.YES_OPTION) {
            if (clienteClie != null && clienteClie.getNome().compareTo("") > 0) {
                try {
                    Servico.ServicoCliente.excluirCliente(clienteClie.getId());
                } catch (ClienteException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                    return;
                } catch (DataSourceException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                    return;
                }
                JOptionPane.showMessageDialog(rootPane, "Cliente Excluído Com Sucesso!");
                novo();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Cliente esta vazio");
            }
        }    
        //finalizado
    }//GEN-LAST:event_ExcluirCadastroButtonActionPerformed

    private void sobreNomeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreNomeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sobreNomeTextActionPerformed

    private void AlterarCadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarCadastroButtonActionPerformed
        // TODO add your handling code here:
        if (clienteClie != null && clienteClie.getNome().compareTo("") > 0) {
            clienteClie.setNome(NomeText.getText());
            clienteClie.setBairro(bairroText.getText());
            clienteClie.setCep(cepText.getText());
            clienteClie.setCidade(cidadeText.getText());
            clienteClie.setComplemento(compText.getText());
            clienteClie.setCPFCNPJ(cpfText.getText());
            Date a = new Date();
            a = (Date) data.getValue();
            clienteClie.setDataNascimento(a);
            clienteClie.setEmail(emailText.getText());
            clienteClie.setEndereco(endText.getText());
            String o = jComboBox1.getSelectedItem().toString();
            if (o.compareTo("Selecionar")==0) {
                clienteClie.setEstado("");
            }else{
                clienteClie.setEstado((String)jComboBox1.getSelectedItem());
            }
            clienteClie.setNumEnd(numEndText.getText());
            clienteClie.setSobrenome(sobreNomeText.getText());
            clienteClie.setTelefone(telText.getText());
            try {
                Servico.ServicoCliente.atualizarCliente(clienteClie);
            } catch (DataSourceException e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
                return;
            } catch(ClienteException ex){
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                return;
            }
            JOptionPane.showMessageDialog(rootPane, "Cliente Alterado Com Sucesso!");
            novo();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Cliente esta vazio");
        }

    }//GEN-LAST:event_AlterarCadastroButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarCadastroButton;
    private javax.swing.JButton BuscarClienteButton;
    private javax.swing.JButton CadastrarButton;
    private javax.swing.JButton CancelarButton;
    private javax.swing.JButton ExcluirCadastroButton;
    private javax.swing.JTextField NomeText;
    private javax.swing.JTextField bairroText;
    private javax.swing.JTextField cepText;
    private javax.swing.JTextField cidadeText;
    private javax.swing.JTextField compText;
    private javax.swing.JTextField cpfText;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField endText;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField numEndText;
    private javax.swing.JTextField sobreNomeText;
    private javax.swing.JTextField telText;
    // End of variables declaration//GEN-END:variables
}

