package model;

import java.math.BigDecimal;

public class Quartos {

    public enum Status {
       
        DISPONIVEL("Disponível"),
        OCUPADO("Ocupado"),
        MANUTENCAO("Manutenção"),
        RESERVADO("Reservado");
        
        
        private final String valor;

        Status(String valor) {
            this.valor = valor;
        }

        public String getValor() {
            return valor;
        }

        public static Status fromString(String texto) {
            for (Status s : Status.values()) {
                if (s.valor.equalsIgnoreCase(texto)) {
                    return s;
                }
            }
            throw new IllegalArgumentException("Status desconhecido: " + texto);
        }

        @Override
        public String toString() {
            return valor;
        }
    }

    private int id;
    private int numero;
    private String tipo;
    private Status status;  
    private BigDecimal valor_diaria;

    public Quartos() {}

    public Quartos(int id, int numero, String tipo, Status status, BigDecimal valor_diaria) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.status = status;
        this.valor_diaria = valor_diaria;
    }

    // Getters e setters

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public BigDecimal getValor_diaria() {
        return valor_diaria;
    }
    public void setValor_diaria(BigDecimal valor_diaria) {
        this.valor_diaria = valor_diaria;
    }

    @Override
    public String toString() {
        return (numero + " | " + tipo + " |Status: " + status + " |Diária: " + valor_diaria);
    }
}