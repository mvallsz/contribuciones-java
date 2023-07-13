package prueba.linkedList;
import java.util.LinkedList;

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
        

    }
}
