package com.projeto.veiculos.Veiculo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("motocicletas")
public class Motocicletas extends Veiculo {
	
	private String cilindradas;
	private String torque;
	
	
	
	// Construtor com parâmetros
    public Motocicletas(String modelo, int anoFabricacao, String montadora, String cor, int km, String cilindradas, String torque) {
        super(modelo, anoFabricacao, montadora, cor, km);
        this.cilindradas = cilindradas;
        this.torque = torque;
    }
    
 // Construtor vazio (obrigatório para JPA/Hibernate)
 	public Motocicletas() {}
	
	public String getcilindradas() {
		return cilindradas;
	}
	
	public String gettorque() {
		return torque;
	}

	@Override
	
	public void acelerar(int aceleracao) {
		if (aceleracao > 0) {
			System.out.println(" A Aceleração da moto está em:" + aceleracao + "km/h");
			System.out.println("");
		}
		else {
			System.out.println("Aceleração necessita ser maior que 0.");
		}

	}
	
	public void Infomoto() {
		
		System.out.println("Modelo: " + getmodelo());
		System.out.println("Ano de fabricação: " + getanoFabricacao());
		System.out.println("Empresa: " + getmontadora());
		System.out.println("Cor: " + getcor());
		System.out.println("Quilometragem: " + getquilometragem());
		System.out.println("Cilindradas: " + getcilindradas());
		System.out.println("Torque: " + gettorque());
	}
}
