package br.com.caelum.treinamentodev.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.caelum.treinamentodev.models.Sala;

@Repository
@Transactional
public class SalaDao {

	@PersistenceContext
	private EntityManager em;

	public void salva(Sala sala) {
		em.persist(sala);		
	}

}
