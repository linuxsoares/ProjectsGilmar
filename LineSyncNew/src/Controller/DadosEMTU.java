package Controller;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DadosEMTU {
	
	Elements valor;
	String link = "http://www.emtu.sp.gov.br//Sistemas/linha/";
	int count = 0;
	String[] valores;
	String valorReal;
	Document doc, doc1;
	
	public void buscaDados(String linha) throws IOException{
		
		doc = Jsoup.connect("http://www.emtu.sp.gov.br//Sistemas/linha/buscanumero.htm?numlinha="+linha+"&pag=buscanumero.htm").get();
		link += doc.getElementsByClass("link10").attr("href");
		doc1 = Jsoup.connect(link).get();
		Elements teste = doc1.getElementsByClass("destaque2");
		for(Element elemento: teste){
			if(elemento.text().contains("R$")){
				//System.out.println(elemento.text().substring(19, elemento.text().length()));
			}
		}
	}
}
