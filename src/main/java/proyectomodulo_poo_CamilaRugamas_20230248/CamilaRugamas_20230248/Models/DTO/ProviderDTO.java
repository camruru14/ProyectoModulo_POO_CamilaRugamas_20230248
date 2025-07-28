package proyectomodulo_poo_CamilaRugamas_20230248.CamilaRugamas_20230248.Models.DTO;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString @EqualsAndHashCode
@Getter @Setter
public class ProviderDTO {

private Long id;

    @NotBlank(message = "El nombre del proveedor es obligatorio")
    private String nombre;

    @NotNull(message = "El apellido es obligatorio")
    private Long telefono;

    @NotBlank(message = "Debe ser una direccion valida")
    private String direccion;

    @Email(message = "Debe ser un correo valido")
    private String correo;

    @NotBlank(message = "debe ser un codigo valido")
    private String codigo;

    @NotNull
    private Long estado;

    @NotBlank
    private String comentarios;

}
