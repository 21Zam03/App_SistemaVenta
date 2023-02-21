use app_sistema_ventas;

create table Usuario (
    idUsuario int auto_increment not null,
    nombre varchar(45) not null,
    correo varchar(45) not null,
    contrasena varchar(45) not null,
    primary key(idUsuario)
);

create table Cliente (
    idCliente int auto_increment not null,
	dni varchar(45) not null,
    nombre varchar(45) not null,
    telefono varchar(9) not null,
    direccion varchar(45) not null,
    razonSocial varchar(45),
    primary key(idCliente)
);

create table Venta (
    idVenta int auto_increment not null,
    idCliente int not null,
    fecha date not null,
    primary key(idVenta),
    foreign key (idCliente) references Cliente(idCliente)
);

create table Producto (
    idProducto int auto_increment not null,
    idProveedor int not null,
    codigo varchar(45) not null,
    nombre varchar(45) not null,
    stock int not null,
    precio double not null,
    primary key(idProducto),
    foreign key (idProveedor) references Proveedor(idProveedor)
);

create table Proveedor (
    idProveedor int auto_increment not null,
    ruc varchar(45) not null,
    nombre varchar(45) not null,
    telefono varchar(45) not null,
    direccion varchar(45) not null,
    razonSocial varchar(45),
    primary key(idProveedor)
);

create table DetalleVenta (
    idDetalleVenta int auto_increment not null,
    idVenta int not null,
    idProducto int not null,
    cantidad int not null,
    precio double not null,
    primary key(idDetalleVenta),
    foreign key (idVenta) references Venta(idVenta),
    foreign key (idProducto) references Producto(idProducto)
);

create table Empresa (
    idEmpresa int auto_increment not null,
    ruc varchar(45) not null,
    nombre varchar(45) not null,
    telefono varchar(45) not null,
    direccion varchar(45) not null,
    razonSocial varchar(45),
    primary key(idEmpresa)
);

insert into Empresa (ruc, nombre, telefono, direccion, razonSocial) values (10957829456, 'ZamStore', '903712983', 'Miraflores', 
'Derecha');
select * from Producto where idProducto = 3;

DELIMITER $$
create procedure sp_login(email varchar(45), password_d varchar(45))
BEGIN
	select * from Usuario where correo = email and contrasena = password_d;
END$$
call sp_login('asdasd','extergcw');

DELIMITER $$
create procedure sp_registrarCliente(dni1 varchar(45), nombre1 varchar(45), telefono1 varchar(45), direccion1 varchar(45), 
razonSocial1 varchar(45))
BEGIN
	insert into Cliente (dni, nombre, telefono, direccion, razonSocial) values (dni1, nombre1, telefono1, direccion1, razonSocial1);
END$$
call sp_registrarCliente('asdasd','extergcw');

DELIMITER $$
create procedure sp_listarClientes()
BEGIN
	select * from Cliente;
END$$

DELIMITER $$
create procedure sp_eliminarCliente(id int)
BEGIN
	delete from Cliente where idCliente = id;
END$$
call sp_eliminarCliente(4);

DELIMITER $$
create procedure sp_actualizarCliente(id_1 int, dni_1 varchar(45), nombre_1 varchar(45), telefono_1 varchar(45), direccion_1 varchar(45), 
razonSocial_1 varchar(45))
BEGIN
	update Cliente set dni = dni_1, nombre = nombre_1, telefono = telefono_1, direccion = direccion_1, razonSocial = razonSocial_1 
    where idCliente = id_1;
END$$

DELIMITER $$
create procedure sp_obtenerCliente(dni_1 varchar(45))
BEGIN
	select * from Cliente where dni = dni_1;
END$$

DELIMITER $$
create procedure sp_registrarProveedor(ruc1 varchar(45), nombre1 varchar(45), telefono1 varchar(45), direccion1 varchar(45), 
razonSocial1 varchar(45))
BEGIN
	insert into Proveedor (ruc, nombre, telefono, direccion, razonSocial) values (ruc1, nombre1, telefono1, direccion1, razonSocial1);
END$$

DELIMITER $$
create procedure sp_listarProveedores()
BEGIN
	select * from Proveedor;
END$$

DELIMITER $$
create procedure sp_eliminarProveedor(id int)
BEGIN
	delete from Proveedor where idProveedor = id;
END$$

