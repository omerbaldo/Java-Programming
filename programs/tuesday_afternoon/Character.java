package tuesday_afternoon;


public class Character {
 
     
    public String name = "Geoff";
    
    public int strength = 10;
    public int health = 20;
    public int defense = 5;
     
    public int takeDamage(int damage){
       int damageTaken = damage - this.defense;
       this.health -= damageTaken;
       return damageTaken;
    }
    public int attack(Character target){
         int damageDealt = this.strength + Arena.generator.nextInt(5);
         return target.takeDamage(damageDealt);
    }
}

