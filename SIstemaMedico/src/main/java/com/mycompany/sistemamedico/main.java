package com.mycompany.sistemamedico;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author rafaz
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        Medico medico = new Medico("Dr. Joao", 45, "Masculino", "joao.med", "12345", Arrays.asList("MEDICO"), "Cardiologia");
        Paciente paciente = new Paciente("Maria Silva", 30, "Feminino", "maria.silva", "senha123", Arrays.asList("PACIENTE"));
        Funcionario funcionario = new Funcionario("Carlos Souza", 35, "Masculino", "carlos.souza", "admin123", Arrays.asList("FUNCIONARIO", "ADMIN"));

        while (!sair) {
            System.out.println("\nMenu:");
            System.out.println("1. Registrar Exame");
            System.out.println("2. Registrar Coleta");
            System.out.println("3. Elaborar Parecer");
            System.out.println("4. Ver Informacoes do Medico");
            System.out.println("5. Ver Informacoes do Paciente");
            System.out.println("6. Ver Informacoes do Funcionario");
            System.out.println("7. Ver Requisicoes Pendentes");
            System.out.println("8. Ver Registros de Coleta");
            System.out.println("9. Ver Exames Realizados");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opcao: ");
            int op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Digite o tipo de exame: ");
                    String tipoExame = scanner.nextLine();
                    Requisicao requisicao = new Requisicao(tipoExame, medico, new Date());
                    funcionario.lancarRequisicao(requisicao);
                    break;
                case 2:
                    System.out.print("Digite o tipo de material coletado: ");
                    String tipoMaterial = scanner.nextLine();

                    System.out.print("Digite a quantidade coletada: ");
                    float quantidade = scanner.nextFloat();
                    scanner.nextLine();

                    System.out.print("Digite a hora da coleta: ");
                    String horaColeta = scanner.nextLine();

                    Registro registro = new Registro(tipoMaterial, quantidade, horaColeta);
                    funcionario.registrarColeta(registro);
                    break;
                case 3:
                    System.out.print("Digite o resultado do exame: ");
                    String resultadoExame = scanner.nextLine();

                    System.out.print("Digite o parecer do medico: ");
                    String parecerMedico = scanner.nextLine();

                    Exame exame = new Exame(resultadoExame, parecerMedico);
                    funcionario.elaborarParecer(exame);
                    Sistema.adicionarExame(exame);
                    break;
                case 4:
                    System.out.println("Informacoes do Medico:");
                    System.out.println(medico);
                    break;
                case 5:
                    System.out.println("Informacoes do Paciente:");
                    System.out.println(paciente);
                    break;
                case 6:
                    System.out.println("Informacoes do Funcionario:");
                    System.out.println(funcionario);
                    break;
                case 7:
                    System.out.println("Requisicoes Pendentes:");
                    for (Requisicao req : Sistema.getRequisicoes()) {
                        System.out.println(req);
                    }
                    break;
                case 8:
                    System.out.println("Registros de Coleta:");
                    for (Registro reg : Sistema.getRegistros()) {
                        System.out.println(reg);
                    }
                    break;
                case 9:
                    System.out.println("Exames Realizados:");
                    for (Exame exam : Sistema.getExames()) {
                        System.out.println(exam);
                    }
                    break;
                case 10:
                    sair = true;
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
