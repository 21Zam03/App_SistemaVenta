/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.zam.interfaces;

import com.zam.controladora.Eventos;
import com.zam.controladora.Metodos;
import com.zam.controladora.Pdf;
import com.zam.logica.Cliente;
import com.zam.logica.DetalleVenta;
import com.zam.logica.Empresa;
import com.zam.logica.Producto;
import com.zam.logica.Proveedor;
import com.zam.logica.Venta;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class Sistema extends javax.swing.JFrame {

    Metodos metodos;
    Eventos eventos;
    List<Cliente> listaClientes;
    List<Proveedor> listaProveedores;
    List<Producto> listaProductos;
    List<Venta> listaVentas;
    List<DetalleVenta> listaDetalleVenta;
    Empresa empresa;
    DefaultTableModel tablaGlobal;
    double total_a_pagar;

    public Sistema() {
        this.listaClientes = null;
        this.listaProveedores = null;
        this.listaProductos = null;
        this.listaVentas = null;
        this.listaDetalleVenta = null;
        this.empresa = null;
        this.total_a_pagar = 0.0;
        metodos = new Metodos();
        eventos = new Eventos();
        initComponents();
        cmbFiltro.addItem("-");
        cmbFiltro.addItem("Dni");
        cmbFiltro.addItem("Nombre");
        cmbFiltro.addItem("Telefono");
        cmbFiltro.addItem("Direccion");
        cmbFiltro.addItem("Razon Social");
        jTabbedPane1.setUI(new BasicTabbedPaneUI() {
            @Override
            protected int calculateTabAreaHeight(int tab_placement, int run_count, int max_tab_height) {
                return 0; // Establecer la altura de la pestaña en 0 para ocultarlas
            }
        });

        this.tablaGlobal = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        this.cargarTablaVenta();
        txtStock.setEditable(false);
        txtDescripcionVenta.setEditable(false);
        txtNombre.setEditable(false);
        AutoCompleteDecorator.decorate(cmbProveedor);
        cmbProveedor.setEditable(true);
        this.crearCmb();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNuevaVenta = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCodigoVenta = new javax.swing.JTextField();
        txtDescripcionVenta = new javax.swing.JTextField();
        txtCantidadVenta = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnEliminarVenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Venta = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDniVenta = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnGenerarVenta = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnGuardarCliente = new javax.swing.JButton();
        btnActualizarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnAgregarCliente = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtDni_cliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNombre_cliente = new javax.swing.JTextField();
        txtTelefono_cliente = new javax.swing.JTextField();
        txtDireccion_cliente = new javax.swing.JTextField();
        txtRazon_cliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        txtId_cliente = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtRuc_proveedor = new javax.swing.JTextField();
        txtNombre_proveedor = new javax.swing.JTextField();
        txtTelefono_proveedor = new javax.swing.JTextField();
        txtDireccion_proveedor = new javax.swing.JTextField();
        txtRazon_proveedor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProveedor = new javax.swing.JTable();
        btnGuardarProveedor = new javax.swing.JButton();
        btnActualizarProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        btnAgregarProveedor = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        txtId_proveedor = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtCodigo_producto = new javax.swing.JTextField();
        txtDescripcion_producto = new javax.swing.JTextField();
        txtCantidad_producto = new javax.swing.JTextField();
        txtPrecio_producto = new javax.swing.JTextField();
        cmbProveedor = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        btnGuardarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnAgregarProducto = new javax.swing.JButton();
        btnActualizarProducto = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaListaVenta = new javax.swing.JTable();
        btnVisualizarVentas = new javax.swing.JButton();
        cmbFiltro = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        lblFiltro = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtRucEmpresa = new javax.swing.JTextField();
        txtNombreEmpresa = new javax.swing.JTextField();
        txtTelefonoEmpresa = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btnActualizarEmpresa = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        txtDireccionEmpresa = new javax.swing.JTextField();
        txtRazonEmpresa = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaDetalleVenta = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        txtIDventa = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtDetalleTotal = new javax.swing.JTextField();
        btnCrearPdf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnNuevaVenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNuevaVenta.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\venta.png")); // NOI18N
        btnNuevaVenta.setText("Nueva venta");
        btnNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });

        btnCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCliente.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\clientes.png")); // NOI18N
        btnCliente.setText(" Clientes");
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnProveedor.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\proveedor.png")); // NOI18N
        btnProveedor.setText("Proveedor");
        btnProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        btnProductos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnProductos.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\producto.png")); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnVentas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\ventas.png")); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnConfig.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnConfig.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\config.png")); // NOI18N
        btnConfig.setText("Config");
        btnConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\logo_alesso.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnConfig, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVentas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnNuevaVenta)
                .addGap(18, 18, 18)
                .addComponent(btnCliente)
                .addGap(18, 18, 18)
                .addComponent(btnProveedor)
                .addGap(18, 18, 18)
                .addComponent(btnProductos)
                .addGap(18, 18, 18)
                .addComponent(btnVentas)
                .addGap(18, 18, 18)
                .addComponent(btnConfig)
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 590));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PUNTO DE VENTA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\encabezado.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 990, 180));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Codigo:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 13, 49, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Producto:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 13, 100, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Cantidad:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 13, 60, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Precio:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 13, 50, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Stock Disponible");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 13, 110, -1));

        txtCodigoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoVentaKeyTyped(evt);
            }
        });
        jPanel3.add(txtCodigoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, -1));
        jPanel3.add(txtDescripcionVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 290, -1));

        txtCantidadVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadVentaKeyTyped(evt);
            }
        });
        jPanel3.add(txtCantidadVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 80, -1));

        txtPrecioVenta.setEditable(false);
        jPanel3.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 60, -1));
        jPanel3.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 70, -1));

        btnEliminarVenta.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\eliminar.png")); // NOI18N
        btnEliminarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 60, -1));

        tabla_Venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_Venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_VentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_Venta);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 97, 901, 170));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Dni/Ruc:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 63, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nombre:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        txtDniVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniVentaKeyTyped(evt);
            }
        });
        jPanel3.add(txtDniVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 329, 160, -1));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 170, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\money.png")); // NOI18N
        jLabel6.setText("Total a pagar:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 110, -1));

        btnGenerarVenta.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\imprimit.png")); // NOI18N
        btnGenerarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });
        jPanel3.add(btnGenerarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 90, -1));

        lblTotal.setText("........");
        jPanel3.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, 50, 20));

        jTabbedPane1.addTab("tab1", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarCliente.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\guardar.png")); // NOI18N
        btnGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });
        jPanel4.add(btnGuardarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 71, 40));

        btnActualizarCliente.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\actualizar.png")); // NOI18N
        btnActualizarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClienteActionPerformed(evt);
            }
        });
        jPanel4.add(btnActualizarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 312, 70, 37));

        btnEliminarCliente.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\eliminar.png")); // NOI18N
        btnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 71, 40));

        btnAgregarCliente.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\agregar.png")); // NOI18N
        btnAgregarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 70, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Dni/Ruc:");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 34, 80, -1));

        txtDni_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDni_clienteKeyTyped(evt);
            }
        });
        jPanel4.add(txtDni_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 198, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Nombre:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 74, 69, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Telefono:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 112, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Direccion:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 150, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Razon social:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 193, -1, -1));

        txtNombre_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre_clienteKeyTyped(evt);
            }
        });
        jPanel4.add(txtNombre_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 198, -1));

        txtTelefono_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefono_clienteKeyTyped(evt);
            }
        });
        jPanel4.add(txtTelefono_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 108, 198, -1));

        txtDireccion_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccion_clienteKeyTyped(evt);
            }
        });
        jPanel4.add(txtDireccion_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 146, 198, -1));

        txtRazon_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazon_clienteKeyTyped(evt);
            }
        });
        jPanel4.add(txtRazon_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 189, 197, -1));

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCliente);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 30, 595, 319));

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\alesso.png")); // NOI18N
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 140, 50));
        jPanel4.add(txtId_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 20, -1));

        jTabbedPane1.addTab("tab2", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Ruc:");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 31, 43, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Nombre:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 70, 65, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Telefono:");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 108, 74, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Direccion:");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 150, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Razon social:");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 189, 100, -1));
        jPanel5.add(txtRuc_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 27, 185, -1));
        jPanel5.add(txtNombre_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 66, 185, -1));
        jPanel5.add(txtTelefono_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 104, 185, -1));
        jPanel5.add(txtDireccion_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 146, 185, -1));
        jPanel5.add(txtRazon_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 185, 185, -1));

        tablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProveedorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaProveedor);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 17, 606, 330));

        btnGuardarProveedor.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\guardar.png")); // NOI18N
        btnGuardarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProveedorActionPerformed(evt);
            }
        });
        jPanel5.add(btnGuardarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 61, 40));

        btnActualizarProveedor.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\actualizar.png")); // NOI18N
        btnActualizarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProveedorActionPerformed(evt);
            }
        });
        jPanel5.add(btnActualizarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 60, 40));

        btnEliminarProveedor.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\eliminar.png")); // NOI18N
        btnEliminarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });
        jPanel5.add(btnEliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 60, 40));

        btnAgregarProveedor.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\agregar.png")); // NOI18N
        btnAgregarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProveedorActionPerformed(evt);
            }
        });
        jPanel5.add(btnAgregarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 59, 40));

        jLabel34.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\alesso.png")); // NOI18N
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 140, 60));
        jPanel5.add(txtId_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 30, -1));

        jTabbedPane1.addTab("tab3", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Codigo: ");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Descripcion: ");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Cantidad:");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Precio:");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Proveedor:");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        jPanel6.add(txtCodigo_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 210, -1));
        jPanel6.add(txtDescripcion_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 210, -1));
        jPanel6.add(txtCantidad_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 210, -1));
        jPanel6.add(txtPrecio_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 210, -1));

        jPanel6.add(cmbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 210, -1));

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaProducto);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 590, 340));

        btnGuardarProducto.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\guardar.png")); // NOI18N
        btnGuardarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });
        jPanel6.add(btnGuardarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 70, 40));

        btnEliminarProducto.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\eliminar.png")); // NOI18N
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        jPanel6.add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 70, 40));

        btnAgregarProducto.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\agregar.png")); // NOI18N
        btnAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        jPanel6.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 70, 40));

        btnActualizarProducto.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\actualizar.png")); // NOI18N
        btnActualizarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductoActionPerformed(evt);
            }
        });
        jPanel6.add(btnActualizarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 60, 40));

        jLabel35.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\alesso.png")); // NOI18N
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 140, 60));

        jTabbedPane1.addTab("tab4", jPanel6);

        tablaListaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tablaListaVenta);

        btnVisualizarVentas.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\ver_icon.png")); // NOI18N
        btnVisualizarVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarVentasActionPerformed(evt);
            }
        });

        cmbFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFiltroItemStateChanged(evt);
            }
        });

        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFiltroKeyPressed(evt);
            }
        });

        lblFiltro.setText("------------------");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVisualizarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnVisualizarVentas))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFiltro))))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", jPanel7);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("RUC");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("NOMBRE");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("TELEFONO");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("DIRECCION");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("RAZON SOCIAL");

        btnActualizarEmpresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizarEmpresa.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\actualizar.png")); // NOI18N
        btnActualizarEmpresa.setText("Actualizar");
        btnActualizarEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEmpresaActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel33.setText("DATOS DE LA EMPRESA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccionEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(txtRucEmpresa))
                .addGap(167, 167, 167)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtNombreEmpresa))
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazonEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(392, 392, 392)
                .addComponent(btnActualizarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRucEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazonEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnActualizarEmpresa)
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("tab6", jPanel2);

        tablaDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tablaDetalleVenta);

        jLabel36.setText("ID Venta: ");

        btnRegresar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\atras_icon.png")); // NOI18N
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel37.setText("Cliente: ");

        jLabel38.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\money.png")); // NOI18N
        jLabel38.setText("Total: ");

        btnCrearPdf.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_SistemaVenta\\src\\main\\java\\com\\zam\\img\\pdf.png")); // NOI18N
        btnCrearPdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnCrearPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDetalleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIDventa, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(263, 263, 263)
                                .addComponent(btnRegresar))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(46, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36)
                        .addComponent(txtIDventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(txtDetalleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("tab7", jPanel8);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 990, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        if (txtDni_cliente.getText().isBlank() || txtNombre_cliente.getText().isBlank()
                || txtTelefono_cliente.getText().isBlank() || txtDireccion_cliente.getText().isBlank()
                || txtRazon_cliente.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Llene todos los datos", "Casilleros incompletos", 2);
        } else {
            Cliente cliente = new Cliente(txtDni_cliente.getText(), txtNombre_cliente.getText(),
                    txtTelefono_cliente.getText(), txtDireccion_cliente.getText(), txtRazon_cliente.getText());
            boolean registro = metodos.registrarCliente(cliente);
            if (registro) {
                JOptionPane.showMessageDialog(null, "Registro de cliente realizado con exito", "Proceso exitoso", 1);
                this.listaClientes = metodos.listarClientes();
                this.cargarTablaCliente(listaClientes);
                this.limpiarCliente();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar al cliente, vuelvalo a intentarlo", "Error", 2);
            }
        }
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void btnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClienteActionPerformed
        int id = Integer.parseInt(String.valueOf(tablaCliente.getValueAt(tablaCliente.getSelectedRow(), 0)));

        Cliente cliente = new Cliente(id, String.valueOf(txtDni_cliente.getText()), String.valueOf(txtNombre_cliente.getText()),
                String.valueOf(txtTelefono_cliente.getText()), String.valueOf(txtDireccion_cliente.getText()), String.valueOf(txtRazon_cliente.getText()));

        this.metodos.actualizarCliente(cliente);

        JOptionPane.showMessageDialog(null, "Los datos se actualizaron con exito", "Proceso exitoso", 1);
        listaClientes = metodos.listarClientes();
        this.cargarTablaCliente(listaClientes);
        this.limpiarCliente();
    }//GEN-LAST:event_btnActualizarClienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        this.limpiarCliente();
        btnGuardarCliente.setEnabled(true);
        btnActualizarCliente.setEnabled(false);
        btnEliminarCliente.setEnabled(false);
        jTabbedPane1.setSelectedIndex(1);
        this.listaClientes = metodos.listarClientes();
        this.cargarTablaCliente(listaClientes);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
        this.limpiarVenta();
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        this.limpiarProveedor();
        jTabbedPane1.setSelectedIndex(2);
        btnGuardarProveedor.setEnabled(true);
        btnActualizarProveedor.setEnabled(false);
        btnEliminarProveedor.setEnabled(false);
        this.listaProveedores = metodos.listarProveedores();
        this.cargarTablaProveedor(listaProveedores);
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        this.limpiarProducto();
        this.crearCmb();
        jTabbedPane1.setSelectedIndex(3);
        btnGuardarProducto.setEnabled(true);
        btnActualizarProducto.setEnabled(false);
        btnEliminarProducto.setEnabled(false);
        this.listaProductos = metodos.listarProductos();
        this.cargarTablaProducto(listaProductos);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        jTabbedPane1.setSelectedIndex(4);
        cmbFiltro.setSelectedIndex(0);
        txtFiltro.setEditable(false);
        this.listaVentas = metodos.listarVentas();
        this.cargarTablaVentaFinal(listaVentas);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        jTabbedPane1.setSelectedIndex(5);
        this.empresa = this.metodos.obtenerEmpresa();
        this.cargarDatosEmpresa(empresa);
    }//GEN-LAST:event_btnConfigActionPerformed

    private void tablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClienteMouseClicked
        int fila = tablaCliente.rowAtPoint(evt.getPoint());
        txtDni_cliente.setText(String.valueOf(tablaCliente.getValueAt(fila, 1)));
        txtNombre_cliente.setText(String.valueOf(tablaCliente.getValueAt(fila, 2)));
        txtTelefono_cliente.setText(String.valueOf(tablaCliente.getValueAt(fila, 3)));
        txtDireccion_cliente.setText(String.valueOf(tablaCliente.getValueAt(fila, 4)));
        txtRazon_cliente.setText(String.valueOf(tablaCliente.getValueAt(fila, 5)));
        btnGuardarCliente.setEnabled(false);
        btnActualizarCliente.setEnabled(true);
        btnEliminarCliente.setEnabled(true);
    }//GEN-LAST:event_tablaClienteMouseClicked

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        if (tablaCliente.getRowCount() > 0) {
            if (tablaCliente.getSelectedRow() != -1) {
                int seleccion = JOptionPane.showOptionDialog(
                        null, //Componenete
                        "Esta seguro que desea eliminar el registro seleccionado?", //Mensaje
                        "Intento de eliminacion", //Titulo
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, //Icono... al poner null el icono sera por defecto
                        new Object[]{"Si", "No"},
                        "Si");
                if (seleccion == 0) {
                    int id = Integer.parseInt(String.valueOf(tablaCliente.getValueAt(tablaCliente.getSelectedRow(), 0)));
                    System.out.println("Id: " + id);
                    boolean error = metodos.EliminarCliente(id);
                    if (error) {
                        listaClientes = metodos.listarClientes();
                        this.cargarTablaCliente(listaClientes);
                        JOptionPane.showMessageDialog(null, "Cliente eliminado con exito", "Eliminacion exitoso", 1);
                        this.limpiarCliente();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un error al momento de intentar eliminar", "Error", 2);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado una columna", "Columna no seleccionada", 1);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay aun registros", "Error", 2);
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        this.limpiarCliente();
        btnGuardarCliente.setEnabled(true);
        btnActualizarCliente.setEnabled(false);
        btnEliminarCliente.setEnabled(false);
        txtDni_cliente.requestFocus();
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnGuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProveedorActionPerformed
        if (txtRuc_proveedor.getText().isBlank() || txtNombre_proveedor.getText().isBlank()
                || txtTelefono_proveedor.getText().isBlank() || txtDireccion_proveedor.getText().isBlank()
                || txtRazon_proveedor.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Llene todos los datos", "Casilleros incompletos", 2);
        } else {
            Proveedor proveedor = new Proveedor(txtRuc_proveedor.getText(), txtNombre_proveedor.getText(),
                    txtTelefono_proveedor.getText(), txtDireccion_proveedor.getText(), txtRazon_proveedor.getText());
            boolean registro = metodos.registrarProveedor(proveedor);
            if (registro) {
                JOptionPane.showMessageDialog(null, "Registro de proveedor realizado con exito", "Proceso exitoso", 1);
                this.listaProveedores = metodos.listarProveedores();
                this.cargarTablaProveedor(listaProveedores);
                this.limpiarProveedor();
                this.crearCmb();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar el proveedor, vuelvalo a intentarlo", "Error", 2);
            }
        }
    }//GEN-LAST:event_btnGuardarProveedorActionPerformed

    private void tablaProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedorMouseClicked
        int fila = tablaProveedor.rowAtPoint(evt.getPoint());
        txtRuc_proveedor.setText(String.valueOf(tablaProveedor.getValueAt(fila, 1)));
        txtNombre_proveedor.setText(String.valueOf(tablaProveedor.getValueAt(fila, 2)));
        txtTelefono_proveedor.setText(String.valueOf(tablaProveedor.getValueAt(fila, 3)));
        txtDireccion_proveedor.setText(String.valueOf(tablaProveedor.getValueAt(fila, 4)));
        txtRazon_proveedor.setText(String.valueOf(tablaProveedor.getValueAt(fila, 5)));
        btnGuardarProveedor.setEnabled(false);
        btnActualizarProveedor.setEnabled(true);
        btnEliminarProveedor.setEnabled(true);
    }//GEN-LAST:event_tablaProveedorMouseClicked

    private void btnAgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProveedorActionPerformed
        this.limpiarProveedor();
        btnGuardarProveedor.setEnabled(true);
        btnActualizarProveedor.setEnabled(false);
        btnEliminarProveedor.setEnabled(false);
        txtRuc_proveedor.requestFocus();
    }//GEN-LAST:event_btnAgregarProveedorActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        if (tablaProveedor.getRowCount() > 0) {
            if (tablaProveedor.getSelectedRow() != -1) {
                int seleccion = JOptionPane.showOptionDialog(
                        null, //Componenete
                        "Esta seguro que desea eliminar el registro seleccionado?", //Mensaje
                        "Intento de eliminacion", //Titulo
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, //Icono... al poner null el icono sera por defecto
                        new Object[]{"Si", "No"},
                        "Si");
                if (seleccion == 0) {
                    int id = Integer.parseInt(String.valueOf(tablaProveedor.getValueAt(tablaProveedor.getSelectedRow(), 0)));
                    boolean error = metodos.eliminarProveedor(id);
                    if (error) {
                        JOptionPane.showMessageDialog(null, "Proveedor eliminado con exito", "Eliminacion exitoso", 1);
                        listaProveedores = metodos.listarProveedores();
                        this.cargarTablaProveedor(listaProveedores);
                        this.limpiarProveedor();
                        this.crearCmb();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un error al momento de intentar eliminar", "Error", 2);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado una columna", "Columna no seleccionada", 1);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay aun registros", "Error", 2);
        }
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnActualizarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProveedorActionPerformed
        int id = Integer.parseInt(String.valueOf(tablaProveedor.getValueAt(tablaProveedor.getSelectedRow(), 0)));

        Proveedor proveedor = new Proveedor(id, String.valueOf(txtRuc_proveedor.getText()), String.valueOf(txtNombre_proveedor.getText()),
                String.valueOf(txtTelefono_proveedor.getText()), String.valueOf(txtDireccion_proveedor.getText()),
                String.valueOf(txtRazon_proveedor.getText()));

        this.metodos.actualizarProveedor(proveedor);

        JOptionPane.showMessageDialog(null, "Los datos se actualizaron con exito", "Proceso exitoso", 1);
        this.listaProveedores = metodos.listarProveedores();
        this.cargarTablaProveedor(listaProveedores);
        this.limpiarProveedor();
    }//GEN-LAST:event_btnActualizarProveedorActionPerformed

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
        if (txtCodigo_producto.getText().isBlank() || txtDescripcion_producto.getText().isBlank()
                || txtCantidad_producto.getText().isBlank() || txtPrecio_producto.getText().isBlank()
                || cmbProveedor.getSelectedItem().toString().equals("-")) {
            JOptionPane.showMessageDialog(null, "Llene todos los datos", "Casilleros incompletos", 2);
        } else {
            String prov = cmbProveedor.getSelectedItem().toString();
            Proveedor proveedor = metodos.obtenerProveedor(prov);
            Producto producto = new Producto(proveedor, txtCodigo_producto.getText(), txtDescripcion_producto.getText(),
                    Integer.parseInt(txtCantidad_producto.getText()), Double.parseDouble(txtPrecio_producto.getText()));
            boolean registro = metodos.registrarProducto(producto);
            if (registro) {
                JOptionPane.showMessageDialog(null, "Registro del producto realizado con exito", "Proceso exitoso", 1);
                this.listaProductos = metodos.listarProductos();
                this.cargarTablaProducto(listaProductos);
                this.limpiarProducto();
                this.crearCmb();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar el producto, vuelvalo a intentarlo", "Error", 2);
            }
        }
    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        if (tablaProducto.getRowCount() > 0) {
            if (tablaProducto.getSelectedRow() != -1) {
                int seleccion = JOptionPane.showOptionDialog(
                        null, //Componenete
                        "Esta seguro que desea eliminar el registro seleccionado?", //Mensaje
                        "Intento de eliminacion", //Titulo
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, //Icono... al poner null el icono sera por defecto
                        new Object[]{"Si", "No"},
                        "Si");
                if (seleccion == 0) {
                    int id = Integer.parseInt(String.valueOf(tablaProducto.getValueAt(tablaProducto.getSelectedRow(), 0)));
                    System.out.println("Id: " + id);
                    boolean error = metodos.eliminarProducto(id);
                    if (error) {
                        listaProductos = metodos.listarProductos();
                        this.cargarTablaProducto(listaProductos);
                        JOptionPane.showMessageDialog(null, "Producto eliminado con exito", "Eliminacion exitosa", 1);
                        this.limpiarCliente();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hubo un error al momento de intentar eliminar", "Error", 2);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado una columna", "Columna no seleccionada", 1);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay aun registros", "Error", 2);
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void tablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMouseClicked
        int fila = tablaProducto.rowAtPoint(evt.getPoint());
        txtCodigo_producto.setText(String.valueOf(tablaProducto.getValueAt(fila, 2)));
        txtDescripcion_producto.setText(String.valueOf(tablaProducto.getValueAt(fila, 3)));
        txtCantidad_producto.setText(String.valueOf(tablaProducto.getValueAt(fila, 4)));
        txtPrecio_producto.setText(String.valueOf(tablaProducto.getValueAt(fila, 5)));
        cmbProveedor.setSelectedItem(String.valueOf(tablaProducto.getValueAt(fila, 1)));
        btnGuardarProducto.setEnabled(false);
        btnActualizarProducto.setEnabled(true);
        btnEliminarProducto.setEnabled(true);
    }//GEN-LAST:event_tablaProductoMouseClicked

    private void btnActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProductoActionPerformed
        int id = Integer.parseInt(String.valueOf(tablaProducto.getValueAt(tablaProducto.getSelectedRow(), 0)));
        String nombre = String.valueOf(cmbProveedor.getSelectedItem());
        Proveedor proveedor = metodos.obtenerProveedor(nombre);

        Producto producto = new Producto(id, proveedor, txtCodigo_producto.getText(), txtDescripcion_producto.getText(),
                Integer.parseInt(txtCantidad_producto.getText()), Double.parseDouble(txtPrecio_producto.getText()));

        this.metodos.actualizarProducto(producto);
        JOptionPane.showMessageDialog(null, "Los datos se actualizaron con exito", "Proceso exitoso", 1);
        this.listaProductos = metodos.listarProductos();
        this.cargarTablaProducto(listaProductos);
        this.limpiarProducto();
        this.crearCmb();
    }//GEN-LAST:event_btnActualizarProductoActionPerformed

    private void txtCodigoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoVentaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtCodigoVenta.getText().isBlank()) {
                String codigo = txtCodigoVenta.getText();
                Producto producto = this.metodos.obtenerProducto_cod(codigo);
                if (producto != null) {
                    txtCodigoVenta.setText(producto.getCodigo());
                    txtDescripcionVenta.setText(producto.getNombre());
                    txtCantidadVenta.setText("");
                    txtPrecioVenta.setText(String.valueOf(producto.getPrecio()));
                    txtStock.setText(String.valueOf(producto.getStock()));
                    txtCantidadVenta.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "No hay ningun producto con ese codigo", "Atencion!!", 2);
                    txtCodigoVenta.setText("");
                    txtDescripcionVenta.setText("");
                    txtCantidadVenta.setText("");
                    txtPrecioVenta.setText("");
                    txtStock.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No ha escrito el codigo", "Atencion!!", 2);
            }
        }
    }//GEN-LAST:event_txtCodigoVentaKeyPressed

    private void txtCantidadVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtCantidadVenta.getText().isBlank()) {
                String cod = txtCodigoVenta.getText();
                String descripcion = txtDescripcionVenta.getText();
                int cantidad = Integer.parseInt(txtCantidadVenta.getText());
                double precio = Double.parseDouble(txtPrecioVenta.getText());
                double total = cantidad * precio;
                int stock = Integer.parseInt(txtStock.getText());

                //Para aproximar a 2 decimales el precio total.
                double total_final = (double) Math.round(total * 100) / 100;

                if (cantidad <= stock) {
                    Object objecto[] = {cod, descripcion, cantidad, precio, total_final};
                    this.agregarProductoVenta(objecto);
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad sobrepasa el stock", "Atencion!!", 2);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No digitado una cantidad", "Atencion!!", 2);
            }
        }
    }//GEN-LAST:event_txtCantidadVentaKeyPressed

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
        if (tabla_Venta.getRowCount() > 0) {
            if (tabla_Venta.getSelectedRow() != -1) {
                int seleccion = JOptionPane.showOptionDialog(
                        null, //Componenete
                        "Esta seguro que desea eliminar el producto de la lista de ventas?", //Mensaje
                        "Intento de eliminacion", //Titulo
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, //Icono... al poner null el icono sera por defecto
                        new Object[]{"Si", "No"},
                        "Si");
                if (seleccion == 0) {
                    String cod = String.valueOf(tabla_Venta.getValueAt(tabla_Venta.getSelectedRow(), 0));
                    double prec = Double.parseDouble(String.valueOf(tabla_Venta.getValueAt(tabla_Venta.getSelectedRow(), 4)));
                    for (int i = 0; i < tablaGlobal.getRowCount(); i++) {
                        if (tabla_Venta.getValueAt(i, 0).equals(cod)) {
                            tablaGlobal.removeRow(i);
                        }
                    }
                    tabla_Venta.setModel(tablaGlobal);
                    total_a_pagar = total_a_pagar - prec;
                    lblTotal.setText(String.format("%.2f", total_a_pagar));
                }
            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado un producto", "Atencion!!", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay productos en la tabla de ventas", "Atencion!!", 2);
        }
    }//GEN-LAST:event_btnEliminarVentaActionPerformed

    private void txtDniVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniVentaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtDniVenta.getText().isBlank()) {
                String dni = txtDniVenta.getText();
                Cliente cliente = this.metodos.obtenerCliente(dni);
                if (cliente != null) {
                    txtNombre.setText(cliente.getNombre());
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente no existe", "Atencion!!", 2);
                    txtDniVenta.setText("");
                    txtNombre.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No ha digitado el dni del cliente", "Atencion!!", 2);
            }
        }
    }//GEN-LAST:event_txtDniVentaKeyPressed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        if (tabla_Venta.getRowCount() > 0) {
            if (!txtNombre.getText().isBlank()) {
                String dni = txtDniVenta.getText();
                Cliente cliente = this.metodos.obtenerCliente(dni);
                Venta venta = new Venta(cliente, new Date());
                boolean registro = this.metodos.registrarVenta(venta);
                venta = this.metodos.obtenerVenta(cliente);
                if (registro) {
                    DetalleVenta detalle;
                    boolean registro2 = false;
                    for (int i = 0; i < tabla_Venta.getRowCount(); i++) {
                        String cod_producto = String.valueOf(tabla_Venta.getValueAt(i, 0));
                        Producto producto = this.metodos.obtenerProducto_cod(cod_producto);
                        int cantidad = Integer.parseInt(String.valueOf(tabla_Venta.getValueAt(i, 2)));
                        detalle = new DetalleVenta(venta, producto, cantidad, producto.getPrecio());
                        registro2 = this.metodos.registrarDetalleVenta(detalle);
                    }
                    if (registro2) {
                        for (int i = tablaGlobal.getRowCount() - 1; i >= 0; i--) {
                            String codigo1 = String.valueOf(tabla_Venta.getValueAt(i, 0));
                            String cantidad1 = String.valueOf(tabla_Venta.getValueAt(i, 2));
                            Producto producto1 = this.metodos.obtenerProducto_cod(codigo1);
                            registro2 = this.metodos.actualizarStock(codigo1, cantidad1, producto1.getStock());
                            tablaGlobal.removeRow(i);
                        }
                        if (registro2) {
                            JOptionPane.showMessageDialog(null, "Se registro la venta exitosamente", "Registro exitoso", 1);
                            tabla_Venta.setModel(tablaGlobal);
                            txtDniVenta.setText("");
                            txtNombre.setText("");
                            lblTotal.setText("........");
                            total_a_pagar = 0.0;
                            List<DetalleVenta> lista = this.metodos.obtenerDetalleVenta(venta.getIdVenta());
                            Pdf pdf = new Pdf();
                            String nombre = pdf.CrearPdf(lista);
                            pdf.abrirPdf(nombre);
                            this.limpiarVenta();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo registrar la venta (Stock)", "Error", 2);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo registrar la venta (Detalle de venta)", "Error", 2);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo registrar la venta (venta)", "Error", 2);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay un cliente seleccionado", "Atencion!!", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay productos en la tabla de ventas", "Atencion!!", 2);
        }
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    private void txtCodigoVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoVentaKeyTyped
        eventos.numberKeyPress(evt);
    }//GEN-LAST:event_txtCodigoVentaKeyTyped

    private void txtCantidadVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaKeyTyped
        eventos.numberKeyPress(evt);
    }//GEN-LAST:event_txtCantidadVentaKeyTyped

    private void txtDniVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniVentaKeyTyped
        eventos.numberKeyPress(evt);
    }//GEN-LAST:event_txtDniVentaKeyTyped

    private void txtDni_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDni_clienteKeyTyped
        eventos.numberKeyPress(evt);
    }//GEN-LAST:event_txtDni_clienteKeyTyped

    private void txtNombre_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre_clienteKeyTyped
        eventos.textKeyPress(evt);
    }//GEN-LAST:event_txtNombre_clienteKeyTyped

    private void txtTelefono_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefono_clienteKeyTyped
        eventos.numberKeyPress(evt);
    }//GEN-LAST:event_txtTelefono_clienteKeyTyped

    private void txtDireccion_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccion_clienteKeyTyped
        eventos.textKeyPress(evt);
    }//GEN-LAST:event_txtDireccion_clienteKeyTyped

    private void txtRazon_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazon_clienteKeyTyped
        eventos.textKeyPress(evt);
    }//GEN-LAST:event_txtRazon_clienteKeyTyped

    private void tabla_VentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_VentaMouseClicked
        btnEliminarVenta.setEnabled(true);
    }//GEN-LAST:event_tabla_VentaMouseClicked

    private void btnActualizarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEmpresaActionPerformed
        this.empresa = new Empresa(txtRucEmpresa.getText(), txtNombreEmpresa.getText(), txtTelefonoEmpresa.getText(),
                txtDireccionEmpresa.getText(), txtRazonEmpresa.getText());
        boolean actualizacion = this.metodos.actualizarEmpresa(empresa);
        if (actualizacion) {
            JOptionPane.showMessageDialog(null, "Se actualizaron los datos con exito", "Proceso exitoso", 1);
            /*this.empresa = this.metodos.obtenerEmpresa();
            this.cargarDatosEmpresa(empresa);*/
        } else {
            JOptionPane.showMessageDialog(null, "No se pudieron actualizar los datos", "Error", 1);
        }
    }//GEN-LAST:event_btnActualizarEmpresaActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        this.limpiarProducto();
        btnGuardarProducto.setEnabled(true);
        btnActualizarProducto.setEnabled(false);
        btnEliminarProducto.setEnabled(false);
        txtCodigo_producto.requestFocus();
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnVisualizarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarVentasActionPerformed
        if (tablaListaVenta.getRowCount() > 0) {
            if (tablaListaVenta.getSelectedRow() != -1) {
                int cod = Integer.parseInt(String.valueOf(tablaListaVenta.getValueAt(tablaListaVenta.getSelectedRow(), 0)));
                this.listaDetalleVenta = this.metodos.obtenerDetalleVenta(cod);
                jTabbedPane1.setSelectedIndex(6);
                this.cargarTablaDetalleVenta(listaDetalleVenta);
            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado una venta!!", "Atencion!!", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "La tabla de ventas esta vacia", "Atencion!!", 2);
        }
    }//GEN-LAST:event_btnVisualizarVentasActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cmbFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFiltroItemStateChanged
        switch (cmbFiltro.getSelectedItem().toString()) {
            case "-": {
                lblFiltro.setText("-");
                txtFiltro.setText("");
                txtFiltro.setEditable(false);
                this.listaVentas = this.metodos.listarVentas();
                this.cargarTablaVentaFinal(listaVentas);
            }
            break;
            case "Dni": {
                txtFiltro.setText("");
                lblFiltro.setText("Dni:");
                txtFiltro.setEditable(true);
                txtFiltro.requestFocus();
            }
            ;
            break;
            case "Nombre": {
                txtFiltro.setText("");
                lblFiltro.setText("Nombre:");
                txtFiltro.setEditable(true);
                txtFiltro.requestFocus();
            }
            ;
            break;
            case "Telefono": {
                txtFiltro.setText("");
                lblFiltro.setText("Telefono:");
                txtFiltro.setEditable(true);
                txtFiltro.requestFocus();
            }
            ;
            break;
            case "Direccion": {
                txtFiltro.setText("");
                lblFiltro.setText("Direccion:");
                txtFiltro.setEditable(true);
                txtFiltro.requestFocus();
            }
            ;
            break;
            case "Razon Social": {
                txtFiltro.setText("");
                lblFiltro.setText("Razon Social:");
                txtFiltro.setEditable(true);
                txtFiltro.requestFocus();
            }
            ;
            break;
            default:
                JOptionPane.showMessageDialog(null, "Error", "Atencion!!", 2);
        }
    }//GEN-LAST:event_cmbFiltroItemStateChanged

    private void txtFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtFiltro.getText().isBlank()) {
                String dato = txtFiltro.getText();
                List<Venta> nueva_lista = null;
                switch (cmbFiltro.getSelectedItem().toString()) {
                    case "Dni": {
                        this.listaVentas = this.metodos.listarVentas();
                        nueva_lista = listaVentas.stream().filter(venta -> venta.getCliente().getDni().equals(dato)).collect(Collectors.toList());
                        if (!nueva_lista.isEmpty()) {
                            this.cargarTablaVentaFinal(nueva_lista);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontro un cliente con el dni registrado", "Atencion!!", 2);
                        }
                    };
                    break;
                    case "Nombre": {
                        this.listaVentas = this.metodos.listarVentas();
                        nueva_lista = listaVentas.stream().filter(venta -> venta.getCliente().getNombre().contains(dato)).collect(Collectors.toList());
                        if (!nueva_lista.isEmpty()) {
                            this.cargarTablaVentaFinal(nueva_lista);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontro un cliente con el nombre registrado", "Atencion!!", 2);
                        }
                    };
                    break;
                    case "Telefono": {
                        this.listaVentas = this.metodos.listarVentas();
                        nueva_lista = listaVentas.stream().filter(venta -> venta.getCliente().getTelefono().equals(dato)).collect(Collectors.toList());
                        if (!nueva_lista.isEmpty()) {
                            this.cargarTablaVentaFinal(nueva_lista);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontro un cliente con el telefono registrado", "Atencion!!", 2);
                        }
                    };
                    break;
                    case "Direccion": {
                        this.listaVentas = this.metodos.listarVentas();
                        nueva_lista = listaVentas.stream().filter(venta -> venta.getCliente().getDireccion().equals(dato)).collect(Collectors.toList());
                        if (!nueva_lista.isEmpty()) {
                            this.cargarTablaVentaFinal(nueva_lista);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontro un cliente con la direccion registrada", "Atencion!!", 2);
                        }
                    };
                    break;
                    case "Razon Social": {
                        this.listaVentas = this.metodos.listarVentas();
                        nueva_lista = listaVentas.stream().filter(venta -> venta.getCliente().getRazonSocial().equals(dato)).collect(Collectors.toList());
                        if (!nueva_lista.isEmpty()) {
                            this.cargarTablaVentaFinal(nueva_lista);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontro un cliente con la razon social registrada", "Atencion!!", 2);
                        }
                    };
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "El texto digitado no coincide con ningun tipo de filtro", "Atencion!!", 2);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El casillero esta vacio", "Atencion!!", 2);
            }
        }
    }//GEN-LAST:event_txtFiltroKeyPressed

    private void btnCrearPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPdfActionPerformed
        List<DetalleVenta> detalle = this.metodos.obtenerDetalleVenta(Integer.parseInt(txtIDventa.getText()));
        Pdf pdf = new Pdf();
        pdf.CrearPdf(detalle);
    }//GEN-LAST:event_btnCrearPdfActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCliente;
    private javax.swing.JButton btnActualizarEmpresa;
    private javax.swing.JButton btnActualizarProducto;
    private javax.swing.JButton btnActualizarProveedor;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnAgregarProveedor;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnCrearPdf;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JButton btnGuardarProveedor;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btnVisualizarVentas;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JComboBox<String> cmbProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTable tablaDetalleVenta;
    private javax.swing.JTable tablaListaVenta;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JTable tablaProveedor;
    private javax.swing.JTable tabla_Venta;
    private javax.swing.JTextField txtCantidadVenta;
    private javax.swing.JTextField txtCantidad_producto;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodigoVenta;
    private javax.swing.JTextField txtCodigo_producto;
    private javax.swing.JTextField txtDescripcionVenta;
    private javax.swing.JTextField txtDescripcion_producto;
    private javax.swing.JTextField txtDetalleTotal;
    private javax.swing.JTextField txtDireccionEmpresa;
    private javax.swing.JTextField txtDireccion_cliente;
    private javax.swing.JTextField txtDireccion_proveedor;
    private javax.swing.JTextField txtDniVenta;
    private javax.swing.JTextField txtDni_cliente;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtIDventa;
    private javax.swing.JTextField txtId_cliente;
    private javax.swing.JTextField txtId_proveedor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtNombre_cliente;
    private javax.swing.JTextField txtNombre_proveedor;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtPrecio_producto;
    private javax.swing.JTextField txtRazonEmpresa;
    private javax.swing.JTextField txtRazon_cliente;
    private javax.swing.JTextField txtRazon_proveedor;
    private javax.swing.JTextField txtRucEmpresa;
    private javax.swing.JTextField txtRuc_proveedor;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTelefonoEmpresa;
    private javax.swing.JTextField txtTelefono_cliente;
    private javax.swing.JTextField txtTelefono_proveedor;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaCliente(List<Cliente> listaClientes) {
        DefaultTableModel tabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"ID", "DNI/RUC", "NOMBRE", "TELEFONO", "DIRECCION", "RAZON SOCIAL"};
        tabla.setColumnIdentifiers(titulos);

        if (listaClientes != null) {
            for (int i = 0; i < listaClientes.size(); i++) {
                Object objeto[] = {listaClientes.get(i).getIdCliente(), listaClientes.get(i).getDni(), listaClientes.get(i).getNombre(),
                    listaClientes.get(i).getTelefono(), listaClientes.get(i).getDireccion(), listaClientes.get(i).getRazonSocial()};
                tabla.addRow(objeto);
            }
            tablaCliente.setModel(tabla);
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla");
        }
    }

    private void cargarTablaProveedor(List<Proveedor> listaProveedores) {
        DefaultTableModel tabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"ID", "RUC", "NOMBRE", "TELEFONO", "DIRECCION", "RAZON SOCIAL"};
        tabla.setColumnIdentifiers(titulos);

        if (listaProveedores != null) {
            for (int i = 0; i < listaProveedores.size(); i++) {
                Object objeto[] = {listaProveedores.get(i).getIdProveedor(), listaProveedores.get(i).getRuc(), listaProveedores.get(i).getNombre(),
                    listaProveedores.get(i).getTelefono(), listaProveedores.get(i).getDireccion(), listaProveedores.get(i).getRazonSocial()};
                tabla.addRow(objeto);
            }
            tablaProveedor.setModel(tabla);
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla");
        }
    }

    private void cargarTablaProducto(List<Producto> listaProductos) {
        DefaultTableModel tabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"ID", "PROVEEDOR", "CODIGO", "NOMBRE", "STOCK", "PRECIO"};
        tabla.setColumnIdentifiers(titulos);

        //Proveedor prov = metodos.obtenerProveedor();
        if (listaProductos != null) {
            for (int i = 0; i < listaProductos.size(); i++) {
                Object objeto[] = {listaProductos.get(i).getIdProducto(), listaProductos.get(i).getProveedor().getNombre(),
                    listaProductos.get(i).getCodigo(), listaProductos.get(i).getNombre(), listaProductos.get(i).getStock(),
                    listaProductos.get(i).getPrecio()};
                tabla.addRow(objeto);
            }
            tablaProducto.setModel(tabla);
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla");
        }
    }

    private void cargarTablaVentaFinal(List<Venta> listaVentas) {
        DefaultTableModel tabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String titulos[] = {"ID", "CLIENTE", "FECHA", "TOTAL"};
        tabla.setColumnIdentifiers(titulos);
        
        if (listaVentas != null) {
            double precio_Total = 0.0;
            double precio_Total_Final = 0.0;
            for (int i = 0; i < listaVentas.size(); i++) {
                List<Double> precio_cantidad = this.metodos.obtenerVentaTotal(listaVentas.get(i).getIdVenta());
                for (int j = 0; j < precio_cantidad.size(); j++) {
                    precio_Total = precio_Total + precio_cantidad.get(j);
                }
                precio_Total_Final = (double) Math.round(precio_Total * 100) / 100;
                Object objeto[] = {listaVentas.get(i).getIdVenta(), listaVentas.get(i).getCliente().getNombre(),
                    listaVentas.get(i).getFecha(), precio_Total_Final};
                tabla.addRow(objeto);
                precio_Total = 0.0;
            }
            tablaListaVenta.setModel(tabla);
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla");
        }
    }

    private void cargarTablaDetalleVenta(List<DetalleVenta> listaDetalleVenta) {
        DefaultTableModel tabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        txtIDventa.setText(String.valueOf(listaDetalleVenta.get(0).getVenta().getIdVenta()));
        txtIDventa.setEditable(false);
        txtCliente.setText(String.valueOf(listaDetalleVenta.get(0).getVenta().getCliente().getNombre()));
        txtCliente.setEditable(false);
        String titulos[] = {"PRODUCTO", "CANTIDAD", "PRECIO"};
        tabla.setColumnIdentifiers(titulos);
        double total = 0.0;
        double precio_cantidad = 0.0;
        if (listaDetalleVenta != null) {
            for (int i = 0; i < listaDetalleVenta.size(); i++) {
                Object objeto[] = {listaDetalleVenta.get(i).getProducto().getNombre(), listaDetalleVenta.get(i).getCantidad(),
                    listaDetalleVenta.get(i).getProducto().getPrecio()};
                tabla.addRow(objeto);
                precio_cantidad = listaDetalleVenta.get(i).getPrecio() * listaDetalleVenta.get(i).getCantidad();
                total = total + precio_cantidad;
            }
            tablaDetalleVenta.setModel(tabla);
            txtDetalleTotal.setText(String.format("%.2f", total));
            txtDetalleTotal.setEditable(false);
        }
    }

    private void cargarDatosEmpresa(Empresa empresa) {
        txtRucEmpresa.setText(empresa.getRuc());
        txtNombreEmpresa.setText(empresa.getNombre());
        txtTelefonoEmpresa.setText(empresa.getTelefono());
        txtDireccionEmpresa.setText(empresa.getDireccion());
        txtRazonEmpresa.setText(empresa.getRazonSocial());
    }

    private void cargarTablaVenta() {
        String titulos[] = {"CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO", "TOTAL"};
        tablaGlobal.setColumnIdentifiers(titulos);
        tabla_Venta.setModel(tablaGlobal);
    }

    public void agregarProductoVenta(Object object[]) {
        if (tablaGlobal.getRowCount() == 0) {;
            tablaGlobal.addRow(object);
            tabla_Venta.setModel(tablaGlobal);
            total_a_pagar = (double) object[4] + total_a_pagar;
            lblTotal.setText(String.format("%.2f", total_a_pagar));
            this.limpiarVenta();
            txtCodigoVenta.requestFocus();
        } else {
            for (int i = 0; i < tabla_Venta.getRowCount(); i++) {
                if (tabla_Venta.getValueAt(i, 0).equals(String.valueOf(object[0]))) {
                    JOptionPane.showMessageDialog(null, "Ya se ha registrado ese producto en la venta", "Atencion!!", 2);
                    this.limpiarVenta();
                    txtCodigoVenta.requestFocus();
                    return;
                }
            }
            System.out.println("Hola");
            tablaGlobal.addRow(object);
            tabla_Venta.setModel(tablaGlobal);
            total_a_pagar = (double) object[4] + total_a_pagar;
            lblTotal.setText(String.format("%.2f", total_a_pagar));
            this.limpiarVenta();
            txtCodigoVenta.requestFocus();
        }
    }

    private void limpiarCliente() {
        txtDni_cliente.setText("");
        txtNombre_cliente.setText("");
        txtTelefono_cliente.setText("");
        txtDireccion_cliente.setText("");
        txtRazon_cliente.setText("");
    }

    private void limpiarProveedor() {
        txtRuc_proveedor.setText("");
        txtNombre_proveedor.setText("");
        txtTelefono_proveedor.setText("");
        txtDireccion_proveedor.setText("");
        txtRazon_proveedor.setText("");
    }

    private void limpiarProducto() {
        txtCodigo_producto.setText("");
        txtDescripcion_producto.setText("");
        txtCantidad_producto.setText("");
        txtPrecio_producto.setText("");
        cmbProveedor.setSelectedIndex(0);
    }

    private void limpiarVenta() {
        txtCodigoVenta.setText("");
        txtDescripcionVenta.setText("");
        txtCantidadVenta.setText("");
        txtPrecioVenta.setText("");
        txtStock.setText("");
    }

    private void crearCmb() {
        cmbProveedor.removeAllItems();
        cmbProveedor.addItem("-");
        this.listaProveedores = metodos.listarProveedores();
        for (int i = 0; i < listaProveedores.size(); i++) {
            cmbProveedor.addItem(listaProveedores.get(i).getNombre());
        }
    }

}
