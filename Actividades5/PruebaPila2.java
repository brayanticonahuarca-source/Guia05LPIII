package Actividades5;


public class PruebaPila2 {

    public static void main(String[] args) throws ExcepcionPilaLlena2 {

        Pila2<Integer> pila1 = new Pila2<Integer>(5);
        Pila2<Integer> pila2 = new Pila2<Integer>(5);
        Pila2<Integer> pila3 = new Pila2<Integer>(5);

        pila1.push(10);
        pila1.push(20);
        pila1.push(30);

        pila2.push(10);
        pila2.push(20);
        pila2.push(30);

        pila3.push(10);
        pila3.push(20);
        pila3.push(40);

        System.out.println("Comparando pila1 con pila2:");
        System.out.println(pila1.esIgual(pila2));

        System.out.println();

        System.out.println("Comparando pila1 con pila3:");
        System.out.println(pila1.esIgual(pila3));

        System.out.println();

        System.out.println("Contenido de pila1:");

        while (true) {

            try {

                System.out.println(pila1.pop());

            } catch (ExcepcionPilaVacia2 e) {

                break;
            }
        }

        System.out.println();

        System.out.println("Contenido de pila2:");

        while (true) {

            try {

                System.out.println(pila2.pop());

            } catch (ExcepcionPilaVacia2 e) {

                break;
            }
        }
    }
}