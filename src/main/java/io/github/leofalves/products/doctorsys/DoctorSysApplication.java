package io.github.leofalves.products.doctorsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoctorSysApplication {

/*
	@Bean
	public CommandLineRunner init(@Autowired PersonRepository personRep) {
		return args -> {
			System.out.println("Saving persons...");
			Person person = new Person(null, "Leo", (long) 125, DocumentType.RG, LocalDate.parse("1976-06-19"));
			personRep.salvar(person);
			
			Person person2 = new Person(null, "Elaine", (long) 155, DocumentType.CPF, LocalDate.parse("1973-03-19"));
			personRep.salvar(person2);
			
			System.out.println("Listing all persons...");
			List<Person> persons = personRep.obterTodos();
			persons.forEach(System.out::println);

//			System.out.println("Updating persons...");
//			persons.forEach(p -> {
//				p.setName(p.getName().concat(" - Atualizado"));
//				personRep.atualizar(p);
//			});
//			
//			System.out.println("Getting per name...");
//			personRep.obterPorNome("Leo").forEach(System.out::println);
//			
//			System.out.println("Getting all...");
//			persons = personRep.obterTodos();
//			persons.forEach(System.out::println);
//			
//			System.out.println("Deleting all...");
//			personRep.obterTodos().forEach(p -> {
//				personRep.deletar(p.getId());
//			});
//			
//			
//			System.out.println("Getting all...");
//			persons = personRep.obterTodos();
//			if (persons.isEmpty()) {
//				System.out.println("No person selected");
//			}else {
//				persons.forEach(System.out::println);	
//			}
//									
		};
	}
*/	
	public static void main(String[] args) {
		SpringApplication.run(DoctorSysApplication.class, args);
	}

}
