package com.jody.employee.position;

import com.jody.employee.level.HasManager;

import java.math.BigDecimal;

public abstract class AManagerOperational extends AEmployee implements HasManager {
    private BigDecimal salary;

    public AManagerOperational(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal positionalAllowance() {
        return new BigDecimal(6000000);
    }

    public BigDecimal salary() {
        return salary;
    }

    public BigDecimal getTakeHomePay() {
        return salary().add(positionalAllowance());
    }
}
