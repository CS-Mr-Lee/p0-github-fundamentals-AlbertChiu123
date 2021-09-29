/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author alber_3d0phb2
 */
public class TestDog {
    public static void main (String[] args){
        int WateverItIs = 10;
        //First cat's characteristics
        Dog dog1 = new Dog("Yoo Me", "Tuna", "medium", "Black and white", "Munchkin", 15, 'M', 160);
        
        //Second cat's characteristics
        Dog dog2 = new Dog("Joh", "Peanut", "small", "Oramge", "Tabby", 36, 'F', 260);

        
        //Print cat's characteristic
        System.out.println(dog1.Name);
        dog1.sleep();
        System.out.println(dog2.Name);
        dog1.eat(WateverItIs);
        System.out.println(dog2.Name);
        dog1.poop();
        Dog cat3 = new Dog("Me Yoo", "Salmon", "Huge", "Puce", "English Fold", 45, 'F', 3060);
        cat3.sleep();
    }
}
