/**
 * lab 3 package
 */
package KI34.Stepanov.Lab3;

import java.io.*;

/**
 * Class <code>Gun</code> implements gun
 40
 * @author Andriy Stepanov
 * @version 1.0
 */
public class Gun {
    private String gunName;
    private int damage;
    private int ammo;
    private int maxAmmo;
    private boolean isAim;
    private boolean isTaken;
    private int exploitation;
    private PrintWriter fout;

    /**
     * Constructor
     * @param gunName Gun's Name
     * @param damage Received damage
     * @param ammo The count of ammo
     * @param maxAmmo Maximum count of ammo
     * @param exploitation Exploitation
     * @throws FileNotFoundException throw about non-existent file
     */
    public Gun(String gunName, int damage, int ammo, int maxAmmo, int exploitation) throws FileNotFoundException {
        this.gunName = gunName;
        this.damage = damage;
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
        this.isAim = false;
        this.isTaken = false;
        this.exploitation = exploitation;
        fout = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Method returns gun's name
     * @return Gun's name
     */
    public String getGunName() {
        return gunName;
    }

    /**
     * Method sets the new gun's name
     * @param gunName The name of the gun
     */
    public void setGunName(String gunName) {
        this.gunName = gunName;
    }

    /**
     * Method returns gun's damage
     * @return Gun's damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Method sets the new gun's damage
     * @param damage The damage of the gun
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * Method returns the count of the ammo
     * @return the count of the ammo
     */
    public int getAmmo() {
        return ammo;
    }

    /**
     * Method sets the count of the ammo
     * @param ammo The count of the ammo
     */
    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    /**
     * Method returns the count of the ammo
     * @return the count of the ammo
     */
    public int getMaxAmmo() {
        return maxAmmo;
    }

    /**
     * Method sets maximum count of ammo
     * @param maxAmmo Maximum count of ammo
     */
    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    /**
     * Method returns aiming the gun
     * @return aiming the gun
     */
    public boolean isAim() {
        return isAim;
    }

    /**
     * Method sets aiming the gun
     * @param aim Aiming the gun
     */
    public void setAim(boolean aim) {
        isAim = aim;
    }

    /**
     * Method returns exploitation
     * @return exploitation
     */
    public int getExploitation() {
        return exploitation;
    }

    /**
     * Method sets exploitation the gun
     * @param exploitation Exploitation the gun
     */
    public void setExploitation(int exploitation) {
        this.exploitation = exploitation;
    }

    /**
     * Method returns taking gun
     * @return taking gun
     */
    public boolean isTaken() {
        return isTaken;
    }

    /**
     * Method sets taking gun
     * @param taken Taking gun
     */
    public void setTaken(boolean taken) {
        isTaken = taken;
    }

    /**
     * Method simulates gun's shoot
     */
    public void shoot() {
        if (isTaken) {
            if (isAim) {
                if (ammo == 0) {
                    System.out.println("Немає патронів");
                    fout.print("Немає патронів\n");
                    isAim = false;
                } else {
                    System.out.println("Вистріл");
                    fout.print("Вистріл\n");
                    ammo -= 1;
                    exploitation -= 1;
                    isAim = false;
                }
            } else {
                System.out.println("Спершу потрібно прицілитися");
                fout.print("Спершу потрібно прицілитися\n");
            }
        } else {
            System.out.println("Візьміть пістолет");
            fout.print("Візьміть пістолет\n");
        }
    }

    /**
     * Method simulates gun's reload
     */
    public void reload() {
        ammo = maxAmmo;
        System.out.println("Перезарядка");
        fout.print("Перезарядка\n");
    }

    /**
     * Method simulates gun's aim
     */
    public void aim() {
        if (isAim) {
            System.out.println("Ви і так прицілені");
            fout.print("Ви і так прицілені\n");
        } else {
            System.out.println("Ви прицілилися");
            fout.print("Ви прицілилися\n");
            isAim = true;
        }
    }

    /**
     * Method simulates gun's repair
     */
    public void repair() {
        if (exploitation == 100) {
            System.out.println("Пістолет повністю робочий");
            fout.print("Пістолет повністю робочий\n");
        } else {
            exploitation = 100;
            System.out.println("Пістолет відремонтовано");
            fout.print("Пістолет відремонтовано\n");
        }
    }

    /**
     * Method simulates gun's taking
     */
    public void takeGun() {
        System.out.println("Ви взяли пістолет до рук");
        fout.print("Ви взяли пістолет до рук\n");
        isTaken = true;
    }

    /**
     * Method simulates gun's putting
     */
    public void putGun() {
        System.out.println("Ви положили пістолет");
        fout.print("Ви положили пістолет\n");
        isTaken = false;
    }

    /**
     * Method simulates gun's increasing maximum count of the ammo
     * @param count the count of the maximum ammo
     */
    public void increaseMaxAmmo(int count) {
        if (count <= maxAmmo) {
            System.out.println("Магазин менший для збільшення");
            fout.print("Магазин менший для збільшення\n");
        } else {
            maxAmmo = count;
            ammo = count;
            System.out.println("Магазин збільшений до " + maxAmmo);
            fout.print("Магазин збільшений до " + maxAmmo + "\n");
        }
    }

    /**
     * Method simulates gun's decreasing maximum count of the ammo
     * @param count the count of the maximum ammo
     */
    public void decreaseMaxAmmo(int count) {
        if (count >= maxAmmo) {
            System.out.println("Магазин більший для зменшення");
            fout.print("Магазин більший для зменшення\n");
        } else {
            maxAmmo = count;
            ammo = count;
            System.out.println("Магазин зменшений до " + maxAmmo);
            fout.print("Магазин зменшений до " + maxAmmo + "\n");
        }
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
        System.out.println("Експлуатація " + exploitation + "%" + "\n\n");

        fout.print("\n");
        fout.print("Імя " + gunName + "\n");
        fout.print("Шкода " + damage + "\n");
        fout.print("Боєприпаси " + ammo + "\n");
        fout.print("Максимальна кількість боєприпасів " + maxAmmo + "\n");
        fout.print("Експлуатація " + exploitation + "%" + "\n\n");
    }

    /**
     * Method releases used recourses
     */
    public void dispose()
    {
        fout.flush();
        fout.close();
    }
}
