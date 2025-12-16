package cl.duoc.ms_news_bff.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewsArticleDto {
    @JsonProperty("id")
    private Long id;
    
    @JsonProperty("titulo")
    private String titulo;
    
    @JsonProperty("descripcion")
    private String descripcion;
    
    @JsonProperty("contenido")
    private String contenido;
    
    @JsonProperty("autor")
    private String autor;
    
    @JsonProperty("fechaPublicacion")
    private String fechaPublicacion;
    
    @JsonProperty("esPublicado")
    private Boolean esPublicado;
    
    @JsonProperty("imagenUri")
    private String imagenUri;
}
