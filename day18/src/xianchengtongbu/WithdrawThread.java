package xianchengtongbu;


	public class WithdrawThread implements Runnable {

		public Account account = new Account();

		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				makeWithdraw(100);
				// TODO 自动生成的方法存根
			}

			// 查询余额
			if (account.getBalance() < 0) {
				System.out.println("银行卡透支了");

			}
		
	
		// 取款 余额不足提醒
		private void makeWithdraw (int amount) {
			if (account.getBalance() >= amount) {
				System.out.println(Thread.currentThread().getName() + "准备取款。");

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				// 0.5秒后完成取款
				account.withdraw(amount);
				System.out.println(Thread.currentThread().getName() + "完成取款。");

			} else {
				System.out.println("余额不足以支付" + Thread.currentThread().getName()
						+ "的取款，余额为" + account.getBalance());
			}
		}
	
		}
}