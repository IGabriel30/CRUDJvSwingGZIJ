/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.crudjvswinggz;

import accesoadatos.ProductoDAL;
import entidades.Productos;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilerias.OpcionesCRUD;

/**
 *
 * @author IGABRIEL
 */
public class FrmProductosLec extends javax.swing.JFrame {

    private OpcionesCRUD opcionCRUD;

    /**
     * Creates new form FrmProductosLec
     */
    public FrmProductosLec() {
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

        jLabel1 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jBtnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbtnCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jbtnModificar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscar Producto");

        jLabel1.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jBtnBuscar.setBackground(new java.awt.Color(153, 153, 255));
        jBtnBuscar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnBuscarMouseEntered(evt);
            }
        });
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        jLabel2.setText("Productos");

        jbtnCrear.setBackground(new java.awt.Color(153, 153, 255));
        jbtnCrear.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jbtnCrear.setText("Crear");
        jbtnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnCrearMouseEntered(evt);
            }
        });
        jbtnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCrearActionPerformed(evt);
            }
        });

        jTableProductos.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(jTableProductos);

        jbtnModificar.setBackground(new java.awt.Color(153, 153, 255));
        jbtnModificar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jbtnModificar.setText("Modificar");
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jbtnEliminar.setBackground(new java.awt.Color(153, 153, 255));
        jbtnEliminar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnEliminarMouseEntered(evt);
            }
        });
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbtnCancelar.setBackground(new java.awt.Color(153, 153, 255));
        jbtnCancelar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnCancelarMouseEntered(evt);
            }
        });
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnCrear))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnCancelar)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBuscar)
                    .addComponent(jbtnCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnModificar)
                    .addComponent(jbtnEliminar)
                    .addComponent(jbtnCancelar))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCrearActionPerformed
        opcionCRUD = OpcionesCRUD.CREAR;
        FrmProductoEsc frmProductosEsc = new FrmProductoEsc(opcionCRUD, new Productos());
        frmProductosEsc.setTitle("Crear producto");
        frmProductosEsc.setVisible(true);
    }//GEN-LAST:event_jbtnCrearActionPerformed

    private Productos obtenerDatos() {
        Productos producto = new Productos();
        int row = jTableProductos.getSelectedRow();
        producto.setProductoID((int) jTableProductos.getValueAt(row, 0));
        producto.setNombre(jTableProductos.getValueAt(row, 1).toString());
        producto.setDescripcion(jTableProductos.getValueAt(row, 2).toString());
        producto.setCategoria(jTableProductos.getValueAt(row, 3).toString());
        producto.setPrecio((double) jTableProductos.getValueAt(row, 4));

        return producto;
    }
    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        int row = jTableProductos.getSelectedRow();
        if (row != -1) {
            opcionCRUD = OpcionesCRUD.MODIFICAR;
            FrmProductoEsc frmProductosEsc = new FrmProductoEsc(opcionCRUD, obtenerDatos());
            frmProductosEsc.setTitle("Modificar producto");
            frmProductosEsc.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Seleccionar una fila", "Producto",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        int row = jTableProductos.getSelectedRow();
        if (row != -1) {
            opcionCRUD = OpcionesCRUD.ELIMINAR;
            FrmProductoEsc frmProductosEsc = new FrmProductoEsc(opcionCRUD, obtenerDatos());
            frmProductosEsc.setTitle("Eliminar producto");
            frmProductosEsc.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Seleccionar una fila", "Producto",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
        Productos producto = new Productos();
        producto.setNombre(jTxtNombre.getText());
        ArrayList<Productos> productos = ProductoDAL.buscar(producto);
        String[] columnas = {"ID PRoducto", "Nombre", "Descripcion", "Categoria", "Precio"};
        Object[][] datos = new Object[productos.size()][5];
        for (int i = 0; i < productos.size(); i++) {
            Productos item = productos.get(i);
            datos[i][0] = item.getProductoID();
            datos[i][1] = item.getNombre();
            datos[i][2] = item.getDescripcion();
            datos[i][3] = item.getCategoria();
            datos[i][4] = item.getPrecio();

        }
        DefaultTableModel modelTable = new DefaultTableModel(datos, columnas);
        jTableProductos.setModel(modelTable);
    }//GEN-LAST:event_jBtnBuscarActionPerformed

    private void jBtnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnBuscarMouseEntered
       jbtnCancelar.setBackground(Color.lightGray);
    }//GEN-LAST:event_jBtnBuscarMouseEntered

    private void jbtnCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCrearMouseEntered
        jbtnCrear.setBackground(Color.GREEN);
    }//GEN-LAST:event_jbtnCrearMouseEntered

    private void jbtnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEliminarMouseEntered
          jbtnEliminar.setBackground(Color.RED);
    }//GEN-LAST:event_jbtnEliminarMouseEntered

    private void jbtnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarMouseEntered
         jbtnCancelar.setBackground(Color.GRAY);
    }//GEN-LAST:event_jbtnCancelarMouseEntered

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmProductosLec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProductosLec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProductosLec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProductosLec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProductosLec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnCrear;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnModificar;
    // End of variables declaration//GEN-END:variables
}
