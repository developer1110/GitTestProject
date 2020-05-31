package com.vn.cj;

public class CarVn implements GameVn{

	@Override
	public void Start() {
		System.out.println("You are about to play Car Game");
		
	}

	@Override
	public void Play() {
		System.out.println("You are playing Car Game");
		
	}

	@Override
	public void Stop() {
		System.out.println("Thank you for playing Car Game");
		
	}

}
