package com.SpringBoot.ProjetoJava.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
@Table ( name = "Armazenamento_de_Senhas" )

public class ProjetoJavaEntity {


    @Id @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private long id;

    @NotBlank
    private String nome;

    @Email @NotBlank
    private String email;
    @NotBlank @Size( min = 12)
    private String senha;


    public ProjetoJavaEntity ( ) { }


    public ProjetoJavaEntity ( String nome, String email, String senha ){
        this.nome = nome;
        this.email = email;
        this.senha = senha;}
}
