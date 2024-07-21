package dama.estudos.estudos.services;

import dama.estudos.estudos.entities.Order;
import dama.estudos.estudos.entities.User;
import dama.estudos.estudos.repositories.OrderRepository;
import dama.estudos.estudos.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
