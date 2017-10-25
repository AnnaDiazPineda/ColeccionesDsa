package com.colecciones;

public class Objeto {
    private String Nombre; // no ha de ser unic
    private String Tipo;
    private String Descripcion;
    private int Valor;
    private int Coste;

    public Objeto(String _nombre, String _tipo, String _descrip, int _valor, int _coste)
    {
        Nombre = _nombre;
        Tipo = _tipo;
        Descripcion = _descrip;
        Valor = _valor;
        Coste = _coste;
    }
}