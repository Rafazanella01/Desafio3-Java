package com.mycompany.sistemamedico;
import java.util.Arrays;
import java.util.Date;
/**
 *
 * @author rafaz
 */
public class main {
    public static void main(String[] args) {
    
        System.out.println("Oiii lucas");
        
        Medico medico = new Medico("Dr. João", 45, "Masculino", "joao.med", "12345", Arrays.asList("MEDICO"), "Cardiologia");

        Paciente paciente = new Paciente("Maria Silva", 30, "Feminino", "maria.silva", "senha123", Arrays.asList("PACIENTE"));

        Funcionario funcionario = new Funcionario("Carlos Souza", 35, "Masculino", "carlos.souza", "admin123", Arrays.asList("FUNCIONARIO", "ADMIN"));

        Requisicao requisicao = new Requisicao("Colesterol", medico, new Date());

        Registro registro = new Registro("Sangue", 5.0f, "10:00");

        Exame exame = new Exame("Resultado do exame", "Parecer do médico");

        System.out.println(medico);
        System.out.println(paciente);
        System.out.println(funcionario);
        System.out.println(requisicao);
        System.out.println(registro);
        System.out.println(exame);
    }
}
