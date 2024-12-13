package com.sude.expenseproject.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "incomes")
@Data
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long receiptNo;
    private String description;
    private Integer price;


}

