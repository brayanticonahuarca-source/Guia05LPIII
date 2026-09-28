package Actividades5;

public class ExcepcionPilaLlena extends Exception {

    public ExcepcionPilaLlena() {
        super("La pila esta llena");
    }
}