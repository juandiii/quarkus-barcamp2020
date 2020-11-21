package com.github.juandiii.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

@ApplicationScoped
public class StoreProducer {

  public StoreProducer() {
  }

  @Produces
  @Singleton
  public StoreImpl store() {
    return new StoreImpl();
  }

}
