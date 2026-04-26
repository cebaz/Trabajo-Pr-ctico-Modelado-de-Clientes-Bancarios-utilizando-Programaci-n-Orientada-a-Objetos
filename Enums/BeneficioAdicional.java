package Enums;

public enum BeneficioAdicional {
    CAJA_SEGURIDAD(10),
    SEGURO_PREMIUM(15),
    ASESOR_FINANCIERO(20),
    TARJETA_BLACK(25),
    INVERSIONES_ADMINISTRADAS(30),
    CUENTA_EN_DOLARES(15),
    LINEA_CREDITO_PREAPROBADA(20);

    private int puntaje;

    BeneficioAdicional(int puntaje){
        this.puntaje = puntaje;
    }

    public int getPuntaje(){
        return puntaje;
    }
}