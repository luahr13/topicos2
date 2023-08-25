package br.unitins.dto;

import br.unitins.model.Usuario;

public record UsuarioResponseDTO(

    Long id,
    String nome,
    String cpf
    // @JsonInclude(JsonInclude.Include.NON_NULL)
    // Perfil perfil
) {
    public UsuarioResponseDTO (Usuario usuario){
            this(usuario.getId(),
                usuario.getNome(),
                usuario.getCpf()
                );
    }
}
