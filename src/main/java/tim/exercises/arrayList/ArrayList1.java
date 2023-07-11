package tim.exercises.arrayList;

import java.util.ArrayList;

record ItemDeAlmacen( String name, String type, int count) {
    public ItemDeAlmacen( String name) {
        this(name, "LACTEO", 4);
    }
}

public class ArrayList1 {
    public static void main(String[] args) {

        ItemDeAlmacen[] arrayAlmacen = new ItemDeAlmacen[5];

        arrayAlmacen[0] = new ItemDeAlmacen("ARROZ", "GRANOS", 5);
        arrayAlmacen[1] = new ItemDeAlmacen("PASTA", "PASTA", 5);
        arrayAlmacen[2] = new ItemDeAlmacen("HARINA", "HARINAS", 5);
        arrayAlmacen[3] = new ItemDeAlmacen("CARAOTA", "GRANOS", 5);

        System.out.println(arrayAlmacen[0]);
        System.out.println(arrayAlmacen[1]);
        System.out.println(arrayAlmacen.length);


        ArrayList<ItemDeAlmacen> listAlmacen = new ArrayList<>();

        listAlmacen.add(new ItemDeAlmacen("YOGOURT"));
        listAlmacen.add(new ItemDeAlmacen("QUESO"));
        listAlmacen.add(new ItemDeAlmacen("LECHE"));

        System.out.println(listAlmacen.get(0));
        System.out.println(listAlmacen.get(2));
        System.out.println(listAlmacen.size());
    }
}
