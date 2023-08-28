package tim.challanges;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import tim.exercises.arrayList.listas.ListItem;

class Place {
    private String name;
    private int distanceFromOrigin;

    public Place() {
        this("Caracas",0);
        System.out.println("Creación de Ciudad de origen");
    }


    public Place(String name, int distanceFromOrigin) {
        this.name = name;
        this.distanceFromOrigin = distanceFromOrigin;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistanceFromOrigin() {
        return this.distanceFromOrigin;
    }

    public void setDistanceFromOrigin(int distanceFromOrigin) {
        this.distanceFromOrigin = distanceFromOrigin;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", this.name, this.distanceFromOrigin);
    }

}

public class LinkedListChallenge {
    
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        iniciaLista(placesToVisit);
        printMenu();
        processOption(sc, placesToVisit);
        
    }

    public static void iniciaLista(LinkedList<Place> placesToVisit) {
        placesToVisit.add(new Place());
    }

    public static void processOption(Scanner sc, LinkedList<Place> placesToVisit){
        String opcion = "";
        
        opcion = sc.nextLine().toLowerCase();
        
        switch(opcion){
            case "a", "adelantar" -> {

            }
            case "r", "retroceder" -> {

            }
            case "l", "listar" -> { 
                System.out.println(placesToVisit);
                System.out.println("------------------");
                printMenu();
                processOption(sc, placesToVisit);
            }
            case "m", "mostrar" -> imprimeItinerario(sc, placesToVisit);
            case "n", "nuevo" -> ingresaLugar(sc, placesToVisit);
            case "v", "volver" -> {
                printMenu();
                processOption(sc, placesToVisit);
            }
            case "s", "salir" -> {
                System.out.println("Hasta Luego");
            }
        }
    }

    public static void printMenu(){
        String textBlock = """
                Acciones disponibles (seleccione la letra o la palabra):
                (A)delantar en el itinerario
                (R)etroceder en el itinerario
                (L)istar todos los lugares
                (M)ostrar itinerario
                (N)uevo lugar para visitar
                (V)olver al menu
                (S)alir
                """;
        System.out.println(textBlock + " ");
    
    }

    public static void ingresaLugar(Scanner sc, LinkedList<Place> lugares) {
        boolean error = false;
        boolean duplicated = false;
        int distancia = 0;
        String nombre = "";
        
        System.out.println("Ingrese el lugar que quiere agregar a la lista: ");
        nombre = sc.nextLine();
        
        do {
            try {
                System.out.println("Ingrese la distancia respecto al origen: ");
                distancia = Integer.parseInt(sc.nextLine());
                error = false;    
            } catch (Exception e) {
                error = true;
                System.out.println("Ingrese un valor de distancia valido");           
            }
        }while(error);

        ListIterator<Place> recorre = lugares.listIterator();
        Place newPlace = new Place(nombre, distancia);
        
        while (recorre.hasNext()) {
            Place placeInList = recorre.next();
            if(placeInList.getName().equalsIgnoreCase(newPlace.getName()) &&
            placeInList.getDistanceFromOrigin() == newPlace.getDistanceFromOrigin()){
                duplicated = true;
                break;
            }
        }

        if(duplicated){
            System.out.println("Este destino ya se encuentra en la lista...");
            System.out.println("Quiere ingresar otro destino? Y/n");
            boolean exit = true;
            while (exit) {
                switch(sc.nextLine()){
                    case "Y" -> {
                        ingresaLugar(sc, lugares);
                        exit = false;
                    }
                    case "n" -> { exit = false; }
                    default -> { 
                        System.out.println("Ingrese un valor valido");
                     }
                }                
            }
        } else {
            lugares.add(newPlace);
            Comparator<Place> placeComparator
            = Comparator.comparing(Place::getDistanceFromOrigin);
            lugares.sort(placeComparator);
        
        }
        printMenu();
        processOption(sc, lugares);
    }

    public static void imprimeItinerario(Scanner sc, LinkedList<Place> placesToVisit) {
        
        Place desde = placesToVisit.getFirst();
        
        if (placesToVisit.size() > 1) {
            System.out.println("-------------------");
            System.out.println("Itinerario de Viaje");
            System.out.println("-------------------");

            ListIterator<Place> recorredor = placesToVisit.listIterator(1);
            
            while (recorredor.hasNext()){
                Place hasta = recorredor.next();
                System.out.println("Desde: " + desde.getName() + ", hasta: " + hasta.getName());
                desde = hasta;
            }
        } else {
            System.out.println("No hay ciudades disponibles en el itinerario");
        }
 
        
        printMenu();
        processOption(sc, placesToVisit);
    }

}




