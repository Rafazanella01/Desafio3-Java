package com.mycompany.sistemamedico;
import java.util.List;

/**
 *
 * @author rafaz
 */

public class Medico extends Usuario {
    private String especializacao;

    public Medico(String nome, int idade, String sexo, String login, String senha, List<String> permissoes, String especializacao)
    {
        super(nome, idade, sexo, login, senha, permissoes);
        this.especializacao = especializacao;
    }

    // Getters e setters
    public String getEspecializacao()
    {
        return especializacao;
    }

    public void setEspecializacao(String especializacao)
    {
        this.especializacao = especializacao;
    }

    @Override
    public String toString()
    {
        return "Medico{" +
                "especializacao='" + especializacao + '\'' +
                ", nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                ", login='" + getLogin() + '\'' +
                ", senha='" + getSenha() + '\'' +
                ", permissoes=" + getPermissoes() +
                '}';
    }
}

