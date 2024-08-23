/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciador;

import classe.Pessoa;
import java.util.List;

/**
 *
 * @author igorxf
 */
public class servicoGerenciador implements gerenciadorPessoa{
    private gerenciadorPessoa gerentep; 
    
    public servicoGerenciador(gerenciadorPessoa gerentep){
        this.gerentep  = gerentep;
    }

    public servicoGerenciador() {
    }
    
    
    
    @Override
    public Pessoa buscar(String  cpf) {
        return gerentep.buscar(cpf);
    }


    @Override
    public void add(Pessoa newPessoa) {
       gerentep.add(newPessoa);
    }

    @Override
    public void atualizar(String cpf, Pessoa newPessoa) {
        gerentep.atualizar(cpf, newPessoa);
        
    }

    @Override
    public void remover(String cpf) {
        gerentep.remover(cpf);
    }
   
}
