/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;

import classe.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows
 */
public class serializadorCSValuno {
    public String toCSV(List<Aluno> alunos) {
        String csv = "Matricula;Nome;Idade;Ano Ingresso\n"; // Cabeçalho
        for (Aluno aluno : alunos) {
            csv += aluno.getMatricula() + ";"
                    + aluno.getNome() + ";"
                    + aluno.getIdade() + ";"
                    + aluno.getAnoIngresso() + ";\n";
                    
                    
        }
        return csv;
    }

    //Deserializa uma String no formato CSV para uma lista de alunos
    public List <Aluno> fromCSV(String data) {
        List <Aluno> alunos = new ArrayList<>();

        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >=4 ) {
                // Cria uma nova aluno com os dados da linha
                Aluno aluno = new Aluno(
                        partes[0], // Matricula
                        Integer.parseInt(partes[1]), // Nome
                        partes[2], //idade
                        Integer.parseInt(partes[3])//Ano Ingresso
                      
                );

                // Adiciona a aluno à lista
                alunos.add(aluno);
            }
        }
        return alunos;
    }

    
}
