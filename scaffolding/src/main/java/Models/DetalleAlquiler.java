/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author SERVITEC
 */
import java.util.Date;

public class DetalleAlquiler {
    private int idDetalle;
    private int idAlquiler;
    private int idItem;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    private String tipoTiempo;
    private Date fechaSalida;
    private Date fechaRetorno;

    public DetalleAlquiler() {}

    public DetalleAlquiler(int idDetalle, int idAlquiler, int idItem, int cantidad, double precioUnitario, double subtotal, String tipoTiempo, Date fechaSalida, Date fechaRetorno) {
        this.idDetalle = idDetalle;
        this.idAlquiler = idAlquiler;
        this.idItem = idItem;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
        this.tipoTiempo = tipoTiempo;
        this.fechaSalida = fechaSalida;
        this.fechaRetorno = fechaRetorno;
    }

    public int getIdDetalle() { return idDetalle; }
    public void setIdDetalle(int idDetalle) { this.idDetalle = idDetalle; }

    public int getIdAlquiler() { return idAlquiler; }
    public void setIdAlquiler(int idAlquiler) { this.idAlquiler = idAlquiler; }

    public int getIdItem() { return idItem; }
    public void setIdItem(int idItem) { this.idItem = idItem; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; }

    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double subtotal) { this.subtotal = subtotal; }

    public String getTipoTiempo() { return tipoTiempo; }
    public void setTipoTiempo(String tipoTiempo) { this.tipoTiempo = tipoTiempo; }

    public Date getFechaSalida() { return fechaSalida; }
    public void setFechaSalida(Date fechaSalida) { this.fechaSalida = fechaSalida; }

    public Date getFechaRetorno() { return fechaRetorno; }
    public void setFechaRetorno(Date fechaRetorno) { this.fechaRetorno = fechaRetorno; }
}