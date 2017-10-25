package com.colecciones;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    public String Nombre; // ha de ser unic
    public String Contrasena;
    private int Nivel;
    private int Ataque;
    private int Defensa;
    private int Resistencia;
    //Aquesta es la llista on es guarden els objectes que pot tenir un usuari
    // llista del tipus Objeto, anomenada ObjetosUsuario
    List<Objeto> ObjetosUsuario = new ArrayList<Objeto>();

    //construïm un nou usuari
    public Usuario (String _nombre, String _contrasena, int _nivel, int _Ataque, int _defensa, int _resis)
    {
        Nombre = _nombre;
        Contrasena = _contrasena;
        Nivel = _nivel;
        Ataque = _Ataque;
        Defensa = _defensa;
        Resistencia = _resis;
    }

    public String getNombre()
    {
        return Nombre;
    }

    //bucle for each for (String nombre : lista)
    public Objeto getObjetoPorNombre(String _nombreObjeto)
    {
        for(Objeto _objetoUsuario:ObjetosUsuario)
        {
            return _objetoUsuario;
        }
        return null;
    }
    public Objeto deleteObjetoPorNombre(String _nombreObjeto)
    {
        for (Objeto _obejetoUsuario:ObjetosUsuario)
        {
            if (_obejetoUsuario.equals(_nombreObjeto))
            {
                ObjetosUsuario.remove(_nombreObjeto);
            }

        }
        return null;
    }

    public String toString(){
        String explicacio = "Nombre" + this.Nombre +
                "\n Contrasena =" + this.Contrasena +
                "\n Nivel = " +this.Nivel+
                "\n Ataque =" + this.Ataque+
                "\n Defensa = " +this.Defensa+
                "\n Resistencia =" + Resistencia;
        return explicacio;
    }
}


