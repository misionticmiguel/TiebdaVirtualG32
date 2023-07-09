package com.usa.atenea.controlador;

import com.usa.atenea.dtos.UsuariosDto;
import com.usa.atenea.modelo.CarModel;
import com.usa.atenea.servicios.CarServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CarControlador {

    @Autowired
    CarServicio carServicio;

    @GetMapping("/car")
    public Optional<CarModel> obtenerCarPorId(@RequestParam int id) {
        return carServicio.obtenerCarPorId(id);
    }
    @GetMapping("/car-todos")
    public List<CarModel> obtenerTodosPorId() {
        return carServicio.obtenerTodosCar();
    }
    @DeleteMapping("/car")
    public void elimenarCarPorId(@RequestParam int id) {
        carServicio.elinimarCarPorId(id);
    }
    @PostMapping("/car")
    public void crearCar(@RequestBody CarModel carModel) {
        carServicio.crearCar(carModel);
    }
    @PutMapping("/car")
    public void actualizarCar(@RequestBody CarModel carModel) {
        carServicio.actualizarCar(carModel);
    }
}
