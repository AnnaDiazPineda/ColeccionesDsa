package com.colecciones;
import java.util.ArrayList;
import java.util.Scanner;

public class Pregunta {
    String textoPregunta;
    ArrayList<Respuesta> respuestas;
    Scanner scanner = new Scanner(System.in);

    public Pregunta(String _textoPregunta){
        this.textoPregunta = _textoPregunta;
        this.scanner = new Scanner(System.in);
        this.respuestas = new ArrayList<Respuesta>();
    }
    public void anyadirRespuesta(String respuesta, Pregunta sigiuentePregunta){
        Respuesta aanyadir = new Respuesta(respuesta,sigiuentePregunta);
        respuestas.add(aanyadir);
    }

    public void doPregunta(){
        System.out.println(textoPregunta);

        System.out.println("Puedes responder con un 0 y sera :"+ respuestas.get(0).textoRespuesta);
        System.out.println("Puedes responder con un 1 y sera :"+ respuestas.get(1).textoRespuesta);
        System.out.println("Puedes responder con un 2 y sera :"+ respuestas.get(2).textoRespuesta);

        Integer answer = Integer.parseInt(scanner.next());

        System.out.println("tu respuesta es:"+ answer + " que quiere decir : " + respuestas.get(answer).textoRespuesta);

        if(respuestas.get(answer).siguientePregunta != null){
            respuestas.get(answer).siguientePregunta.doPregunta();
        }
    }
}
