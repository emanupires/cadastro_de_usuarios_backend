package br.com.api.projeto.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "usuario")
@Getter @Setter @NoArgsConstructor // <---
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotBlank(message = "O nome deve ser preenchido!")
    @Size(min = 3, message="O nome deve ter no mínimo 3 caracteres.")
    @Column(name = "nome", length = 200, nullable = false)
    private String nome;

    @Email(message = "O e-mail deve ser válido!")
    @NotBlank(message = "O e-mail deve ser preenchido!")
    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @NotBlank(message = "A senha deve ser preenchido!")
    @Column(name = "senha", columnDefinition = "TEXT", nullable = false)
    private String senha;

    @NotBlank(message = "O telefone deve ser preenchido!")
    @Column(name = "telefone", length = 15, nullable = false)
    private String telefone;
}

