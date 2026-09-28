package Actividades5;

public class Pila<E> {

    private E[] elementos;

    private int superior;

    public Pila(int tamanio) {

        elementos = (E[]) new Object[tamanio];

        superior = -1;

    }

    public void push(E elemento) throws ExcepcionPilaLlena {

        if (superior == elementos.length - 1) {

            throw new ExcepcionPilaLlena();

        }

        superior++;

        elementos[superior] = elemento;

    }

    public E pop() throws ExcepcionPilaVacia {

        if (superior == -1) {

            throw new ExcepcionPilaVacia();

        }

        E elemento = elementos[superior];

        elementos[superior] = null;

        superior--;

        return elemento;

    }

    public boolean contains(E elemento) {

        for (int i = superior; i >= 0; i--) {

            if (elemento == null) {

                if (elementos[i] == null) {

                    return true;

                }

            } else {

                if (elemento.equals(elementos[i])) {

                    return true;

                }

            }

        }

        return false;

    }

}