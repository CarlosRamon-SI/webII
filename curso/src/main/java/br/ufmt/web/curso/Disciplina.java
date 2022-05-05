package br.ufmt.web.curso;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_id_disciplina", allocationSize = 1)
public class Disciplina {
    
    @Id
    @GeneratedValue(generator = "seq_id_disciplina", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "disciplina")
    private List<Tarefa> tarefas;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Tarefa> getTarefas() {
        return tarefas;
    }
    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
    
}
