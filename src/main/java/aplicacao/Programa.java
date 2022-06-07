package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import aula1ii.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		//ctrl+shift+o para importar automaticamente
		//Pessoa p1= new Pessoa(null,"Joana","joana@email.com");
		//Pessoa p2= new Pessoa(null,"Carlos","Carlos@email.com");
		//Pessoa p3= new Pessoa(null,"Ikki","ikki@email.com");
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//achando pela id
		Pessoa p= em.find(Pessoa.class, 2);
		System.out.println(p);
		
		//em.getTransaction().begin();
	    //em.persist(p1);
		//em.persist(p2);
		//em.persist(p3);
		//em.getTransaction().commit();
		
		em.close();
		emf.close();
		System.out.println("Operação finalizada");
		
		//System.out.println(p1);
		//System.out.println(p2);
		//System.out.println(p3);
	}
}
