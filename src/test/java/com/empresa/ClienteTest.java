package com.empresa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente(1, "Ezequiel Santos", 15, "m");
    }

    @Test
    public void testGettersEConstructors() {
        assertEquals(1, cliente.getId());
        assertEquals("Ezequiel Santos", cliente.getNome());
        assertEquals(15, cliente.getDesconto());
        assertEquals("m", cliente.getGenero());
    }

    @Test
    public void testSetDesconto() {
        cliente.setDesconto(20);
        assertEquals(20, cliente.getDesconto());
    }

    @Test
    public void testValidacaoGenero() {
        cliente.setGenero("f");
        assertEquals("f", cliente.getGenero());
        
        cliente.setGenero("invalido");
        assertEquals("nd", cliente.getGenero());
    }

    @Test
    public void testToString() {
        assertEquals("Ezequiel Santos (1) (15%)", cliente.toString());
    }
}
