package com.sude.expenseproject.Service;

import com.sude.expenseproject.Entity.Income;
import com.sude.expenseproject.Repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeService {

   @Autowired
   private final IncomeRepository incomeRepository;

    public IncomeService(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }

    public Income addIncome(Income income) {
        return incomeRepository.save(income);
    }
    public boolean deleteIncome(Long id){
        incomeRepository.deleteById(id);
        return true;
    }

    public List<Income> getAllIncomes() {
        return incomeRepository.findAll();
    }
}
