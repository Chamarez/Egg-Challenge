package Egg.Challenge.challenge.orders.controllers;

import Egg.Challenge.challenge.auth.models.User;
import Egg.Challenge.challenge.auth.repository.UserRepository;
import Egg.Challenge.challenge.orders.models.Order;
import Egg.Challenge.challenge.orders.payloads.OrderRequest;
import Egg.Challenge.challenge.orders.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("customers")
public class CustomerController {
    @Autowired
    private UserRepository customerService;
    @Autowired
    private OrderRepository orderRepository;

    @PutMapping
    public void addHusband(@Valid @RequestBody OrderRequest orderRequest) {

        User newCustomer = customerService.findByUsername(orderRequest.getUsername());
        System.out.println(newCustomer.toString());

        Order order = new Order();
        order.setDesc(orderRequest.getDesc());
        order.setOrd_date();
        order.setState(orderRequest.getState());
        orderRepository.save(order);
        newCustomer.setOrders(order);
        customerService.save(newCustomer);



    }

    @GetMapping
    public ResponseEntity<List<User>> getAllCustomers(){
        return ResponseEntity.ok(customerService.findAll());
    }


}
