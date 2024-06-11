/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoadatos;

import entidades.Pedidos;
import entidades.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author IGABRIEL
 */
public class PedidoDAL {

    public static int crear(Pedidos pedidos) {
        try (Connection conn = ComunDB.obtenerConexion()) {

            String sql = "INSERT INTO Pedidos (FechaPedido, ClienteNombre, ClienteCorreo, ProductoID, Cantidad) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = conn.prepareStatement(sql)) {
               java.sql.Date sqlDate = new java.sql.Date(pedidos.getFechaPedido().getTime());
                statement.setDate(1, sqlDate);
                statement.setString(2, pedidos.getNombreCliente());
                statement.setString(3, pedidos.getCorreoCliente());
                statement.setInt(4, pedidos.getCantidad());
                statement.setInt(5, pedidos.getProductoID());
                int rowsAffected = statement.executeUpdate();
                return rowsAffected;
            } catch (SQLException e) {
                throw new RuntimeException("Error al crear el pedido", e);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener la conexión a la base de datos", e);
        }
    }

    public static int modificar(Pedidos pedidos) {
        try (Connection conn = ComunDB.obtenerConexion()) {

            String sql = "UPDATE Pedidos SET FechaPedido=?, ClienteNombre=?, ClienteCorreo=?, ProductoID=?, Cantidad=? WHERE PedidoID=?";
            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                java.sql.Date sqlDate = new java.sql.Date(pedidos.getFechaPedido().getTime());
                statement.setDate(1, sqlDate);
                
                statement.setString(2, pedidos.getNombreCliente());
                statement.setString(3, pedidos.getCorreoCliente());
                statement.setInt(4, pedidos.getCantidad());
                statement.setInt(5, pedidos.getProductoID());
                statement.setInt(6, pedidos.getPedidoID());
                int rowsAffected = statement.executeUpdate();
                return rowsAffected;
            } catch (SQLException e) {
                throw new RuntimeException("Error al crear el Pedido", e);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener la conexión a la base de datos", e);
        }
    }

    public static int eliminar(Pedidos pedido) {
        try (Connection conn = ComunDB.obtenerConexion()) {

            String sql = "DELETE FROM Pedidos WHERE PedidoID=?";
            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                statement.setInt(1, pedido.getPedidoID());
                int rowsAffected = statement.executeUpdate();
                return rowsAffected;
            } catch (SQLException e) {
                throw new RuntimeException("Error al crear el producto", e);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener la conexión a la base de datos", e);
        }
    }

    public static ArrayList<Pedidos> buscar(Date pedidoSearch) {
       ArrayList<Pedidos> pedidos = new ArrayList<>();
    try (Connection conn = ComunDB.obtenerConexion()) {
           String sql = "SELECT p.PedidoID, p.FechaPedido, p.ClienteNombre, p.ClienteCorreo, p.Cantidad, p.ProductoID, c.Nombre AS NombreProducto ";
        sql += "FROM Pedidos p INNER JOIN Productos c ON c.ProductoID = p.ProductoID";
        
         if (pedidoSearch != null) {
                sql += " WHERE p.FechaPedido = ?";
            }
       // sql += " WHERE p.FechaPedido = ? ";

        try (PreparedStatement statement = conn.prepareStatement(sql)) {
       
              if (pedidoSearch != null) {
                java.sql.Date sqlDate = new java.sql.Date(pedidoSearch.getTime());
                statement.setDate(1, sqlDate);
            }

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Pedidos pedido = new Pedidos();
                    pedido.setPedidoID(resultSet.getInt("PedidoID"));
                    pedido.setFechaPedido(resultSet.getDate("FechaPedido"));
                    pedido.setNombreCliente(resultSet.getString("ClienteNombre"));
                    pedido.setCorreoCliente(resultSet.getString("ClienteCorreo"));
                    pedido.setCantidad(resultSet.getInt("Cantidad"));

                    pedido.setProductoID(resultSet.getInt("ProductoID"));
                    Productos producto = new Productos();
                    producto.setNombre(resultSet.getString("NombreProducto"));
                    pedido.setProductoIde(producto);

                    pedidos.add(pedido);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al buscar pedidos", e);
        }
    } catch (SQLException e) {
        throw new RuntimeException("Error al obtener la conexión a la base de datos", e);
    }
    return pedidos;
    }
}
