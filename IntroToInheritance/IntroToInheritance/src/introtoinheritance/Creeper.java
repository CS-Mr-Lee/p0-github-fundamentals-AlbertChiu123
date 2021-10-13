/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introtoinheritance;

public class Creeper {
  private int x,y,z;
  private int hp;

  public Creeper(int x, int y, int z, int hp) {
    this.x = x;
    this.y = y;
    this.z = z;
    this.hp = 20;
  }

  //Accessors

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public int getZ() {
    return this.z;
  }

  public int getHP() {
    return this.hp;
  }

  //Mutators
  public void move(int xChange, int yChange, int zChange) {
    this.x += xChange;
    this.y += yChange;
    this.z += zChange;
  }

  public void sound() {
    System.out.println("Hiss");
  }

  public void explode() {
    this.sound();
    System.out.println("Explode");
  }
}