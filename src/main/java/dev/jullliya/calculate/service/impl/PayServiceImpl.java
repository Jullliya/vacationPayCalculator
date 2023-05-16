package dev.jullliya.calculate.service.impl;
import dev.jullliya.calculate.dto.PayDto;
import dev.jullliya.calculate.service.PayService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PayServiceImpl implements PayService {

    private Map<PayDto, Double> response = new HashMap<>();

    public Double getPay(Long averageSalary, Long vacationDays) {
        PayDto payDto = new PayDto(averageSalary, vacationDays, (double)(averageSalary / 29 * vacationDays));
        response.put(payDto, (double)(averageSalary / 29 * vacationDays));
        return response.get(payDto);
    }
}
