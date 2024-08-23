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
 * @author Windows
 */
public class serializadorCSVProf {
     public String toCSV(List<Professor> profs) {
        String csv = "Nome;Idade;CPF\n"; // Cabeçalho
        for (Professor prof : profs) {
            csv +=    prof.getNome() + ";"
                    + prof.getIdade() + ";"
                    + prof.getCpf()+ ";\n";
                    
                    
        }
        return csv;
    }

    //Deserializa uma String no formato CSV para uma lista de profs
    public List <Professor> fromCSV(String data) {
        List <Professor> profs = new ArrayList<>();

        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >=3 ) {
                // Cria uma nova prof com os dados da linha
                Professor profe = new Professor(
                        partes[0], // 
                        Integer.parseInt(partes[1]), //idade
                        partes[2]//Ano Ingresso
                      
                );

                // Adiciona a prof à lista
                profs.add(profe);
            }
        }
        return profs;
    }
    
}
