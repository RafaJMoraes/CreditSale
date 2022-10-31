package com.cursoBackend.fiado.repository;



import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cursoBackend.fiado.domain.Cliente;
import com.cursoBackend.fiado.domain.CompraFiada;


public interface ComprasRepository extends JpaRepository<CompraFiada, UUID> {



}
