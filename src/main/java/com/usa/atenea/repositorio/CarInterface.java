package com.usa.atenea.repositorio;

import com.usa.atenea.modelo.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CarInterface extends JpaRepository<CarModel,Integer>{
}
