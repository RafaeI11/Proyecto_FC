package Vistas;

import Clases.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Compra extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;

    public Compra() throws Exception {
        initComponents();
        setLocationRelativeTo(null);
        listar();
        con.box("cliente", "nombre", "id_cliente", comboCliente);
        con.box("producto", "nombre", "id_producto", comboProducto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        comboCliente = new javax.swing.JComboBox<>();
        comboProducto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        regresar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Cliente"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ID Compra:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 30, -1, -1));

        jLabel3.setText("Cliente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 20));

        jLabel4.setText("Producto:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, 20));

        jLabel5.setText("Fecha:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 139, -1));

        txtfecha.setText("yyyy-mm-dd");
        txtfecha.setToolTipText("");
        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });
        jPanel1.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 140, -1));

        jLabel1.setText("Precio:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtPrecio.setEditable(false);
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 140, -1));

        comboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente" }));
        jPanel1.add(comboCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        comboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Producto" }));
        jPanel1.add(comboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carros final.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 140, 140));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 830, 170));

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
        jPanel2.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, 40));

        eliminar.setText("ELIMINAR");
        eliminar.setContentAreaFilled(false);
        eliminar.setFocusPainted(false);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 830, 120));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Registros"));

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID COMPRA", "CLIENTE", "PRODUCTO", "PRECIO", "FECHA"
            }
        ));
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 830, 170));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        regresar.setText(" Regresar");
        regresar.setContentAreaFilled(false);
        regresar.setFocusPainted(false);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 140, 30));

        fondo.setBackground(new java.awt.Color(255, 255, 142));
        fondo.setOpaque(true);
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            JOptionPane.showMessageDialog(null, "Compra no Seleccionada");
        } else {
            int id = Integer.parseInt((String) TablaDatos.getValueAt(fila, 0).toString());
            String cliente = (String) TablaDatos.getValueAt(fila, 1);
            String producto = (String) TablaDatos.getValueAt(fila, 2);
            double precio = Double.parseDouble((String) TablaDatos.getValueAt(fila, 3).toString());
            String fecha = (String) TablaDatos.getValueAt(fila, 4);
            txtId.setText("" + id);
            comboCliente.setSelectedItem(cliente);
            comboProducto.setSelectedItem(producto);
            txtPrecio.setText("" + precio);
            txtfecha.setText("" + fecha);
        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        Tablas tablas = new Tablas();
        tablas.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    public void listar() {
        String sql = "SELECT "
                + "co.id_compra,"
                + "c.nombre AS Cliente, "
                + "p.nombre AS Producto, "
                + "p.precio AS Precio, "
                + "co.fecha AS Fecha "
                + "FROM "
                + "cliente c "
                + "JOIN compra co ON c.id_cliente = co.id_cliente "
                + "JOIN producto p ON co.id_producto = p.id_producto "
                + "order by id_compra;";

        try {
            con.conectaBD();
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] compra = new Object[5];
            modelo = (DefaultTableModel) TablaDatos.getModel();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            while (rs.next()) {
                compra[0] = rs.getInt("id_compra");
                compra[1] = rs.getString("Cliente");
                compra[2] = rs.getString("Producto");
                compra[3] = rs.getDouble("Precio");
                LocalDate fecha = rs.getObject("Fecha", LocalDate.class);
                String fechaString = fecha.format(formatter);
                compra[4] = fechaString;
                modelo.addRow(compra);
            }
            TablaDatos.setModel(modelo);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void limpiar() {
        int rowCount = modelo.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public void Agregar() {
        String cli = (String) comboCliente.getSelectedItem();
        String pro = (String) comboProducto.getSelectedItem();

        int idclii = Integer.parseInt(comboCliente.getClientProperty(cli).toString());
        int idproo = Integer.parseInt(comboProducto.getClientProperty(pro).toString());
        String fecha = txtfecha.getText();

        String resetAutoIncrementSQL = "ALTER TABLE compra AUTO_INCREMENT = 1";

        String sql = "INSERT INTO compra (id_cliente, id_producto, fecha) "
                + "VALUES ('" + idclii + "','" + idproo + "','" + fecha + "')";
        if (cli.equals("") || pro.equals("") || fecha.equals("")) {
            JOptionPane.showMessageDialog(null, "El campo está vacío");
        } else {

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(resetAutoIncrementSQL);
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "La compra fue agregada correctamente");
                limpiar();
                listar();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }

        }
    }

    public void modificar() {
        String cli = (String) comboCliente.getSelectedItem();
        String pro = (String) comboProducto.getSelectedItem();

        int idclii = Integer.parseInt(comboCliente.getClientProperty(cli).toString());
        int idproo = Integer.parseInt(comboProducto.getClientProperty(pro).toString());
        String fec = txtfecha.getText();

        String sql = "update compra set id_cliente='" + idclii + "',id_producto='" + idproo + "',fecha='" + fec + "'"
                + " where id_compra=" + txtId.getText();
        if (cli.equals("") || pro.equals("") || fec.equals("")) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
        } else {
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "El cliente fue Actualizado");
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
            JOptionPane.showMessageDialog(null, "Debe seleccionar una compra");

        } else {
            String sql = "delete from compra where id_compra=" + txtId.getText();
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "La compra fue Eliminada");
                limpiar();
                listar();
            } catch (Exception e) {
            }
        }
    }

    public void limpiartxt() {
        txtId.setText("");
        txtPrecio.setText("");
        txtfecha.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton agregar;
    private javax.swing.JComboBox<String> comboCliente;
    private javax.swing.JComboBox<String> comboProducto;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtfecha;
    // End of variables declaration//GEN-END:variables
}
