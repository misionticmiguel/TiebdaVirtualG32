package com.usa.atenea.repositorio;

import com.usa.atenea.modelo.ClienteModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clientRepository extends JpaRepository<ClienteModelo,Integer> {
}
