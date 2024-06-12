/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.crudjvswinggz;

import accesoadatos.ProductoDAL;
import entidades.Productos;
import java.awt.Color;
import javax.swing.JOptionPane;
import utilerias.OpcionesCRUD;
import static utilerias.OpcionesCRUD.CREAR;
import static utilerias.OpcionesCRUD.ELIMINAR;
import static utilerias.OpcionesCRUD.MODIFICAR;

/**
 *
 * @author IGABRIEL
 */
public class FrmProductoEsc extends javax.swing.JFrame {

    private OpcionesCRUD opcionCRUD;
    private Productos productActual = new Productos();
    private Color originalButtonColor;

    /**
     * Creates new form FrmProductoEsc
     */
    public FrmProductoEsc(OpcionesCRUD opcion, Productos producto) {
        this.opcionCRUD = opcion;
        initComponents();

        if (opcion != OpcionesCRUD.CREAR) {
            asingarDatos(producto);
            productActual = producto;
        }

        originalButtonColor = jbtnGuardar.getBackground();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtADescripcion = new javax.swing.JTextArea();
        jtxtCategoria = new javax.swing.JTextField();
        jtxtPrecio = new javax.swing.JTextField();
        jbtnGuardar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        jLabel1.setText("Producto");

        jLabel2.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel3.setText("Descripcion:");

        jLabel4.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel4.setText("Categoria:");

        jLabel5.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel5.setText("Precio:");

        jTxtADescripcion.setColumns(20);
        jTxtADescripcion.setRows(5);
        jScrollPane1.setViewportView(jTxtADescripcion);

        jbtnGuardar.setBackground(new java.awt.Color(153, 153, 255));
        jbtnGuardar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnGuardarMouseExited(evt);
            }
        });
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnCancelar.setBackground(new java.awt.Color(153, 153, 255));
        jbtnCancelar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnCancelarMouseExited(evt);
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
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38)
                                .addComponent(jtxtNombre)
                                .addGap(111, 111, 111))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(14, 14, 14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(31, 31, 31)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jtxtCategoria)
                                        .addGap(128, 128, 128))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1)
                                        .addGap(56, 56, 56))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtxtPrecio)
                                        .addGap(145, 145, 145))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(110, 110, 110)))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jtxtNombre))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jtxtCategoria))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jtxtPrecio))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        if (null != opcionCRUD) // TODO add your handling code here:
            switch (opcionCRUD) {
                case CREAR:
                    crearReg();
                    this.setVisible(false);
                    break;
                case MODIFICAR:
                    modificarReg();
                    this.setVisible(false);
                    break;
                case ELIMINAR:
                    eliminarReg();
                    this.setVisible(false);
                    break;
                default:
                    break;
            }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnGuardarMouseEntered
        jbtnGuardar.setBackground(Color.BLUE);
    }//GEN-LAST:event_jbtnGuardarMouseEntered

    private void jbtnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarMouseEntered
        jbtnCancelar.setBackground(Color.GRAY);
    }//GEN-LAST:event_jbtnCancelarMouseEntered

    private void jbtnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnGuardarMouseExited
        jbtnGuardar.setBackground(originalButtonColor);
    }//GEN-LAST:event_jbtnGuardarMouseExited

    private void jbtnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarMouseExited
        jbtnCancelar.setBackground(originalButtonColor);
    }//GEN-LAST:event_jbtnCancelarMouseExited

    private Productos obtenerDatos() {
        Productos producto = new Productos();
        producto.setNombre(jtxtNombre.getText());
        producto.setDescripcion(jTxtADescripcion.getText());
        producto.setCategoria(jtxtCategoria.getText());
        producto.setPrecio(Double.parseDouble(jtxtPrecio.getText()));
        producto.setProductoID(productActual.getProductoID());
        return producto;
    }

    private void asingarDatos(Productos producto) {
        jtxtNombre.setText(producto.getNombre());
        jTxtADescripcion.setText(producto.getDescripcion());
        jtxtPrecio.setText(Double.toString(producto.getPrecio()));

        jtxtCategoria.setText(producto.getCategoria());
    }

    private void crearReg() {
        try {
            Productos producto = obtenerDatos();
            int result = ProductoDAL.crear(producto);
            if (result > 0) {
                JOptionPane.showMessageDialog(this,
                        "El producto fue registrado existosamente", "CREAR PRODUCTO",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Sucedio un error al crear el producto", "ERROR PRODUCTO",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(), "ERROR PRODUCTO",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    private void modificarReg() {
        try {
            Productos producto = obtenerDatos();
            int result = ProductoDAL.modificar(producto);
            if (result > 0) {
                JOptionPane.showMessageDialog(this,
                        "El producto fue modificado existosamente", "MODIFICAR PRODUCTO",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Sucedio un error al modificar el producto", "ERROR PRODUCTO",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(), "ERROR PRODUCTO",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    private void eliminarReg() {
        try {
            Productos producto = obtenerDatos();
            int result = ProductoDAL.eliminar(producto);
            if (result > 0) {
                JOptionPane.showMessageDialog(this,
                        "El producto fue eliminado existosamente", "ELIMINAR PRODUCTO",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Sucedio un error al eliminar el producto", "ERROR PRODUCTO",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(), "ERROR PRODUCTO",
                    JOptionPane.ERROR_MESSAGE);
        }

    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtADescripcion;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JTextField jtxtCategoria;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtPrecio;
    // End of variables declaration//GEN-END:variables
}
