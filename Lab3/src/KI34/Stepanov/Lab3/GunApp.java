/**
 * lab 3 package
 */
package KI34.Stepanov.Lab3;

import java.io.*;

/**
 * Gun Application class implements main method for Gun class possibilities demonstration
 * @author Andriy Stepanov
 * @version 1.0
 */
public class GunApp {
    /**
     * @param args function parameter
     * @throws FileNotFoundException throw about non-existent file
     */
    public static void main(String[] args) throws FileNotFoundException {
        Gun gun = new Gun("Glock", 15, 5, 25, 75);
        gun.takeGun();
        gun.printInfo();

        gun.aim();
        gun.shoot();
        gun.shoot();
        gun.aim();
        gun.shoot();
        gun.reload();
        gun.aim();
        gun.aim();
        gun.shoot();
        gun.aim();
        gun.shoot();
        gun.increaseMaxAmmo(40);

        gun.printInfo();
        gun.decreaseMaxAmmo(15);
        gun.repair();
        gun.increaseMaxAmmo(30);
        gun.aim();
        gun.shoot();
        gun.putGun();

        gun.printInfo();
        gun.deleteInfo();

        gun.printInfo();
        gun.dispose();
    }
}