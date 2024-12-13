package com.sude.expenseproject;

import lombok.Data;

@Data
public class IncomeDto {
    private String receiptNo;
    private String description;
    private Integer price;
}
