/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

//Para cada disciplina, registre o nome, semestre, horário, 

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//o professor ministrante e uma lista dos alunos matriculados.
public class Disciplina {
    private String nome;
    private int semestre;
    private String horario;
    private String profMinistrante;
    private List<Aluno> alunos = new ArrayList<>();

    public Disciplina(String nome, int semestre, String horario, String profMinistrante) {
        this.nome = nome;
        this.semestre = semestre;
        this.horario = horario;
        this.profMinistrante = profMinistrante;
    }
    
    public Disciplina() {
        this.nome = "";
        this.semestre = 0;
        this.horario = "";
        this.profMinistrante = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getProfMinistrante() {
        return profMinistrante;
    }

    public void setProfMinistrante(String profMinistrante) {
        this.profMinistrante = profMinistrante;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + this.semestre;
        hash = 97 * hash + Objects.hashCode(this.horario);
        hash = 97 * hash + Objects.hashCode(this.profMinistrante);
        hash = 97 * hash + Objects.hashCode(this.alunos);
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
        final Disciplina other = (Disciplina) obj;
        if (this.semestre != other.semestre) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        if (!Objects.equals(this.profMinistrante, other.profMinistrante)) {
            return false;
        }
        return Objects.equals(this.alunos, other.alunos);
    }
    
    public void imprimir(){
        System.out.println(toString());          
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", semestre=" + semestre + ", horario=" + horario + ", profMinistrante=" + profMinistrante + ", alunos=" + alunos + '}';
    }
    
    
    
    
    
    
    
    
}    
    
    
