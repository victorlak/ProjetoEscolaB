/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gerenciador;

import classe.Pessoa;
import java.util.List;

/**
 *
 * @author igorxf
 */
public interface gerenciadorPessoa {
    public Pessoa buscar(String cpf);
    public void add(Pessoa newPessoa);
    public void atualizar(String cpf, Pessoa newPessoa);
    public void remover(String cpf);
}
