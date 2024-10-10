package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        System.out.println("Los libros de la biblioteca son:");
        //para declarar el objeto
        //para instanciar una clase
        Libro libro1=new Libro("El Resplandor", "Stephen King","De Bolsillo", 600);
        Libro libro2=new Libro("La Bella y la Bestia","Disney","Critica",352);
        Libro libro3=new Libro("El Señor de los anillos","J.J.K Tolkien","HarperCollins",1392);
        Libro libro4=new Libro("El amor en los tiempos del cólera","Gabriel García Márquez","Vintage",368);
        Libro libro5=new Libro("julio verne","viaje al centro de la tierra","Anaya Infantil y Juvenil",320);

        libro1.imprimir();
        System.out.println(libro1.imprimircubierta());
        libro2.imprimir();
        System.out.println(libro2.imprimircubierta());
        libro3.imprimir();
        System.out.println(libro3.imprimircubierta());
        libro4.imprimir();
        System.out.println(libro4.imprimircubierta());
        libro5.imprimir();
        System.out.println(libro5.imprimircubierta());
    }
}