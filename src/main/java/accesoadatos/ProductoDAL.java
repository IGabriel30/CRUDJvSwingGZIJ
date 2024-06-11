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

    public static int crear(Productos producto) {
        try (Connection conn = ComunDB.obtenerConexion()) {

            String sql = "INSERT INTO Productos (Nombre, Descripcion, Categoria, Precio) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                statement.setString(1, producto.getNombre());
                statement.setString(2, producto.getDescripcion());
                statement.setString(3, producto.getCategoria());
                statement.setDouble(4, producto.getPrecio());

                int rowsAffected = statement.executeUpdate();
                return rowsAffected;
            } catch (SQLException e) {
                throw new RuntimeException("Error al crear el producto", e);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener la conexión a la base de datos", e);
        }
    }

    public static int modificar(Productos producto) {
        try (Connection conn = ComunDB.obtenerConexion()) {

            String sql = "UPDATE Productos SET Nombre=?, Descripcion=?, Categoria=?, Precio=? WHERE ProductoID=?";
            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                statement.setString(1, producto.getNombre());
                statement.setString(2, producto.getDescripcion());
                statement.setString(3, producto.getCategoria());
                statement.setDouble(4, producto.getPrecio());
                statement.setInt(5, producto.getProductoID());
                int rowsAffected = statement.executeUpdate();
                return rowsAffected;
            } catch (SQLException e) {
                throw new RuntimeException("Error al crear el producto", e);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener la conexión a la base de datos", e);
        }
    }

    public static int eliminar(Productos producto) {
        try (Connection conn = ComunDB.obtenerConexion()) {

            String sql = "DELETE FROM Productos WHERE ProductoID=?";
            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                statement.setInt(1, producto.getProductoID());
                int rowsAffected = statement.executeUpdate();
                return rowsAffected;
            } catch (SQLException e) {
                throw new RuntimeException("Error al crear el producto", e);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener la conexión a la base de datos", e);
        }
    }

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
                        Productos producto = new Productos(productoId, nombre, descripcion, categoria, precio);
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

    public static ArrayList<Productos> buscar(Productos productoSearch) {
        ArrayList<Productos> productos = new ArrayList<>();
        try (Connection conn = ComunDB.obtenerConexion()) {
            String sql = "SELECT p.ProductoID, p.Nombre, p.Descripcion, p.Categoria, p.Precio " +
                     "FROM Productos p WHERE p.Nombre LIKE ?";
            
            //se prepara la sentencia SQL
            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                    // Configura el parámetro de la consulta
                statement.setString(1, "%" + productoSearch.getNombre() + "%");
                // Ejecuta la consulta y obtiene los resultados
                try (ResultSet resultSet = statement.executeQuery()) {
                    // Recorre los resultados y asigna los valores a objetos de tipo Productos
                    while (resultSet.next()) {
                        Productos producto = new Productos();
                        producto.setProductoID(resultSet.getInt("ProductoID"));
                        producto.setNombre(resultSet.getString("Nombre"));
                        producto.setDescripcion(resultSet.getString("Descripcion"));
                        producto.setCategoria(resultSet.getString("Categoria"));
                        producto.setPrecio(resultSet.getDouble("Precio"));

                        
                    // Agrega el producto a la lista
                        productos.add(producto);
                    }
                }
            } catch (SQLException e) {
                 // Lanza una excepción en caso de error al ejecutar la consulta
                throw new RuntimeException("Error al buscar productos", e);
            }
        } catch (SQLException e) {
            // Lanza una excepción en caso de error al obtener la conexión a la base de datos
            throw new RuntimeException("Error al obtener la conexión a la base de datos", e);
        }
         // Devuelve la lista de productos encontrados
        return productos;
    }

}
