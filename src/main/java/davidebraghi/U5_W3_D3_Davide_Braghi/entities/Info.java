package davidebraghi.U5_W3_D3_Davide_Braghi.entities;

import java.util.Date;

public class Info {
    private String nome;
    private String cognome;
    private Date dataDiNascita;

    public Info(String nome, String cognome, Date dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    public String getNomeCompleto() {
        return nome + " " + cognome;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }
}

