/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridgepattern;

/**
 *
 * @author MoaathAlrajab
 */
public class SmallCar extends Vehicle {

	public SmallCar(Engine engine) {
		this.weightInKilos = 600;
		this.engine = engine;
	}

	@Override
	public void drive() {
		System.out.println("\nThe small car is driving");
		int horsepower = engine.go();
		reportOnSpeed(horsepower);
	}

}
