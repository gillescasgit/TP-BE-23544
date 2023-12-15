package ar.com.codoacodo.repository;

import java.time.LocalDate;
import java.util.List;

import ar.com.codoacodo.entity.Orador;

public class MainOradorRepository {

	 public static void main(String[] args) {
		
		 OradorRepository repository = new MySqlOradorRepository();
		 
		 Orador orador1 =repository.getById(3L);
		 
		 orador1.setApellido("ILLESCAS");
		 orador1.setNombre("Gonzalo");
		 orador1.setTema("c++");
		 
		 repository.update(orador1);
		 
		 System.out.println(repository.findAll());
		 
	}
}
