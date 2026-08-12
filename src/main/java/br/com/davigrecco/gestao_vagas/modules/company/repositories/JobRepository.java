package br.com.davigrecco.gestao_vagas.modules.company.repositories;

import br.com.davigrecco.gestao_vagas.modules.company.entities.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {


    //Contains - LIKE
    //Select * from job where descrpition like procurar em qualuqer lugar

    List<JobEntity> findByDescriptionContainingIgnoreCase(String filter);

}
