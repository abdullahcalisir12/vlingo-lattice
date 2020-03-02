package io.vlingo.lattice.grid.example;

import io.vlingo.common.Completes;

public interface Greeting {
  void hello(final String name);
  Completes<Pinger> respond(final String name);
}