/*
* Project:  Critter
* Class: Turtle.java
* Author:    Ariel Khavasov
* Date:     November 17, 2021
* This Program Makes a farm
*/

import java.util.*;
public class Turtle implements Critter 
{
int moveCounter;
int direction;
int counter = 0;
public Turtle() {
this.moveCounter = 0;
this.direction = 0;
}
public char getChar() {
  return 'T';
}
public int getMove(CritterInfo info) {
    
  Random rand = new Random();
  int [] directions = {SOUTH, WEST, NORTH, EAST};
  if(this.moveCounter > 0)
  {
      moveCounter--;

  }
  else {
    
        this.direction = counter;;
        counter++;
        this.moveCounter = 4;
        
}
if(counter == directions.length )
{
    counter = 0;
}

return directions [this.direction];
}
}