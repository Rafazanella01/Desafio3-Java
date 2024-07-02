package com.mycompany.sistemamedico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafaz
 */
public class Sistema {
    private static List<Requisicao> requisicoes = new ArrayList<>();
    private static List<Registro> registros = new ArrayList<>();
    private static List<Exame> exames = new ArrayList<>();

    public static void adicionarRequisicao(Requisicao requisicao) {
        requisicoes.add(requisicao);
    }

    public static void adicionarRegistro(Registro registro) {
        registros.add(registro);
    }

    public static void adicionarExame(Exame exame) {
        exames.add(exame);
    }

    public static List<Requisicao> getRequisicoes() {
        return requisicoes;
    }

    public static List<Registro> getRegistros() {
        return registros;
    }

    public static List<Exame> getExames() {
        return exames;
    }
}
