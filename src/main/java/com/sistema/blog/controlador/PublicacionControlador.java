package com.sistema.blog.controlador;

import com.sistema.blog.dto.PublicacionDTO;
import com.sistema.blog.servicio.PublicacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/publicaciones")
public class PublicacionControlador {

    @Autowired
    private PublicacionServicio publicacionServicio;

    @PostMapping
    public ResponseEntity<PublicacionDTO> guardarPublicacion(@RequestBody PublicacionDTO publicacionDTO){

        return new ResponseEntity<>(publicacionServicio.crearPublicacion(publicacionDTO), HttpStatus.CREATED);

    }

    @GetMapping
    public List<PublicacionDTO> listarPublicaciones() {
        return publicacionServicio.obtenerTodasLasPublicaciones();
    }

}
