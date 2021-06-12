package tp2.app;

import java.io.Serializable;

public class Zona {

    private int id;
    private String nome;

    public Zona(int id, String nome) {

        this.id= id;
        this.nome = nome;

    }

    public int getId()
    {

        return id;
    }
    public void setId(int id)
    {

        this.id = id;
    }
    public String getNome()
    {

        return nome;
    }

    public Zona(String nome)
    {

        this.nome = nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }
}
