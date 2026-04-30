package com.bankapp.bankapp.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class AccountRequest {
    private Long userId;
    private BigDecimal initialBalance;
}