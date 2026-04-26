
import java.time.LocalDate;

import Calificaion.CalificacionCliente;
import Enums.BeneficioAdicional;

public class ClientePreferencial extends Cliente{
    protected double limiteCreditoEspecial;
    protected String ejecutivoCuentaAsignado;
    protected BeneficioAdicional beneficiosAdicionales;

    public ClientePreferencial(int id, String nombre, String apellido, int documento, String direccion, int telefono, String correo, LocalDate fechaAlta, CalificacionCliente calificacion, double limiteCreditoEspecial, String ejecutivoCuentaAsignado, BeneficioAdicional beneficiosAdicionales, double ingresos) {
        super(id, nombre, apellido, documento, direccion, telefono, correo, fechaAlta, calificacion, ingresos);
        this.limiteCreditoEspecial = limiteCreditoEspecial;
        this.ejecutivoCuentaAsignado = ejecutivoCuentaAsignado;
        this.beneficiosAdicionales = beneficiosAdicionales;
    }

    @Override
    public String toString() {
        return "ClientePreferencial [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", documento="
                + documento + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo
                + ", fechaAlta=" + fechaAlta + ", calificacion=" + calificacion + ", ingresos=" + ingresos
                + ", calcularCalificacion()=" + calcularCalificacion() + "]";
    }

    @Override
    public CalificacionCliente calcularCalificacion() {
    int score = 0;

    score += puntajePorIngresos(ingresos);
    score += puntajePorAntiguedad(fechaAlta);
    score += beneficiosAdicionales.getPuntaje() / 3;

    if(score > 100)
        score = 100;

    calificacion = determinarCalificacion(score);

    return calificacion;
    }

    public double getLimiteCreditoEspecial() {
        return limiteCreditoEspecial;
    }

    public void setLimiteCreditoEspecial(double limiteCreditoEspecial) {
        this.limiteCreditoEspecial = limiteCreditoEspecial;
    }

    public String getEjecutivoCuentaAsignado() {
        return ejecutivoCuentaAsignado;
    }

    public void setEjecutivoCuentaAsignado(String ejecutivoCuentaAsignado) {
        this.ejecutivoCuentaAsignado = ejecutivoCuentaAsignado;
    }

    public BeneficioAdicional getBeneficiosAdicionales() {
        return beneficiosAdicionales;
    }

    public void setBeneficiosAdicionales(BeneficioAdicional beneficiosAdicionales) {
        this.beneficiosAdicionales = beneficiosAdicionales;
    }
}