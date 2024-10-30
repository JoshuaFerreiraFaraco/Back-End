package com.example.exercicio12;

public class conta {
    private String codigo;
    private String cliente;
    private Double saldo;

    public conta(String codigo, String cliente, Double saldo) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getCliente() {
        return cliente;
    }
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
