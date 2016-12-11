package br.com.sistemaVendas;

public class VendGrupoA extends Vendedor{

	@Override
	public int multiplicar() {
		// TODO Auto-generated method stub
		return this.getSalario()+((this.getSalario()*6)/100);
	}

}
