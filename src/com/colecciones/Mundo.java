package com.colecciones;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public  class Mundo {
    public Mundo(){

    }

    //Creo un map per usuaris ja que no accepta duplicats    //class hashmap <k,v>
    //k la clau que rebem  //v el tipus de valors mapejats
    Map<String, Usuario> listaUsuarios = new HashMap<String, Usuario>();

    //metodo boolean retorna true si el mapa mapea alguna key del valor especifico
    public Boolean nuevoUsuario(Usuario _usuario)
    {
        listaUsuarios.put(_usuario.Nombre, _usuario);
        return true;

    }

    public List<Objeto> objetosUsuarioConsulta (Usuario _usuario)
    {
        return _usuario.ObjetosUsuario;
    }

    public void nuevoObjetoUsuario (Usuario _usuario, Objeto _objeto)
    {
        //Recibo el nombre de un usuario (_usuario), en su lista de objetos
        //añado el objeto que he recibido
        _usuario.ObjetosUsuario.add(_objeto);
    }

    public Objeto consultarObjetoUsuario(Usuario _usuario, String _objeto)
    {
        return _usuario.getObjetoPorNombre(_objeto);
    }
    boolean eliminarObjetoUsuario(Usuario _usuario , Objeto _objeto)
    {
        _usuario.ObjetosUsuario.remove(_objeto);
        return true;
    }

    public void transferirObjectesUsuarios(Usuario _usuario1, Usuario _usuario2, Objeto _objeto)
    {
        _usuario1.ObjetosUsuario.remove(_objeto);
        _usuario2.ObjetosUsuario.add(_objeto);
    }

}
