package br.com.sistemaVendas;

public class VendGrupoB extends Vendedor{

	@Override
	public int multiplicar() {
		// TODO Auto-generated method stub
		return this.getSalario()+((this.getSalario()*10)/100);
	}

}
