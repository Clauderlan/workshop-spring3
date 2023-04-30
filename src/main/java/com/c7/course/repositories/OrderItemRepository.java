package com.c7.course.repositories;

import com.c7.course.entities.OrderItem;
import com.c7.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
