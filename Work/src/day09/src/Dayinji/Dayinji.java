package Dayinji;

public  class Dayinji {

	
	private Moheinterface mohe;
	private Paperinterface paper;

	public void print(){
		System.out.println("����ʹ��"+mohe.showColor()+"ī����"+paper.showSize()+"ֽ�ϴ�ӡ");

	

	
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
