package com.mycompany.sistemamedico;
import java.util.List;

/**
 *
 * @author rafaz
 */
public class Usuario extends Pessoa {
    private String login;
    private String senha;
    private List<String> permissoes;

    public Usuario(String nome, int idade, String sexo, String login, String senha, List<String> permissoes)
    {
        super(nome, idade, sexo);
        this.login = login;
        this.senha = senha;
        this.permissoes = permissoes;
    }

    // Getters e setters
    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public String getSenha()
    {
        return senha;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    }

    public List<String> getPermissoes()
    {
        return permissoes;
    }

    public void setPermissoes(List<String> permissoes)
    {
        this.permissoes = permissoes;
    }

    @Override
    public String toString()
    {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", permissoes=" + permissoes +
                ", nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                '}';
    }
}

