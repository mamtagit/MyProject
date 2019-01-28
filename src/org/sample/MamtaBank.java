package org.sample;

public class MamtaBank extends ICICIBank {
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("10%");
	}
	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("20%");

	}
	public static void main(String[] args) {
		MamtaBank bank=new MamtaBank();
		bank.deposit();
		bank.saving();
		bank.fixed();
	}
		

	}


