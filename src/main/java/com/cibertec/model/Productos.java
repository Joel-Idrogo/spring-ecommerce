package com.cibertec.model;

public class Productos {
	private Integer id_producto;
	private String nombre_producto;
	private String descripcion;
	private double precio_compra;
	private double precio_venta;
	private int cantidad;
	
	public Productos() {
	}
	
	public Productos(Integer id_producto, String nombre_producto, String descripcion, double precio_compra,
			double precio_venta, int cantidad) {
		super();
		this.id_producto = id_producto;
		this.nombre_producto = nombre_producto;
		this.descripcion = descripcion;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
		this.cantidad = cantidad;
	}

	public Integer getId_producto() {
		return id_producto;
	}

	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}

	public double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Productos [id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", descripcion="
				+ descripcion + ", precio_compra=" + precio_compra + ", precio_venta=" + precio_venta + ", cantidad="
				+ cantidad + "]";
	}
}
