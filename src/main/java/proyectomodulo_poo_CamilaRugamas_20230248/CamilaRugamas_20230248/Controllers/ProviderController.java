package proyectomodulo_poo_CamilaRugamas_20230248.CamilaRugamas_20230248.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyectomodulo_poo_CamilaRugamas_20230248.CamilaRugamas_20230248.Models.DTO.ProviderDTO;
import proyectomodulo_poo_CamilaRugamas_20230248.CamilaRugamas_20230248.Services.ProviderService;

import java.util.List;

@RestController
@RequestMapping("/API")
public class ProviderController {

    @Autowired
    private ProviderService acceso;

    @GetMapping("/proveedores")
    public List<ProviderDTO> datosproveedores(){
        return acceso.getAllUsers();
    }

}
