/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.controladora;

import com.zam.conexion.ConexionDB;
import com.zam.logica.Cliente;
import com.zam.logica.DetalleVenta;
import com.zam.logica.Empresa;
import com.zam.logica.Producto;
import com.zam.logica.Proveedor;
import com.zam.logica.Venta;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Metodos {

    public boolean logearse(String correo, String contrasena) {
        boolean registro = false;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_login(?,?)}");
            cl.setString(1, correo);
            cl.setString(2, contrasena);
            rs = cl.executeQuery();
            if (rs.next()) {
                registro = true;
            } 
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return registro;
    }

    public boolean registrarCliente(Cliente cliente) {
        boolean registro = false;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_registrarCliente(?,?,?,?,?)}");
            cl.setString(1, cliente.getDni());
            cl.setString(2, cliente.getNombre());
            cl.setString(3, cliente.getTelefono());
            cl.setString(4, cliente.getDireccion());
            cl.setString(5, cliente.getRazonSocial());
            rs = cl.executeQuery();
            if (rs != null) {
                registro = true;
            } 
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return registro;
    }

    public List<Cliente> listarClientes() {
        List<Cliente> listaClientes = new ArrayList<>();
        Cliente cliente;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_listarClientes()}");
            rs = cl.executeQuery();
            while (rs.next()) {
                cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                listaClientes.add(cliente);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } 
        return listaClientes;
    }

    public boolean EliminarCliente(int id) {
        boolean registro = false;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_eliminarCliente(?)}");
            cl.setInt(1, id);
            rs = cl.executeQuery();
            if (rs != null) {
                registro = true;
            } 
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return registro;
    }

    public boolean actualizarCliente(Cliente cliente) {
        boolean registro = false;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_actualizarCliente(?,?,?,?,?,?)}");
            cl.setInt(1, cliente.getIdCliente());
            cl.setString(2, cliente.getDni());
            cl.setString(3, cliente.getNombre());
            cl.setString(4, cliente.getTelefono());
            cl.setString(5, cliente.getDireccion());
            cl.setString(6, cliente.getRazonSocial());
            rs = cl.executeQuery();
            if (rs != null) {
                registro = true;
            } 
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return registro;
    }

    public Cliente obtenerCliente(String dni) {
        Cliente cliente = null;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_obtenerCliente(?)}");
            cl.setString(1, dni);
            rs = cl.executeQuery();
            while (rs.next()) {
                cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return cliente;
    }

    public Cliente obtenerCliente(int id) {
        Cliente cliente = null;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_obtenerCliente_id(?)}");
            cl.setInt(1, id);
            rs = cl.executeQuery();
            while (rs.next()) {
                cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return cliente;
    }

    public boolean registrarProveedor(Proveedor proveedor) {
        boolean registro = false;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_registrarProveedor(?,?,?,?,?)}");
            cl.setString(1, proveedor.getRuc());
            cl.setString(2, proveedor.getNombre());
            cl.setString(3, proveedor.getTelefono());
            cl.setString(4, proveedor.getDireccion());
            cl.setString(5, proveedor.getRazonSocial());
            rs = cl.executeQuery();
            if (rs != null) {
                registro = true;
            } 
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return registro;
    }

    public List<Proveedor> listarProveedores() {
        List<Proveedor> listaProveedores = new ArrayList<>();
        Proveedor proveedor;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_listarProveedores()}");
            rs = cl.executeQuery();
            while (rs.next()) {
                proveedor = new Proveedor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                listaProveedores.add(proveedor);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return listaProveedores;
    }

    public boolean eliminarProveedor(int id) {
        boolean registro = false;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_eliminarProveedor(?)}");
            cl.setInt(1, id);
            rs = cl.executeQuery();
            if (rs != null) {
                registro = true;
            } 
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return registro;
    }

    public boolean actualizarProveedor(Proveedor proveedor) {
        boolean registro = false;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_actualizarProveedor(?,?,?,?,?,?)}");
            cl.setInt(1, proveedor.getIdProveedor());
            cl.setString(2, proveedor.getRuc());
            cl.setString(3, proveedor.getNombre());
            cl.setString(4, proveedor.getTelefono());
            cl.setString(5, proveedor.getDireccion());
            cl.setString(6, proveedor.getRazonSocial());
            rs = cl.executeQuery();
            if (rs != null) {
                registro = true;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return registro;
    }

    public Proveedor obtenerProveedor(String nombre) {
        Proveedor proveedor = null;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_obtenerProveedor(?)}");
            cl.setString(1, nombre);
            rs = cl.executeQuery();
            while (rs.next()) {
                proveedor = new Proveedor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Hubo un problema", "Error", 2);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return proveedor;
    }

    public Proveedor obtenerProveedor_id(int id) {
        Proveedor proveedor = null;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_obtenerProveedor_id(?)}");
            cl.setInt(1, id);
            rs = cl.executeQuery();
            while (rs.next()) {
                proveedor = new Proveedor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Hubo un problema", "Error", 2);
        } finally {
            if (rs != null) {
                try {
                   rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return proveedor;
    }

    public boolean registrarProducto(Producto producto) {
        boolean registro = false;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_registrarProducto(?,?,?,?,?)}");
            cl.setInt(1, producto.getProveedor().getIdProveedor());
            cl.setString(2, producto.getCodigo());
            cl.setString(3, producto.getNombre());
            cl.setInt(4, producto.getStock());
            cl.setDouble(5, producto.getPrecio());
            rs = cl.executeQuery();
            if (rs != null) {
                registro = true;
            } 
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return registro;
    }

    public List<Producto> listarProductos() {
        List<Producto> listaProductos = new ArrayList<>();
        Producto producto;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_listarProductos()}");
            rs = cl.executeQuery();
            while (rs.next()) {
                Proveedor proveedor = this.obtenerProveedor_id(rs.getInt(2));
                producto = new Producto(rs.getInt(1), proveedor, rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6));
                listaProductos.add(producto);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return listaProductos;
    }

    public boolean eliminarProducto(int id) {
        boolean registro = false;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_eliminarProducto(?)}");
            cl.setInt(1, id);
            rs = cl.executeQuery();
            if (rs != null) {
                registro = true;
            } 
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return registro;
    }

    public boolean actualizarProducto(Producto producto) {
        boolean registro = false;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_actualizarProducto(?,?,?,?,?,?)}");
            cl.setInt(1, producto.getIdProducto());
            cl.setInt(2, producto.getProveedor().getIdProveedor());
            cl.setString(3, producto.getCodigo());
            cl.setString(4, producto.getNombre());
            cl.setInt(5, producto.getStock());
            cl.setDouble(6, producto.getPrecio());
            rs = cl.executeQuery();
            if (rs != null) {
                registro = true;
            } 
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return registro;
    }

    public Producto obtenerProducto_cod(String codigo) {
        Producto producto = null;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_obtenerProducto_cod(?)}");
            cl.setString(1, codigo);
            rs = cl.executeQuery();
            while (rs.next()) {
                Proveedor proveedor = this.obtenerProveedor_id(rs.getInt(2));
                producto = new Producto(rs.getInt(1), proveedor, rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Hubo un problema", "Error", 2);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return producto;
    }

    public boolean registrarVenta(Venta venta) {
        boolean registro = false;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_registrarVenta(?,?)}");
            java.sql.Date fecha = new java.sql.Date(venta.getFecha().getTime());
            cl.setInt(1, venta.getCliente().getIdCliente());
            cl.setDate(2, fecha);
            rs = cl.executeQuery();
            if (rs != null) {
                registro = true;
            } 
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return registro;
    }

    public boolean registrarDetalleVenta(DetalleVenta detalleVenta) {
        boolean registro = false;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_registrarDetalleVenta(?,?,?,?)}");
            cl.setInt(1, detalleVenta.getVenta().getIdVenta());
            cl.setInt(2, detalleVenta.getProducto().getIdProducto());
            cl.setInt(3, detalleVenta.getCantidad());
            cl.setDouble(4, detalleVenta.getPrecio());
            rs = cl.executeQuery();
            if (rs != null) {
                registro = true;
            } 
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return registro;
    }

    public Venta obtenerVenta(Cliente cliente) {
        Venta venta = null;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_obtenerVenta(?)}");
            cl.setInt(1, cliente.getIdCliente());
            rs = cl.executeQuery();
            while (rs.next()) {
                venta = new Venta(rs.getInt(1), cliente, rs.getDate(3));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Hubo un problema", "Error", 2);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
  
        } 
        return venta;
    }

    public boolean actualizarStock(String codigo1, String cantidad1, int stock) {
        int stock_final = stock - Integer.parseInt(cantidad1);
        boolean registro = false;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_actualizarStock(?,?)}");
            cl.setInt(1, stock_final);
            cl.setString(2, codigo1);
            rs = cl.executeQuery();
            if (rs != null) {
                registro = true;
            } 
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return registro;
    }

    public List<Venta> listarVentas() {
        List<Venta> listaVentas = new ArrayList<>();
        Venta venta;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_listarVentas()}");
            rs = cl.executeQuery();
            while (rs.next()) {
                Cliente cliente = this.obtenerCliente(rs.getInt(2));
                venta = new Venta(rs.getInt(1), cliente, rs.getDate(3));
                listaVentas.add(venta);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return listaVentas;
    }

    public List<Double> obtenerVentaTotal(int id) {
        List<Double> precio_cantidad = new ArrayList<>();
        double num1;
        int num2;
        double precio_total;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_obtenerVentaTotal(?)}");
            cl.setInt(1, id);
            rs = cl.executeQuery();
            while (rs.next()) {
                num1 = rs.getDouble(1);
                num2 = rs.getInt(2);
                precio_total = num1 * num2;
                precio_cantidad.add(precio_total);            
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Hubo un problema", "Error", 2);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return precio_cantidad;
    }

    public Empresa obtenerEmpresa() {
        Empresa empresa = null;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_obtenerEmpresa()}");
            rs = cl.executeQuery();
            while (rs.next()) {
                empresa = new Empresa(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Hubo un problema", "Error", 2);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return empresa;
    }

    public boolean actualizarEmpresa(Empresa empresa) {
        boolean actualizacion = false;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_actualizarEmpresa(?,?,?,?,?)}");
            cl.setString(1, empresa.getRuc());
            cl.setString(2, empresa.getNombre());
            cl.setString(3, empresa.getTelefono());
            cl.setString(4, empresa.getDireccion());
            cl.setString(5, empresa.getRazonSocial());
            rs = cl.executeQuery();
            if (rs != null) {
                actualizacion = true;
            } 
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return actualizacion;
    }
    
    public Producto obtenerProducto_id(int id) {
        Producto producto = null;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_obtenerProducto_Id(?)}");
            cl.setInt(1, id);
            rs = cl.executeQuery();
            while (rs.next()) {
                Proveedor proveedor  = this.obtenerProveedor_id(id);
                producto = new Producto(rs.getInt(1), proveedor, rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Hubo un problema", "Error", 2);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return producto;
    }

    public Venta obtenerVenta_id(int id) {
        Venta venta = null;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_obtenerVenta_Id(?)}");
            cl.setInt(1, id);
            rs = cl.executeQuery();
            while (rs.next()) {
                Cliente cliente = this.obtenerCliente(rs.getInt(2));
                venta = new Venta(rs.getInt(1), cliente, rs.getDate(3));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Hubo un problema", "Error", 2);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return venta;
    }

    public List<DetalleVenta> obtenerDetalleVenta(int id) {
        List<DetalleVenta> listaDetalleVentas = new ArrayList<>();
        DetalleVenta detalle;
        ResultSet rs = null;
        try {
            CallableStatement cl = ConexionDB.getConexion().prepareCall("{call sp_obtenerDetalleVenta(?)}");
            cl.setInt(1, id);
            rs = cl.executeQuery();
            while (rs.next()) {
                Venta venta = this.obtenerVenta_id(rs.getInt(2));
                Producto producto = this.obtenerProducto_id(rs.getInt(3));
                detalle = new DetalleVenta(rs.getInt(1), venta, producto, rs.getInt(4), rs.getDouble(5));
                listaDetalleVentas.add(detalle);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Hubo un problema", "Error", 2);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Error: "+e.getMessage());
                }
            }
        }
        return listaDetalleVentas;
    }
}
