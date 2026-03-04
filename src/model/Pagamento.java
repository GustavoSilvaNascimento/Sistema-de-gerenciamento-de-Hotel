package model;

import java.math.BigDecimal;
import java.sql.Date;

public class Pagamento {
    private int id;
    private int idReserva;
    private BigDecimal valor;
    private Date dataPagamento;
    private MetodoPagamento metodo;

    public enum MetodoPagamento {
        CARTAO_CREDITO("Cartão de Crédito"),
        PIX("Pix"),
        CARTAO_DEBITO("Cartão de débito"),
        DINHEIRO("Dinheiro");

        private final String descricao;

        MetodoPagamento(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }

        public static MetodoPagamento fromString(String texto) {
            for (MetodoPagamento m : MetodoPagamento.values()) {
                if (m.descricao.equalsIgnoreCase(texto)) {
                    return m;
                }
            }
            throw new IllegalArgumentException("Método de pagamento inválido: " + texto);
        }
    }

    public Pagamento() {}

    public Pagamento(int id, int idReserva, BigDecimal valor, Date dataPagamento, MetodoPagamento metodo) {
        this.id = id;
        this.idReserva = idReserva;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.metodo = metodo;
    }

    // Getters e Setters

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdReserva() { return idReserva; }
    public void setIdReserva(int idReserva) { this.idReserva = idReserva; }

    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }

    public Date getDataPagamento() { return dataPagamento; }
    public void setDataPagamento(Date dataPagamento) { this.dataPagamento = dataPagamento; }

    public MetodoPagamento getMetodo() { return metodo; }
    public void setMetodo(MetodoPagamento metodo) { this.metodo = metodo; }
}