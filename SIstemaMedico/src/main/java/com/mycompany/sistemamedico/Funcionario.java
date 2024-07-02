package com.mycompany.sistemamedico;
import java.util.List;

/**
 *
 * @author rafaz
 */
public class Funcionario extends Usuario /*implements AtividadesFuncionario*/ {
    public Funcionario(String nome, int idade, String sexo, String login, String senha, List<String> permissoes)
    {
        super(nome, idade, sexo, login, senha, permissoes);
    }

    public void lancarRequisicao(Requisicao requisicao)
    {
        
    }

    public void registrarColeta(Registro registro)
    {
        
    }

    public void elaborarParecer(Exame exame)
    {
        
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

