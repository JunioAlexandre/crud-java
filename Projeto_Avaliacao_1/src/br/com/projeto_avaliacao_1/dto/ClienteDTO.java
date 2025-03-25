package br.com.projeto_avaliacao_1.dto;

public class ClienteDTO {
    private String nome_cli, descricao_cli, precodevenda_cli, datadocadastro_cli;
    private int quantidadeemestoque_cli;

    public String getNome_cli() {
        return nome_cli;
    }

    public void setNome_cli(String nome_cli) {
        this.nome_cli = nome_cli;
    }

    public String getDescricao_cli() {
        return descricao_cli;
    }

    public void setDescricao_cli(String descricao_cli) {
        this.descricao_cli = descricao_cli;
    }

    public String getPrecodevenda_cli() {
        return precodevenda_cli;
    }

    public void setPrecodevenda_cli(String precodevenda_cli) {
        this.precodevenda_cli = precodevenda_cli;
    }

    public int getQuantidadeemestoque_cli() {
        return quantidadeemestoque_cli;
    }

    public void setQuantidadeemestoque_cli(int quantidadeemestoque_cli) {
        this.quantidadeemestoque_cli = quantidadeemestoque_cli;
    }

    public String getDatadocadastro_cli() {
        return datadocadastro_cli;
    }

    public void setDatadocadastro_cli(String datadocadastro_cli) {
        this.datadocadastro_cli = datadocadastro_cli;
    }
}
