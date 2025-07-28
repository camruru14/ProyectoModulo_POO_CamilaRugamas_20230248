package proyectomodulo_poo_CamilaRugamas_20230248.CamilaRugamas_20230248.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectomodulo_poo_CamilaRugamas_20230248.CamilaRugamas_20230248.Entities.ProviderEntity;
import proyectomodulo_poo_CamilaRugamas_20230248.CamilaRugamas_20230248.Models.DTO.ProviderDTO;
import proyectomodulo_poo_CamilaRugamas_20230248.CamilaRugamas_20230248.Repositories.ProviderRepository;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository repo;

    public List<ProviderDTO> getAllUsers() {
    List<ProviderEntity> proveedores = repo.findAll();
        return proveedores.stream()
            .map(this::convertirPADTO)
            .collect(Collectors.toList());
    }

    private ProviderDTO convertirPADTO(ProviderEntity proveedor) {
        ProviderDTO dto = new ProviderDTO();
        dto.setId(proveedor.getId());
        dto.setNombre(proveedor.getNombre());
        dto.setTelefono(proveedor.getTelefono());
        dto.setCorreo(proveedor.getCorreo());
        dto.setDireccion(proveedor.getDireccion());
        dto.setCodigo(proveedor.getCodigo());
        dto.setEstado(proveedor.getEstado());
        dto.setComentarios(proveedor.getComentarios());
        return dto;
    }
}
