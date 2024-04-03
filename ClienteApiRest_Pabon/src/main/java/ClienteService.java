import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Period;

@Service
public class ClienteService {

    public Cliente obtenerClienteConEdad(Cliente cliente) {
        LocalDate fechaNacimiento = cliente.getFechaNacimiento();
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        int edad = periodo.getYears();
        
        // Creamos un nuevo objeto Cliente con la edad calculada
        Cliente clienteConEdad = new Cliente(cliente.getNombre(), cliente.getApellido(), cliente.getFechaNacimiento());
        
        return clienteConEdad;
    }
}
