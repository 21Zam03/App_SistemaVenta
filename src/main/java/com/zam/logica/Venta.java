/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zam.logica;

import java.util.Date;

public class Venta {

    private int idVenta;
    private Cliente cliente;
    private Date fecha;

    public Venta(int idVenta, Cliente cliente, Date fecha) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public Venta(Cliente cliente, Date fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public Venta() {
    }
      
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
     
}
