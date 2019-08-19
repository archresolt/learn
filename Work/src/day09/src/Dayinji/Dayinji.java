package Dayinji;

public  class Dayinji {

	
	private Moheinterface mohe;
	private Paperinterface paper;

	public void print(){
		System.out.println("正在使用"+mohe.showColor()+"墨盒在"+paper.showSize()+"纸上打印");

	

	
}

	public Moheinterface getMohe() {
		return mohe;
	}

	public void setMohe(Moheinterface mohe) {
		this.mohe = mohe;
	}

	public Paperinterface getPaper() {
		return paper;
	}

	public void setPaper(Paperinterface paper) {
		this.paper = paper;
	}
	
}
