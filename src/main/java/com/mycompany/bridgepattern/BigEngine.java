/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridgepattern;

/**
 *
 * @author MoaathAlrajab
 */
public class BigEngine implements Engine {

	int horsepower;

	public BigEngine() {
		horsepower = 350;
	}

	@Override
	public int go() {
		System.out.println("The big engine is running");
		return horsepower;
	}

}