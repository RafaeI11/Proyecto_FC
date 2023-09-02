package Vistas;

import java.util.logging.Level;
import java.util.logging.Logger;
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
        tProducto = new javax.swing.JButton();
        tFactura = new javax.swing.JButton();
        tCompra = new javax.swing.JButton();
        tCliente = new javax.swing.JButton();
        salir1 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jLabel1.setText("Bienvenido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Seleccione la Tabla en la que desea Ingresar Datos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 430, 30));

        tProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productos.png"))); // NOI18N
        tProducto.setText(" Tabla Producto");
        tProducto.setContentAreaFilled(false);
        tProducto.setFocusPainted(false);
        tProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tProductoActionPerformed(evt);
            }
        });
        getContentPane().add(tProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 140, 40));

        tFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/factura.png"))); // NOI18N
        tFactura.setText(" Tabla Factura");
        tFactura.setContentAreaFilled(false);
        tFactura.setFocusPainted(false);
        tFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(tFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 140, 40));

        tCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carros (1).png"))); // NOI18N
        tCompra.setText(" Tabla Compra");
        tCompra.setContentAreaFilled(false);
        tCompra.setFocusPainted(false);
        tCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCompraActionPerformed(evt);
            }
        });
        getContentPane().add(tCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 140, 40));

        tCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar-usuario.png"))); // NOI18N
        tCliente.setText(" Tabla Cliente");
        tCliente.setContentAreaFilled(false);
        tCliente.setFocusPainted(false);
        tCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tClienteActionPerformed(evt);
            }
        });
        getContentPane().add(tCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, 40));

        salir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/puerta-de-salida.png"))); // NOI18N
        salir1.setText("SALIR");
        salir1.setContentAreaFilled(false);
        salir1.setFocusPainted(false);
        salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir1ActionPerformed(evt);
            }
        });
        getContentPane().add(salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 380, 50));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/puerta-de-salida.png"))); // NOI18N
        salir.setText("SALIR");
        salir.setContentAreaFilled(false);
        salir.setFocusPainted(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 380, 50));

        jLabel3.setBackground(new java.awt.Color(255, 255, 142));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tProductoActionPerformed
        try {
            Producto pr = new Producto();
            pr.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_tProductoActionPerformed

    private void tFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFacturaActionPerformed
        Factura fac;
        try {
            fac = new Factura();
            fac.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_tFacturaActionPerformed

    private void tCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCompraActionPerformed
        try {
            Compra cpr = new Compra();
            cpr.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_tCompraActionPerformed

    private void tClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tClienteActionPerformed
        // TODO add your handling code here:
        Cliente cli = new Cliente();
        cli.setVisible(true);
        dispose();

    }//GEN-LAST:event_tClienteActionPerformed

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
        JOptionPane.showMessageDialog(null, "Servicio Finalizado");
        dispose();
    }//GEN-LAST:event_salir1ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        JOptionPane.showMessageDialog(null, "Servicio Finalizado");
        dispose();
    }//GEN-LAST:event_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton salir;
    private javax.swing.JButton salir1;
    private javax.swing.JButton tCliente;
    private javax.swing.JButton tCompra;
    private javax.swing.JButton tFactura;
    private javax.swing.JButton tProducto;
    // End of variables declaration//GEN-END:variables
}
