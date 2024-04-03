import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente")
    public Cliente obtenerCliente() {
        // Simulamos la obtención de un cliente de alguna fuente de datos
        Cliente cliente = new Cliente("Juan", "Pérez", LocalDate.of(1990, 5, 15));
        // Calculamos la edad del cliente
        return clienteService.obtenerClienteConEdad(cliente);
    }
}

