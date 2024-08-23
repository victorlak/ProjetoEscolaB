/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;


import classe.Disciplina;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * return "Nome";
        }else if(columnIndex == COL_SEMESTRE){
            return "Semestre";
        }else if(columnIndex == COL_HORARIO){
            return "Horario";
        }else if(columnIndex == COL_PROFM){
            return "Professor ministrante";
        }else if(columnIndex == COL_ALUNOS){
            return "Alunos";
 * @author  igorxf
 */
public class serializadorCSVDisciplina {
     public String toCSV(List<Disciplina> disciplinas) {
        String csv = "Nome; Semestre; Horario;Professor Ministrante;Alunos\n";
        for (Disciplina disc: disciplinas) {
            csv += disc.getNome()+ ";"
                    + disc.getSemestre()+ ";"
                    + disc.getHorario()+ ";"
                    + disc.getProfM()+ ";"
                    +disc.getAlunos()+"\n";
                    

        }
        return csv;
    }

    public List <Disciplina> fromCSV(String data) {
        List <Disciplina> disciplinas = new ArrayList<>();

        String[] linhas = data.split("\n");
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >=4 ) {
                Disciplina disc;
                disc = new Disciplina(
                        partes[0],
                        partes[1], 
                        partes[2], 
                        partes[3]
                      
                );
                disciplinas.add(disc);
            }
        }
        return disciplinas;
    }
    
}
