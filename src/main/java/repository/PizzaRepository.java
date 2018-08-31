package repository;

import models.Pizza;
import org.springframework.data.repository.CrudRepository;

public interface PizzaRepository  extends CrudRepository<Pizza, String> {
}
