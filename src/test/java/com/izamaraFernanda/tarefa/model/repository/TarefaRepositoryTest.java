package com.izamaraFernanda.tarefa.model.repository;

import org.junit.jupiter.api.Test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.izamaraeFernanda.tarefa.entity.Tarefa;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
public class TarefaRepositoryTest {
	

	@Autowired
	TestEntityManager entityManager;
	
	
	
	@Test
	public void devePersistirUmUsuarioNaBaseDeDados() {
		//cenario
		Tarefa tarefa = criarTarefa();
		
		//ação
		Tarefa tarefaSalvo = entityManager.persist(tarefa);
		
		//verificação
		Assertions.assertThat(tarefaSalvo.getId()).isNotNull();
	}
	
	
	
	
	public static Tarefa criarTarefa() {
		return Tarefa
				.builder()
				.nome("Tarefa Xandão")
				.descricao("Criar CRUD com spring boot")
				.status("em execução")
				.observacao("muito dificil")
				.data_criacao("22/04/2024")
				.data_atualizacao("22/04/2024")
				.build();
	}
	
}

