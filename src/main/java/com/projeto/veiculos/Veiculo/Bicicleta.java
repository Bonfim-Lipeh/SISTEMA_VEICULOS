package com.projeto.veiculos.Veiculo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("bicicleta")
public class Bicicleta extends Veiculo {

    private String amortecedor;
    private String material;
    private int marcha;
    private String aro;

    

    public Bicicleta(String modelo, int anoFabricacao, String montadora, String cor, int quilometragem, String amortecedor, String material, int marcha, String aro) {
    		// Chamada correta para o construtor da superclasse
    		super(modelo, anoFabricacao, montadora, cor, quilometragem);

    			// Inicialização dos atributos da classe Bicicleta
    			this.amortecedor = amortecedor;
    			this.material = material;
    			this.marcha = marcha;
    			this.aro = aro;
}
    public Bicicleta() { // Construtor vazio (obrigatório para JPA/Hibernate)
        super();
    }
	
	public String getamortecedor() {
		return amortecedor;
	}
	public String getmaterial() {
		return material;
	}
	public int getmarcha() {
		return marcha;
	}
	public String getaro() {
		return aro;
	}
	
@Override
	
	public void acelerar(int aceleracao) {
		if (aceleracao > 0) {
			System.out.println(" A Aceleração da Bicicleta está em:" + aceleracao + "km/h");
			System.out.println("");
		}
		else {
			System.out.println("Aceleração necessita ser maior que 0.");
		}
}


public void Infobike() {
	
	System.out.println("Modelo: " + getmodelo());
	System.out.println("Ano de fabricação: " + super.getanoFabricacao());
	System.out.println("Empresa: " + getmontadora());
	System.out.println("Cor: " + getcor());
	System.out.println("Amortecedor: " + getamortecedor());
	System.out.println("Marcha: " + getmarcha());
	System.out.println("Tamanho do Aro: " + getaro());

}

}