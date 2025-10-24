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

public class Alquiler {
    private int idAlquiler;
    private int idCliente;
    private String tipoAlquiler;
    private Date fechaSalida;
    private Date fechaRetorno;
    private Date fechaRetornoReal;
    private String estado;
    private double total;

    public Alquiler() {}

    public Alquiler(int idAlquiler, int idCliente, String tipoAlquiler, Date fechaSalida, Date fechaRetorno, Date fechaRetornoReal, String estado, double total) {
        this.idAlquiler = idAlquiler;
        this.idCliente = idCliente;
        this.tipoAlquiler = tipoAlquiler;
        this.fechaSalida = fechaSalida;
        this.fechaRetorno = fechaRetorno;
        this.fechaRetornoReal = fechaRetornoReal;
        this.estado = estado;
        this.total = total;
    }

    public int getIdAlquiler() { return idAlquiler; }
    public void setIdAlquiler(int idAlquiler) { this.idAlquiler = idAlquiler; }

    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }

    public String getTipoAlquiler() { return tipoAlquiler; }
    public void setTipoAlquiler(String tipoAlquiler) { this.tipoAlquiler = tipoAlquiler; }

    public Date getFechaSalida() { return fechaSalida; }
    public void setFechaSalida(Date fechaSalida) { this.fechaSalida = fechaSalida; }

    public Date getFechaRetorno() { return fechaRetorno; }
    public void setFechaRetorno(Date fechaRetorno) { this.fechaRetorno = fechaRetorno; }

    public Date getFechaRetornoReal() { return fechaRetornoReal; }
    public void setFechaRetornoReal(Date fechaRetornoReal) { this.fechaRetornoReal = fechaRetornoReal; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}
