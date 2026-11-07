package com.empresa;

public class FaturaCliente {
    private int id;
    private Cliente cliente;
    private double valor;

    public FaturaCliente(int id, Cliente cliente, double valor) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
    }

    public FaturaCliente(int id) {
        this.id = id;
        this.cliente = null;
        this.valor = 0.0;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorComDesconto() {
        if (cliente == null) {
            return valor;
        }
        return valor - (valor * cliente.getDesconto() / 100.0);
    }

    @Override
    public String toString() {
        String nomeCliente = (cliente != null) ? cliente.getNome() : "Sem cliente";
        int idCliente = (cliente != null) ? cliente.getId() : 0;
        int descontoCliente = (cliente != null) ? cliente.getDesconto() : 0;

        return String.format("Fatura [id=%d, cliente=%s (%d) (%d%%), valor=%.2f]",
                id, nomeCliente, idCliente, descontoCliente, valor);
    }
}
