package br.com.fiap.webservice;

import br.com.fiap.bean.Contato;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface ContatoServer {
	
	@WebMethod String addContact(Contato contato);
	@WebMethod String deleteContact(String email);
	@WebMethod Contato getContact(String email);	
	@WebMethod Contato[] listContacts();
	
}