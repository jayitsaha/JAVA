/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Jayit
 */

public class ChemicalElement implements Comparable {
    
        private String symbol = "";
        
        private int atomicNumber = 1;
        
        /**
         * this value measures the affinity to bind an electron
         */
        private double electronegativity;
        
        public static final ChemicalElement HYDROGEN = new ChemicalElement("H", 1, 2.20);
    
        public static final ChemicalElement OXYGEN = new ChemicalElement("O", 8, 3.44);
    
        public static final ChemicalElement POTASSIUM = new ChemicalElement("K", 19, 0.82);
        
        public static final ChemicalElement ZINC = new ChemicalElement("Zn", 30, 1.65);
        
        public static final ChemicalElement GALLIUM = new ChemicalElement("Ga", 31, 1.81);
        
        private static boolean [] alkaliMetal = new boolean[119];
        
        static {
            alkaliMetal[3] = true;
            alkaliMetal[11] = true;
            alkaliMetal[19] = true;
            alkaliMetal[37] = true;
            alkaliMetal[55] = true;
            alkaliMetal[85] = true;
        }
        
        /**
         * Creates a new chemical element with given symbolic name,
         * atomic number (number of protons), and electronegativity.
        */
        public ChemicalElement(String symbol, int atomicNumber,
                double electronegativity)  {
            this.symbol = symbol;
            this.atomicNumber = atomicNumber;
            this.electronegativity = electronegativity;
        }
        
        /**
         * Creates a new chemical element with given symbolic name,
         * atomic number, and electronegativity 0.
         */
        public ChemicalElement(String symbol, int electronegativity) {
            this(symbol, electronegativity, 0);
        }
        
        /**
         * Returns true if and only if this chemical element is a metal.
         */
        public boolean isMetal() {
            boolean metal = false;
            
            switch (atomicNumber) {
            case 13:
            case 31:
            case 49:
            case 50:
            case 81:
            case 82:
            case 83:
            case 113:
            case 114:
            case 115:
            case 116: metal = true;
            }
            return metal;
        }
        /**
         * Returns true if and only if this chemical element is
         * an alkali metal.
         */
        public boolean isAlkaliMetal() {
            // This is the fastes implementation variant.
            // The maintainability is a little worse than the other
            // two implementations, because the initialization of the data
            // is seperated from this method.
            return alkaliMetal[atomicNumber];
        }
    
        /**
         * Retruns true if and only if this chemical metal is 
         * a transition metal. 
         */
        public boolean isTransitionMetal() {
            return 21 <= atomicNumber && atomicNumber <= 30
                || 39 <= atomicNumber && atomicNumber <= 48
                || 72 <= atomicNumber && atomicNumber <= 80;
        }
        
        /**
         * Returns the symbolic name of this chemical element (
         * one or two first letter of its latin name).
         */
        public String getSymbol() {
            return symbol;
        }
        
        /**
         * Returns the atomic number (number of protons) of this
         * chemical element.
         */
        public int getAtomicNumber() {
            return atomicNumber;
        }
        
        public double getElectronegativity() {
            return electronegativity;
        }
        
        public String toString() {
            return getSymbol();
        }
        /**
         * Compares two chemical elements with respect to their
         * electronegativity
         */
        public int compareTo(Object o) {
            ChemicalElement element = (ChemicalElement) o;
            
            // Note: NEVER compare floating points with the identity == operatore
            if ( Math.abs(electronegativity - element.electronegativity) <= 0.000000000001) {
                return 0;
            } else if ( electronegativity < element.electronegativity) {
                return -1;
            } else {
                return 1;
            }
        }
        
        public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
                System.out.println("ENTER SYMBOL OF ELEM1");
                String symbol1 = sc.next();
                 System.out.println("ENTER ATOMIC NO OF ELEM1");
               
                int atomicNumber1 = sc.nextInt();
                System.out.println("ENTER EN OF ELEM1");

                double EN1 = sc.nextDouble();
                
                
                System.out.println("ENTER SYMBOL OF ELEM2");
                String symbol2 = sc.next();
                System.out.println("ENTER ATOMIC NO OF ELEM2");

                int atomicNumber2 = sc.nextInt();
                System.out.println("ENTER EN OF ELEM2");
                
                double EN2 = sc.nextDouble();
                ChemicalElement elem1 = new ChemicalElement(symbol1,atomicNumber1,EN1);
                ChemicalElement elem2 = new ChemicalElement(symbol2,atomicNumber2,EN2);
                
                
                int getAt1 = elem1.getAtomicNumber();
                int getAt2 = elem2.getAtomicNumber();
                
                System.out.println("ATOMIC NO. OF ELEM1");
                System.out.println(getAt1);
                System.out.println("ATOMIC NO. OF ELEM2");
                System.out.println(getAt2);

                
                


                
		sc.close();
	}
    
        
     
    }

