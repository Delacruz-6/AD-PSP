package com.salesianostriana.dam._EjercicioPractica;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Equivalente a @Controller + @ResponseBody
@RequestMapping("/monumento")
@RequiredArgsConstructor
public class MonumentoController {

    private final MonumentoRepository repository;

    @GetMapping("/")
    public List<Monumento> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Monumento findOne(@PathVariable("id") Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping("/")
    public ResponseEntity<Monumento> create(@RequestBody Monumento monumento) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(repository.save(monumento));
    }

    @PutMapping("/{id}")
    public Monumento edit(@RequestBody Monumento monumento, @PathVariable Long id) {

        Monumento antigua = repository.findById(id).orElse(monumento);
        antigua.setNombreMonumento(monumento.getNombreMonumento());
        antigua.setLocalizacion(monumento.getLocalizacion());
        antigua.setNombreCiudad(monumento.getNombreCiudad());
        antigua.setCodigoPais(monumento.getCodigoPais());
        antigua.setNombrePais(monumento.getNombrePais());
        antigua.setDescripcion(monumento.getDescripcion());
        antigua.setFoto(monumento.getFoto());

        return repository.save(antigua);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
        //return ResponseEntity.status(204).build();
    }






}
