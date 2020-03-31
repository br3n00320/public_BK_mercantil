
package bk_mercantil;

public class BK_produtos {
    
    public String BK_mercadoria;
    public String BK_validade;
    public double BK_preco;
    public double BK_kg;
    public String BK_fardo;
    
    
    public int BK_faltaProdutos;
    public boolean BK_estoque;
    
    

    public String getBK_merdadoria(){
        return BK_mercadoria;
    }
    public void setBK_merdadoria(String BK_mercadoria){
        this.BK_mercadoria= BK_mercadoria ; 
    }
    
     public String getBK_validade(){
        return BK_validade;
    }
    public void setBK_validade(String BK_validade){
        this.BK_validade= BK_validade ;       
    }
     public double getBK_preco(){
        return BK_preco;
    }
    public double setBK_preco(double BK_preco){
        return this.BK_preco= BK_preco ; 
    }
     public double getBK_kg(){
        return BK_kg;
    }
    public double setBK_kg(double BK_kg){
        return this.BK_kg = BK_kg ; 
    }
     public String getBK_fardo(){
        return BK_fardo;
    }
    public void setBK_fardo(String BK_fardo){
        this.BK_fardo = BK_fardo ; 
    }
     public int getBK_faltaProdutos(){
        return BK_faltaProdutos;
    }
    public void setBK_BK_faltaProdutos(int BK_faltaProdutos){
        this.BK_faltaProdutos= BK_faltaProdutos ; 
    }
    void setBK_estoque(boolean b) {
    }

    void setBK_faltaProdutos(int i) {
    }
}

