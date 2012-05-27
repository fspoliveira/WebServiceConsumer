/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.controller;

import br.com.fiap.bean.Contato;
import br.com.fiap.webservice.ContatoConsumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author fsantiago
 */
@ManagedBean(name = "contatoC")
@SessionScoped
public class ContatoController {

    private Contato contato;
    private DataModel listaContatos;
    

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public DataModel getListaContatos() {
        return listaContatos;
    }

    public void setListaContatos(DataModel listaContatos) {
        this.listaContatos = listaContatos;
    }

    public DataModel getListarContatos() {
        ContatoConsumer cc = new ContatoConsumer();
        Contato[] contatos = cc.list();
        List<Contato> contact = new ArrayList<Contato>();
        contact.addAll(Arrays.asList(contatos));
        listaContatos = new ListDataModel(contact);

        return listaContatos;
    }

    public Contato getContato(Contato contato) {
        ContatoConsumer cc = new ContatoConsumer();
        Contato c;
        c = cc.getContato(contato);
        return c;
    }

    public String excluirContato() {
        Contato contatoTemp = (Contato) (listaContatos.getRowData());
        ContatoConsumer cc = new ContatoConsumer();
        cc.removeContato(contatoTemp);
        return "contato";
    }

    public void adicionarContato(ActionEvent actionEvent) {
        ContatoConsumer cc = new ContatoConsumer();
        cc.addContact(contato);
    }

    public void prepararAdicionarContato(ActionEvent actionEvent) {
        contato = new Contato();
    }

    public void prepararAlterarContato(ActionEvent actionEvent) {
        contato = (Contato) (listaContatos.getRowData());
    }
}