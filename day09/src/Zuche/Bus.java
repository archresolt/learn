package Zuche;

public class Bus extends Auto {
	private int seat;

	public Bus() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Bus(String id, String brand, int seat) {
		super(id, brand);
		this.seat = seat;
	}

	@Override
	public int moneyCount(int d) {
		if (seat < 16) {
			return 900 * d;

		} else {
			return 1500 * d;

		}
		// TODO �Զ����ɵķ������

	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

}
