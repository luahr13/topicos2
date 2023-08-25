package br.unitins.model;

import jakarta.persistence.Entity;

@Entity
public class Usuario extends DefaultEntity{
    private String nome;
    private String cpf;

    //@Enumerated(EnumType.STRING)
    //private Perfil perfil;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //public Perfil getPerfil() {
    //    return perfil;
   // }

    //public void setPerfil(Perfil perfil) {
   //     this.perfil = perfil;
    //}

    

}
