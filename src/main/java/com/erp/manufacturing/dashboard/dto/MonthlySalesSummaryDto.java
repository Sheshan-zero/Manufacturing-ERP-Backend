package com.erp.manufacturing.dashboard.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;

public record MonthlySalesSummaryDto(
        String month,
        BigDecimal totalSalesAmount
) {
}
