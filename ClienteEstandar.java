import java.time.LocalDate;

public class ClienteEstandar extends Cliente{
    protected int dni;
    protected LocalDate fechaNacimiento;
    protected Profesion profesion;

    public ClienteEstandar(int id, String nombre, String apellido, int documento, String direccion, int telefono, String correo, LocalDate fechaAlta, CalificacionCliente calificacion, int dni, LocalDate fechaNacimiento, Profesion profesion, double ingresos) {
        super(id, nombre, apellido, documento, direccion, telefono, correo, fechaAlta, calificacion, ingresos);
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "ClienteEstandar [dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", id=" + id + ", nombre="
                + nombre + ", profesion=" + profesion + ", apellido=" + apellido + ", documento=" + documento
                + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + ", fechaAlta="
                + fechaAlta + ", ingresos=" + ingresos + ", calcularCalificacion()=" + calcularCalificacion() + "]";
    }

    @Override
    public CalificacionCliente calcularCalificacion() {
    int score = 0;

    score += puntajePorIngresos(ingresos);
    score += puntajePorAntiguedad(fechaAlta);
    score += profesion.getPuntaje() / 3;

    if(score > 100)
        score = 100;

    calificacion = determinarCalificacion(score);

    return calificacion;
}

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Profesion getProfesion() {
        return profesion;
    }

    public void setProfesion(Profesion profesion) {
        this.profesion = profesion;
    }
}