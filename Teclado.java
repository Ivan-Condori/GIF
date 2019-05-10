package com.p2.mundopc;

public class Teclado extends DispositivoEntrada {

    private int idTeclado;
    private int contadorTeclados;

    public Teclado(int idTeclado, int contadorTeclados, String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = idTeclado;
        this.contadorTeclados = contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", contadorTeclados=" + contadorTeclados + '}';
    }

}