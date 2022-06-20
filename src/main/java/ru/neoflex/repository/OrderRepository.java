package ru.neoflex.repository;

import ru.neoflex.model.Order;

/**
 * OrderReposiroey.
 *
 * @author nanikeev
 */
public interface OrderRepository {

    Order findById(Long id);
    void save(Order order);
}
