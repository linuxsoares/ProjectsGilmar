package Main;

import java.io.IOException;
import java.sql.SQLException;

import com.sun.org.apache.bcel.internal.generic.LMUL;

import Controller.DadosBD;
import Controller.DadosEMTU;
import Controller.Email;

public class Main {
	
	/**
	 * @param args
	 */
	static String real;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//DadosEMTU dadosEMTU = new DadosEMTU();
		DadosBD db = new DadosBD();
		String[] lm_desc = new String[1100];
		int num = db.executaConsulta().length;
		lm_desc = new String[num];
		lm_desc = db.executaConsulta();
		
		if (lm_desc[0] != null){
			for (int i = 0 ; lm_desc.length >= i; i++) {
				if (lm_desc[i] != null){
					//System.out.println("Onibus: "+lm_desc[i]);	
				}
			}
		}
		Email email = new Email();
		email.enviarEmail(lm_desc);
	}
}
