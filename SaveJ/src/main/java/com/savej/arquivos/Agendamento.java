package com.savej.arquivos;
import java.time.LocalDate;

/*Aqui será a classe que marcará dia de provas,teste e entregas de documentos.
 * 
 */
public class Agendamento {
	private LocalDate data;
	private boolean vale_nota;

	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public boolean isVale_nota() {
		return vale_nota;
	}
	public void setVale_nota(boolean vale_nota) {
		this.vale_nota = vale_nota;
	}
	
	
	
}
