package com.mycompany.sistemamedico;

/**
 *
 * @author rafaz
 */
public class Exame {
    private String resultado;
    private String parecer;

    public Exame(String resultado, String parecer)
    {
        this.resultado = resultado;
        this.parecer = parecer;
    }

    // Getters e setters
    public String getResultado()
    {
        return resultado;
    }

    public void setResultado(String resultado)
    {
        this.resultado = resultado;
    }

    public String getParecer()
    {
        return parecer;
    }

    public void setParecer(String parecer)
    {
        this.parecer = parecer;
    }

    @Override
    public String toString()
    {
        return "Exame{" +
                "resultado='" + resultado + '\'' +
                ", parecer='" + parecer + '\'' +
                '}';
    }
}

