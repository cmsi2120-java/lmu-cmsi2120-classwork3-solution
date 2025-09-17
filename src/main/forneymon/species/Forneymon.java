package main.forneymon.species;

import java.util.Objects;

/**
 * Forneymon are pseudo-mythical animal beings that are daily locked
 * in pseudo-humane combat for the viewing pleasure of the masses!
 */
abstract public class Forneymon implements MinForneymon {
    
    private int health;
    private String name;
    
    /**
     * Create a new Forneymon with the given name and starting health
     * @param h Starting health
     * @param n Their given name
     */
    public Forneymon (int h, String n) {
        health = h;
        name = n;
    }
    
    /**
     * Forneymon can take a specified integer damage of the given type,
     * where type will be something like "burny" or "dampy"
     * @param dmg The amount of damage to take
     * @param type The type of taken damage
     * @return The Forneymon's remaining health
     */
    public int takeDamage (int dmg, String type) {
        health -= dmg;
        return health;
    }
    
    /**
     * Prints the name of this Forneymon twice with a space in between
     * 
     * @return The twice repeated name String
     */
    @Override
    public String toString () {
        return name + " " + name;
    }
    
    /**
     * Two Forneymon are equivalent only if they share the same species
     * and name.
     */
    @Override
    public boolean equals (Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return this.name.equals(((Forneymon) other).name);
    }
    
    @Override
    public int hashCode () {
        return Objects.hash(this.name);
    }
    
    /**
     * Returns the current health of this Forneymon.
     * @return The current health of this Forneymon.
     */
    public int getHealth () {return health;}
    
    /**
     * Returns the name of this Forneymon.
     * @return The name of this Forneymon.
     */
    public String getName () {return name;}
    
}
