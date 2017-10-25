package com.colecciones;
import java.util.Scanner;

public class Dialogo {
    String nombreInterlocutor;
    public Dialogo(String _nombreInterlocutor){
        nombreInterlocutor = _nombreInterlocutor;

    }
    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hi my name is"+nombreInterlocutor+", please enter your name: ");
        String username = scanner.next();
        System.out.print("Hello "+username);

        System.out.print("Quieres un libro ?");
        String answer = scanner.next();
        if(answer.compareTo("si") == 0 || answer.compareTo("Si") == 0 ){
            System.out.print("Toma: En un lugar de la mancha");
        }
        System.out.print("Ok, y una pelicula?");
        answer = scanner.next();
        if(answer.compareTo("si") == 0 || answer.compareTo("Si") == 0 ){
            System.out.print("Toma: En una galaxia");
        }else {
            System.out.print("No te gustan las peliculas?");
            answer = scanner.next();
            if(answer.compareTo("si") == 0 || answer.compareTo("Si") == 0 ){
                System.out.print("entonces porque no quieres la que te regalo");
            }else {
                System.out.print("Y las series?");
                answer = scanner.next();
                if(answer.compareTo("si") == 0 || answer.compareTo("Si") == 0 ){
                    System.out.print("entonces te regalo una serie");
                }else {
                    System.out.print("ok hasta luego , adiosLau?");
                }
            }
        }
    }
}
