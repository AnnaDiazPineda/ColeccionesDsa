package com.colecciones;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList <Usuario> usuarioContainer = new ArrayList<Usuario>();
        ArrayList <Objeto> ObjetoContainer = new ArrayList<Objeto>();

        Usuario primerUsuario = new Usuario("Anna","marianet",10,10,10, 10);
        Objeto espadaFuego = new Objeto("Espada", "Luchar", "espada de fuego", 20, 20);

        Mundo bosque = new Mundo();
        bosque.nuevoUsuario(primerUsuario);
        bosque.nuevoObjetoUsuario(primerUsuario, espadaFuego);

        //Usuario.getObjetoPorNombre("Espada");



        Pregunta primeraPregunta = new Pregunta("Hola te interessan los diccionarios?");
        /*System.out.println(""+primerUsuario.toString());

        Dialogo primerDialogo = new Dialogo("Juanito");
        primerDialogo.start();*/
        Pregunta preguntacomprar = new Pregunta("Porque tengo uno muy bueno, crees que me lo puedes comprar?");
        preguntacomprar.anyadirRespuesta("Quanto vale?",null);
        preguntacomprar.anyadirRespuesta("No, pero me lo prestas?",null);
        preguntacomprar.anyadirRespuesta("Si",null);

        Pregunta preguntacasiadios = new Pregunta("Pues gracias por el interes, quieres algo mas?");
        preguntacasiadios.anyadirRespuesta("No",null);
        preguntacasiadios.anyadirRespuesta("Perdona estaa distraido repiteme ",preguntacasiadios);
        preguntacasiadios.anyadirRespuesta("Si, cuantamelo todo otra vez",primeraPregunta);


        primeraPregunta.anyadirRespuesta("Si",null);
        primeraPregunta.anyadirRespuesta("No",preguntacasiadios);
        primeraPregunta.anyadirRespuesta("Porque",preguntacomprar);

        primeraPregunta.doPregunta();
    }
}
