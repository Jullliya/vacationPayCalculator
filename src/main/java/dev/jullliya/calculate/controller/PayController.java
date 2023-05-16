package dev.jullliya.calculate.controller;

import dev.jullliya.calculate.dto.PayDto;
import dev.jullliya.calculate.service.PayService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private PayService payService;

    @GetMapping("/{averageSalary}/{vacationDays}")
    public ResponseEntity<?> getVacationPay(@PathVariable Long averageSalary, @PathVariable Long vacationDays) {
        PayDto payDto = new PayDto(averageSalary, vacationDays, (double) (averageSalary / 29 * vacationDays));
        return ResponseEntity.ok(payDto.getVacationPay());
    };
}
