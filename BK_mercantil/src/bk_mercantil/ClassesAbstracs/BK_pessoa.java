package bk_mercantil.ClassesAbstracs;

public abstract class BK_pessoa {

    protected String BK_nome;
    protected int BK_idade;
    protected char BK_sexo;
    protected long BK_Tel;

    public String getBK_nome() {
        return BK_nome;
    }

    public void setBK_nome(String BK_nome) {
        this.BK_nome = BK_nome;
    }

    public char getBK_sexo() {
        return BK_sexo;
    }

    public void setBK_sexo(char BK_sexo) {
        this.BK_sexo = BK_sexo;
    }

    public int getBK_idade() {
        return BK_idade;
    }

    public void setBK_idade(int BK_idade) {
        this.BK_idade = BK_idade;
    }

    public long getBK_Tel() {
        return BK_Tel;
    }

    public void setBK_Tel(long BK_Tel) {
        this.BK_Tel = BK_Tel;
    }

}
