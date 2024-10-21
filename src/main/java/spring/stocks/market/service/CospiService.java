package spring.stocks.market.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.stocks.market.component.JsoupComponent;
import spring.stocks.market.domain.KospiStockDto;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CospiService {

    private final JsoupComponent jsoupComponent;

    public List<KospiStockDto> getKosPiStockList() {
        return jsoupComponent.getKosPiStockList();
    }
}
