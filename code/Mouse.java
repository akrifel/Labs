/*
* Project:  Critter
* Class: Mouse.java
* Author:    Ariel Khavasov
* Date:     November 17, 2021
* This Program Makes a farm
*/

import java.util.*;
public class Mouse implements Critter 
{
int moveCounter;
int direction;
public Mouse() {
this.moveCounter = 0;
this.direction = 2;
}
public char getChar() {
  return 'M';
}
public int getMove(CritterInfo info) {

  int [] directions = {SOUTH, NORTH, WEST, EAST};

  if(this.direction == 2)
  {
      this.direction = 1;}

  else if(this.direction == 1)
  {
      this.direction = 2;
  }
  return directions [this.direction]; 

}
}