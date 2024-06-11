/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoadatos;

import entidades.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author IGABRIEL
 */
public class ProductoDAL {
 public static ArrayList<Productos> obtenerTodos() {
        ArrayList<Productos> productos = new ArrayList<>();
        try (Connection conn = ComunDB.obtenerConexion()) {
            String sql = "SELECT ProductoId, Nombre, Descripcion, Categoria, Precio FROM Productos";           
            try (PreparedStatement statement = conn.prepareStatement(sql)) {                              
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        int productoId = resultSet.getInt("ProductoID");
                        String nombre = resultSet.getString("Nombre");
                        String descripcion = resultSet.getString("Descripcion");
                        String categoria = resultSet.getString("Categoria"); 
                        double precio = resultSet.getDouble("Precio"); 
                        Productos producto = new Productos(productoId,nombre,descripcion,categoria,precio);
                        productos.add(producto);
                    }
                }
            } catch (SQLException e) {
                throw new RuntimeException("Error al obtener los pedidos", e);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener la conexión a la base de datos", e);
        }
        return productos;
    }

  
}
