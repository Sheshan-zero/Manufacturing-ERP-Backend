package com.erp.manufacturing.dashboard;

import com.erp.manufacturing.dashboard.dto.MonthlySalesSummaryDto;
import com.erp.manufacturing.dashboard.dto.ProductionSummaryDto;
import com.erp.manufacturing.dashboard.dto.SupplierPurchaseSummaryDto;
import com.erp.manufacturing.dashboard.dto.TopSellingProductDto;
import com.erp.manufacturing.common.DtoMapper;
import com.erp.manufacturing.item.dto.ItemResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

public class DashboardController {
}
