package com.p2.mundopc;

public class Raton extends DispositivoEntrada {

    private int idRaton;
    private int contadorRatones;

    public Raton(int idRaton, int contadorRatones, String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = idRaton;
        this.contadorRatones = contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", contadorRatones=" + contadorRatones + '}';
    }

}