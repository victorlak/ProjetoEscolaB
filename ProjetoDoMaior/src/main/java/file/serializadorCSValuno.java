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
        String csv = "Cpf;Nome;Idade;Matricula;Ano Ingresso\n"; 
        for (Aluno aluno : alunos) {
            csv += aluno.getCpf() + ";"
                    +  aluno.getNome()+ ";"
                    + aluno.getIdade()+ ";"
                    + aluno.getMatricula()+ ";"
                    + aluno.getAnoIngresso() + ";\n";
                    
                    
        }
        return csv;
    }
    
    public List <Aluno> fromCSV(String data) {
        List <Aluno> alunos = new ArrayList<>();

        String[] linhas = data.split("\n");
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >=4 ) {
                Aluno aluno = new Aluno(
                        partes[0],
                        partes[1],
                        partes[2],
                        partes[3],
                        partes[4]
                      
                );

                alunos.add(aluno);
            }
        }
        return alunos;
    }

    
}
