package org.genericos;

public class Main {
    public static void main(String[] args) {
        OperacionGenerica<Integer> operacion = new OperacionGenerica<>(8,7);
        System.out.println("--------Operacion generica--------");
        System.out.println("Suma = "+operacion.sumar());
        System.out.println("Resta = "+operacion.restar());
        System.out.println("Multiplicacion = "+operacion.multiplicar());
        System.out.println("Division = "+operacion.dividir());
    }
}