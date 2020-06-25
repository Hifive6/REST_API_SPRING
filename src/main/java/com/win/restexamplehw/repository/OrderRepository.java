package com.win.restexamplehw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.win.restexamplehw.domain.*;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}