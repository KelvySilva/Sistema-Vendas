package br.com.sistemaVendas;

public class VendGrupoC extends Vendedor{

	@Override
	public int multiplicar() {
		// TODO Auto-generated method stub
		return this.getSalario()+((this.getSalario()*15)/100);
	}

}
