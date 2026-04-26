import java.time.LocalDate;



public class ClienteEmpresa extends Cliente{
    protected String razonSocial;
    protected int cuit;
    protected Rubro rubro;
    protected String representanteLegal;

    public ClienteEmpresa(int id, String nombre, String apellido, int documento, String direccion, int telefono, String correo, LocalDate fechaAlta, CalificacionCliente calificacion, String razonSocial, int cuit, Rubro rubro, String representanteLegal, double ingresos) {
        super(id, nombre, apellido, documento, direccion, telefono, correo, fechaAlta, calificacion, ingresos);
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.rubro = rubro;
        this.representanteLegal = representanteLegal;
    }

    @Override
    public String toString() {
        return "ClienteEmpresa [razonSocial=" + razonSocial + ", cuit=" + cuit + ", id=" + id + ", rubro=" + rubro
                + ", nombre=" + nombre + ", representanteLegal=" + representanteLegal + ", apellido=" + apellido
                + ", documento=" + documento + ", direccion=" + direccion + ", telefono=" + telefono + ", correo="
                + correo + ", fechaAlta=" + fechaAlta + ", ingresos=" + ingresos + ", calcularCalificacion()="
                + calcularCalificacion() + "]";
    }

    @Override
    public CalificacionCliente calcularCalificacion() {
    int score = 0;

    score += puntajePorIngresos(ingresos);
    score += puntajePorAntiguedad(fechaAlta);
    score += rubro.getPuntaje() / 3;

    if(score > 100)
        score = 100;

    calificacion = determinarCalificacion(score);

    return calificacion;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }
}