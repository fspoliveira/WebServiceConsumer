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
        
        Contato c = new Contato();
        c.setEmail("fspo1@hotmail.com");
        
        cc.getContato(c);
        // cc.deleteContato("cmarquesani@hotmail.com");

       
        
        c.setEmail("fa10ti01@yahoo.com.br");
        c.setNome("Fatima Pedrazzanni");
       

        cc.getContato(c);

        System.out.println(cc.getListarContatos());
        
      
      
    }
}
