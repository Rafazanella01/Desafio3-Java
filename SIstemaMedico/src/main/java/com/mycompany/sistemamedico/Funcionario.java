package com.mycompany.sistemamedico;
import java.util.List;

/**
 *
 * @author rafaz
 */
public class Funcionario extends Usuario {
    public Funcionario(String nome, int idade, String sexo, String login, String senha, List<String> permissoes)
    {
        super(nome, idade, sexo, login, senha, permissoes);
    }

    public void lancarRequisicao(Requisicao requisicao) {
        if (!getPermissoes().contains("FUNCIONARIO")) {
            System.out.println("Voce nao tem permissao para lancar requisicoes.");
            return;
        }

        Sistema.adicionarRequisicao(requisicao);

        System.out.println("Requisicao lancada por " + getNome() + ": " + requisicao);
    }

    public void registrarColeta(Registro registro) {
        if (!getPermissoes().contains("FUNCIONARIO")) {
            System.out.println("Voce nao tem permissao para lancar requisicoes.");
            return;
        }

        Sistema.adicionarRegistro(registro);

        System.out.println("Coleta registrada por " + getNome() + ": " + registro);
    }

    public void elaborarParecer(Exame exame) {
        if (!getPermissoes().contains("FUNCIONARIO")) {
            System.out.println("Voce nao tem permissao para lancar requisicoes.");
            return;
        }

        exame.setParecer("Parecer elaborado por " + getNome());

        System.out.println("Parecer elaborado por " + getNome() + " para o exame: " + exame);
    }

    @Override
    public String toString()
    {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                ", login='" + getLogin() + '\'' +
                ", senha='" + getSenha() + '\'' +
                ", permissoes=" + getPermissoes() +
                '}';
    }
}

