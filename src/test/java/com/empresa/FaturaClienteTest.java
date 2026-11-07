package com.empresa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FaturaClienteTest {
    private Cliente cliente;
    private FaturaCliente fatura;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente(101, "Gabriel Silva", 10);
        fatura = new FaturaCliente(1, cliente, 500.0);
    }

    @Test
    public void testCalculoDesconto() {
        assertEquals(450.0, fatura.getValorComDesconto(), 0.001);
    }

    @Test
    public void testFaturaSemCliente() {
        FaturaCliente faturaSemCliente = new FaturaCliente(2);
        assertEquals(0.0, faturaSemCliente.getValorComDesconto(), 0.001);
    }

    @Test
    public void testSetValorECliente() {
        Cliente novoCliente = new Cliente(102, "Miguel Santos", 20);
        fatura.setCliente(novoCliente);
        fatura.setValor(1000.0);
        
        assertEquals(800.0, fatura.getValorComDesconto(), 0.001);
    }
}
