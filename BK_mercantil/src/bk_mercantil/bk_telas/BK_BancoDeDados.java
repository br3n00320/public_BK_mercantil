package bk_mercantil.bk_telas;

import bk_mercantil.funcionarios.BK_funcionario;
import bk_mercantil.funcionarios.BK_caixa;
import bk_mercantil.funcionarios.BK_gerente;

public class BK_BancoDeDados {

    BK_funcionario f1 = new BK_funcionario();
    BK_funcionario f2 = new BK_funcionario();
    BK_funcionario f3 = new BK_funcionario();
    
    BK_gerente g1 = new BK_gerente();

    BK_caixa c1 = new BK_caixa();
    BK_caixa c2 = new BK_caixa();

    public void BK_BancoDeDados() {

        //funcionarios
        f1.setBK_nome("Alex costa e costa");
        f1.setBK_idade(22);
        f1.setBK_sexo('M');
        f1.setBK_Tel(991631980);

        f2.setBK_nome("Rita de cassia lopes lobato");
        f2.setBK_idade(21);
        f2.setBK_sexo('F');
        f2.setBK_Tel(991458987);

        f3.setBK_nome("Breno santos silva");
        f3.setBK_idade(19);
        f3.setBK_sexo('M');
        f3.setBK_Tel(998865489);

        //gerentes
        g1.setBK_nome(f1.getBK_nome());
        g1.setBK_funcao("Gerente");
        g1.setSalario(1040);
        g1.setBK_idade(f1.getBK_idade());
        g1.setBK_sexo(f1.getBK_sexo());
        g1.setBK_Tel(f1.getBK_Tel());
        g1.setBK_Usuario("gerentealex");
        g1.setBK_Senha("1234");

        //caixas
        c1.setBK_nome(f2.getBK_nome());
        c1.setBK_funcao("Caixa");
        c1.setSalario(1040);
        c1.setBK_idade(f2.getBK_idade());
        c1.setBK_sexo(f2.getBK_sexo());
        c1.setBK_Tel(f2.getBK_Tel());
        c1.setBK_Usuario("caixarita");
        c1.setBK_Senha("1234");

        c2.setBK_nome(f3.getBK_nome());
        c2.setBK_funcao("Caixa");
        c2.setSalario(1040);
        c2.setBK_idade(f3.getBK_idade());
        c2.setBK_sexo(f3.getBK_sexo());
        c2.setBK_Tel(f3.getBK_Tel());
        c2.setBK_Usuario("caixabreno");
        c2.setBK_Senha("1234");

    }
    
    public void login(){
    
    
    
    }

    
}
