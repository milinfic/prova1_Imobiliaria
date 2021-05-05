
package Classes;

import java.util.ArrayList;

public class Tipo_Imovel extends Imovel{
    
    public static ArrayList<Tipo_Imovel> imovel = new ArrayList<>();
    
    String descricao, bairro, status;
    double valorfinal;
    
    public Tipo_Imovel(){ //construtor filha chamando a mãe
        super();
    }
    
    public Tipo_Imovel(String cod_imovel, String tipo, double valor_base, String descricao, String bairro, String status ){//construtor filha recebendo todos os dados, armazenando os da classe e enviando para a mãe os dados a ser armazenado lá
        super(cod_imovel, tipo, valor_base);
        this.descricao = descricao;
        this.bairro = bairro;
        this.status = status;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getStatus() {
        return status;
    }

    //descrição do imóvel, o bairro onde se localiza e o status (situação do imóvel – ocupado ou disponível
    public void setStatus(String status) {
        this.status = status;
    }    
    
    public double getValorfinal() {
        return valorfinal;
    }

    public void setValorfinal(double valorfinal) {
        this.valorfinal = valorfinal;
    }
}
