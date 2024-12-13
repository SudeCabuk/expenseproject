package com.sude.expenseproject.Controllers;

import com.sude.expenseproject.Entity.Income;
import com.sude.expenseproject.IncomeDto;
import com.sude.expenseproject.Service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/incomes")
public class IncomeController {
    @Autowired
    private IncomeService incomeService;

    @PostMapping
    public List<Income> createIncomes(@RequestBody List<IncomeDto> incomes) {

           for(IncomeDto income:incomes){
               if(income.getDescription() != null && income.getPrice() !=null && income.getReceiptNo() != null){
                   Income income1 = new Income();
                   income1.setPrice(income.getPrice());
                   income1.setDescription(income.getDescription());
                   income1.setReceiptNo(Long.valueOf(income.getReceiptNo()));
                   incomeService.addIncome(income1);
               }
           }

        return incomeService.getAllIncomes();
    }
    @GetMapping
    public List<Income> getIncomes() {
        return incomeService.getAllIncomes();
    }

    @DeleteMapping
    public boolean deleteIncome(@RequestParam Long id) {
        return incomeService.deleteIncome(id);
    }
}
