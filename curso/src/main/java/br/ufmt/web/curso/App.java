package br.ufmt.web.curso;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = 
          Persistence.
            createEntityManagerFactory("tarefas");
        EntityManager em = 
          emf.createEntityManager();

        Disciplina d = new Disciplina();
        d.setNome("Web II");
        
        Tarefa t = new Tarefa();
        t.setId(1l);
        t.setDescricao("Tarefa 1");
        t.setFinalizado(false);
        t.setDataFinalizacao(
          Calendar.getInstance()
        );
        t.setDisciplina(d);

        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
