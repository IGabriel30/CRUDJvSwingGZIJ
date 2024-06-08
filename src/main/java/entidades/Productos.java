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
public class Productos {
    
    private int ProductoID;
    private String nombre;
    private String descripcion;
    private String Categoria;
    private double precio;

    public Productos() {
    }

    public Productos(int ProductoID, String nombre, String descripcion, String Categoria, double precio) {
        this.ProductoID = ProductoID;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.Categoria = Categoria;
        this.precio = precio;
    }

    public int getProductoID() {
        return ProductoID;
    }

    public void setProductoID(int ProductoID) {
        this.ProductoID = ProductoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
       
}
