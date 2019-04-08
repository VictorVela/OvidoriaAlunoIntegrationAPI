package br.com.opet.edu.alunoopet.service;

import br.com.opet.edu.alunoopet.model.Aluno;
import br.com.opet.edu.alunoopet.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> findAll() {return alunoRepository.findAll();}

    public Aluno findByMatricula(Long matricula) {return alunoRepository.findById(matricula).get();}

    public Aluno saveOrUpdate (Aluno aluno){
        if (alunoRepository.save(aluno) != null){
            alunoRepository.save(aluno);
            return aluno;
        }

        alunoRepository.save(aluno);
        return aluno;
    }

    public String delete(Long id){
        if(alunoRepository.existsById(id)){
            alunoRepository.deleteById(id);
            return !alunoRepository.existsById(id) ? "Objeto deletado" : "Erro no delete";
        }

        return  "Não deu boa";
    }
}
