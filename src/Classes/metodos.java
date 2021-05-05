//classe responsável pelos metos realizados no programa
package Classes;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class metodos {
    
    DecimalFormat casas = new DecimalFormat("0.00");
    
    public void salvar(Tipo_Imovel x) {
        x.imovel.add(x);
        JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
    }
    
    public void locacao(String codigo) {
        int x = 0;
        double valor = 0;
        for (int i = 0; i < Tipo_Imovel.imovel.size(); i++) {
            if (codigo.equals(Tipo_Imovel.imovel.get(i).getCod_imovel())) {
                if (Tipo_Imovel.imovel.get(i).getStatus().equals("DISPONÍVEL")) {
                    x = 1;
                    Tipo_Imovel.imovel.get(i).setStatus("ALUGADO");
                    if (Tipo_Imovel.imovel.get(i).getTipo().equals("RESIDENCIAL")) {
                        valor = Tipo_Imovel.imovel.get(i).getValor_base();
                        valor = valor * 1.05;
                    } 
                    if (Tipo_Imovel.imovel.get(i).getTipo().equals("GALPÃO")) {
                        valor = Tipo_Imovel.imovel.get(i).getValor_base();
                        valor = valor * 1.10;
                    } 
                    if (Tipo_Imovel.imovel.get(i).getTipo().equals("COMERCIAL")) {                        
                        valor = Tipo_Imovel.imovel.get(i).getValor_base();
                        valor = valor * 1.15;
                    }
                    casas.format(valor);
                    Tipo_Imovel.imovel.get(i).setValorfinal(valor);
                    JOptionPane.showMessageDialog(null, "LOCAÇÃO FEITA COM SUCESSO"
                            + "\nCÓDIGO: " + codigo + ""
                            + "\nVALOR FINAL: R$" + casas.format(valor)
                    );
                } else {
                    JOptionPane.showMessageDialog(null, "IMÓVEL INDISPONÍVEL!");
                    x = 2;
                }
            }
        }
        if (x == 0) {
            JOptionPane.showMessageDialog(null, "CÓDIGO INEXISTENTE!");
        }
    }
    
    public void devolucao(String codigo) {
        int x = 0;
        for (int i = 0; i < Tipo_Imovel.imovel.size(); i++) {
            if (codigo.equals(Tipo_Imovel.imovel.get(i).getCod_imovel())) {
                if (Tipo_Imovel.imovel.get(i).getStatus().equals("ALUGADO")) {
                    x = 1;
                    Tipo_Imovel.imovel.get(i).setStatus("DISPONÍVEL");
                    Tipo_Imovel.imovel.get(i).setValorfinal(0);
                    JOptionPane.showMessageDialog(null, "DEVOLUÇÃO REALIZADA COM SUCESSO!");
                } else {
                    JOptionPane.showMessageDialog(null, "ESSE IMÓVEL NÃO ESTA ALUGADO!");
                    x = 2;
                }
            }
        }
        if (x == 0) {
            JOptionPane.showMessageDialog(null, "CÓDIGO INEXISTENTE!");
        }
    }
    
    public ArrayList alugado() {
        ArrayList<Tipo_Imovel> alugado = new ArrayList<Tipo_Imovel>();
        
        for (int i = 0; i < Tipo_Imovel.imovel.size(); i++) {
            if (Tipo_Imovel.imovel.get(i).getStatus().equals("ALUGADO")) {
                Tipo_Imovel x = new Tipo_Imovel();
                x.setTipo(Tipo_Imovel.imovel.get(i).getTipo());
                x.setBairro(Tipo_Imovel.imovel.get(i).getBairro());
                x.setValor_base(Tipo_Imovel.imovel.get(i).getValor_base());
                x.setValorfinal(Tipo_Imovel.imovel.get(i).getValorfinal());
                
                alugado.add(x);
            }            
        }
        return alugado;
    }
    
    public ArrayList disponivel() {
        ArrayList<Tipo_Imovel> disponivel = new ArrayList<Tipo_Imovel>();
        
        for (int i = 0; i < Tipo_Imovel.imovel.size(); i++) {
            if (Tipo_Imovel.imovel.get(i).getStatus().equals("DISPONÍVEL")) {
                Tipo_Imovel x = new Tipo_Imovel();
                x.setTipo(Tipo_Imovel.imovel.get(i).getTipo());
                x.setBairro(Tipo_Imovel.imovel.get(i).getBairro());
                x.setValor_base(Tipo_Imovel.imovel.get(i).getValor_base());
                
                disponivel.add(x);
            }            
        }
        return disponivel;
    }
}
