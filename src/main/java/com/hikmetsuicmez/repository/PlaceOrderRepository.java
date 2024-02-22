package com.hikmetsuicmez.repository;

import com.hikmetsuicmez.entity.PlacedOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceOrderRepository extends JpaRepository<PlacedOrder,Long> {

}
