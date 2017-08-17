package entidade;

import java.time.LocalDate;

public class Projeto {
	
	private int codigo;
	private LocalDate dataInicioProjeto;
    private LocalDate dataEntrega;
    
    private Equipe equipe;
    
    public Projeto() {
		// TODO Auto-generated constructor stub
	}
    
    

	@Override
	public String toString() {
		return "\n[Projeto] \nCodigo=" + codigo + "\nDataInicioProjeto=" + dataInicioProjeto + "\nDataEntrega=" + dataEntrega + "\n";
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public LocalDate getDataInicioProjeto() {
		return dataInicioProjeto;
	}

	public void setDataInicioProjeto(LocalDate dataInicioProjeto) {
		this.dataInicioProjeto = dataInicioProjeto;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((dataEntrega == null) ? 0 : dataEntrega.hashCode());
		result = prime * result + ((dataInicioProjeto == null) ? 0 : dataInicioProjeto.hashCode());
		result = prime * result + ((equipe == null) ? 0 : equipe.hashCode());
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
		Projeto other = (Projeto) obj;
		if (codigo != other.codigo)
			return false;
		if (dataEntrega == null) {
			if (other.dataEntrega != null)
				return false;
		} else if (!dataEntrega.equals(other.dataEntrega))
			return false;
		if (dataInicioProjeto == null) {
			if (other.dataInicioProjeto != null)
				return false;
		} else if (!dataInicioProjeto.equals(other.dataInicioProjeto))
			return false;
		if (equipe == null) {
			if (other.equipe != null)
				return false;
		} else if (!equipe.equals(other.equipe))
			return false;
		return true;
	}
   
}
