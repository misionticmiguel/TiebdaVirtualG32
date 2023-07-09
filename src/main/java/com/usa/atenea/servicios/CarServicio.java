package com.usa.atenea.servicios;

import com.usa.atenea.modelo.CarModel;
import com.usa.atenea.repositorio.CarInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServicio {
    @Autowired
    CarInterface carInterface;

    public Optional<CarModel> obtenerCarPorId(int id){
        return carInterface.findById(id);
    }
    public List<CarModel> obtenerTodosCar(){
        return carInterface.findAll();
    }
    public void crearCar(CarModel carModel){
        if(!carInterface.existsById(carModel.getId())) {
            carInterface.save(carModel);
        }
    }
    public void elinimarCarPorId(int id){
        carInterface.deleteById(id);
    }
    public void actualizarCar(CarModel carModel){
       if(carInterface.existsById(carModel.getId())){
           carInterface.save(carModel);
       }

    }
    
}
