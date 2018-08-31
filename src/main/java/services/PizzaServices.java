package services;

import models.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.PizzaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PizzaServices {


    @Autowired
    private PizzaRepository pizzaRepository;


    public List<Pizza> allPizzas(){

        List<Pizza> pizzas = (List<Pizza>) pizzaRepository.findAll();

        return  pizzas;
    }


    public Optional<Pizza> onePizza(String id){

       return pizzaRepository.findById(id);
    }


    public void addPizza( Pizza pizza){
        pizzaRepository.save(pizza);
    }


    public void updatePizza(Pizza pizza){
        pizzaRepository.save(pizza);

    }


    public void deletePizza(Pizza pizza){
        pizzaRepository.delete(pizza);
    }

}
