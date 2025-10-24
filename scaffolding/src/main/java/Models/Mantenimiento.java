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

public class Mantenimiento {
    private int idMantenimiento;
    private int idItem;
    private Date fechaMantenimiento;
    private String descripcion;
    private double costo;
    private String responsable;

    public Mantenimiento() {}

    public Mantenimiento(int idMantenimiento, int idItem, Date fechaMantenimiento, String descripcion, double costo, String responsable) {
        this.idMantenimiento = idMantenimiento;
        this.idItem = idItem;
        this.fechaMantenimiento = fechaMantenimiento;
        this.descripcion = descripcion;
        this.costo = costo;
        this.responsable = responsable;
    }

    public int getIdMantenimiento() { return idMantenimiento; }
    public void setIdMantenimiento(int idMantenimiento) { this.idMantenimiento = idMantenimiento; }

    public int getIdItem() { return idItem; }
    public void setIdItem(int idItem) { this.idItem = idItem; }

    public Date getFechaMantenimiento() { return fechaMantenimiento; }
    public void setFechaMantenimiento(Date fechaMantenimiento) { this.fechaMantenimiento = fechaMantenimiento; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }

    public String getResponsable() { return responsable; }
    public void setResponsable(String responsable) { this.responsable = responsable; }
}
