package Vistas;

import javax.swing.JOptionPane;

public class Tablas extends javax.swing.JFrame {

    public Tablas() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        tProducto = new javax.swing.JButton();
        tFactura = new javax.swing.JButton();
        tPagos = new javax.swing.JButton();
        tCompra = new javax.swing.JButton();
        tCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Bienvenido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Seleccione la Tabla en la que desea Ingresar Datos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 360, 30));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        salir.setText("SALIR");
        salir.setFocusPainted(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        tProducto.setText(" Tabla Producto");
        tProducto.setFocusPainted(false);
        tProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tProductoActionPerformed(evt);
            }
        });
        getContentPane().add(tProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 140, -1));

        tFactura.setText(" Tabla Factura");
        tFactura.setFocusPainted(false);
        tFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(tFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 140, -1));

        tPagos.setText(" Tabla Pagos");
        tPagos.setFocusPainted(false);
        tPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPagosActionPerformed(evt);
            }
        });
        getContentPane().add(tPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 140, -1));

        tCompra.setText(" Tabla Compra");
        tCompra.setFocusPainted(false);
        tCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCompraActionPerformed(evt);
            }
        });
        getContentPane().add(tCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 140, -1));

        tCliente.setText(" Tabla Cliente");
        tCliente.setFocusPainted(false);
        tCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tClienteActionPerformed(evt);
            }
        });
        getContentPane().add(tCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        JOptionPane.showMessageDialog(null, "Servicio Finalizado");
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void tProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tProductoActionPerformed

        dispose();
    }//GEN-LAST:event_tProductoActionPerformed

    private void tFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFacturaActionPerformed

    private void tPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPagosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPagosActionPerformed

    private void tCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCompraActionPerformed

    private void tClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton salir;
    private javax.swing.JButton tCliente;
    private javax.swing.JButton tCompra;
    private javax.swing.JButton tFactura;
    private javax.swing.JButton tPagos;
    private javax.swing.JButton tProducto;
    // End of variables declaration//GEN-END:variables
}