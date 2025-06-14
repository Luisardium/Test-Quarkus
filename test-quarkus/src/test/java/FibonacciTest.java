import com.beesion.ms.ejercicios.SecuenciaFibonacci;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class FibonacciTest {

    @Test
    public void testFibonacciCincoElementos() {
        int[] inicio = {2, 3};
        int n = 5;
        List<Integer> esperado = Arrays.asList(2, 3, 5, 8, 13);
        assertEquals(esperado, SecuenciaFibonacci.fibonacci(inicio, n));
    }

    @Test
    public void testFibonacciConCeroElementos() {
        int[] inicio = {1, 1};
        int n = 0;
        List<Integer> esperado = Arrays.asList();
        assertEquals(esperado, SecuenciaFibonacci.fibonacci(inicio, n));
    }

    @Test
    public void testFibonacciConUnElemento() {
        int[] inicio = {7, 11};
        int n = 1;
        List<Integer> esperado = Arrays.asList(7);
        assertEquals(esperado, SecuenciaFibonacci.fibonacci(inicio, n));
    }

    @Test
    public void testFibonacciConDosElementos() {
        int[] inicio = {5, 8};
        int n = 2;
        List<Integer> esperado = Arrays.asList(5, 8);
        assertEquals(esperado, SecuenciaFibonacci.fibonacci(inicio, n));
    }

    @Test
    public void testFibonacciConNueveElementos() {
        int[] inicio = {0, 1};
        int n = 9;
        List<Integer> esperado = Arrays.asList(0,1,1,2,3,5,8,13,21);
        assertEquals(esperado, SecuenciaFibonacci.fibonacci(inicio, n));
    }
}
