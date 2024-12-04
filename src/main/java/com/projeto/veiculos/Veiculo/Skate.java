package com.projeto.veiculos.Veiculo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("skate")
public class Skate extends Veiculo {
    public enum TipoRodas { VERTICAL, STREET, LONGBOARD, CRUISER, PROFISSIONAL  } // Enum para tipos de rodas

    @Column
    private TipoRodas rodas;
    @Column
    private double tamanho; // em polegadas
    @Column
    private String rigidez;
    


    public Skate(String modelo, int anoFabricacao, String montadora, String cor, TipoRodas rodas, double tamanho, String rigidez) {
        super(modelo, anoFabricacao, montadora, cor, 0); // Kilometragem sempre zero
        this.rodas = rodas;
        this.tamanho = tamanho;
        this.rigidez = rigidez;
    }
    // Construtor vazio (obrigatório para JPA/Hibernate)
    public Skate() {}

	
	public TipoRodas getRodas() {
		return rodas;
	}
	
	public double getTamanho() {
		return tamanho;
	}
	
	public String getRigidez() {
		return rigidez;
	}
	
	
@Override
	
	public void acelerar(int aceleracao) {
		if (aceleracao > 0) {
			System.out.println(" A Aceleração do Skate está em:" + aceleracao + "km/h");
			System.out.println("");
		}
		else {
			System.out.println("Aceleração necessita ser maior que 0.");
		}
}




public void Infoskate() {
    System.out.println("Modelo: " + getmodelo());
    System.out.println("Ano de fabricação: " + getanoFabricacao());
    System.out.println("Tipo de rodas (VERTICAL, STREET, LONGBOARD, CRUISER, PROFISSIONAL) " + getRodas());
    System.out.println("Empresa: " + getmontadora());
    System.out.println("Cor: " + getcor());
    System.out.println("Tamanho: " + getTamanho() + " polegadas");
    System.out.println("Rigidez: " + getRigidez() + "A");
}
}