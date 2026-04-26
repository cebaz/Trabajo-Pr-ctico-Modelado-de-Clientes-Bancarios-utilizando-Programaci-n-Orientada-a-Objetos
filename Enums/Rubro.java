package Enums;

public enum Rubro {
    GASTRONOMIA(50),
    COMERCIO_MINORISTA(60),
    CONSTRUCCION(55),
    TRANSPORTE(65),
    TECNOLOGIA(90),
    SALUD(85),
    INDUSTRIA(80),
    AGROPECUARIO(70),
    EDUCACION(75),
    FINANZAS(95);

    private int puntaje;

    Rubro(int puntaje){
        this.puntaje = puntaje;
    }

    public int getPuntaje(){
        return puntaje;
    }
}