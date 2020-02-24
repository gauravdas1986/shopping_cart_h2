package com.gaurav.repository;
import com.gaurav.model.OrderProduct;
import com.gaurav.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}