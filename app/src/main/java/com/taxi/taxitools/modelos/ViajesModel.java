package com.taxi.taxitools.modelos;

public class ViajesModel {
    String nombreUsuario;
    String puntoDestino;
    String puntoOrigen;
    String telefon;

    public ViajesModel() {
    }

    public ViajesModel(String nombreUsuario, String puntoDestino, String puntoOrigen, String telefon) {
        this.nombreUsuario = nombreUsuario;
        this.puntoDestino = puntoDestino;
        this.puntoOrigen = puntoOrigen;
        this.telefon = telefon;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPuntoDestino() {
        return puntoDestino;
    }

    public void setPuntoDestino(String puntoDestino) {
        this.puntoDestino = puntoDestino;
    }

    public String getPuntoOrigen() {
        return puntoOrigen;
    }

    public void setPuntoOrigen(String puntoOrigen) {
        this.puntoOrigen = puntoOrigen;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
