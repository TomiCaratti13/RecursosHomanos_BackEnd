package trc.recursos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import trc.recursos.modelo.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
}
