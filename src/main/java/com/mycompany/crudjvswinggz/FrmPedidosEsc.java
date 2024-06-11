/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.crudjvswinggz;

import accesoadatos.PedidoDAL;
import accesoadatos.ProductoDAL;
import utilerias.OpcionesCRUD;

import entidades.Pedidos;
import entidades.Productos;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JOptionPane;

/**
 *
 * @author IGABRIEL
 */
public class FrmPedidosEsc extends javax.swing.JFrame {

    private OpcionesCRUD opcionesCRUD;
    private Pedidos pedidoActual = new Pedidos();
    private HashMap<Integer, Productos> mapProductos = new HashMap<Integer, Productos>();

    /**
     * Creates new form FrmPedidosEsc
     */
    public FrmPedidosEsc(OpcionesCRUD opcion, Pedidos pedido) {
        this.opcionesCRUD = opcion;
        initComponents();
       
         jDateChooserFechaPedido.setDateFormatString("yyyy-MM-dd");
        
         ArrayList<Productos> products = ProductoDAL.obtenerTodos();
        DefaultComboBoxModel<Productos> modelCombox = new DefaultComboBoxModel(products.toArray());
        for (Productos pro : products) {
            mapProductos.put(pro.getProductoID(), pro);
        }
        jComboProducto.setModel(modelCombox);
        
        //Si no es la opción de crear, asignar los datos del pedido
        if (opcion != OpcionesCRUD.CREAR) {
            asingarDatos(pedido);
            pedidoActual = pedido;
        }
 
    }

    private Pedidos obtenerDatos() {
        Pedidos pedido = new Pedidos();
        
        //FEcha
        // Obtener la fecha desde JDateChooser
    Date fecha = jDateChooserFechaPedido.getDate();
    if (fecha == null) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una fecha válida.");
        return null;
    }
    pedido.setFechaPedido(fecha);
    pedido.setNombreCliente(jTxtFNombreCliente.getText());
    pedido.setCorreoCliente(jTxtfCorreo.getText());

    pedido.setCantidad((Integer) jSpinnerCantidad.getValue());
    Productos producto = (Productos) jComboProducto.getSelectedItem();
    pedido.setProductoID(producto.getProductoID());
   
    return pedido;
    }

    private void asingarDatos(Pedidos pedido) {
      // Establecer la fecha en JDateChooser
    jDateChooserFechaPedido.setDate(pedido.getFechaPedido());
        
        jTxtFNombreCliente.setText(pedido.getNombreCliente());
        jTxtfCorreo.setText(pedido.getCorreoCliente());

        Productos producto = mapProductos.get(pedido.getProductoID());
        jComboProducto.setSelectedItem(producto);
        
         //obtener la cantidad del JSpinner
         jSpinnerCantidad.setValue(pedido.getCantidad());
    }

    private void crearReg() {
        try {
            Pedidos pedido = obtenerDatos();
            int result = PedidoDAL.crear(pedido);
            if (result > 0) {
                JOptionPane.showMessageDialog(this,
                        "El producto fue registrado existosamente", "CREAR PEDIDO",
                        JOptionPane.INFORMATION_MESSAGE);
              
            } else {
                JOptionPane.showMessageDialog(this,
                        "Sucedio un error al crear el producto", "ERROR PEDIDO",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(), "ERROR PEDIDO",
                    JOptionPane.ERROR_MESSAGE);
        }

    }
    
    

    private void modificarReg() {
        try {
            Pedidos pedido = obtenerDatos();
            int result = PedidoDAL.modificar(pedido);
            if (result > 0) {
                JOptionPane.showMessageDialog(this,
                        "El producto fue modificado existosamente", "MODIFICAR PEDIDO",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Sucedio un error al modificar el producto", "ERROR PEDIDO",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(), "ERROR PEDIDO",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    private void eliminarReg() {
        try {
            Pedidos pedido = obtenerDatos();
            int result = PedidoDAL.eliminar(pedido);
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
        jTxtFNombreCliente = new javax.swing.JTextField();
        jTxtfCorreo = new javax.swing.JTextField();
        jComboProducto = new javax.swing.JComboBox<>();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jbtnGuardar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jDateChooserFechaPedido = new com.toedter.calendar.JDateChooser();

        setTitle("Pedidos");
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel1.setText("Fecha de Pedido:");

        jLabel2.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel2.setText("Nombre del Cliente:");

        jLabel3.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel3.setText("Correo del Cliente");

        jLabel4.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel4.setText("Producto:");

        jLabel5.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel5.setText("Cantidad:");

        jComboProducto.setBackground(new java.awt.Color(153, 153, 255));

        jbtnGuardar.setBackground(new java.awt.Color(153, 153, 255));
        jbtnGuardar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnCancelar.setBackground(new java.awt.Color(153, 153, 255));
        jbtnCancelar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        jLabel6.setText("Pedido");

        jDateChooserFechaPedido.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jTxtfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooserFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtFNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnCancelar))
                .addGap(65, 65, 65))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:

        if (null != opcionesCRUD) // TODO add your handling code here:
            switch (opcionesCRUD) {
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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Productos> jComboProducto;
    private com.toedter.calendar.JDateChooser jDateChooserFechaPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTextField jTxtFNombreCliente;
    private javax.swing.JTextField jTxtfCorreo;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnGuardar;
    // End of variables declaration//GEN-END:variables
}
