/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.webservice;

import br.com.fiap.bean.Contato;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author fsantiago
 */
public class ContatoConsumer {

    public Contato getContato(String email) {
        URL url = null;
        
        try {
            url = new URL("http://localhost:9104/contatos?wsdl");
        } catch (MalformedURLException ex) {
            Logger.getLogger(ContatoConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        QName qname = new QName("http://webservice.fiap.com.br/", "ContatoServerImplService");
        Service service = Service.create(url, qname);
        ContatoServer cs = service.getPort(ContatoServer.class);
        Contato c = cs.getContact(email);
        System.out.println(c.getEmail());
        System.out.println(c.getNome());
        
        return c;
    }
}
