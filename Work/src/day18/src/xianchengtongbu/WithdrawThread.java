package xianchengtongbu;


	public class WithdrawThread implements Runnable {

		public Account account = new Account();

		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				makeWithdraw(100);
				// TODO �Զ����ɵķ������
			}

			// ��ѯ���
			if (account.getBalance() < 0) {
				System.out.println("���п�͸֧��");

			}
		
	
		// ȡ�� ��������
		private void makeWithdraw (int amount) {
			if (account.getBalance() >= amount) {
				System.out.println(Thread.currentThread().getName() + "׼��ȡ�");

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				// 0.5������ȡ��
				account.withdraw(amount);
				System.out.println(Thread.currentThread().getName() + "���ȡ�");

			} else {
				System.out.println("������֧��" + Thread.currentThread().getName()
						+ "��ȡ����Ϊ" + account.getBalance());
			}
		}
	
		}
}