package com.github.juandiii.cdi;

import java.util.List;

import com.github.juandiii.entity.Coffee;

public interface Store {

  List<Coffee> getCoffess();

  void addCoffee(Coffee coffee);

  Coffee getCoffee(Integer id);

}
