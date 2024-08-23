/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciador;

import classe.Pessoa;
import classe.Professor;
import file.filePersistence;
import file.serializadorCSVProf;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author  igorxf
 */
public class gerenciadorProfessor implements gerenciadorPessoa{
    private List<Professor> profs;

    public gerenciadorProfessor() {
        this.profs = new ArrayList<>();  
    }
    
     @Override
    public Professor buscar(String cpf) {
        for (Professor prof : profs) {
            if (prof.getCpf().equals(cpf)) {
                return prof;
            }
        }
        return null;
    }

    @Override
    public void add(Pessoa newPessoa) {
        if (newPessoa instanceof Professor) {
            profs.add((Professor) newPessoa);
        } else {
            throw new IllegalArgumentException("A pessoa deve ser um Professor.");
        }
    }


    @Override
    public void atualizar(String cpf, Pessoa newPessoa) {
        if (!(newPessoa instanceof Professor)) {
            throw new IllegalArgumentException("O novo professor deve ser uma instância de Professor.");
        }

        Professor profExistente = buscar(cpf);
        if (profExistente != null) {
            int indice = profs.indexOf(profExistente);
            profs.set(indice, (Professor) newPessoa);
            System.out.println("Professor atualizado.");
        } else {
            System.out.println("Não foi possível encontrar professor com esse CPF.");
        }
    }

    @Override
    public void remover(String cpf) {
        Professor profExistente = buscar(cpf);
        if (profExistente != null) {
            profs.remove(profExistente);
            System.out.println("Professor removido.");
        } else {
            System.out.println("Não foi possível encontrar professor com esse CPF.");
        }
    }
    
    public List<Professor> getProfessor() {
        return profs;
    }

    
    @Override
    public String toString() {
        return "gerenciadorProfessor{" + "profs=" + profs + '}';
    }
    
    public void salvarNoArquivo(String caminhoDoArquivo) {
        serializadorCSVProf serializador = new serializadorCSVProf();
        String csvData = serializador.toCSV(profs);

        filePersistence filePersistence = new filePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Professores salvos em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        filePersistence FilePersistence = new filePersistence();
        String csvData = FilePersistence.loadFromFile(caminhoDoArquivo);

        serializadorCSVProf serializador = new serializadorCSVProf();
        this.profs = serializador.fromCSV(csvData);

        System.out.println("Professores carregados de " + caminhoDoArquivo);
    }
    
}

