package StructuralPattern.Adapter.tvPort.adapters;


import StructuralPattern.Adapter.tvPort.intefaces.HDMI;
import StructuralPattern.Adapter.tvPort.intefaces.VGA;

public class HDMIToVGAAdapter implements HDMI {
	private VGA vga;

	public HDMIToVGAAdapter(VGA vga) {
		System.out.println("Conecting the HDMI/VGA adapter...");
		this.vga = vga;
	}

	@Override
	public void setImage(String image) {
		System.out.println("Converting the image from HDMI to VGA");
		vga.setImage(image);
	}
	
	@Override
	public void setSound(String sound) {
		System.out.println("Sorry, We don`t work with sound");
	}
}