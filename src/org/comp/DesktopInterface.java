package org.comp;

public class DesktopInterface implements Hardware,Software{

	@Override
	public void softwareResources() {
		System.out.println("ADAS");
		
	}

	@Override
	public void hardwareResources() {
		System.out.println("hfbuf");
		
	}
	public static void main(String[]args) {
		DesktopInterface a = new DesktopInterface();
		a.softwareResources();
		a.hardwareResources();
	}
	

}
