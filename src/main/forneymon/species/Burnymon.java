package main.forneymon.species;

/**
 * Burnymons singe their opponents with the powers of 5 suns,
 * and start with 15 health
 */
public class Burnymon extends Forneymon {
    
    private static final int STARTING_HEALTH = 15;
    
    /**
     * Creates a new Burnymon with the given name n.
     * Starts with 15 health
     * @param n The Burnymon's given name
     */
    public Burnymon (String n) {
        super(STARTING_HEALTH, n);
    }
    
}
