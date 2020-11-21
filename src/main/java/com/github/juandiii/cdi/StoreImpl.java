package com.github.juandiii.cdi;

import java.util.ArrayList;
import java.util.List;

import com.github.juandiii.entity.Coffee;

public class StoreImpl implements Store {

  List<Coffee> coffeess = new ArrayList<>();

  public StoreImpl() {
    Coffee coffee1 = new Coffee();
    coffee1.coffee = "Coffee Origen de Colombia";
    coffee1.place = "Colombia";

    Coffee coffee2 = new Coffee();
    coffee2.coffee = "Coffee certified of Juan Valdez";
    coffee2.place = "Colombian";

    Coffee coffee3 = new Coffee();
    coffee3.coffee = "Coffee Premium";
    coffee3.place = "Colombia";

    coffeess.add(coffee1);
    coffeess.add(coffee2);
    coffeess.add(coffee3);
  }

  @Override
  public void addCoffee(Coffee coffee) {
    coffeess.add(coffee);
  }

  @Override
  public Coffee getCoffee(Integer id) {
    return coffeess.get(id);
  }

  @Override
  public List<Coffee> getCoffess() {
    return coffeess;
  }



}
