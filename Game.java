/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game;

/**
 *
 * @author EBOOK123
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //membuat objek
        Player superpowers = new Player();
        Player enemy       = new Player();
        
        superpowers.name = "Kokohh";
        superpowers.speed = 20;
        superpowers.healthPoin = 0;
        superpowers.damage = 23;
        superpowers.armor = 30;
        
        enemy.name = "yi long ma";
        enemy.speed = 20;
        enemy.healthPoin = 100;
        enemy.damage = 23;
        enemy.armor = 30;
        
        
        
        
        //melakukan method
        superpowers.run();
        superpowers.attack();
        superpowers.defend();
        enemy.run();
        enemy.attack();
        enemy.defend();
        
        if (superpowers.isDead()) {
            System.out.println("yi long ma WIN ");
            
            if (enemy.isDead()) {
                System.out.println("Kokoh WIN");
                
            }}}}