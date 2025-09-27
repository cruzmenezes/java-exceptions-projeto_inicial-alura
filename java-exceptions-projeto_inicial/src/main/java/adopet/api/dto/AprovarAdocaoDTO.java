package adopet.api.dto;

import jakarta.validation.constraints.NotNull;

public record AprovarAdocaoDTO(@NotNull Long idAdocao, String justificativa) {

    public String justificativa() {
        return justificativa; // retorna o valor do campo
    }
}
