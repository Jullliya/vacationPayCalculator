package dev.jullliya.calculate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PayDto {

    private Long averageSalary;
    private Long vacationDays;
    private Double vacationPay;

}
