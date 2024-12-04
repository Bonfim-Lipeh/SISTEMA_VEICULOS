package com.projeto.veiculos.Veiculo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("caminhao")
public class Caminhao extends Veiculo {

    private int numeroDeEixos;
    private double pesoBruto; // Considerando peso em toneladas
    
 

    public Caminhao(String modelo, int anoFabricacao, String montadora, String cor, int quilometragem, int numeroDeEixos, double pesoBruto) {
        super(modelo, anoFabricacao, montadora, cor, quilometragem);
        this.numeroDeEixos = numeroDeEixos;
        this.pesoBruto = pesoBruto;
    }
    
 // Construtor vazio (obrigatório para JPA/Hibernate)
    public Caminhao() {
    	
    }

    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }

    public double getPesoBruto() {
        return pesoBruto;
    }

	
@Override
	
	public void acelerar(int aceleracao) {
		if (aceleracao > 0) {
			System.out.println(" A Aceleração do Caminhão está em:" + aceleracao + "km/h");
			System.out.println("");
		}
		else {
			System.out.println("Aceleração necessita ser maior que 0.");
		}
}

public void Infocami() {
	
	System.out.println("Modelo: " + getmodelo());
	System.out.println("Ano de fabricação: " + getanoFabricacao());
	System.out.println("Empresa: " + getmontadora());
	System.out.println("Cor: " + getcor());
	System.out.println("Quilometragem: " + getquilometragem());
	System.out.println("Quantidade de eixos: " + getNumeroDeEixos());
	System.out.println("Peso Bruto: " + getPesoBruto());
}
}