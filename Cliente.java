import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cliente implements Calificable {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int documento;
    protected String direccion;
    protected int telefono;
    protected String correo;
    protected LocalDate fechaAlta;
    protected CalificacionCliente calificacion;
    protected double ingresos;


    public Cliente(int id, String nombre, String apellido, int documento, String direccion, int telefono, String correo, LocalDate fechaAlta, CalificacionCliente calificacion, double ingresos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaAlta = fechaAlta;
        this.calificacion = calificacion;
        this.ingresos = ingresos;
    }


    public static int puntajePorIngresos(double ingresos){

        if(ingresos < 100000)
            return 10;
        if(ingresos < 300000)
            return 20;
        if(ingresos < 700000)
            return 30;

        return 40;
    }

    public static int puntajePorAntiguedad(LocalDate fechaAlta){
        long anios = ChronoUnit.YEARS.between(fechaAlta, LocalDate.now());

        if(anios < 1)
            return 5;
        if(anios < 3)
            return 15;
        if(anios < 5)
            return 25;

        return 30;
    }

    @Override
    public CalificacionCliente calcularCalificacion() {
        int score = 0;

        score += puntajePorIngresos(this.ingresos);
        score += puntajePorAntiguedad(fechaAlta);
        calificacion = determinarCalificacion(score);

        return calificacion;
    }

    @Override
    public CalificacionCliente determinarCalificacion(int score) {
        if (score < 25)
            return CalificacionCliente.BAJO;
        else if (score < 50)
            return CalificacionCliente.MEDIO;
        else if (score < 75)
            return CalificacionCliente.ALTO;
        else
            return CalificacionCliente.AVANZADO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setCalificacion(CalificacionCliente calificacion) {
        this.calificacion = calificacion;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
}