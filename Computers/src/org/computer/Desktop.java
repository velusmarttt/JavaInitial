package org.computer;

public class Desktop implements Hardware,Software{
	private void desktopModel() {
		System.out.println("desktop model is windows 8");
	}

	@Override
	public void hardwareResources() {
		System.out.println("hardware resources is good at the moment");
		
	}

	@Override
	public void softwareResources() {
		System.out.println("software resources is not in condition");
		
	}
	public static void main(String[] args) {
		Desktop D=new Desktop();
		D.desktopModel();
		D.hardwareResources();
		D.softwareResources();
	}

}
