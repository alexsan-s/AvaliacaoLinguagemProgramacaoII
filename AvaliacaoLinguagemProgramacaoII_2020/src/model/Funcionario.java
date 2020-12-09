package model;

public class Funcionario {
    public String matricula;
    public String nome;
    public String cidade;
    public double salario;
    public String departamento;

    public Funcionario(String matricula, String nome, String cidade, double salario, String departamento) {
        this.matricula = matricula;
        this.nome = nome;
        this.cidade = cidade;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Matricula:" + matricula + ", Nome:" + nome + ", Cidade:" + cidade + ", Salario:" + salario + ", Departamento:" + departamento + '\n';
    }
    
    
}
