package Actividades5;

public class Pila2<E> {

    private final int tamanio;
    private int superior;
    private E[] elementos;

    public Pila2() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public Pila2(int s) {

        tamanio = s > 0 ? s : 10;
        superior = -1;

        elementos = (E[]) new Object[tamanio];
    }

    public void push(E valor) throws ExcepcionPilaLlena2 {

        if (superior == tamanio - 1) {

            throw new ExcepcionPilaLlena2(
            );
        }

        elementos[++superior] = valor;
    }

    public E pop() throws ExcepcionPilaVacia2 {

        if (superior == -1) {

            throw new ExcepcionPilaVacia2(
            );
        }

        return elementos[superior--];
    }

    public boolean esIgual(Pila2<E> otraPila) {

        if (otraPila == null) {
            return false;
        }

        if (this.superior != otraPila.superior) {
            return false;
        }

        for (int i = 0; i <= superior; i++) {

            if (elementos[i] == null && otraPila.elementos[i] == null) {
                continue;
            }

            if (elementos[i] == null || otraPila.elementos[i] == null) {
                return false;
            }

            if (!elementos[i].equals(otraPila.elementos[i])) {
                return false;
            }
        }

        return true;
    }
}