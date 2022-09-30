package com.gungame;

public class CrossFireApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player1 p1 =new Player1("Vishwa", "Sword", 100);
		System.out.println(p1.getName());
		System.out.println(p1.getWeapon());
		System.out.println(p1.getHealth());
		
		p1.damageByGun1();
		p1.damageByGun1();
		p1.damageByGun2();
		p1.heal();
		System.out.println();
		
		
		Player2 p2 = new Player2("Vinay",  "AK-47", 100, true);
		System.out.println(p2.getName());
		System.out.println(p2.getWeapon());
		System.out.println(p2.getHealth());
		p2.damageByGun1();
		p2.damageByGun2();
	}

}
