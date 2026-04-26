package Enums;

public enum Profesion {
    DESEMPLEADO(10),
    FREELANCER(35),
    COMERCIANTE(50),
    EMPLEADO_PRIVADO(65),
    EMPLEADO_PUBLICO(75),
    DOCENTE(75),
    PROFESIONAL(85),
    INGENIERO(90),
    EMPRESARIO(80),
    JUBILADO(60);

    private int puntaje;

    Profesion(int puntaje){
        this.puntaje = puntaje;
    }

    public int getPuntaje(){
        return puntaje;
    }
}