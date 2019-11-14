package com.jpa_hibernate.ipi_paoo_jpa_hibernate.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_veiculoXreboque")
public class VeiculoXReboque {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Date data;
	
	@ManyToOne
	private Veiculo veiculo;
	@ManyToOne 
	private Reboque reboque;
	

}
