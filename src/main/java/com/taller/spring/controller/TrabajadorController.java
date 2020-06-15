package com.taller.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller.spring.model.Trabajador;
import com.taller.spring.service.TrabajadorService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class TrabajadorController {

   @Autowired
   private TrabajadorService trabajadorService;

   /*---Add new book---*/
   @PostMapping("/trabajador")
   public ResponseEntity<?> save(@RequestBody Trabajador trabajador) {
      long id = trabajadorService.save(trabajador);
      return ResponseEntity.ok().body("New Trabajador has been saved with ID:" + id);
   }

   /*---Get a book by id---*/
   @GetMapping("/trabajador/{id}")
   public ResponseEntity<Trabajador> get(@PathVariable("id") long id) {
	  Trabajador trabajador = trabajadorService.get(id);
      return ResponseEntity.ok().body(trabajador);
   }

   /*---get all books---*/
   @GetMapping("/trabajador")
   public ResponseEntity<List<Trabajador>> list() {
      List<Trabajador> trabajadors = trabajadorService.list();
      return ResponseEntity.ok().body(trabajadors);
   }

   /*---Update a book by id---*/
   @PutMapping("/trabajador/{id}")
   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Trabajador trabajador) {
	   trabajadorService.update(id, trabajador);
      return ResponseEntity.ok().body("Trabajador has been updated successfully.");
   }

   /*---Delete a book by id---*/
   @DeleteMapping("/trabajador/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
	   trabajadorService.delete(id);
      return ResponseEntity.ok().body("Trabajador has been deleted successfully.");
   }
}