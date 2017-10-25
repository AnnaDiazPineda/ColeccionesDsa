package com.colecciones;

public class Respuesta {
    public String textoRespuesta;
    public Pregunta siguientePregunta;
    public Respuesta(String respuesta, Pregunta sigiuentePregunta){
        this.textoRespuesta = respuesta;
        this.siguientePregunta = sigiuentePregunta;
    }
}
