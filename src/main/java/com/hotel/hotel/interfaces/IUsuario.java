package com.hotel.hotel.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel.hotel.model.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
