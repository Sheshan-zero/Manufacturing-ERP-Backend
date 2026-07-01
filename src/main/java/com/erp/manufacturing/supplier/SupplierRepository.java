package com.erp.manufacturing.supplier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
