package org.example;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Coordinates implements Cloneable {
    private static final Logger LOGGER = Logger.getLogger("global");
    int x;
    int y;

    Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String equals(Coordinates c3) {
        String result;
        result = this.x == c3.x && this.y == c3.y ? "true" : "false";
        return result;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
            Scanner sc = new Scanner(System.in);
            LOGGER.log(Level.INFO, "Enter the value x:");
            int x = sc.nextInt();
            LOGGER.log(Level.INFO, "Enter the value y:");
            int y = sc.nextInt();
            Coordinates c = new Coordinates(x, y);
            Coordinates c2 = (Coordinates) c.clone();
            String s = c.equals(c2);
            LOGGER.info("Orginal object and clonable object is Same ?: ");
            LOGGER.info(s);
    }
}