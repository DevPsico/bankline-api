package com.dio.santander.bankline.api.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dio.santander.bankline.api.model.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer>{

}
