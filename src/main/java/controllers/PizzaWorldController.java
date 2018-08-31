package controllers;

import models.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.PizzaServices;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class PizzaWorldController {

    @Autowired
    private PizzaServices pizzaServices;


    @GetMapping("/pizza")
    public List<Pizza> getAll(){
      return  pizzaServices.allPizzas();


    }

    @GetMapping("/pizza/{id}")
    public Optional<Pizza> getOne(@PathVariable final String id){
         return pizzaServices.onePizza(id);


    }

    @PostMapping("/pizza")
    public void  addPizza(@RequestBody Pizza pizza) {
        pizzaServices.addPizza(pizza);

    }

   }
