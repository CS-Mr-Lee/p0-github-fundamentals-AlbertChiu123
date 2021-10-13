/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introtoinheritance;


public class Skeleton extends Mob{
  //Attributes
  //what attribute should be created for range
  //or shooting?
// private int x,y,z;
  // private int hp;
  private String weapon;
    private String x;
    private String y;
    private String z;
    private String hp;

  public Skeleton(int x, int y, int z, int hp, String weapon) {
    super(x, y, z, hp);
    this.weapon = weapon;
    // this.x = x;
    // this.y = y;
    // this.z = z;
    // this.hp = hp;
  }

  //Constructor
  //What should the constructor look like? How
  //is it different from a normal Mob?


  //Methods
  //What method is uniquely a Skeleton's?
  public void sound() {
    System.out.println("Crackling bone");
  }

  public void shootArrow() {
    System.out.println("I shot you!");
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
