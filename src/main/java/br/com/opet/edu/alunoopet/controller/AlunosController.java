package br.com.opet.edu.alunoopet.controller;

import br.com.opet.edu.alunoopet.model.Aluno;
import br.com.opet.edu.alunoopet.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

    @Autowired
    AlunoService alunoService;

    @GetMapping
    public List<Aluno> findAll() {return alunoService.findAll();}

    @GetMapping("/{matricula}")
    public Aluno findByMatricula(@PathVariable Long matricula) {return alunoService.findByMatricula(matricula);}

    @PostMapping
    public Aluno create (@RequestBody Aluno aluno) {return alunoService.saveOrUpdate(aluno);}

    @DeleteMapping("/{matricula}")
    public String delete(@PathVariable Long matricula){
        return alunoService.delete(matricula);

    }
}
