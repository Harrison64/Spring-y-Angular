package com.taller.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taller.spring.dao.TrabajadorDao;
import com.taller.spring.model.Trabajador;


@Service
@Transactional(readOnly = true)
public class TrabajadorServiceImp implements TrabajadorService {

   @Autowired
   private TrabajadorDao trabajadorDao;

   @Transactional
   @Override
   public long save(Trabajador trabajador) {
      return trabajadorDao.save(trabajador);
   }

   @Override
   public Trabajador get(long id) {
      return trabajadorDao.get(id);
   }

   @Override
   public List<Trabajador> list() {
      return trabajadorDao.list();
   }

   @Transactional
   @Override
   public void update(long id, Trabajador trabajador) {
	   trabajadorDao.update(id, trabajador);
   }

   @Transactional
   @Override
   public void delete(long id) {
	   trabajadorDao.delete(id);
   }

}