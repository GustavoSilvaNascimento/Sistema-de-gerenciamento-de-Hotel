package model;

import java.math.BigDecimal;
import java.util.Date;

public class Reservas {
    public enum StatusReserva {
    Ativo, Finalizado;
    }

    private int id, id_cliente, id_quarto;
    private Date data_checkin, data_checkout;
    private BigDecimal valor_total;
    private StatusReserva status;  

    public Reservas(int id, int id_cliente, int id_quarto, Date data_checkin, Date data_checkout, BigDecimal valor_total, StatusReserva status) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.id_quarto = id_quarto;
        this.data_checkin = data_checkin;
        this.data_checkout = data_checkout;
        this.valor_total = valor_total;
        this.status = status;
    }

    public Reservas() {
    }

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    public int getId_quarto() {
        return id_quarto;
    }
    public void setId_quarto(int id_quarto) {
        this.id_quarto = id_quarto;
    }
    public Date getData_checkin() {
        return data_checkin;
    }
    public void setData_checkin(Date data_checkin) {
        this.data_checkin = data_checkin;
    }
    public Date getData_checkout() {
        return data_checkout;
    }
    public void setData_checkout(Date data_checkout) {
        this.data_checkout = data_checkout;
    }
    public BigDecimal getValor_total() {
        return valor_total;
    }
    public void setValor_total(BigDecimal valor_total) {
        this.valor_total = valor_total;
    }
    public StatusReserva getStatus() {
        return status;
    }
    public void setStatus(StatusReserva status) {
        this.status = status;
    }
}