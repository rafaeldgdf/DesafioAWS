package aws.generation.recife.escola.controllers;

import aws.generation.recife.escola.entities.AlunoEntity;
import aws.generation.recife.escola.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController 
@RequestMapping("/aluno")
public class AlunoController {
	
    @Autowired
    private AlunoService alunoService;

    @PostMapping("/incluir") 
    public AlunoEntity incluir(@RequestBody AlunoEntity aluno) {
        return alunoService.salvarAluno(aluno);
    }

    @GetMapping("/{id}")
    public AlunoEntity buscar(@PathVariable Long id) {
        return alunoService.buscarPorId(id);
    }

    @PutMapping("/alterar") 
    public AlunoEntity alterar(@RequestBody AlunoEntity aluno) {
        return alunoService.atualizarAluno(aluno);
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<String> excluir(@PathVariable Long id) {
        AlunoEntity aluno = alunoService.buscarPorId(id);
        alunoService.deletarAluno(id);
        String mensagem = String.format("O aluno %s, de id %d foi deletado com sucesso", aluno.getNome(), id);
        return ResponseEntity.ok(mensagem);
    }

    @GetMapping()
    public List<AlunoEntity> listarTodos() {
        return alunoService.listarTodos();
    }
}
