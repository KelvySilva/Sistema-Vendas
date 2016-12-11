package br.com.sistemaVendas;

public abstract class Vendedor extends Pessoa implements Calculador {
	
	int salario;

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

}
