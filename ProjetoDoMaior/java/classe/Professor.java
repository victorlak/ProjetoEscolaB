/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

//Cada professor deve ser cadastrado com as 

import java.util.Objects;

//seguintes informações: nome, sexo, idade, e CPF.
public class Professor {
    private String nome;
    private int idade;
    private String cpf;
    
    
    public Professor (String nome, int idade, String cpf){
        this.nome = nome;
        
        this.idade = idade;
        this.cpf = cpf;
    }
    
     public Professor (){
        this.nome = "";
        
        this.idade = 0;
        this.cpf = "";
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + this.idade;
        hash = 79 * hash + Objects.hashCode(this.cpf);
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
        final Professor other = (Professor) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.cpf, other.cpf);
    }

   
    public void imprimir(){
        System.out.print(toString());       
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome +  ", idade=" + idade + ", cpf=" + cpf + '}';
    }
    
    
    
    
     
     
}
