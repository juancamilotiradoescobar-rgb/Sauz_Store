package domain;

import java.util.Date;

public class CalculadorPedido {
    private int idPedido;
    private Date fechaPedido;
    private Cliente cliente;
    private double porcDescuentoCupon;
    private double tarifaIva;
    private double costoEnvio;
    private DetallePedido detallePedido;

    public CalculadorPedido() {
    }

    public CalculadorPedido(int idPedido, Date fechaPedido, Cliente cliente, double porcDescuentoCupon, double tarifaIva, double costoEnvio, DetallePedido detallePedido) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.cliente = cliente;
        this.porcDescuentoCupon = porcDescuentoCupon;
        this.tarifaIva = tarifaIva;
        this.costoEnvio = costoEnvio;
        this.detallePedido = detallePedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPorcDescuentoCupon() {
        return porcDescuentoCupon;
    }

    public void setPorcDescuentoCupon(double porcDescuentoCupon) {
        this.porcDescuentoCupon = porcDescuentoCupon;
    }

    public double getTarifaIva() {
        return tarifaIva;
    }

    public void setTarifaIva(double tarifaIva) {
        this.tarifaIva = tarifaIva;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public DetallePedido getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(DetallePedido detallePedido) {
        this.detallePedido = detallePedido;
    }
}
