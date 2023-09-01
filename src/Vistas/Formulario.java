package Vistas;

import Clases.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Formulario extends javax.swing.JFrame {

    public Formulario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        conexion = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jLabel1.setText("Bienvenido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Por favor conectese a la Base de Datos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        conexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/relacional.png"))); // NOI18N
        conexion.setText("  Conectar");
        conexion.setContentAreaFilled(false);
        conexion.setFocusPainted(false);
        conexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conexionActionPerformed(evt);
            }
        });
        getContentPane().add(conexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 120, 30));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        salir.setText("  Salir");
        salir.setContentAreaFilled(false);
        salir.setFocusPainted(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 120, 30));

        fondo.setBackground(new java.awt.Color(255, 255, 142));
        fondo.setOpaque(true);
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conexionActionPerformed

        Conexion bd = new Conexion();

        try {
            bd.conectaBD();
            if (bd.isConnected() == true) {
                Icon icono = new ImageIcon(getClass().getResource("/Imagenes/cheque.png"));
                JOptionPane.showMessageDialog(null, "Conexión exitosa", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
                dispose();
                Tablas tablas = new Tablas();
                tablas.setVisible(true);
            } else {
                Icon icono = new ImageIcon(getClass().getResource("/Imagenes/cerrar.png"));
                JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
                dispose();
            }

        } catch (Exception ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_conexionActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton conexion;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
