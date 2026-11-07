package com.empresa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaClienteTest {
    private Cliente cliente;
    private ContaCliente conta;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente(201, "Ezequiel Santos", 15);
        conta = new ContaCliente(50, cliente, 200.0);
    }

    @Test
    public void testDepositoValido() {
        double novoSaldo = conta.addDeposito(150.0);
        assertEquals(350.0, novoSaldo, 0.001);
        assertEquals(350.0, conta.getSaldo(), 0.001);
    }

    @Test
    public void testSaqueComSaldoSuficiente() {
        double novoSaldo = conta.subSaldo(100.0);
        assertEquals(100.0, novoSaldo, 0.001);
    }

    @Test
    public void testSaqueSemSaldoSuficiente() {
        double novoSaldo = conta.subSaldo(500.0);
        assertEquals(200.0, novoSaldo, 0.001);
    }
}
