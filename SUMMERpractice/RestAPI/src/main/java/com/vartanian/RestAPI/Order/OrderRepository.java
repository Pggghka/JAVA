package com.vartanian.RestAPI.Order;

import com.vartanian.RestAPI.Order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order, Long> {
}
