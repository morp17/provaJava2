package entidade;


import java.util.List;

public class Equipe {
	
	private String nome;
	private String descricao;
	private Departamento departamento;
	
	private List<Funcionario> funcionario;
	private List<Projeto> projeto;
	
	public Equipe() {
		// TODO Auto-generated constructor stub
	}
	
	
public void alocaFuncionario(Funcionario funcionario, Projeto projeto ){
		
		
		
	}
	
		
	@Override
	public String toString() {
		return "\n[Equipe] \nNome=" + nome + "\nDescricao=" + descricao + projeto + departamento + funcionario + "\n";
	}



	public Departamento getDepartamento() {
		return departamento;
	}


	
	

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Projeto> getProjeto() {
		return projeto;
	}

	public void setProjeto(List<Projeto> projeto) {
		this.projeto = projeto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((projeto == null) ? 0 : projeto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipe other = (Equipe) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (projeto == null) {
			if (other.projeto != null)
				return false;
		} else if (!projeto.equals(other.projeto))
			return false;
		return true;
	}
	
	
	
	
}
