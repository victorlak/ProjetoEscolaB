/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciador;

import classe.Professor;
import file.filePersistence;
import file.serializadorCSVProf;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows
 */
public class gerenciadorProfessor {
    private List<Professor> profs;

    public gerenciadorProfessor() {
        this.profs = new ArrayList<>();  
    }
    
    public void addProf(Professor prof){
        profs.add(prof);
        System.out.println("Aducionado com sucesso !");
    }
    
    public Professor buscarProf(String cpf){
        for(Professor prof : profs){
            if(prof.getCpf().equals(cpf)){
            return prof;
        }
    }
    return null;  
    }
    
    public void removeProf(String cpf){
        profs.remove(buscarProf(cpf));
        System.out.println("Removido com sucesso!");
    }
    
    public void atualizarProf(String cpf, Professor newProf){
        Professor profExistente = buscarProf(cpf);
        if(profExistente != null){
            int indice = profs.indexOf(profExistente);
            profs.set(indice,newProf);
            System.out.println("Atualizado com sucesso!");
        }else{
            System.out.println("Não existe este cpf.");
        }
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
        System.out.println("Professores salvos com sucesso em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        filePersistence FilePersistence = new filePersistence();
        String csvData = FilePersistence.loadFromFile(caminhoDoArquivo);

        serializadorCSVProf serializador = new serializadorCSVProf();
        this.profs = serializador.fromCSV(csvData);

        System.out.println("Professores carregados com sucesso de " + caminhoDoArquivo);
    }
}

