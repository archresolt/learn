package Cpu;

public class Computer {
	private UsbInterface usb;
	public void useUsb(){
		usb.func();
		
	}
	public UsbInterface getUsb() {
		return usb;
	}
	public void setUsb(UsbInterface usb) {
		this.usb = usb;
	}

}
