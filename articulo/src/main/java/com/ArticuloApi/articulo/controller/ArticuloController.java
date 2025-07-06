//Paquete del controlador
package com.ArticuloApi.articulo.controller;

import com.ArticuloApi.articulo.model.Articulo;
import com.ArticuloApi.articulo.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

// Controlador REST que maneja las peticiones HTTP
@RestController
@RequestMapping("/api/articulo")

public class ArticuloController {
    //Inyeccion del servicio
    private final ArticuloService articuloService;

    //Constructor con inyeccion
    @Autowired
    public ArticuloController(ArticuloService articuloService) {
        this.articuloService = articuloService;
    }

    //GET/api/articulo -> Lista todos los articulos
    @GetMapping
    public List<Articulo>listar(){
        return articuloService.listarArticulo();
    }

    //GET/api/articulo/{id} -> busca un articulo por ID
    @GetMapping("/{id}")
    public ResponseEntity<Articulo> obtenerPorId(@PathVariable Long id){
        return articuloService.obtenerArticuloPorId(id)
        .map(ResponseEntity::ok)                       //Devuelve 200 si lo encuentra
        .orElse(ResponseEntity.notFound().build());    //Devuelve 404 sino
    }


    //POST/api/articulo -> crea un nuevo articulo
    @PostMapping    
    public Articulo crear(@RequestBody Articulo articulo){
        return articuloService.guardarArticulo(articulo);
    }

    //PUT/api/articulo/{id} -> actualiza un articulo existente
    @PutMapping("/{id}")
    public ResponseEntity<Articulo> actualizar(@PathVariable Long id, @RequestBody Articulo articulo){
        if (articuloService.obtenerArticuloPorId(id).isEmpty()){
            return ResponseEntity.notFound().build();     //Si no existe , 404
        }
        return ResponseEntity.ok(articuloService.actualizarArticulo(id, articulo));  //Si existe actualiza y 200
    }

    //DELETE/api/articulo/{id} -> elimina un articulo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        if (articuloService.obtenerArticuloPorId(id).isEmpty()){
            return ResponseEntity.notFound().build();     //Si no existe , 404
        }
        articuloService.eliminarArticulo(id);
        return ResponseEntity.noContent().build();             //204 No Content
    }



        
    @GetMapping("/articulos")
    public String getArticulos() {
        //Aqui podemos retornar una lista de articulos
        //por ahora retonnamos un string para probar que el controlador funciona

        return "Lista de articulos de Matt";
    }
}








