package br.com.opet.edu.alunoopet.repository;

import br.com.opet.edu.alunoopet.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
}
