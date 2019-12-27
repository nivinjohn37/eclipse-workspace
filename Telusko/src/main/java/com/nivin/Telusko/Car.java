package com.nivin.Telusko;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	private Tyre tyre;
	
	/**
	 * @return the tyre
	 */
	public Tyre getTyre() {
		return tyre;
	}


	/**
	 * @param tyre the tyre to set
	 */
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [tyre=" + tyre + "]";
	}


	public void drive() {
		System.out.println("Test Driving crazy");
	}
}
