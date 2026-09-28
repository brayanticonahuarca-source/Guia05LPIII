package Actividades5;

public class Actividad2 {

    public static void main(String[] args) {

        Pila<Integer> pila = new Pila<Integer>(5);

        try {

            pila.push(10);
            pila.push(20);
            pila.push(30);
            pila.push(40);
            pila.push(50);

            System.out.println("Elementos agregados a la pila");

            System.out.println("Contiene 30: " + pila.contains(30));

            System.out.println("Contiene 60: " + pila.contains(60));

            System.out.println("Contiene 10: " + pila.contains(10));

            System.out.println("Contiene 50: " + pila.contains(50));

        } catch (ExcepcionPilaLlena e) {

            System.out.println(e.getMessage());
        }
    }
}