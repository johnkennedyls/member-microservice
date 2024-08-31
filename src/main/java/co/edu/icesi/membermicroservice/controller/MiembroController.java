package co.edu.icesi.membermicroservice.controller;

import co.edu.icesi.membermicroservice.model.Miembro;
import co.edu.icesi.membermicroservice.service.MiembroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/miembros")
public class MiembroController {

    @Autowired
    private MiembroService miembroService;

    @PostMapping(path = "/registrar")
    public Miembro registrarMiembro(@RequestBody Miembro miembro) {
        return miembroService.registrarMiembro(miembro);
    }

    @GetMapping(path = "/todos")
    public List<Miembro> obtenerTodosMiembros() {
        return miembroService.obtenerTodosMiembros();
    }

    @PutMapping(path = "/actualizar/{id}")
    public Miembro actualizarMiembro(@PathVariable Long id, @RequestBody Miembro miembro) {
        return miembroService.actualizarMiembro(id, miembro);
    }

    @DeleteMapping(path = "/eliminar/{id}")
    public void eliminarMiembro(@PathVariable Long id) {
        miembroService.eliminarMiembro(id);
    }
}
