package aws.generation.recife.escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import aws.generation.recife.escola.entities.AlunoEntity;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {
	
}