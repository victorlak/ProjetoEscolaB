/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;


import classe.Disciplina;
import classe.Professor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows
 */
public class serializadorCSVDisciplina {
     public String toCSV(List<Disciplina> disciplinas) {
        String csv = "Nome; Prof. Ministrante; Semestre; Horario"; // Cabeçalho
        for (Disciplina disc: disciplinas) {
            csv += disc.getNome()+ ";"
                    + disc.getProfMinistrante()+ ";"
                    + disc.getSemestre()+ ";"
                    + disc.getHorario()+ ";\n";
                    
                    
        }
        return csv;
    }

    //Deserializa uma String no formato CSV para uma lista de disciplina
    public List <Disciplina> fromCSV(String data) {
        List <Disciplina> disciplinas = new ArrayList<>();

        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >=4 ) {
                // Cria uma nova disciplinacom os dados da linha
                Disciplina disc;
                disc = new Disciplina(
                        partes[0], // Matricula
                        Integer.parseInt(partes[1]), //semestre
                        partes[2], //idade
                        partes[3]//Professor profMinistrante
                      
                );

                // Adiciona a disciplinaà lista
                disciplinas.add(disc);
            }
        }
        return disciplinas;
    }
    
}
