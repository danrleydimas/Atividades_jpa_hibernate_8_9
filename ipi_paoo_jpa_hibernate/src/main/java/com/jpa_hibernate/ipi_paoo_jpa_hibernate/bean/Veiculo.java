package com.jpa_hibernate.ipi_paoo_jpa_hibernate.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_veiculo")
public class Veiculo {
	
	@Id
	@GeneratedValue
	private Long id;
	private String marca;
	private String modelo;
	private String cor;
	
	
	@ManyToOne
	private Pessoa pessoas;
	
	//@ManyToMany
	//private List <Reboque> reboques;
	@OneToMany (mappedBy = "veiculo")
	private List <VeiculoXReboque> veiculosReboques;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	 @OneToOne(optional = false)
	   @JoinColumn (name = "id_da_placa_do_veiculo")
	   private Placa placa;
	   public Placa getPlaca() {
		   return placa;
		   }public void setPlaca(Placa placa) 
		   {
			   this.placa = placa;
			   }      
	

}
