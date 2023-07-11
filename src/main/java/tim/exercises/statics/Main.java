package tim.exercises.statics;

public class Main {
    public static void main(String[] args) {
        System.out.println(A.i);
        System.out.println(A.s);
        System.out.println(B.s);
        B.m();
    }
}

class A {
    static final String s = "s";
    static int i = 10;

    static {
        System.out.println("bloque static tim.exercises.statics.A");
    }
}

class B extends A {
    static {
        System.out.println("Bloque static tim.exercises.statics.B");
    }
    static void m(){
        System.out.println("Funcion M");
    }
}