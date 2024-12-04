package com.projeto.veiculos.Veiculo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 

import javax.persistence.Table;

@Entity
@Table(name = "veiculos")
public class Veiculo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Utilizar Long para IDs auto-incrementados
    @Column
    private String modelo;
    @Column
    private int anoFabricacao; // Nome mais claro para o atributo
    @Column
    private String montadora;
    @Column
    private String cor;
    @Column
    private int quilometragem; // Nome mais claro para o atributo
    
   

    // Construtor com todos os argumentos
    public Veiculo(String modelo, int anoFabricacao, String montadora, String cor, int quilometragem) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.montadora = montadora;
        this.cor = cor;
        this.quilometragem = quilometragem;
    }
    
 public Veiculo() {
    	
    }
	
	/**
     * Obtém o ID do contato.
     *
     * @return O ID do contato.
     */
	public Long getId() {
		return id;
	}
    /**
     * Define o ID do contato.
     *
     * @param id O novo ID do contato.
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * Obtém o modelo do veiculo.
     *
     * @return O modeo do veiculo.
     */
	
	public String getmodelo() {
		return modelo;
	}
	
	/**
     * Obtém o ano de fabriacação do veiculo.
     *
     * @return o ano de fabricação do veiculo.
     */

	public int getanoFabricacao() {
		return anoFabricacao;
	}
	
	/**
     * Obtém a montadora do veiculo.
     *
     * @return a montadora do veiculo.
     */
	
	public String getmontadora() {
		return montadora;
	}
	
	/**
     * Obtém a cor do veiculo.
     *
     * @return a cor do veiculo.
     */
	
	public String getcor() {
		return cor;
	}
	
	/**
     * Obtém a quilometragem do veiculo.
     *
     * @return a quilometragem do veiculo.
     */
	public int getquilometragem() {
		return quilometragem;
	}
	
	public void acelerar(int aceleracao) {
		if (aceleracao > 0) {
			quilometragem += aceleracao;
			System.out.println(" A Aceleração do veículo está em:" + aceleracao + "km/h");
		}
		else {
			System.out.println("Aceleração necessita ser maior que 0.");
		}
	}
	

	
}
