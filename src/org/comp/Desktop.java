package org.comp;
//child lass
public class Desktop extends Computer{
	private void desktopSize() {
		System.out.println("Desktop Size is 18 inch");
		
	}
public static void main(String[]args) {
	Desktop a = new Desktop();
	a.desktopSize();
	a.computerModel();
}
}
