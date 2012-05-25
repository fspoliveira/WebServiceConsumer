/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.test;

import br.com.fiap.controller.ContatoController;

/**
 *
 * @author fsantiago
 */
public class TestController {
    
    public static void main(String args[]){
        ContatoController cc = new ContatoController();
        cc.getContato("fspo1@hotmail.com");
    }
        
}
