package br.unitins.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record UsuarioDTO(
    @NotBlank(message = "O campo precisa ser preenchido.")
    String nome,

    @NotBlank(message = "O campo precisa ser preenchido.")
    @Pattern(regexp = "[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}", message = "O CPF deve estar no formato 999.999.999-99")
    String cpf

    // Integer idPerfil
)
{
    
}
