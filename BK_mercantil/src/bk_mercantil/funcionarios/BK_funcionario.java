package bk_mercantil.funcionarios;

import bk_mercantil.ClassesAbstracs.BK_pessoa;

public class BK_funcionario extends BK_pessoa {

    protected String BK_funcao;
    protected double salario;
    protected String BK_Usuario;
    protected String BK_Senha;

    public String getBK_funcao() {
        return BK_funcao;
    }

    public void setBK_funcao(String BK_funcao) {
        this.BK_funcao = BK_funcao;
    }

    public String getBK_nome() {
        return BK_nome;
    }

    public void setBK_nome(String BK_nome) {
        this.BK_nome = BK_nome;
    }

    public int getBK_idade() {
        return BK_idade;
    }

    public void setBK_idade(int BK_idade) {
        this.BK_idade = BK_idade;
    }

    public char getBK_sexo() {
        return BK_sexo;
    }

    public void setBK_sexo(char BK_sexo) {
        this.BK_sexo = BK_sexo;
    }

    public long getBK_Tel() {
        return BK_Tel;
    }

    public void setBK_Tel(long BK_Tel) {
        this.BK_Tel = BK_Tel;
    }

    public String getBK_Usuario() {
        return BK_Usuario;
    }

    public void setBK_Usuario(String BK_Usuario) {
        this.BK_Usuario = BK_Usuario;
    }

    public String getBK_Senha() {
        return BK_Senha;
    }

    public void setBK_Senha(String BK_Senha) {
        this.BK_Senha = BK_Senha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double BK_salario(double s) {
        return s;

    }

}
