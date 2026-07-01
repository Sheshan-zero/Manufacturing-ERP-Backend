package com.erp.manufacturing.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
