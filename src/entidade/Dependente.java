package entidade;

public class Dependente {

	private String nome;
	private String filiacao;
	
	private Funcionario funcionario;
	
	
	public Dependente() {
		// TODO Auto-generated constructor stub
	}
	
	


	@Override
	public String toString() {
		return "\n[Dependente] \nNome=" + nome + "\nFiliação=" + filiacao + "\n" ;
	}




	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getFiliacao() {
		return filiacao;
	}


	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((filiacao == null) ? 0 : filiacao.hashCode());
		result = prime * result + ((funcionario == null) ? 0 : funcionario.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Dependente other = (Dependente) obj;
		if (filiacao == null) {
			if (other.filiacao != null)
				return false;
		} else if (!filiacao.equals(other.filiacao))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
}
