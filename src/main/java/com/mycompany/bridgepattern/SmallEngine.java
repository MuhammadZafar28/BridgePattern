/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridgepattern;

/**
 *
 * @author MoaathAlrajab
 */
public class SmallEngine implements Engine {

	int horsepower;

	public SmallEngine() {
		horsepower = 100;
	}

	@Override
	public int go() {
		System.out.println("The small engine is running");
		return horsepower;
	}

}