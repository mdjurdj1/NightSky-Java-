import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public NightSky(double density) {
        this(density, 20, 10);
    }
    
    public NightSky(int width, int height) {
        this(0.1, width, height);
    }
    
    public void printLine() {
        for(int i = 0; i < width; i++) {
            double rand = Math.random();
            if (rand <= density) {
                System.out.print("*");
                this.starsInLastPrint += 1;
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public void print() {
        this.starsInLastPrint = 0;
        for(int i = 0; i < height; i++) {
            printLine();
            System.out.println("");
        }
    }
    
    public int starsInLastPrint() {
        return starsInLastPrint;
    }
    
}
