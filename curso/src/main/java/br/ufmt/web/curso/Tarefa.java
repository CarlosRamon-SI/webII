package br.ufmt.web.curso;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tarefa")
public class Tarefa {
  @Id
  private Long id;
  private String descricao;
  @Column(name = "finalizacao")
  private boolean finalizado;
  @Temporal(TemporalType.DATE)
  @Column(name="data_finalizacao",
   nullable = true)
  private Calendar dataFinalizacao;

  @ManyToOne(cascade = CascadeType.ALL)
  private Disciplina disciplina;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public boolean isFinalizado() {
    return this.finalizado;
  }

  public void setFinalizado(boolean finalizado) {
    this.finalizado = finalizado;
  }

  public Calendar getDataFinalizacao() {
    return this.dataFinalizacao;
  }

  public void setDataFinalizacao(Calendar dataFinalizacao) {
    this.dataFinalizacao = dataFinalizacao;
  }

  public Disciplina getDisciplina() {
    return disciplina;
  }

  public void setDisciplina(Disciplina disciplina) {
    this.disciplina = disciplina;
  }


}
