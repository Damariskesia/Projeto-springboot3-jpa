package dama.estudos.estudos.services;

import dama.estudos.estudos.entities.OrderItem;
import dama.estudos.estudos.entities.User;
import dama.estudos.estudos.repositories.OrderItemRepository;
import dama.estudos.estudos.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository repository;

    public List<OrderItem> findAll() {
        return repository.findAll();
    }

    public OrderItem findById(Long id){
        Optional<OrderItem> obj = repository.findById(id);
        return obj.get();
    }
}
