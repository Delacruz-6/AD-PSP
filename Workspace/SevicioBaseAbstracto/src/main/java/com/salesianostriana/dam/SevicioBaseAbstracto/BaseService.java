package com.salesianostriana.dam.SevicioBaseAbstracto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
// Para no utilizar los repositorios en los controladores
public  abstract class BaseService<T, ID,R extends JpaRepository<T,ID>> {


    @Autowired
    protected R repositorio;

    public List<T> findAll(){
        return repositorio.findAll();
    }

    public Optional<T> findById(ID id){
        return repositorio.findById(id);
    }

    public T save (T t){
        return repositorio.save(t);
    }

    public T edit (T t){
        return repositorio.save(t);
    }

    public void delete (ID id){
        repositorio.deleteById(id);

    }




}
