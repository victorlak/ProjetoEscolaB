/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

//Cada aluno deve ser cadastrado com 

import java.util.Objects;

//as seguintes informações: nome, sexo, idade, matrícula, e ano de ingresso.
public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    private int anoIngresso;

    public Aluno(String nome, int idade, String matricula, int anoIngresso) {
        this.nome = nome;
       
        this.idade = idade;
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
    }
    
     public Aluno() {
        this.nome = "";
       
        this.idade = 0;
        this.matricula = "";
        this.anoIngresso = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nome);
       
        hash = 37 * hash + this.idade;
        hash = 37 * hash + Objects.hashCode(this.matricula);
        hash = 37 * hash + this.anoIngresso;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (this.anoIngresso != other.anoIngresso) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
       
        return Objects.equals(this.matricula, other.matricula);
    }
    
    public void imprimir(){
     System.out.print(toString()); 
         
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome +  ", idade=" + idade + ", matricula=" + matricula + ", anoIngresso=" + anoIngresso + '}';
    }
    
    
    
    
    
    
}
