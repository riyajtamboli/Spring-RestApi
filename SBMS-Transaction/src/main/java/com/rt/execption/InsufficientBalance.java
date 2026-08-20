package com.rt.execption;

public class InsufficientBalance extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InsufficientBalance(String msg) {
		super(msg);
	}

}
