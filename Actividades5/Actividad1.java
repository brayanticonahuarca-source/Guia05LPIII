package Actividades5;

public class Actividad1 {

    public static <E> void imprimirArreglo(E[] arregloEntrada) {

        for (E elemento : arregloEntrada) {
            System.out.print(elemento + " ");
        }

        System.out.println();
    }

    public static <E> int imprimirArreglo(
            E[] arregloEntrada,
            int subindiceInferior,
            int subindiceSuperior) throws InvalidSubscriptException {

        if (subindiceInferior < 0 ||
            subindiceSuperior >= arregloEntrada.length ||
            subindiceSuperior <= subindiceInferior) {

            throw new InvalidSubscriptException("Indices no validos");
        }

        int cantidad = 0;

        for (int i = subindiceInferior; i <= subindiceSuperior; i++) {
            System.out.print(arregloEntrada[i] + " ");
            cantidad++;
        }

        System.out.println();

        return cantidad;
    }

    public static void main(String[] args) {

        Integer[] arregloInteger = {1, 2, 3, 4, 5, 6};

        Double[] arregloDouble = {
            1.1, 2.2, 3.3, 4.4, 5.5, 6.6
        };

        Character[] arregloCharacter = {
            'H', 'O', 'L', 'A'
        };

        System.out.println("ARREGLO INTEGER");
        imprimirArreglo(arregloInteger);

        try {
            int cantidad = imprimirArreglo(arregloInteger, 1, 4);
            System.out.println("Cantidad de elementos: " + cantidad);
        } catch (InvalidSubscriptException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        System.out.println("ARREGLO DOUBLE");
        imprimirArreglo(arregloDouble);

        try {
            int cantidad = imprimirArreglo(arregloDouble, 1, 4);
            System.out.println("Cantidad de elementos: " + cantidad);
        } catch (InvalidSubscriptException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        System.out.println("ARREGLO CHARACTER");
        imprimirArreglo(arregloCharacter);

        try {
            int cantidad = imprimirArreglo(arregloCharacter, 0, 2);
            System.out.println("Cantidad de elementos: " + cantidad);
        } catch (InvalidSubscriptException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        try {
            imprimirArreglo(arregloInteger, 4, 2);
        } catch (InvalidSubscriptException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}