package tim.exercises.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class BasicArrays {

    public static void main(String[] args) {

        // Array es una clase que hereda de Object Class
        // dos maneras de declar array en JAVA
        // la mas comun es tipo[]
        int[] intArray;
        int anotherIntArray[];

        // inicializacion de arrays, siempre se debe especificar el
        // tamaño del array, se hace la inialización con la palabra new
        // el tipo de dato seguido de los corchetes y
        // dentro el corchete el tamaño del array
        // el array no se puede aumentar el tamaño que se declara
        intArray = new int[10];

        // para acceder a un elemento del array indicamos el índice al
        // cual queremos acceder, los índices en el array empiezan en 0
        // podemos asignar nuevos valores o leer el valor almacenado en
        // ese espacio del array mediante este metodo
        intArray[0] = 5;
        System.out.println("Accediendo al elemento 0 del array");
        System.out.println(intArray[0]);

        // si vamos a utilizar un array en el que sabemos cuales seran
        // sus elementos iniciales, podemos utilizar el inicializador de la siguiente manera

        int[] arrayInit = new int[] { 1, 2, 3, 4, 5};
        System.out.println("Imprimiendo el array que acabamos de inicializar");
        System.out.println(Arrays.toString(arrayInit));

        // también podemos utilzar una forma más simplificada de la
        // inicializacion del array de la siguiente forma
        // esta forma se llama inicializador anonimo de arrays

        int[] arrayInit2 = { 1, 2, 3 ,4 ,5 };
        System.out.println("Imprimiendo el array que acabamos de inicializar de la forma simple");
        System.out.println(Arrays.toString(arrayInit2));

        System.out.println("tamaño del array que acabamos de crear");
        System.out.println(arrayInit2.length);

        // recorriendo arrays de la forma clásica

        System.out.println("Recorriendo el array mediante el for clásico");
        for (int i = 0; i < arrayInit2.length; i++) {
            System.out.print(arrayInit2[i] + " ");
        }

        // recorriendo arrays con el metodo mejorado
        System.out.println("\nRecorriendo el array mediante el for mejorado");
        for (int element : arrayInit) {
            System.out.print(element + " ");
        }

        // un array se puede asignar a una variable de tipo Object
        Object objectArray = arrayInit;

        if(objectArray instanceof int[]) {
            System.out.println("\nprobando la asignación de arrays a variables de tipo objeto");
        }

        //para poder manipular el objeto que hacer referencia al array con los metodos estaticos
        // de la clase Array es necesario hacer un casting explícito del objeto como se ve a continuacion.
        System.out.println("Imprimiendo el object Array");
        System.out.println(Arrays.toString((int[])objectArray));

        // nota: la asignación del array al objeto no hace referencia a un nuevo objeto,
        // la nueva variable de tipo Object sigue apuntando al array original,
        // por lo que todos los cambios que se realicen al array original
        // se veran reflejados al momento de manipular el Object
        System.out.println("arrayInit: " + arrayInit);
        System.out.println("objectArray: " +objectArray);
        arrayInit[0] = 8;
        System.out.println(Arrays.toString((int[])objectArray));

        // generar un Array de entero random desde función generaIntArray
        int[] newArray = generaIntArray(10);
        System.out.println(Arrays.toString(newArray));

        // ordenar arrays con procedimiento sort de la clase Arrays
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));

        // rellenar con un valor estatico las posiciones de un
        // array mediante la utilización del metodo fill de la clase Array

        int[] newArray2 = new int[10];
        System.out.println(Arrays.toString(newArray2));

        // rellenamos todos los valores con el valor 10
        Arrays.fill(newArray2,10 );
        System.out.println(Arrays.toString(newArray2));

        // rellenamos especificando desde y hasta con el valor 5
        Arrays.fill(newArray2, 0, 5,5 );
        System.out.println(Arrays.toString(newArray2));

        // Para copiar un array podemos utlizar una funcion llamada copyOf,
        // que genera un nuevo array en lugar de que la nueva variable array apunte al array original

        int[] newArray3 = Arrays.copyOf(newArray2, newArray2.length);

        System.out.println("copiamos newArray2 en newArray3");
        System.out.println("newArray3: " + Arrays.toString(newArray3));

        System.out.println("imprimimos newArray2");
        System.out.println("newArray2: " + Arrays.toString(newArray2));
        Arrays.fill(newArray3, 15);

        System.out.println("imprimimos newArray3 despues de la modificación");
        System.out.println("newArray3: " + Arrays.toString(newArray3));

        System.out.println("imprimimos newArray2 despues de la modificación");
        System.out.println("newArray2: " + Arrays.toString(newArray2));

        // podemos tambier hacer una copia parcial de un array de esta manera

        int[] newSmallerArray = Arrays.copyOf(newArray, 5);

        System.out.println("imprimimos newSmallerArray, tendra los primeros 5 valores de newArray");
        System.out.println("newArray: " + Arrays.toString(newArray));
        System.out.println("newSmallerArray: " + Arrays.toString(newSmallerArray));

        // funcion binarySearch de la clase Array, realiza una busqueda segmentada en el array
        // de la llave que se le pase como argumento, regresa el indice del elemento encontrado,
        // si no lo encuentra devuelve un numero negativo, el metodo es Case Sensitive
        // el array debe estar ordenado para optimizar el proceso de busqueda.

        String[] sArray = {"Pedro", "Manuel", "Andrea", "Sandra", "Susana", "Ivan", "Barbara"};

        System.out.println(Arrays.toString(sArray));
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        System.out.println("Indice de Sandra: " + Arrays.binarySearch(sArray, "Sandra"));
        System.out.println("Indice de Carlos: " + Arrays.binarySearch(sArray, "Carlos"));
        System.out.println("Indice de Jose: " + Arrays.binarySearch(sArray, "Jose"));
        System.out.println("Indice de Barbara: " + Arrays.binarySearch(sArray, "Barbara"));
        System.out.println("Indice de barbara: " + Arrays.binarySearch(sArray, "barbara"));

        if(Arrays.binarySearch(sArray, "Sandra") >= 0) {
            System.out.println("Sandra se encuentra en el array");
        }

        // funcion equals de la clase Arrays, compara dos arrays y si coincide el tipo,
        // el tamaño y el orden de los elementos del array entrega una respuesta positiva de tipo boolean

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        int[] array3 = {2, 1, 3, 4, 5};
        int[] array4 = {1, 2, 3, 4, 5};

        System.out.println("Probando el equals con 2 arrays identicos");
        if(Arrays.equals(array1, array2)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays no son iguales");
        }

        System.out.println("Probando el equals con 2 arrays con orden diferente");
        if(Arrays.equals(array3, array4)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays no son iguales");
        }

        int[] arrayTosort = generaIntArray(10);
        System.out.println(Arrays.toString(arrayTosort));
        int[] arraySorted = desendingSortingArray(arrayTosort);
        System.out.println(Arrays.toString(arraySorted));

        imprime("hola", "manuel");

        int[] numeros = readIntegers();
        System.out.println(Arrays.toString(numeros));

        System.out.println(minNumber(numeros));

        // Matrices en JAVA, la declaración de las matrices se realiza de la siguiente forma:

        // Cración de matrices con el inicializador
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // creación de matrices sin inicializar los valores

        int[][] matriz2 = new int[3][3];

        // creación de matrices inicializando la cantidad filas y no de columnas

        int[][] matriz3 = new int[3][];

        // Recorrer una matriz mediante el acceso a los indices

        for(int i = 0; i < matriz.length; i++){
            int[] filas = matriz[i];
            for(int j = 0; j < filas.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Recorrer una matriz mediante un ciclo for mejorado

        for (var fila: matriz) {
            for(var celda: fila ) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }

        // la clase Arrays hereda de la clase Objeto,
        // por lo que un array de tipo Object puede almacenar un variable de tipo Array
        Object[] unArray = new Object[3];
        System.out.println(Arrays.toString(unArray));

        unArray[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(unArray));
        unArray[1] = new String[][] {
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };

        // tambien se pueden almacenar arreglos de multiples dimensiones
        unArray[2] = new int[2][2][2];

        System.out.println(Arrays.deepToString(unArray));

        for (Object element: unArray) {
            System.out.println(element.getClass().getSimpleName());
            System.out.println(element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }

    }

    private static int[] generaIntArray (int largo) {
        Random ramdomGenerator = new Random();
        int[] arrayInt = new int[largo];

        for (int i = 0; i < largo; i++) {
            arrayInt[i] = ramdomGenerator.nextInt(100);
        }

        return arrayInt;
    }

    private static int[] readIntegers() {

        // proceso generado con metodos clasicos para recorrer y parsear los valores de String a int.
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa una lista de enteros separados por comas (,): ");

        String input = sc.nextLine();
        String[] numbersS = input.split(",");
        int[] numbers = new int[numbersS.length];

        for (int i = 0; i < numbersS.length; i++) {
            numbers[i] = Integer.parseInt(numbersS[i]);
        }

        return numbers;

        //Proceso utlizando el stream de la clase Arrays
        //return Arrays.stream(sc.nextLine().split(",")).mapToInt(num -> Integer.parseInt(num)).toArray();
    }

    private static int minNumber(int[] numbers) {

        // proceso simplificado utilizando el proceso stream de la clase Arrays
        //return Arrays.stream(numbers).min().getAsInt();

        // proceso clasico para determinar cual es el valor menor del array
        int min_value = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min_value) {
                min_value = numbers[i];
            }
        }
        return min_value;
    }

    private static void imprime(String... vars) {
        System.out.println(vars[0]);
    }

    private static int[] desendingSortingArray(int[] arrayToSort) {
        int length = arrayToSort.length;
        int[] sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < length -1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }

            }
        }
        return sortedArray;
    }
}
