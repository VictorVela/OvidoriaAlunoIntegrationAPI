package br.com.opet.edu.alunoopet.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "ALUNO")
public class Aluno {

    @Id
    private Long matricula;

    @NonNull
    private String nome;

    @NonNull
    private String curso;

    @NonNull
    private String periodo;

    @NonNull
    private String unidade;

    @NonNull
    private String turno;
}
