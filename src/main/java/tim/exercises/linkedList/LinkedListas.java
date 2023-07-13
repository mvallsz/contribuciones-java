package tim.exercises.linkedList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListas {
    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<>();
        places.addFirst("hola");
        places.addFirst("hola2");
        places.addFirst("hola3");
        places.push("hola 4");
        places.offer("hola 5");
        places.offerFirst("hola 6");

        System.out.println(places);
        
        
        //Linked List como colas
        
        LinkedList<String> cola = new LinkedList<>();

        System.out.println("Ejemplo de cola");
        cola.offer("elemento 1");
        cola.offer("elemento 2");
        System.out.println(cola);

        System.out.println("extraemos el primer elemento en la cola: " + cola.poll());
        System.out.println(cola);

        System.out.println("Entra un nuevo elemento en la cola");        
        cola.offer("elemento 3");
        System.out.println(cola);

        // Linked List como pilas
        
        LinkedList<String> pila = new LinkedList<>();
        System.out.println("Ejemplo de pila");

        pila.push("elemento 1");
        pila.push("elemento 2");
        pila.push("elemento 3");
        System.out.println(pila);

        System.out.println("extraemos el elemento superior en la pila: " + pila.pop());
        System.out.println(pila);

        System.out.println("Entra un nuevo elemento en la pila");        
        pila.push("elemento 4");
        System.out.println(pila);

        pila.push("elemento 5");
        pila.push("elemento 6");
        pila.push("elemento 7");
        pila.push("elemento 8");
        pila.push("elemento 9");

        ListIterator<String> iterator = pila.listIterator();

        System.out.println("Prueba con el iterador");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("extraemos el elemento superior en la pila: " + pila.pop());

        iterator = pila.listIterator(0);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
