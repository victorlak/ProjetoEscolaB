/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.tablemodels;

import classe.Aluno;
import classe.Disciplina;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author igorxf
 */
public class TMCadDisciplina extends AbstractTableModel {
    private List<Disciplina> disc;
    
    private final int COL_NOME = 0;
    private final int COL_SEMESTRE = 1;
    private final int COL_HORARIO = 2;
    private final int COL_PROFM = 3;
    private final int COL_ALUNOS = 4;
    
    
    
    public TMCadDisciplina(List<Disciplina> disc){
        this.disc = disc;
    }
    
    @Override
    public int getRowCount() {
        return this.disc.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    
    public Disciplina getObjetoAluno(int row){
       return this.disc.get(row);
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Disciplina p = this.disc.get(rowIndex);
        switch (columnIndex) {
            case COL_NOME:
                return p.getNome();
            case COL_SEMESTRE:
                return p.getSemestre();
            case COL_HORARIO:
                return p.getHorario();
            case COL_PROFM:
                return p.getProfM();
            case COL_ALUNOS:
                return p.getAlunos().toString();
            default:
                break;
        }
        return "-";
        
    }
    
    
    
    @Override
    public String getColumnName(int columnIndex) {
        //qual o nome da coluna
         if(columnIndex == COL_NOME){
            return "Nome";
        }else if(columnIndex == COL_SEMESTRE){
            return "Semestre";
        }else if(columnIndex == COL_HORARIO){
            return "Horario";
        }else if(columnIndex == COL_PROFM){
            return "Professor ministrante";
        }else if(columnIndex == COL_ALUNOS){
            return "Alunos";
        }

        return "";
    }
}
