package edu.grinnell.csc207.util;

/**
 * Simple counters.
 *
 * YOUR NAME HERE.
 */
public class Counter {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  private int counter;
  private int startingValue;
  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  public Counter() {
    this.counter = 0;
  }
  public Counter(int startingInt) {
    this.counter = startingInt;
    this.startingValue = startingInt;
  }

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  public void increment() {
    this.counter+=1;
  }
  public void reset() {
    this.counter=this.startingValue;
  }

  public String toString() {
    return Integer.toString(this.counter);
  }

  public int getCounter() {
    return this.counter;
  }
} // class Counter
