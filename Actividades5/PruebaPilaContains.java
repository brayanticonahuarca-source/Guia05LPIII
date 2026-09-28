package Actividades5;


public class PruebaPilaContains {

    public static void main(String[] args) {

        Pila<Integer> pila = new Pila<>(5);

        try {

            pila.push(10);
            pila.push(20);
            pila.push(30);
            pila.push(40);

            System.out.println("¿La pila contiene 30? " + pila.contains(30));

            System.out.println("¿La pila contiene 50? " + pila.contains(50));

            System.out.println("Elemento retirado: " + pila.pop());

            System.out.println("¿La pila contiene 40? " + pila.contains(40));

        } catch (ExcepcionPilaLlena e) {

            System.out.println(e.getMessage());

        } catch (ExcepcionPilaVacia e) {

            System.out.println(e.getMessage());

        }

    }

}