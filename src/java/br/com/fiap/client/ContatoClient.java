package br.com.fiap.client;

import br.com.fiap.bean.Contato;
import br.com.fiap.webservice.ContatoServer;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class ContatoClient {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("http://localhost:9107/contatos?wsdl");		
		QName qname = new QName("http://webservice.fiap.com.br/", "ContatoServerImplService");
		Service service = Service.create(url, qname);
		ContatoServer cs = service.getPort(ContatoServer.class);
                Contato cteste = new Contato("fspo1@hotmail.com");
                
                Contato c = cs.getContact(cteste);	     
                System.err.println(c.getNome());
	}

}
