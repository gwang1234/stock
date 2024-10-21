package spring.stocks.market.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.stocks.market.domain.KospiStockDto;
import spring.stocks.market.service.CospiService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CospiController {

    private final CospiService cospiService;

    @GetMapping("/kospi/all")
    public List<KospiStockDto> getKosPiStockList(HttpServletRequest request) {
        return cospiService.getKosPiStockList();

    }
}