DELIMITER $$
create procedure sp_actualizarProveedor(id_1 int, ruc_1 varchar(45), nombre_1 varchar(45), telefono_1 varchar(45), direccion_1 varchar(45), 
razonSocial_1 varchar(45))
BEGIN
	update Proveedor set ruc = ruc_1, nombre = nombre_1, telefono = telefono_1, direccion = direccion_1, razonSocial = razonSocial_1 
    where idProveedor = id_1;
END$$

DELIMITER $$
create procedure sp_registrarProducto(idProveedor_1 int, codigo_1 varchar(45), nombre_1 varchar(45), stock_1 int, precio_1 double)
BEGIN
	insert into Producto (idProveedor, codigo, nombre, stock, precio) values (idProveedor_1, codigo_1, nombre_1, stock_1, precio_1);
END$$

DELIMITER $$
create procedure sp_ObtenerProveedor(nombre_1 varchar(45))
BEGIN
	select * from Proveedor where nombre = nombre_1;
END$$

DELIMITER $$
create procedure sp_listarProductos()
BEGIN
	select * from Producto;
END$$

DELIMITER $$
create procedure sp_ObtenerProveedor_id(id int)
BEGIN
	select * from Proveedor where idProveedor = id;
END$$

DELIMITER $$
create procedure sp_eliminarProducto(id int)
BEGIN
	delete from Producto where idProducto = id;
END$$

DELIMITER $$
create procedure sp_actualizarProducto(id_1 int, id_2 int, codigo_1 varchar(45) ,nombre_1 varchar(45), stock_1 int, precio_1 double)
BEGIN
	update Producto set idProveedor = id_2, codigo = codigo_1, nombre = nombre_1, stock = stock_1, precio = precio_1 
    where idProducto = id_1;
END$$

DELIMITER $$
create procedure sp_ObtenerProducto_cod(codigo_1 varchar(45))
BEGIN
	select * from Producto where codigo = codigo_1;
END$$

DELIMITER $$
create procedure sp_registrarVenta(id_1 varchar(45), fecha_1 date)
BEGIN
	insert into Venta (idCliente, fecha) values (id_1, fecha_1);
END$$

DELIMITER $$
create procedure sp_registrarDetalleVenta(id_1 int, id_2 int, cantidad_1 int, precio_1 double)
BEGIN
	insert into DetalleVenta (idVenta, idProducto, cantidad, precio) values (id_1, id_2, cantidad_1, precio_1);
END$$

DELIMITER $$
create procedure sp_obtenerVenta(id_1 int)
BEGIN
	select * from Venta where idCliente = id_1;
END$$

DELIMITER $$
create procedure sp_actualizarStock(stock_1 int, codigo_1 varchar(45))
BEGIN
	update Producto set stock = stock_1 where codigo = codigo_1;
END$$

DELIMITER $$
create procedure sp_obtenerCliente_id(id_1 int)
BEGIN
	select * from Cliente where idCliente = id_1;
END$$

DELIMITER $$
create procedure sp_listarVentas()
BEGIN
	select * from Venta;
END$$

DELIMITER $$
create procedure sp_obtenerVentaTotal(idVenta1 int)
BEGIN
	Select precio, cantidad from detalleVenta where idVenta = idVenta1;
END$$

DELIMITER $$
create procedure sp_obtenerEmpresa()
BEGIN
	Select * from Empresa;
END$$

DELIMITER $$
create procedure sp_actualizarEmpresa(ruc_2 varchar(45), nombre_1 varchar(45), telefono_1 varchar(45), direccion_1 varchar(45), 
razonSocial_1 varchar(45))
BEGIN
	update Empresa set ruc = ruc_2, nombre = nombre_1, telefono = telefono_1, direccion = direccion_1, razonSocial = razonSocial_1 
    where idEmpresa = 1;
END$$

DELIMITER $$
create procedure sp_obtenerVenta_Id(idVenta_1 int)
BEGIN
	Select * from Venta where idVenta = idVenta_1;
END$$

DELIMITER $$
create procedure sp_obtenerProducto_Id(idProducto_1 int)
BEGIN
	Select * from Producto where idProducto = 2;
END$$

DELIMITER $$
create procedure sp_obtenerDetalleVenta(idVenta_1 int)
BEGIN
	Select * from detalleVenta where idVenta = 9;
END$$


Select * from Venta inner join detalleVenta on Venta.idVenta = detalleVenta.idVenta;
