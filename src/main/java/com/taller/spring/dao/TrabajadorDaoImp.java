package com.taller.spring.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.taller.spring.model.Trabajador;

@Repository
public class TrabajadorDaoImp implements TrabajadorDao{

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public long save(Trabajador trabajador) {
      sessionFactory.getCurrentSession().save(trabajador);
      return trabajador.getId();
   }

   @Override
   public Trabajador get(long id) {
      return sessionFactory.getCurrentSession().get(Trabajador.class, id);
   }

   @Override
   public List<Trabajador> list() {
      List<Trabajador> list = sessionFactory.getCurrentSession().createQuery("from Trabajador").list();
      return list;
   }

   @Override
   public void update(long id, Trabajador trabajador) {
      Session session = sessionFactory.getCurrentSession();
      Trabajador trabajador2 = session.byId(Trabajador.class).load(id);
      trabajador2.setCodigo(trabajador.getCodigo());
      trabajador2.setNombre(trabajador.getNombre());
      trabajador2.setApellido(trabajador.getApellido());
      trabajador2.setTelefono(trabajador.getTelefono());
      trabajador2.setCargo(trabajador.getCargo());
      trabajador2.setSalario(trabajador.getSalario());
      session.flush();
   }

   @Override
   public void delete(long id) {
	   Trabajador trabajador = sessionFactory.getCurrentSession().byId(Trabajador.class).load(id);
      sessionFactory.getCurrentSession().delete(trabajador);
   }

}