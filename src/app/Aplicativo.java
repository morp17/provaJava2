package app;

import java.time.LocalDate;
import java.util.Arrays;

import javax.swing.JOptionPane;

import entidade.Departamento;
import entidade.Dependente;
import entidade.Equipe;
import entidade.Funcionario;
import entidade.Projeto;

public class Aplicativo {
	
	public static void main(String[] args) {
		
		//Referencias
		Departamento departamento;
		Dependente dependente;
		Equipe equipe;
		Funcionario funcionario;
		Projeto projeto;
		
		//Instancia
		
		
		
		//Instancia e dados departamento
		departamento = new Departamento();
		departamento.setSetor("Administrativo");
		departamento.setNomeFantasia("Los Polos Hermanos");
		
		//Instancia e dados dependente
		dependente = new Dependente();
        dependente.setNome("Algusto");
        dependente.setFiliacao("Roberto");
        
        //Instacia e dados de equipe
        equipe = new Equipe();
        equipe.setNome("Vendas e distribuição");
        equipe.setDescricao("Organizar as distribuições e venda de produtos");
        
        //Instancia e dados de funcionarios
        funcionario = new Funcionario();
        funcionario.setMatricula(20);
        funcionario.setNome("Mr.White");
        funcionario.setEmail("white@bol.com.br");
        funcionario.setSalario(1110);
        
        //Instancia e dados de projeto
        projeto = new Projeto();
        projeto.setCodigo(233);
        
        //Não consegui fazer a data funcionar
        projeto.setDataInicioProjeto(LocalDate.now());
        projeto.setDataEntrega(LocalDate.of(2017, 8, 30));
        
        
        //relacionamento entre classes
        equipe.setFuncionario(Arrays.asList(funcionario));
        equipe.setProjeto(Arrays.asList(projeto));
        equipe.setDepartamento(departamento);
        
        funcionario.setEquipe(equipe);
        funcionario.setDependente(Arrays.asList(dependente));
        
        dependente.setFuncionario(funcionario);
        
        projeto.setEquipe(equipe);
        
        departamento.setEquipe(equipe);
        
        
        
        //saida
		JOptionPane.showMessageDialog(null, equipe);
        //System.out.println(equipe);
      
		
		
		
		
		
		
		
		
	
		
	}

}
