package com.erp.manufacturing.salesorder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SalesOrderRepository extends JpaRepository<SalesOrder, Long> {
}
