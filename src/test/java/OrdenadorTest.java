

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class OrdenadorTest {
//Test que comprueba que la lista tiene 12 posiciones
    @Test
    @DisplayName(" La lista tiene 12 posiciones ")
    void testSize() {
        Ordenador ordenador = new Ordenador();
        assertEquals(12,ordenador.getMonthsList().size());
    }
// Test que comprueba si el valor actual de la posición 8 de la lista, es decir el índice 7, es igual al valor esperado.
    @Test
    @DisplayName("Agosto está en la posición 8")
    void testAgostPosition() {
        Ordenador ordenador = new Ordenador();
        assertEquals("Agosto", ordenador.getMonthsList().get(7).getName());
    }
//Test que comprueba que la lista no tiene valor nulo
    @Test
    @DisplayName("La lista no tiene valor nulo")
    void testIsNotNull() {
        Ordenador ordenador = new Ordenador();
        assertNotNull(ordenador.getMonthsList());
    }
}