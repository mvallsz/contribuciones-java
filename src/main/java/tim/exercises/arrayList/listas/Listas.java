package prueba.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

record Item(String name, String type, int cant){
    public Item(String name, String type) {
        this(name, type, 1);
    }
    public Item(String name) {
        this(name, "default", 1);
    }
}

public class Listas {
    
    public static void main(String[] args) {
        String[] articulos = {"articulo 1", "articulo 2", "articulo 3", "articulo 4"};

        var nuevaLista = Arrays.asList(articulos);
        ArrayList<String> nuevaLista2 = new ArrayList<>(nuevaLista);
        System.out.println(nuevaLista);

        nuevaLista.set(0, "articulo 33");
        System.out.println(Arrays.deepToString(articulos));

        nuevaLista2.set(0, "articulo 333");
        System.out.println(Arrays.deepToString(articulos));

        ArrayList<String> nuevoArrayList = new ArrayList<>(nuevaLista2);
        nuevoArrayList.add(4, "articulo 5");
        nuevoArrayList.set(0, "null");
        System.out.println(Arrays.deepToString(articulos));

        System.out.println(nuevoArrayList);

        ArrayList otroArrayList = new ArrayList<>(List.of("articulo 6", "articulo 7", "articulo 8", "articulo 9", "articulo 10"));

        nuevoArrayList.addAll(otroArrayList);
        System.out.println(nuevoArrayList);


        /////////////////////////

        ArrayList<ListItem> listaItems = new ArrayList<>();
        listaItems.add(new ListItem());
        listaItems.add(new ListItem("item 2", "not default"));
        listaItems.add(new ListItem("item 5", "not default"));
        listaItems.add(new ListItem("item 3", "not default"));
        listaItems.add(new ListItem("item 4", "not default"));
        

        if(listaItems.contains(new Item("item 1"))){
            System.out.println("lo contiene");
        }

        System.out.println(listaItems.indexOf(new Item("item 1")));

        listaItems.forEach((ListItem item) -> System.out.println("nombre: " + item.name + ", cantidad: " + item.cantidad) );        

        Comparator<ListItem> listNameComparator
        = Comparator.comparing(ListItem::getName);

        listaItems.sort(listNameComparator);

        listaItems.forEach((ListItem item) -> { item.cantidad ++; });

        listaItems.forEach((ListItem item) -> System.out.println("nombre: " + item.name + ", cantidad: " + item.cantidad) );

    }



}
