package org.sopt.homesool.infrastructure;

import org.sopt.homesool.domain.Payment;
import org.springframework.data.repository.Repository;

public interface PaymentRepository extends Repository<Payment, Long> {
    void save(Payment payment);
}
