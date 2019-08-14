package Zuche;

public class Bus extends Auto {
	private int seat;

	public Bus() {
		super();
		// TODO 自动生成的构造函数存根
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
		// TODO 自动生成的方法存根

	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

}
