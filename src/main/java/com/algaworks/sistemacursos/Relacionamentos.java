package com.algaworks.sistemacursos;

import javax.persistence.*;

public class Relacionamentos {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("Cursos-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();



        entityManager.close();
        entityManagerFactory.close();
    }
}
