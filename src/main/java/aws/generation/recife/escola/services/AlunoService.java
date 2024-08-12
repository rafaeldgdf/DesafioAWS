package aws.generation.recife.escola.services;

import aws.generation.recife.escola.entities.AlunoEntity;
import aws.generation.recife.escola.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public AlunoEntity salvarAluno(AlunoEntity aluno) {
        validarAluno(aluno);
        return alunoRepository.save(aluno);
    }

    public AlunoEntity buscarPorId(Long id) {
        return alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno com ID " + id + " não encontrado"));
    }

    public List<AlunoEntity> listarTodos() {
        return alunoRepository.findAll();
    }

    public AlunoEntity atualizarAluno(AlunoEntity aluno) {
        validarAluno(aluno);
        if (aluno.getId() == null) {
            throw new RuntimeException("ID do aluno não pode ser nulo para atualização");
        }
        return alunoRepository.save(aluno);
    }

    public void deletarAluno(Long id) {
        alunoRepository.deleteById(id);
    }

    private void validarAluno(AlunoEntity aluno) {
        if (aluno.getNome() == null || aluno.getNome().trim().isEmpty()) {
            throw new RuntimeException("Nome é obrigatório e não pode ser vazio");
        }
        if (aluno.getNome().length() < 3 || aluno.getNome().length() > 50) {
            throw new RuntimeException("Nome deve ter entre 3 e 50 caracteres");
        }
        if (aluno.getIdade() == null || aluno.getIdade() <= 0) {
            throw new RuntimeException("Idade é obrigatória e deve ser maior que 0");
        }
        if (aluno.getNotaPrimeiroSemestre() == null || aluno.getNotaPrimeiroSemestre() < 0 || aluno.getNotaPrimeiroSemestre() > 10) {
            throw new RuntimeException("Nota do primeiro semestre deve estar entre 0 e 10");
        }
        if (aluno.getNotaSegundoSemestre() == null || aluno.getNotaSegundoSemestre() < 0 || aluno.getNotaSegundoSemestre() > 10) {
            throw new RuntimeException("Nota do segundo semestre deve estar entre 0 e 10");
        }
        if (aluno.getNomeProfessor() == null || aluno.getNomeProfessor().trim().isEmpty()) {
            throw new RuntimeException("Nome do professor é obrigatório e não pode ser vazio");
        }
        if (aluno.getNomeProfessor().length() < 3 || aluno.getNomeProfessor().length() > 50) {
            throw new RuntimeException("Nome do professor deve ter entre 3 e 50 caracteres");
        }
        if (aluno.getNumeroSala() == null || aluno.getNumeroSala().trim().isEmpty()) {
            throw new RuntimeException("Número da sala é obrigatório e não pode ser vazio");
        }
        if (aluno.getNumeroSala().length() < 1 || aluno.getNumeroSala().length() > 10) {
            throw new RuntimeException("Número da sala deve ter entre 1 e 10 caracteres");
        }
    }
}
