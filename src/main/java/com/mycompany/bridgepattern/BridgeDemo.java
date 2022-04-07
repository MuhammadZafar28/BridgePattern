/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridgepattern;

/**
 *
 * @author MoaathAlrajab
 */
public class BridgeDemo {

	public static void main(String[] args) {

		Vehicle vehicle = new BigBus(new SmallEngine());
		vehicle.drive();
		vehicle.setEngine(new BigEngine());
		vehicle.drive();

		vehicle = new SmallCar(new SmallEngine());
		vehicle.drive();
		vehicle.setEngine(new BigEngine());
		vehicle.drive();

	}

}