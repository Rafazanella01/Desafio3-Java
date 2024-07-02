package com.mycompany.sistemamedico;
import java.util.List;

/**
 *
 * @author rafaz
 */
public class Paciente extends Usuario {
    public Paciente(String nome, int idade, String sexo, String login, String senha, List<String> permissoes)
    {
        super(nome, idade, sexo, login, senha, permissoes);
    }

    @Override
    public String toString()
    {
        return "Paciente{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                ", login='" + getLogin() + '\'' +
                ", senha='" + getSenha() + '\'' +
                ", permissoes=" + getPermissoes() +
                '}';
    }
}

