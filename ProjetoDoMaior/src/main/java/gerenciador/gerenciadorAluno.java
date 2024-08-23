/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciador;

import classe.Aluno;
import classe.Pessoa;
import file.filePersistence;
import file.serializadorCSValuno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igorxf
 */
public class gerenciadorAluno implements gerenciadorPessoa{
    private List<Aluno> alunos ;
    
    public gerenciadorAluno() {
        this.alunos = new ArrayList<>();
    }
    @Override
    public Aluno buscar(String cpf){
        for(Aluno aluno : alunos){
            if(aluno.getCpf().equals(cpf)){
                return aluno;
            }
        }
        return null;
    }
    
    @Override
    public void add(Pessoa newPessoa) {
        if (newPessoa instanceof Aluno) {
            alunos.add((Aluno) newPessoa);
        } else {
            throw new IllegalArgumentException("A pessoa deve ser um Aluno.");
        }
    }
    
    @Override
    public void atualizar(String cpf, Pessoa newAluno) {
        if (!(newAluno instanceof Aluno)) {
            throw new IllegalArgumentException("O novo aluno deve ser uma instância de Aluno.");
        }

        Aluno alunoExistente = buscar(cpf);
        if (alunoExistente != null) {
            int indice = alunos.indexOf(alunoExistente);
            alunos.set(indice, (Aluno) newAluno);
            System.out.println("Aluno atualizado com sucesso.");
        } else {
            System.out.println("Não foi possível encontrar aluno com esse CPF.");
        }
    }
    
    @Override
    public void remover(String cpf){
        alunos.remove(buscar(cpf));
    }
    
    public List<Aluno> getAlunos() {
        return alunos;
    }
    
    @Override
    public String toString() {
        return "gerenciadorAluno{" + "alunos=" + alunos + '}';
    }
    
     public void salvarNoArquivo(String caminhoDoArquivo) {
        serializadorCSValuno serializador = new serializadorCSValuno();
        String csvData = serializador.toCSV(alunos);

        filePersistence filePersistence = new filePersistence();
        filePersistence.saveToFile(csvData, caminhoDoArquivo);
        System.out.println("Alunos salvos  em " + caminhoDoArquivo);
    }

    public void carregarDoArquivo(String caminhoDoArquivo) {
        filePersistence FilePersistence = new filePersistence();
        String csvData = FilePersistence.loadFromFile(caminhoDoArquivo);

        serializadorCSValuno serializador = new serializadorCSValuno();
        this.alunos = serializador.fromCSV(csvData);

        System.out.println("Alunos carregados de " + caminhoDoArquivo);
    }

}
