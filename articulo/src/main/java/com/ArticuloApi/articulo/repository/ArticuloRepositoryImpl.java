//Paquete del repositorio de implementacion
package com.ArticuloApi.articulo.repository;

import com.ArticuloApi.articulo.model.Articulo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Anotacion que marca esta clase como componente de repositorio
@Repository
public class ArticuloRepositoryImpl implements ArticuloRepository {
    //Lista que actua como base de datos en memoria
    private final List<Articulo> articulo = new ArrayList<>();

    //Variable que simula un contador automatico de IDs
    private long idCounter = 1;

    //Devuelve todos los articulos de la lista
    @Override
    public List<Articulo> findAll(){
        return new ArrayList<>(articulo);
    }

    //Busca un articulo por su ID
    @Override
    public Optional<Articulo> findById(Long id){
        return articulo.stream().filter(a -> a.getId().equals(id)).findFirst();
    }

    //Guarda o actualiza un articulo
    @Override
    public Articulo save(Articulo nuevoArticulo) {
        if (nuevoArticulo.getId() == null) {
            nuevoArticulo.setId(idCounter++);    //Asigna ID si es nuevo
            articulo.add(nuevoArticulo);         //Agrega a la lista
        } else {
            deleteById(nuevoArticulo.getId());   //Elimina el anterior
            articulo.add(nuevoArticulo);         //Agrega el actualizado
        }
        return nuevoArticulo;
    }

    //Elimina un articulo por su ID
    @Override
    public void deleteById(Long id) {
        articulo.removeIf(a -> a.getId().equals(id));
    }
}
