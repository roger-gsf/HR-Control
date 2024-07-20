package view;

import controller.CargoController;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cargo;

public class frmSearchPosition extends javax.swing.JFrame {

    public void pesquisarCargos() {
        String nome = txtCargo.getText();

        try {
            List<Cargo> cargos = cargoController.searchCargosByName(nome);
            DefaultTableModel model = (DefaultTableModel) tblCargos.getModel();
            model.setRowCount(0);  // Limpa a tabela antes de adicionar os resultados

            for (Cargo cargo : cargos) {
                model.addRow(new Object[]{cargo.getId(), cargo.getNome(), cargo.getDescricao()});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao pesquisar cargos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        }
    }

    private CargoController cargoController;

    public frmSearchPosition() {
        initComponents();
        cargoController = new CargoController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCargos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPesquisarCargo = new javax.swing.JButton();
        btnNovoCargo = new javax.swing.JButton();
        btnAlterarCargo = new javax.swing.JButton();
        btnExcluirCargo = new javax.swing.JButton();
        txtCargo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCargos.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tblCargos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCargos);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Position Search");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("Position:");

        btnPesquisarCargo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnPesquisarCargo.setText("Search");
        btnPesquisarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCargoActionPerformed(evt);
            }
        });

        btnNovoCargo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnNovoCargo.setText("New");
        btnNovoCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCargoActionPerformed(evt);
            }
        });

        btnAlterarCargo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnAlterarCargo.setText("Alter");
        btnAlterarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCargoActionPerformed(evt);
            }
        });

        btnExcluirCargo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnExcluirCargo.setText("Delete");
        btnExcluirCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCargoActionPerformed(evt);
            }
        });

        txtCargo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisarCargo)
                        .addGap(126, 126, 126))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovoCargo)
                .addGap(18, 18, 18)
                .addComponent(btnAlterarCargo)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirCargo)
                .addGap(119, 119, 119))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarCargo)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoCargo)
                    .addComponent(btnAlterarCargo)
                    .addComponent(btnExcluirCargo))
                .addGap(42, 42, 42))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCargoActionPerformed
        frmRegisterPosition cargoCadastroView = new frmRegisterPosition(this);
        cargoCadastroView.setVisible(true);

    }//GEN-LAST:event_btnNovoCargoActionPerformed

    private void btnPesquisarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCargoActionPerformed
        pesquisarCargos();
    }//GEN-LAST:event_btnPesquisarCargoActionPerformed

    private void btnAlterarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCargoActionPerformed
        int selectedRow = tblCargos.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) tblCargos.getValueAt(selectedRow, 0);
            String nome = (String) tblCargos.getValueAt(selectedRow, 1);
            String descricao = (String) tblCargos.getValueAt(selectedRow, 2);

            frmAlterPosition frmAlterar = new frmAlterPosition(this);
            frmAlterar.setCargoData(id, nome, descricao);
            this.setVisible(false);  // Oculta o formulário de pesquisa
            frmAlterar.setVisible(true);  // Mostra o formulário de alteração
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um cargo para alterar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarCargoActionPerformed

    private void btnExcluirCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCargoActionPerformed
        int selectedRow = tblCargos.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um cargo para excluir.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Obtenha o ID do cargo selecionado
        int cargoId = (int) tblCargos.getValueAt(selectedRow, 0);

        // Confirme a exclusão
        int option = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este cargo?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            // Exclua o cargo usando o CargoController
            try {
                cargoController.deleteCargo(cargoId);
                JOptionPane.showMessageDialog(this, "Cargo excluído com sucesso!");
                // Atualize a tabela após a exclusão
                pesquisarCargos();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o cargo: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirCargoActionPerformed

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
            java.util.logging.Logger.getLogger(frmSearchPosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSearchPosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSearchPosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSearchPosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSearchPosition().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCargo;
    private javax.swing.JButton btnExcluirCargo;
    private javax.swing.JButton btnNovoCargo;
    private javax.swing.JButton btnPesquisarCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCargos;
    private javax.swing.JTextField txtCargo;
    // End of variables declaration//GEN-END:variables
}
