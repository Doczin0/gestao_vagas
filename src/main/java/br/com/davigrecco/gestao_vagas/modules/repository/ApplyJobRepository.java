package br.com.davigrecco.gestao_vagas.modules.repository;

import br.com.davigrecco.gestao_vagas.modules.candidate.entity.ApplyJobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

// Mude de 'public class' para 'public interface'
public interface ApplyJobRepository extends JpaRepository<ApplyJobEntity, UUID> {
}