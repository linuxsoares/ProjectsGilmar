package br.com.itinerario.vo;

public class Onibus {
	
	int id;
	String descricao_ida;
	String descricao_volta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao_ida() {
		return descricao_ida;
	}
	public void setDescricao_ida(String descricao_ida) {
		this.descricao_ida = descricao_ida;
	}
	public String getDescricao_volta() {
		return descricao_volta;
	}
	public void setDescricao_volta(String descricao_volta) {
		this.descricao_volta = descricao_volta;
	}
}
