package com.mycompany.sistemamedico;

/**
 *
 * @author rafaz
 */
public class Registro {
    private String tipoMaterialColetado;
    private float quantidade;
    private String horaColeta;

    public Registro(String tipoMaterialColetado, float quantidade, String horaColeta)
    {
        this.tipoMaterialColetado = tipoMaterialColetado;
        this.quantidade = quantidade;
        this.horaColeta = horaColeta;
    }

    // Getters e setters
    public String getTipoMaterialColetado()
    {
        return tipoMaterialColetado;
    }

    public void setTipoMaterialColetado(String tipoMaterialColetado)
    {
        this.tipoMaterialColetado = tipoMaterialColetado;
    }

    public float getQuantidade()
    {
        return quantidade;
    }

    public void setQuantidade(float quantidade)
    {
        this.quantidade = quantidade;
    }

    public String getHoraColeta()
    {
        return horaColeta;
    }

    public void setHoraColeta(String horaColeta)
    {
        this.horaColeta = horaColeta;
    }

    @Override
    public String toString()
    {
        return "Registro{" +
                "tipoMaterialColetado='" + tipoMaterialColetado + '\'' +
                ", quantidade=" + quantidade +
                ", horaColeta='" + horaColeta + '\'' +
                '}';
    }
}

