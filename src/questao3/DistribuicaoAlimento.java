package questao3;

import java.util.Objects;

public class DistribuicaoAlimento extends Projeto{
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    @Override
    public boolean validaProjeto() {
        if (Objects.equals(getDatafim(), ""))
            return true;
        else
            return false;

    }

    @Override
    public String imprimeProjeto() {
        return "Nome: " +getNomeProjeto()
                + "Descrição: " + getDescricao()
                + "Data Inicio: " + getDatafim()
                + "Data Fim: " + getDatafim()
                + "Descrição Alimento: " + getDescAlimento()
                + "Quantidade: " + getQtde();
    }
}
