/*
* Project:  Critter Lab
* Class: Wolf.java
* Author:    Ariel Khavasov
* Date:     November 17, 2021
* This Program Makes a farm
*/

import java.util.*;
public class Wolf implements Critter 
{
int moveCounter;
int direction;
public Wolf() {
this.moveCounter = 0;
this.direction = 0;
}
public char getChar() {
  return 'W';
}
public int getMove(CritterInfo info) {
  int [] directions = {SOUTH, NORTH, WEST, EAST};
  if (this.moveCounter > 0) {
  this.moveCounter--;
  } else {
  this.direction = 1;
  this.moveCounter = 2;
  }
  return directions [this.direction];
}
}