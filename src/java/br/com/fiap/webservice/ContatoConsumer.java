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

    ContatoServer cs;

    public ContatoConsumer() {
        URL url = null;

        try {
            url = new URL("http://localhost:9107/contatos?wsdl");
        } catch (MalformedURLException ex) {
            Logger.getLogger(ContatoConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }

        QName qname = new QName("http://webservice.fiap.com.br/", "ContatoServerImplService");
        Service service = Service.create(url, qname);
        cs = service.getPort(ContatoServer.class);

    }

    public Contato getContato(Contato contato) {

        Contato c = cs.getContact(contato);
        System.out.println(c.getEmail());
        System.out.println(c.getNome());
        return c;
    }

    public String removeContato(Contato contato) {
        cs.deleteContact(contato);
        return "deletado";
    }

    public String addContact(Contato contato) {
        cs.addContact(contato);
        return "ok";
    }
    
    public Contato[] list(){   
        return cs.listContacts();  
    }
}