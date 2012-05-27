/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.test;

import br.com.fiap.bean.Contato;
import br.com.fiap.controller.ContatoController;

/**
 *
 * @author fsantiago
 */

public class TestController {

    public static void main(String args[]) {
        ContatoController cc = new ContatoController();
        
        cc.getContato("fspo1@hotmail.com");
        // cc.deleteContato("cmarquesani@hotmail.com");

        Contato c = new Contato();
        
        c.setEmail("fa10ti01@yahoo.com.br");
        c.setNome("Fatima Pedrazzanni");
        cc.addContact(c);

        cc.getContato("fa10ti01@yahoo.com.br");

        System.out.println(cc.list());
        
      
      
    }
}
