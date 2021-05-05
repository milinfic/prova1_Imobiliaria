
package Classes;

public class Imovel {    
    
    String cod_imovel, tipo;
    double valor_base;
    
    public Imovel(){//construtor vazio mãe        
    }
    
    public Imovel(String cod_imovel, String tipo, double valor_base){//construtor mãe recebendo dados
        this.cod_imovel = cod_imovel;
        this.tipo = tipo;
        this.valor_base = valor_base;
    }

    public String getCod_imovel() {
        return cod_imovel;
    }

    public void setCod_imovel(String cod_imovel) {
        this.cod_imovel = cod_imovel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor_base() {
        return valor_base;
    }
    
    public void setValor_base(double valor_base) {
        this.valor_base = valor_base;
    }
}
