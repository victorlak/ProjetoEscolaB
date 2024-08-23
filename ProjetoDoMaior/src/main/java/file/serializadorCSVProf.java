/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;


import classe.Professor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author  igorxf
 */
public class serializadorCSVProf {
     public String toCSV(List<Professor> profs) {
        String csv = "Nome;Idade;Sexo;CPF\n"; 
        for (Professor prof : profs) {
            csv +=prof.getNome()+ ";"
                    + prof.getIdade()+ ";"
                    + prof.getSexo() + ";"
                    + prof.getCpf()+ ";\n";
                    
                    
        }
        return csv;
    }

    public List <Professor> fromCSV(String data) {
        List <Professor> profs = new ArrayList<>();

        String[] linhas = data.split("\n");
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >=3 ) {
                Professor profe = new Professor(
                        partes[0],
                        partes[1],
                        partes[2],
                        partes[3]
                      
                );
                profs.add(profe);
            }
        }
        return profs;
    }
    
}
