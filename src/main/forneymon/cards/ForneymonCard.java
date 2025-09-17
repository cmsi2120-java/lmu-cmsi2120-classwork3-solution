package main.forneymon.cards;

import main.forneymon.species.*;

/**
 * Card-based representation of a Forneymon.
 */
public class ForneymonCard {

    private Forneymon forneymon;

    /**
     * Creates a new ForneymonCard with a reference to the given
     * Forneymon
     *
     * @param forneymon The Forneymon referenced by the card
     */
    public ForneymonCard (Forneymon forneymon) {
        if (forneymon == null) {
            throw new IllegalArgumentException();
        }

        this.forneymon = forneymon;
    }

    /**
     * Default constructor to create a new ForneymonCard of type
     * Burnymon with name "MissingNu"
     */
    public ForneymonCard () {
        this.forneymon = new Burnymon("MissingNu");
    }

    /**
     * Getter for the name given to the Forneymon represented by
     * this card
     *
     * @return The card's Forneymon's name, e.g., "Burny"
     */
    public String getName () {return this.forneymon.getName();}

    /**
     * Getter for the type of the Forneymon represented by this
     * card
     *
     * @return The card's Forneymon's type, e.g., "Dampymon"
     */
    public String getType () {return this.forneymon.getClass().getSimpleName();}

    /**
     * Returns a String of the format "Type: Name" for the Forneymon
     * represented by this card.
     *
     * @return A String representation of this Card's Forneymon's type and name
     */
    @Override
    public String toString () {
        return this.getType() + ": " + this.getName();
    }

    /**
     * This ForneymonCard is considered property equivalent to another if the
     * Forneymon they represent are the same species and have the same name,
     * the property equivalence test of Forneymon
     *
     * @param other The other thing to test for equivalence
     * @return Whether or not this ForneymonCard is equivalent
     */
    @Override
    public boolean equals (Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return this.forneymon.equals(((ForneymonCard) other).forneymon);
    }

    @Override
    public int hashCode () {
        return this.forneymon.hashCode();
    }

}
