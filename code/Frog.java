/*
* Project:  Critter
* Class: Frog.java
* Author:    Ariel Khavasov
* Date:     November 17, 2021
* This Program Makes a farm
*/
import java.util.*;
public class Frog implements Critter 
{
int moveCounter;
int direction;
public Frog() {
this.moveCounter = 0;
this.direction = 0;
}
public char getChar() {
  return 'F';
}
public int getMove(CritterInfo info) {
  Random rand = new Random();
  int [] directions = {SOUTH, NORTH, WEST, EAST};
  if (this.moveCounter > 0) {
  this.moveCounter--;
  } else {
  this.direction = rand.nextInt(4);
  this.moveCounter = 2;
  }
  return directions [this.direction];
}
}