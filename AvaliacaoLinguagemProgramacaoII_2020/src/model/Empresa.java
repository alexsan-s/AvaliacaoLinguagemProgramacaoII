package model;

import java.util.ArrayList;

public class Empresa {

    final String descricao;
    ArrayList<Funcionario> vetor;

    public Empresa(String descricao) {
        this.descricao = descricao;
        this.vetor = new ArrayList<>();
    }

    public ArrayList<Funcionario> getVetor() {
        return vetor;
    }

    public void setVetor(ArrayList<Funcionario> vetor) {
        this.vetor = vetor;
    }

    public boolean addFuncionario(String matricula, String nome, String cidade, double salario, String departamento) {
        if (validaMatricula(matricula)) {
            Funcionario objFuncionario = new Funcionario(matricula, nome, cidade, salario, departamento);
            vetor.add(objFuncionario);
            return true;
        } else {
            return false;
        }
    }

    public boolean validaMatricula(String matricula) {
        if (vetor.size() > 0) {
            for (int i = 0; i < vetor.size(); i++) {
                Funcionario objFuncionario = vetor.get(i);
                if (objFuncionario.getMatricula().equals(matricula)) {
                    return false;
                }
            }
        }
        return true;
    }

    public double gastosTotais() {
        double salario = 0;
        for (int i = 0; i < vetor.size(); i++) {
            Funcionario obj = vetor.get(i);
            salario += obj.getSalario();
        }
        return salario;
    }

    public double mediaSalarial() {
        double salario = 0;
        int temp = 0;
        for (int i = 0; i < vetor.size(); i++) {
            Funcionario obj = vetor.get(i);
            salario = +obj.getSalario();
            temp++;
        }
        return salario / temp;
    }

    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < vetor.size(); i++) {
            Funcionario obj = vetor.get(i);
            text += obj.toString();
        }
        return text;
    }

}
