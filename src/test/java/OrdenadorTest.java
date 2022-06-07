

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class OrdenadorTest {

    @Test
    @DisplayName("La lista tiene 12 posiciones ")
    void testSize() {
        Ordenador ordenador = new Ordenador();
        assertEquals(12,ordenador.getMonthsList().size());
    }

    @Test
    @DisplayName("Agosto está en la posición 8")
    void testAgostPosition() {
        Ordenador ordenador = new Ordenador();
        assertEquals("Agosto", ordenador.getMonthsList().get(7).getName());

    }

    @Test
    @DisplayName("La lista no tiene valor nulo")
    void testIsNotNull() {
        Ordenador ordenador = new Ordenador();
        assertNotNull(ordenador.getMonthsList());
    }
}