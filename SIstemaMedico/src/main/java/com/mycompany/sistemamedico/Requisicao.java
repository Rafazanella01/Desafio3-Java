package com.mycompany.sistemamedico;

/**
 *
 * @author rafaz
 */
import java.util.Date;

public class Requisicao {
    private String tipoExame;
    private Medico medico;
    private Date data;

    public Requisicao(String tipoExame, Medico medico, Date data)
    {
        this.tipoExame = tipoExame;
        this.medico = medico;
        this.data = data;
    }

    // Getters e setters
    public String getTipoExame()
    {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame)
    {
        this.tipoExame = tipoExame;
    }

    public Medico getMedico()
    {
        return medico;
    }

    public void setMedico(Medico medico)
    {
        this.medico = medico;
    }

    public Date getData()
    {
        return data;
    }

    public void setData(Date data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "Requisicao{" +
                "tipoExame='" + tipoExame + '\'' +
                ", medico=" + medico +
                ", data=" + data +
                '}';
    }
}

