/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import Exception.DataSourceException;
import Exception.ProdutoException;
import Produto.Produto;
import Servico.ServicoProduto;
import Venda.ItensVenda;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victor.rslucca
 */
public class buscaProduto extends javax.swing.JDialog {

    private String buscar;
    private ArrayList<Produto> prodt = new ArrayList<Produto>();
    private Produto prod = new Produto();
    private String qtdProdSelec;
    boolean itemVenda = false;

    public buscaProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel modelCliente = (DefaultTableModel) tabelaProdTable.getModel();
        modelCliente.setRowCount(0);
    }

    public ItensVenda selecionarItemVenda() {
        itemVenda = true;
        setVisible(true);
        ItensVenda item = new ItensVenda();
        item.setProduto(prod);
        if (qtdProdSelec!=null && qtdProdSelec.compareTo("")>0) {
            item.setQtdProduto(Integer.parseInt(qtdProdSelec));
        }
        return item;
    }

    public Produto selecionarProduto() {
        qtdProdText.setVisible(false);
        qtdLabel.setVisible(false);
        setVisible(true);
        return prod;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelarDialogButton = new javax.swing.JButton();
        qtdLabel = new javax.swing.JLabel();
        qtdProdText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProdTable = new javax.swing.JTable();
        produtoText = new javax.swing.JTextField();
        selecionarProdButton = new javax.swing.JButton();
        buscarProdButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(250, 0));

        cancelarDialogButton.setText("Cancelar");
        cancelarDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarDialogButtonActionPerformed(evt);
            }
        });

        qtdLabel.setText("Quantidade");

        qtdProdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdProdTextActionPerformed(evt);
            }
        });

        tabelaProdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Tamanho", "Cor", "Coleção", "Estoque", "Preço Unitario"
            }
        ));
        tabelaProdTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tabelaProdTable);

        selecionarProdButton.setText("Selecionar");
        selecionarProdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarProdButtonActionPerformed(evt);
            }
        });

        buscarProdButton.setText("Buscar");
        buscarProdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProdButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(selecionarProdButton)
                                .addGap(11, 11, 11)
                                .addComponent(cancelarDialogButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(produtoText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarProdButton))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(qtdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtdProdText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produtoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarProdButton))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtdLabel)
                    .addComponent(qtdProdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecionarProdButton)
                    .addComponent(cancelarDialogButton))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarDialogButtonActionPerformed
        prod = null;
        setVisible(false);
        dispose();
        // finalizado
    }//GEN-LAST:event_cancelarDialogButtonActionPerformed

    private void selecionarProdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarProdButtonActionPerformed
        int linhaSelec = tabelaProdTable.getSelectedRow();
        if (itemVenda) {
            if (linhaSelec > -1 && qtdProdText.getText().compareTo("")>=1) {
                if (prodt.get(linhaSelec).getQuantidade()>=Integer.parseInt(qtdProdText.getText())) {
                    prod = prodt.get(tabelaProdTable.getSelectedRow());
                    qtdProdSelec = qtdProdText.getText();
                    setVisible(false);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Não há estoque suficiente");
                }
            }else {
                JOptionPane.showMessageDialog(this, "É necessario selecionar o produto"
                    + " e a quatidade");
            }   
        }else{
            if (linhaSelec > -1) {
                prod = prodt.get(tabelaProdTable.getSelectedRow());
                setVisible(false);
                dispose();
            }else {
                JOptionPane.showMessageDialog(this, "É necessario selecionar o produto");
            }
        }
    }//GEN-LAST:event_selecionarProdButtonActionPerformed

    private void buscarProdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProdButtonActionPerformed
        buscar = produtoText.getText();
        DefaultTableModel tabelaProd = (DefaultTableModel) tabelaProdTable.getModel();
        tabelaProd.setRowCount(0);
        try {
            if (buscar.compareTo("")==0) {
                prodt = ServicoProduto.listarProduto();
            }else{
                prodt = ServicoProduto.procurarProduto(buscar);
            }if (prodt==null) {
                JOptionPane.showMessageDialog(this, "Nenhum produto encontrado");
            }else{
                for (int i = 0; i < prodt.size(); i++) {
            Object[] prodSelect = new Object[6];
            prodSelect[0] = prodt.get(i).getNome();
            prodSelect[1] = prodt.get(i).getTamanho();
            prodSelect[2] = prodt.get(i).getCor();
            prodSelect[3] = prodt.get(i).getColecao();
            prodSelect[4] = prodt.get(i).getQuantidade();
            prodSelect[5] = prodt.get(i).getPreco();
            tabelaProd.addRow(prodSelect);
                }
        }
        } catch (ProdutoException ex) {
            JOptionPane.showMessageDialog(this, ex);
            return;
        } catch (DataSourceException ex) {
            JOptionPane.showMessageDialog(this, ex);
            return;
        }
        
        //finalizado
    }//GEN-LAST:event_buscarProdButtonActionPerformed

    private void qtdProdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdProdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdProdTextActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarProdButton;
    private javax.swing.JButton cancelarDialogButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField produtoText;
    private javax.swing.JLabel qtdLabel;
    private javax.swing.JTextField qtdProdText;
    private javax.swing.JButton selecionarProdButton;
    private javax.swing.JTable tabelaProdTable;
    // End of variables declaration//GEN-END:variables
}