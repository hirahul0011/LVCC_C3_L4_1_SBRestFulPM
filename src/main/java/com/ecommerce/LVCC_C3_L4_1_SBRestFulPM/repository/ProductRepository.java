package com.ecommerce.LVCC_C3_L4_1_SBRestFulPM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.LVCC_C3_L4_1_SBRestFulPM.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

}
