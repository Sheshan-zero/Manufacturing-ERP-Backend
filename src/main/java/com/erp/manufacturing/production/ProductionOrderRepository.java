package com.erp.manufacturing.production;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProductionOrderRepository extends JpaRepository<ProductionOrder, Long> {
}
