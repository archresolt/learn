package Goods;

public class Goods {
	private String brand;
	private String goodsName;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	private boolean flag = false;

	public synchronized void prd(String brand, String goodsName) {

		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		this.brand = brand;

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		this.goodsName = goodsName;
		System.out.println("��������������:" + this.getBrand() + this.getGoodsName());
		flag = true;
		notifyAll();
	}

	public synchronized void ctom() {
		if (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out
				.println("������ȡ�ߵ���Ʒ�ǣ�" + this.getBrand() + this.getGoodsName());
		flag = false;
		notifyAll();
	}
}
