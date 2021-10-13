/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introtoinheritance;


public class Zombie extends Mob {
  // private int x,y,z;
  // private int hp;
  private String weapon;
    private String x;
    private String y;
    private String z;
    private String hp;

  public Zombie(int x, int y, int z, int hp, String weapon) {
    super(x, y, z, hp);
    this.weapon = weapon;
    // this.x = x;
    // this.y = y;
    // this.z = z;
    // this.hp = hp;
  }

  //Accessors

  // public int getX() {
  //   return this.x;
  // }

  // public int getY() {
  //   return this.y;
  // }

  // public int getZ() {
  //   return this.z;
  // }

  // public int getHP() {
  //   return this.hp;
  // }

  //Mutators
  // public void move(int xChange, int yChange, int zChange) {
  //   this.x += xChange;
  //   this.y += yChange;
  //   this.z += zChange;
  // }

  public void sound() {
    System.out.println("Grrrrr");
  }

  public void attack() {
    System.out.println("I hit you!");
  }

  public String toString() {
    String ret = "x: " + this.x + " " +
                 "y: " + this.y + " " +
                 "z: " + this.z + " " +
                 "Hp: " + this.hp;
    return ret;
  }
}

