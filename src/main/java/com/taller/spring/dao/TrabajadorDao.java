package com.taller.spring.dao;

import java.util.List;
import com.taller.spring.model.Trabajador;

public interface TrabajadorDao {

   long save(Trabajador trabajador);

   Trabajador get(long id);

   List<Trabajador> list();

   void update(long id, Trabajador trabajador);

   void delete(long id);

}