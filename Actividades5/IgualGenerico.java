package Actividades5;

public class IgualGenerico {

    public static <T> boolean esIgualA(T primero, T segundo) {

        return primero.equals(segundo);
    }

    public static void main(String[] args) {

        Integer numero1 = 10;
        Integer numero2 = 10;

        String texto1 = "Hola";
        String texto2 = "Hola";

        Object objeto1 = new Object();
        Object objeto2 = objeto1;

        System.out.println("Integer:");
        System.out.println(esIgualA(numero1, numero2));

        System.out.println();

        System.out.println("String:");
        System.out.println(esIgualA(texto1, texto2));

        System.out.println();

        System.out.println("Object:");
        System.out.println(esIgualA(objeto1, objeto2));

        System.out.println();

        System.out.println("Null:");

        System.out.println(esIgualA(null, null));
    }
}