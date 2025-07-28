package proyectomodulo_poo_CamilaRugamas_20230248.CamilaRugamas_20230248.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Entity
@Table(name = "TBPROVIDER")
@Getter @Setter @ToString @EqualsAndHashCode
public class ProviderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_provider")
    @SequenceGenerator(name = "seq_provider", sequenceName = "seq_provider", allocationSize = 1)
    @Column(name = "PROVIDERID")
    private Long id;

    @Column(name = "PROVIDERNAME")
    private String nombre;

    @Column(name = "PROVIDERPHONE")
    private Long telefono;

    @Column(name = "PROVIDERADDRESS")
    private String direccion;

    @Column(name = "PROVIDEREMAIL")
    private String correo;

    @Column(name = "PROVIDERCODE")
    private String codigo;

    @Column(name = "PROVIDERSTATUS")
    private Long estado;

    @Column(name = "PROVIDERCOMMENTS")
    private String comentarios;


}
