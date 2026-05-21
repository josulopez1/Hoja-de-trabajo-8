import java.util.PriorityQueue;

public class MainJavaPQ {

    public static void main(String[] args) {

        PriorityQueue<Paciente> cola =
                new PriorityQueue<>();

        cola.add(new Paciente("Juan", "Pierna", "C"));
        cola.add(new Paciente("Maria", "Apendicitis", "A"));
        cola.add(new Paciente("Pedro", "Fiebre", "D"));

        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}
