import static org.junit.Assert.*;
import org.junit.Test;

public class VectorHeapTest {

    @Test
    public void testAddRemove() {

        VectorHeap<Paciente> heap = new VectorHeap<>();

        heap.add(new Paciente("Juan", "Pierna", "C"));
        heap.add(new Paciente("Maria", "Apendicitis", "A"));
        heap.add(new Paciente("Pedro", "Fiebre", "D"));

        assertEquals("Maria",
                heap.remove().getNombre());

        assertEquals("Juan",
                heap.remove().getNombre());
    }
}
