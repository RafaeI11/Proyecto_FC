package Vistas;

import Clases.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Producto extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;

    public Producto() throws Exception {
        initComponents();
        setLocationRelativeTo(null);
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Producto"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 30, -1, -1));

        jLabel3.setText("NOMBRE:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setText("PRECIO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 139, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 139, -1));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 140, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productos final.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 140, 140));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 830, 160));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregar.setText("AGREGAR");
        agregar.setContentAreaFilled(false);
        agregar.setFocusPainted(false);
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel2.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 40));

        modificar.setText("MODIFICAR");
        modificar.setContentAreaFilled(false);
        modificar.setFocusPainted(false);
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPanel2.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, 40));

        eliminar.setText("ELIMINAR");
        eliminar.setContentAreaFilled(false);
        eliminar.setFocusPainted(false);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 830, 120));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Registros"));

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Producto", "Nombre", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 830, 150));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        regresar.setText(" Regresar");
        regresar.setContentAreaFilled(false);
        regresar.setFocusPainted(false);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 120, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 142));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        Tablas tablas = new Tablas();
        tablas.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        Agregar();
        limpiartxt();
    }//GEN-LAST:event_agregarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        modificar();
        limpiartxt();
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        eliminar();
        limpiartxt();
    }//GEN-LAST:event_eliminarActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        // TODO add your handling code here:
        int fila = TablaDatos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Cliente no Seleccionado");
        } else {
            int id = Integer.parseInt((String) TablaDatos.getValueAt(fila, 0).toString());
            String nombre = (String) TablaDatos.getValueAt(fila, 1);
            double precio = Double.parseDouble((String) TablaDatos.getValueAt(fila, 2).toString());
            txtId.setText("" + id);
            txtNombre.setText("" + nombre);
            txtPrecio.setText("" + precio);
        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    public void listar() {
        String sql = " select * from producto;";
        try {
            con.conectaBD();
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] producto = new Object[3];
            modelo = (DefaultTableModel) TablaDatos.getModel();
            while (rs.next()) {
                producto[0] = rs.getInt("id_producto");
                producto[1] = rs.getString("nombre");
                producto[2] = rs.getDouble("precio");
                modelo.addRow(producto);
            }
            TablaDatos.setModel(modelo);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public void limpiar() {
        int rowCount = modelo.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public void Agregar() {
        String nombre = txtNombre.getText();
        String precioo = txtPrecio.getText();
        if (nombre.equals("") || precioo.equals("")) {
            JOptionPane.showMessageDialog(null, "El campo esta vacio");

        } else {
            double precio = Double.parseDouble(txtPrecio.getText());
            String resetAutoIncrementSQL = "ALTER TABLE producto AUTO_INCREMENT = 1";
            String sql = "insert into producto(nombre,precio) "
                    + "values ('" + nombre + "','" + precio + "')";
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(resetAutoIncrementSQL);
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "El producto fue agregado correctamente");
                limpiar();
                listar();
            } catch (Exception e) {
                System.out.println("Error que paso: " + e);
            }
        }

    }

    public void eliminar() {
        int sel = TablaDatos.getSelectedRow();
        if (sel == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una producto");

        } else {
            String sql = "delete from producto where id_producto=" + txtId.getText();
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "El producto fue Eliminado");
                limpiar();
                listar();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El producto tiene una compra elimine la compra");
            }
        }
    }

    public void modificar() {
        String nom = txtNombre.getText();
        String pre = txtPrecio.getText();
        String sql = "update producto set nombre='" + nom + "',precio='" + pre + "'"
                + " where id_producto=" + txtId.getText();
        if (nom.equals("") || pre.equals("")) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
        } else {
            double precio = Double.parseDouble(txtPrecio.getText());
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "El producto fue Actualizado");
                limpiar();
                listar();
            } catch (Exception e) {
                System.out.println("Error que paso: " + e);
            }
        }
    }

    public void limpiartxt() {
        txtId.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton agregar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
