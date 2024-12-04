package com.projeto.veiculos.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence; 


import com.projeto.veiculos.Veiculo.Automovel;
import com.projeto.veiculos.Veiculo.Bicicleta;
import com.projeto.veiculos.Veiculo.Caminhao;
import com.projeto.veiculos.Veiculo.Motocicletas;
import com.projeto.veiculos.Veiculo.Skate;

public class Main {

    public static void main(String[] args) {
    	
        Automovel carro = new Automovel("Gol", 2023, "Volkswagen", "Prata", 10000, 5, "ABS", "Duplo");
        
        Motocicletas moto = new Motocicletas("CBX 1000", 2022, "Honda", "Preta", 5000, "1000cc", "Alto");
        
        Caminhao caminhao = new Caminhao("AMG", 2021, "Mercedes", "Branco", 20000, 6, 15000);
        
        Skate skate = new Skate("Street", 2020, "Penny", "Azul", com.projeto.veiculos.Veiculo.Skate.TipoRodas.STREET, 8, "PU"); // Corrigido o tipo de roda

        Bicicleta bicicleta = new Bicicleta("Velox", 2022, "Caloi", "Vermelha", 500, "Suspensão", "Alumínio", 21, "26");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("VeiculoPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Criando objetos e persistindo no banco de dados
        em.persist(carro);

        em.persist(moto);

        em.persist(caminhao);

        em.persist(skate);

        em.persist(bicicleta);

        em.getTransaction().commit();

        // Fechando o EntityManager e EntityManagerFactory
        
    }
}
