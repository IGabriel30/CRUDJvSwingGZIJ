/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author IGABRIEL
 */
public class Pedidos {
    
    private int pedidoID;
    private Date fechaPedido;
    private String nombreCliente;
    private String correoCliente;
    private int cantidad;
    
    private int categoriaId;
    private Productos productoIde;

    public Pedidos() {
    }

    public Pedidos(int pedidoID, Date fechaPedido, String nombreCliente, String correoCliente, int cantidad, int categoriaId, Productos productoIde) {
        this.pedidoID = pedidoID;
        this.fechaPedido = fechaPedido;
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
        this.cantidad = cantidad;
        this.categoriaId = categoriaId;
        this.productoIde = productoIde;
    }

    public int getPedidoID() {
        return pedidoID;
    }

    public void setPedidoID(int pedidoID) {
        this.pedidoID = pedidoID;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Productos getProductoIde() {
        return productoIde;
    }

    public void setProductoIde(Productos productoIde) {
        this.productoIde = productoIde;
    }
 
}
