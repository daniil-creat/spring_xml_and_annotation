package ru.neoflex.repository.impl;

import lombok.extern.java.Log;
import org.springframework.stereotype.Component;
import ru.neoflex.model.Order;
import ru.neoflex.repository.OrderRepository;

/**
 * OrderRepositoryImpl.
 *
 * @author nanikeev
 */
@Log
@Component("orderRepositoryBean")
class OrderRepositoryImpl implements OrderRepository {

    @Override
    public Order findById(Long id) {
        log.info(String.format("find by id %s", id));
        return new Order();
    }

    @Override
    public void save(Order order) {
        log.info(String.format("Order %s saved", order));
    }
}
