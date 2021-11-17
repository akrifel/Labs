/*
* Project:  Critter
* Class: Bird.java
* Author:    Ariel Khavasov
* Date:     November 17, 2021
* This Program Makes a farm
*/
import java.util.*;
public class Bird implements Critter {
public char getChar() {
  return 'B';
}
public int getMove(CritterInfo info) {
  Random rand = new Random();
  int [] directions = {SOUTH, NORTH, WEST, EAST};
  return directions [rand.nextInt(4)];
}
}
