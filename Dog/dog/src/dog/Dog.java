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
public class Dog {

    // Variable for Cat's characteristics
        String Name;
        String FavFood;
        String Size;
        String Colour;
        String Breed;
        int Age;
        char Sex;
        double Weight;
        
        /*Constructor*/
        /*General Constructor*/
        public Dog(String Name, String FavFood, String Size, String Colour, String Breed, int Age, char Sex, double Weight){
            this.Name = Name;
            this.FavFood = FavFood;
            this.Size = Size;
            this.Colour = Colour;
            this.Breed = Breed;
            this.Age = Age;
            this.Sex = Sex;
            this.Weight = Weight;
            
        }
        

        public void sleep(){
            System.out.println(this.Name +" is sleeping.");
        }
        
        public void eat(int FoodGrams){
            System.out.println(this.Name +" is eating 15 grams of food.");
        }
        
        public void poop(){
            System.out.println(this.Name +" is pooping.");
        }
    
}
