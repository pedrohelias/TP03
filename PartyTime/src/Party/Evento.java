package Party;

import java.util.Date;

public class Evento {
	protected String nome;
	protected Lista[] list1 = new Lista[40];
	protected Convidado convidado;
	protected Date data;
	protected String tempo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Lista[] getList1() {
		return list1;
	}
	public void setList1(Lista[] list1) {
		this.list1 = list1;
	}
	public Convidado getConvidado() {
		return convidado;
	}
	public void setConvidado(Convidado convidado) {
		this.convidado = convidado;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	
	
	
	
	
	
		
	
	

	
	
	
}
