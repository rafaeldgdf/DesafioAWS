package aws.generation.recife.escola.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Aluno")
public class AlunoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_aluno", nullable = false)
    private Long id;
    
    @NotEmpty(message = "Nome não pode estar vazio")
    @Size(min = 3, max = 50, message = "Nome deve ter entre 3 e 50 caracteres")
    @Column(nullable = false)
    private String nome;
    
    @NotNull(message = "Idade não pode ser nula")
    @Column(nullable = false)
    private Integer idade;
    
    @NotNull(message = "Nota do primeiro semestre não pode ser nula")
    @Column(name = "nota1", nullable = false)
    private Double notaPrimeiroSemestre;
    
    @NotNull(message = "Nota do segundo semestre não pode ser nula")
    @Column(name = "nota2", nullable = false)
    private Double notaSegundoSemestre;
    
    @NotEmpty(message = "Nome do professor não pode estar vazio")
    @Size(min = 3, max = 50, message = "Nome do professor deve ter entre 3 e 50 caracteres")
    @Column(nullable = false)
    private String nomeProfessor;
    
    @NotEmpty(message = "Número da sala não pode estar vazio")
    @Size(min = 1, max = 10, message = "Número da sala deve ter entre 1 e 10 caracteres")
    @Column(nullable = false)
    private String numeroSala;
}
