package com.jody.employee.position;

import com.jody.employee.level.HasStaff;

import java.math.BigDecimal;

public abstract class AProgrammer extends AEmployee implements HasStaff {
    private int workingDays;
    private BigDecimal salary;

    public AProgrammer(BigDecimal salary, int workingDays) {
        this.workingDays = workingDays ;
        this.salary = salary;
    }

    @Override
    public BigDecimal salary() {
        return salary;
    }

    public BigDecimal mandays() {
        return new BigDecimal(100000);
    }

    public final BigDecimal getTakeHomePay() {
        return salary.add(mandays().multiply(BigDecimal.valueOf(workingDays))) ;
    }
}
