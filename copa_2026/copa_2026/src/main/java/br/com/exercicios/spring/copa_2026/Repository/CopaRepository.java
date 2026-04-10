package br.com.exercicios.spring.copa_2026.Repository;

import br.com.exercicios.spring.copa_2026.Entity.Copa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CopaRepository extends JpaRepository<Copa, Long> {

Optional<Copa> findByAno(Integer ano);

}
