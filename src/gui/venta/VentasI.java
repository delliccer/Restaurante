/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.venta;

/**
 *
 * @author Administrador
 */
public class VentasI extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentasI
     */
    public VentasI() {
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

        jPanel_Detalle_ = new javax.swing.JPanel();
        jButton_NuevoPedido_ = new javax.swing.JButton();
        jButton_Cobrar_ = new javax.swing.JButton();
        jPanel_PreView_ = new javax.swing.JPanel();
        jPanel_Clientes_ = new javax.swing.JPanel();
        jScrollPane_Clientes_ = new javax.swing.JScrollPane();
        jTable_Factura_ = new javax.swing.JTable();
        jButton_ClienteNuevo_ = new javax.swing.JButton();
        jLabel_BuscarPorFecha_ = new javax.swing.JLabel();
        jLabel_SinCobrar_ = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ventas");
        setAutoscrolls(true);
        setMaximumSize(null);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("gui/venta/Bundle"); // NOI18N
        jPanel_Detalle_.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("Ventas.jPanel_Detalle_.border.title"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jPanel_Detalle_.setToolTipText(bundle.getString("Ventas.jPanel_Detalle_.toolTipText")); // NOI18N
        jPanel_Detalle_.setMaximumSize(null);
        jPanel_Detalle_.setMinimumSize(new java.awt.Dimension(332, 1));

        jButton_NuevoPedido_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_NuevoPedido_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/resources/icons/clocheX32.png"))); // NOI18N
        jButton_NuevoPedido_.setText(bundle.getString("Ventas.jButton_NuevoPedido_.text")); // NOI18N
        jButton_NuevoPedido_.setMaximumSize(new java.awt.Dimension(140, 42));
        jButton_NuevoPedido_.setMinimumSize(new java.awt.Dimension(140, 42));
        jButton_NuevoPedido_.setPreferredSize(new java.awt.Dimension(140, 42));
        jButton_NuevoPedido_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NuevoPedido_ActionPerformed(evt);
            }
        });

        jButton_Cobrar_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Cobrar_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/resources/icons/CashBoxX32.png"))); // NOI18N
        jButton_Cobrar_.setText(bundle.getString("Ventas.jButton_Cobrar_.text")); // NOI18N
        jButton_Cobrar_.setMaximumSize(new java.awt.Dimension(140, 42));
        jButton_Cobrar_.setMinimumSize(new java.awt.Dimension(140, 42));
        jButton_Cobrar_.setPreferredSize(new java.awt.Dimension(140, 42));
        jButton_Cobrar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cobrar_ActionPerformed(evt);
            }
        });

        jPanel_PreView_.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel_PreView_.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel_Detalle_Layout = new javax.swing.GroupLayout(jPanel_Detalle_);
        jPanel_Detalle_.setLayout(jPanel_Detalle_Layout);
        jPanel_Detalle_Layout.setHorizontalGroup(
            jPanel_Detalle_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Detalle_Layout.createSequentialGroup()
                .addComponent(jButton_NuevoPedido_, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Cobrar_, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel_Detalle_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_PreView_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_Detalle_Layout.setVerticalGroup(
            jPanel_Detalle_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Detalle_Layout.createSequentialGroup()
                .addComponent(jPanel_PreView_, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_Detalle_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_NuevoPedido_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cobrar_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel_Detalle_, java.awt.BorderLayout.EAST);

        jPanel_Clientes_.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("Ventas.jPanel_Clientes_.border.title"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jPanel_Clientes_.setMaximumSize(null);
        jPanel_Clientes_.setName(""); // NOI18N

        jScrollPane_Clientes_.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane_Clientes_.setMaximumSize(null);
        jScrollPane_Clientes_.setMinimumSize(null);

        jTable_Factura_.setAutoCreateRowSorter(true);
        jTable_Factura_.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTable_Factura_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Nota", "Factura", "Monto", "Fecha", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Factura_.setToolTipText(bundle.getString("Ventas.jTable_Factura_.toolTipText")); // NOI18N
        jTable_Factura_.setMaximumSize(null);
        jTable_Factura_.setMinimumSize(null);
        jTable_Factura_.setPreferredSize(null);
        jTable_Factura_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Factura_MouseClicked(evt);
            }
        });
        jScrollPane_Clientes_.setViewportView(jTable_Factura_);

        jButton_ClienteNuevo_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_ClienteNuevo_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/resources/icons/FunAsClienteX32.png"))); // NOI18N
        jButton_ClienteNuevo_.setText(bundle.getString("Ventas.jButton_ClienteNuevo_.text")); // NOI18N
        jButton_ClienteNuevo_.setMaximumSize(new java.awt.Dimension(150, 42));
        jButton_ClienteNuevo_.setMinimumSize(new java.awt.Dimension(150, 42));
        jButton_ClienteNuevo_.setPreferredSize(new java.awt.Dimension(150, 42));
        jButton_ClienteNuevo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClienteNuevo_ActionPerformed(evt);
            }
        });

        jLabel_BuscarPorFecha_.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel_BuscarPorFecha_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/resources/icons/CalendarX32.png"))); // NOI18N
        jLabel_BuscarPorFecha_.setText(bundle.getString("Ventas.jLabel_BuscarPorFecha_.text")); // NOI18N
        jLabel_BuscarPorFecha_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_BuscarPorFecha_.setMaximumSize(new java.awt.Dimension(150, 32));
        jLabel_BuscarPorFecha_.setMinimumSize(new java.awt.Dimension(150, 32));
        jLabel_BuscarPorFecha_.setPreferredSize(new java.awt.Dimension(150, 32));
        jLabel_BuscarPorFecha_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BuscarPorFecha_MouseClicked(evt);
            }
        });

        jLabel_SinCobrar_.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel_SinCobrar_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/resources/icons/food32.png"))); // NOI18N
        jLabel_SinCobrar_.setText(bundle.getString("Ventas.jLabel_SinCobrar_.text")); // NOI18N
        jLabel_SinCobrar_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_SinCobrar_.setMaximumSize(new java.awt.Dimension(150, 32));
        jLabel_SinCobrar_.setMinimumSize(new java.awt.Dimension(150, 32));
        jLabel_SinCobrar_.setPreferredSize(new java.awt.Dimension(150, 32));
        jLabel_SinCobrar_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SinCobrar_MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_Clientes_Layout = new javax.swing.GroupLayout(jPanel_Clientes_);
        jPanel_Clientes_.setLayout(jPanel_Clientes_Layout);
        jPanel_Clientes_Layout.setHorizontalGroup(
            jPanel_Clientes_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Clientes_Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Clientes_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane_Clientes_, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel_Clientes_Layout.createSequentialGroup()
                        .addComponent(jButton_ClienteNuevo_, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_BuscarPorFecha_, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_SinCobrar_, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_Clientes_Layout.setVerticalGroup(
            jPanel_Clientes_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Clientes_Layout.createSequentialGroup()
                .addComponent(jScrollPane_Clientes_, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_Clientes_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ClienteNuevo_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_BuscarPorFecha_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_SinCobrar_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel_Clientes_, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_NuevoPedido_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NuevoPedido_ActionPerformed

    }//GEN-LAST:event_jButton_NuevoPedido_ActionPerformed

    private void jButton_Cobrar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cobrar_ActionPerformed

    }//GEN-LAST:event_jButton_Cobrar_ActionPerformed

    private void jTable_Factura_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Factura_MouseClicked
//        if (evt.getClickCount() == 2) {
//            int colId = 1;
//            int row = jTable_Factura_.getSelectedRow();
//            FACTURAID = (Integer) jTable_Factura_.getValueAt(row, 1);
//            Object objId = (Object) jTable_Factura_.getValueAt(row, colId);
//            System.err.println("Factura ID: "+FACTURAID);
//            mostrarDetalle();
//        }
    }//GEN-LAST:event_jTable_Factura_MouseClicked

    private void jButton_ClienteNuevo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClienteNuevo_ActionPerformed
        NuevoCliente clienteNuevo = new NuevoCliente();
        clienteNuevo.setVisible(true);
    }//GEN-LAST:event_jButton_ClienteNuevo_ActionPerformed

    private void jLabel_BuscarPorFecha_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BuscarPorFecha_MouseClicked

    }//GEN-LAST:event_jLabel_BuscarPorFecha_MouseClicked

    private void jLabel_SinCobrar_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SinCobrar_MouseClicked

    }//GEN-LAST:event_jLabel_SinCobrar_MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ClienteNuevo_;
    private javax.swing.JButton jButton_Cobrar_;
    private javax.swing.JButton jButton_NuevoPedido_;
    private javax.swing.JLabel jLabel_BuscarPorFecha_;
    private javax.swing.JLabel jLabel_SinCobrar_;
    private javax.swing.JPanel jPanel_Clientes_;
    private javax.swing.JPanel jPanel_Detalle_;
    private javax.swing.JPanel jPanel_PreView_;
    private javax.swing.JScrollPane jScrollPane_Clientes_;
    private javax.swing.JTable jTable_Factura_;
    // End of variables declaration//GEN-END:variables
}