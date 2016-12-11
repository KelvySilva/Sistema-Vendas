package br.com.sistemaVendas;

import java.util.ArrayList;

import java.util.List;

public class TelaPrincipal {
	
	void mostraTudo(List<Calculador> lista){
		
		for (Calculador c : lista) {
			c.multiplicar();
			System.out.println(c.getClass().getSimpleName()+" salario "+c.multiplicar());
		}
	}
	
	public static void main(String[] args) {
		
		Vendedor v1 = new VendGrupoA();
		Vendedor v2 = new VendGrupoA();
		Vendedor v3 = new VendGrupoA();
		Vendedor v4 = new VendGrupoA();
		Vendedor v5 = new VendGrupoA();
		Vendedor v6 = new VendGrupoB();
		Vendedor v7 = new VendGrupoB();
		Vendedor v8 = new VendGrupoB();
		Vendedor v9 = new VendGrupoB();
		Vendedor v10 = new VendGrupoB();
		Vendedor v11 = new VendGrupoB();
		Vendedor v12 = new VendGrupoB();
		Vendedor v13 = new VendGrupoC();
		Vendedor v14 = new VendGrupoC();
		Vendedor v15 = new VendGrupoC();
		Vendedor v16 = new VendGrupoC();
		Vendedor v17 = new VendGrupoC();
		Vendedor v18 = new VendGrupoC();
		Vendedor v19 = new VendGrupoC();
		Vendedor v20 = new VendGrupoC();
		
		v1.setSalario(200);
		v2.setSalario(200);
		v3.setSalario(200);
		v4.setSalario(200);
		v5.setSalario(200);
		v6.setSalario(200);
		v7.setSalario(200);
		v8.setSalario(200);
		v9.setSalario(200);
		v10.setSalario(200);
		v11.setSalario(200);
		v12.setSalario(200);
		v13.setSalario(200);
		v14.setSalario(200);
		v15.setSalario(200);
		v16.setSalario(200);
		v17.setSalario(200);
		v18.setSalario(200);
		v19.setSalario(200);
		v20.setSalario(200);
		
		List<Calculador> lista = new ArrayList<>();
		lista.add(v1);
		lista.add(v2);
		lista.add(v3);
		lista.add(v4);
		lista.add(v5);
		lista.add(v6);
		lista.add(v7);
		lista.add(v8);
		lista.add(v9);
		lista.add(v10);
		lista.add(v11);
		lista.add(v12);
		lista.add(v13);
		lista.add(v14);
		lista.add(v15);
		lista.add(v16);
		lista.add(v17);
		lista.add(v18);
		lista.add(v19);
		lista.add(v20);
		
		TelaPrincipal p = new TelaPrincipal();
				p.mostraTudo(lista);
		
	}

}
