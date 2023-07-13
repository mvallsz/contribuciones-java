package challenges.arrayList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList<String> elements = new ArrayList();
    
        boolean flag = true;

        while (flag) {
            printMenu();
            
            int opcion = -1;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Ingrese una opción valida");    
            }
        
            switch (opcion) {
                case 0 -> flag = false;
                case 1 -> {
                    System.out.println("Ingrese el elemento a ingresar a la lista: ");
                    String elemento = scanner.nextLine().trim();

                    if(elements.contains(elemento)){
                        System.out.println("Elemento ya se encuentra en la lista");
                    } else {
                        elements.add(elemento);
                        elements.sort(Comparator.naturalOrder());
                    }

                    System.out.println();
                    System.out.println("------------ Lista de Elementos ------------");
                    System.out.println(elements.toString());
                    System.out.println("--------------------------------------------");
                    System.out.println();
                }
                case 2 -> {
                    printSubMenu();
                    int opcion2 = -1;
                    try {
                        opcion2 = Integer.parseInt(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("Ingrese una opción valida");    
                    }
                    switch (opcion2) {
                    case 0:
                        break;
                    case 1:
                        System.out.println("Ingrese el valor del elemento: ");
                        String varToRemove = scanner.nextLine().trim();
                        if(elements.contains(varToRemove)){
                            elements.remove(varToRemove);
                            System.out.println("Elemento eliminado con exito");
                        } else {
                            System.out.println("Elemento no se encuentra en la lista");
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese el indice del elemento: ");
                        try {
                            int indice = Integer.parseInt(scanner.nextLine());
                            if(elements.size() < indice || indice < 0){
                                System.out.println("Indice fuera de rango");
                            } else {
                                elements.remove(indice);
                                System.out.println("Elemento eliminado con exito");
                            }
                        } catch (Exception e) {
                            System.out.println("Ingrese un indice valido");    
                        }
                        
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                    }   
                    System.out.println();
                    System.out.println("------------ Lista de Elementos ------------");
                    System.out.println(elements.toString());
                    System.out.println("--------------------------------------------");
                    System.out.println();             
                }
                default -> { System.out.println("Ingrese UNA OPCION VALIDA! "); }
            }
        }
    }

    public static void printMenu(){
        String textBlock = """
                0 - Para salir
                1 - Para agregar un elemento
                2 - para eliminar un elemento

                Ingrese un numero para escoger que hacer:""";
        System.out.println(textBlock + " ");
    
    }
    public static void printSubMenu(){
        String textBlock = """
                0 - Para volver al menu inicial
                1 - Para eliminar un elemento por su contenido
                2 - para eliminar un elemento por su indice

                Ingrese una opción:""";
        System.out.println(textBlock + " ");
    
    }
}
