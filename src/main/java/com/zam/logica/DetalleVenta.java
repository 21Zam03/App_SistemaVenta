/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.logica;

public class DetalleVenta {
    
    private int idDetalleVenta;
    private Venta venta;
    private Producto producto;
    private int cantidad;
    private double precio;

    public DetalleVenta(int idDetalleVenta, Venta venta, Producto producto, int cantidad, double precio) {
        this.idDetalleVenta = idDetalleVenta;
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public DetalleVenta(Venta venta, Producto producto, int cantidad, double precio) {
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
  
    public DetalleVenta() {
    }
 
    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
       
}
