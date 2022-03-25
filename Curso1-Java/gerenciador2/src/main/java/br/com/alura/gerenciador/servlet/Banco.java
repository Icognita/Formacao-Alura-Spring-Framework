package br.com.alura.gerenciador.servlet;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	 
	private static List<Empresa> lista=new ArrayList<>();
	private static Integer chaveSequencial=1;
	
	
	
	
	
	
	static {
		
		//criando as emprsas
		Empresa  empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		
		Empresa  empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		
		//add as emrpesas na lista
		
		lista.add(empresa);
		lista.add(empresa2);
	}
	

	public void adciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);// da classe acessa a lista e add a empresa
		
		System.out.println(lista);
	}
		
		
     public List<Empresa> getEmpresa(){
    	 return Banco.lista; // da clase de volve a lista com a emrpesa
     }


	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp =it.next();
			
			if(emp.getId() == id) {
				it.remove();
				
			}
		}
		
		
			
		}


	public Empresa buscaEmpresaPelaId(Integer id) {
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

		
	}
		


