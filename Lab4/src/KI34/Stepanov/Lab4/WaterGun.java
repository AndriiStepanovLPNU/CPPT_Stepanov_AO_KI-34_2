/**
 * lab 4 package
 */
package KI34.Stepanov.Lab4;

import java.io.FileNotFoundException;

/**
 * Class <code>WaterGun</code> extends class Gun
 * @author Andriy Stepanov
 * @version 1.0
 */
public class WaterGun extends Gun {
    public String color;
    public int saturation;
    public int power;

    /**
     * Constructor
     * @param color Watergun's color
     * @param saturation The saturation of the color
     * @param power Watergun's power
     * @throws FileNotFoundException throw about non-existent file
     */
    public WaterGun(String gunName, int damage, int ammo, int maxAmmo, int exploitation, String color, int saturation, int power) throws FileNotFoundException {
        super(gunName, damage, ammo, maxAmmo, exploitation);
        this.color = color;
        this.saturation = saturation;
        this.power = power;
    }

    /**
     * Method simulates drawing a watergun
     * @param color color to draw
     * @param saturation saturation to add
     */
    void drawWaterGun(String color, int saturation) {
        this.color = color;
        this.saturation = saturation;

        System.out.println("Ви покрасили ваш пістолет у " + color + " колір із насиченістю " + saturation + "%\n");
        fout.print("Ви покрасили ваш пістолет у " + color + " колір із насиченістю " + saturation + "%\n");
    }

    /**
     * Method simulates double shoot
     */
    void doubleShoot() {
        ammo -= 2;

        System.out.println("Ви вистрілили подвійним снарядом");
        fout.print("Ви вистрілили подвійним снарядом\n");
    }

    /**
     * Method simulates deleting information about gun
     */
    public void deleteInfo() {
        this.gunName = "None";
        this.damage = 0;
        this.ammo = 0;
        this.maxAmmo = 0;
        this.isAim = false;
        this.isTaken = false;
        this.exploitation = 0;
        this.color = "None";
        this.saturation = 0;
        this.power = 0;
        System.out.println("Інформація про пістолет видалена");
        fout.print("Інформація про пістолет видалена");
    }
    /**
     * Method simulates printing information about gun
     */
    public void printInfo() {
        System.out.println("\n");
        System.out.println("Імя " + gunName);
        System.out.println("Шкода " + damage);
        System.out.println("Боєприпаси " + ammo);
        System.out.println("Максимальна кількість боєприпасів " + maxAmmo);
        System.out.println("Експлуатація " + exploitation + "%");
        System.out.println("Колір " + color);
        System.out.println("Насиченість " + saturation + "%");
        System.out.println("Сила " + power + "%" + "\n\n");

        fout.print("\n");
        fout.print("Імя " + gunName + "\n");
        fout.print("Шкода " + damage + "\n");
        fout.print("Боєприпаси " + ammo + "\n");
        fout.print("Максимальна кількість боєприпасів " + maxAmmo + "\n");
        fout.print("Експлуатація " + exploitation + "%" + "\n");
        fout.print("Колір " + color + "\n");
        fout.print("Насиченість " + saturation + "%" + "\n");
        fout.print("Сила " + power + "%" + "\n\n");
    }
}
