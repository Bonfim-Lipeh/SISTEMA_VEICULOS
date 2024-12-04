package com.projeto.veiculos.Veiculo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="automovel")
public class Automovel extends Veiculo {

    private int passagMax;
    private String freio;
    private String airbag;

    

    public Automovel(String modelo, int anoFabricacao, String marca, String cor, int quilometragem, int passagMax, String freio, String airbag) {
        super(modelo, anoFabricacao, marca, cor, quilometragem); // Corrija a chamada ao construtor da superclasse se necessário
        this.passagMax = passagMax;
        this.freio = freio;
        this.airbag = airbag;
    }
    
 // Construtor vazio (obrigatório para JPA/Hibernate)
    public Automovel() {
        super();
    }

    public int getPassagMax() { // Corrija o nome do método para seguir a convenção
        return passagMax;
    }

    public String getFreio() {
        return freio;
    }

    public String getAirbag() {
        return airbag;
    }
	
	
	public String getfreio() {
		return freio;
	}
	
	public String getairbag() {
		return airbag;
	}
	
@Override
	
	public void acelerar(int aceleracao) {
		if (aceleracao > 0) {
			System.out.println("A Aceleração do carro está em:" + aceleracao + "km/h");
			System.out.println("");
		}
		else {
			System.out.println("Aceleração necessita ser maior que 0.");
		}
}

public void Infoauto() {
	
	System.out.println("Modelo: " + getmodelo());
	System.out.println("Ano de fabricação: " + getanoFabricacao());
	System.out.println("Empresa: " + getmontadora());
	System.out.println("Cor: " + getcor());
	System.out.println("Quilometragem: " + getquilometragem());
	
	System.out.println("Lugares: " + getPassagMax());
	System.out.println("Tipo de freio: " + getfreio());
	System.out.println("Airbag: " + getairbag());
}

}
