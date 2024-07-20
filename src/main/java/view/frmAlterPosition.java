package view;

import controller.PositionController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Position;

public class frmAlterPosition extends javax.swing.JFrame {

    private PositionController positionController;
    private int positionId;  // Variável para armazenar o ID do cargo que está sendo alterado
    private frmSearchPosition frmSearch;

    public frmAlterPosition(frmSearchPosition frmSearch) {
        initComponents();
        this.frmSearch = frmSearch;
        this.positionController = new PositionController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        btnSavePosition = new javax.swing.JButton();
        btnCancelPosition = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Alteração de Cargo");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblPosition.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblPosition.setText("Position:");

        lblDescription.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblDescription.setText("Description:");

        txtPosition.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        txtDescription.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        btnSavePosition.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnSavePosition.setText("Salvar");
        btnSavePosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePositionActionPerformed(evt);
            }
        });

        btnCancelPosition.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnCancelPosition.setText("Cancelar");
        btnCancelPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelPositionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescription)
                            .addComponent(lblPosition))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPosition)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnSavePosition)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelPosition)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosition)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescription)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSavePosition)
                    .addComponent(btnCancelPosition))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSavePositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePositionActionPerformed
        String positionName = txtPosition.getText();
        String positionDesc = txtDescription.getText();

        Position position = new Position();
        position.setPositionId(positionId);  // Define o ID do cargo a ser alterado
        position.setPositionName(positionName);
        position.setPositionDesc(positionDesc);

        try {
            positionController.updatePosition(position);
            JOptionPane.showMessageDialog(this, "Position successfully updated!");
            this.dispose();
            frmSearch.setVisible(true);  // Mostra o formulário de pesquisa novamente
            frmSearch.searchPosition(); // Chama o método de pesquisa automaticamente
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating position: " + e.getMessage(), "Error message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSavePositionActionPerformed

    private void btnCancelPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelPositionActionPerformed
        this.dispose();
        frmSearch.setVisible(true);
        frmSearch.searchPosition();
    }//GEN-LAST:event_btnCancelPositionActionPerformed

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
            java.util.logging.Logger.getLogger(frmAlterPosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAlterPosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAlterPosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAlterPosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAlterPosition(new frmSearchPosition()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelPosition;
    private javax.swing.JButton btnSavePosition;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtPosition;
    // End of variables declaration//GEN-END:variables

    public void setPositionData(int id, String positionName, String positionDesc) {
        positionId = id;
        txtPosition.setText(positionName);
        txtDescription.setText(positionDesc);
    }
}
