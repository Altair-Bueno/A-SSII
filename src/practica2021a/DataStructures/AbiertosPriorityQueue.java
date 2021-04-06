package practica2021a.DataStructures;

import practica2021a.Estado;

import java.util.EmptyStackException;
import java.util.PriorityQueue;

public class AbiertosPriorityQueue <E extends Estado> extends Abiertos<E> {

    private PriorityQueue<NodoAB> queue;

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void offer(int f, Estado estado) {

    }

    @Override
    public E poll() {
        if (queue.isEmpty()) throw new EmptyStackException();
        return queue.poll().getEstado();
    }

    @Override
    public void remove(Estado estado) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void ver() {

    }
}