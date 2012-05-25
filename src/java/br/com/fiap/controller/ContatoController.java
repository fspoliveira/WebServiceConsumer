/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.controller;

import br.com.fiap.bean.Contato;
import br.com.fiap.webservice.ContatoConsumer;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author fsantiago
 */

@ManagedBean(name="convenioC")
@SessionScoped
public class ContatoController {
    
    public Contato getContato(String email){
         ContatoConsumer cc = new ContatoConsumer();
         Contato c = new Contato();
         c = cc.getContato(email);
         return c;
    }
   
     public String deleteContato(String email){
         ContatoConsumer cc = new ContatoConsumer();
         cc.removeContato(email);
         return "";
         
    }
    
}
