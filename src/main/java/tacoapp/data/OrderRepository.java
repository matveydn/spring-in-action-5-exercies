package tacoapp.data;

import tacoapp.Order;

public interface OrderRepository {

    Order save(Order order);
}
