package day26;

public static void CustomizeDateFormat() throws IOException {
	calendar cdf = Calendar.getInstance();
	int yearAuto = cdf.get(Calendar.YEAR);
	int year = 0,mouth = 0,date = 0;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String inputYear = reader.readLine();
	System.out.println("���������[��:2019]");
	for (int i = 0;i<intputYear.charAt(i) >= '0'&& inputYear.charAt(i)<='9';){
		if(year < yearAuto){
			year = Integer.
					parseInt(intputYear);
		}else{
			System.out.println("���������ݱȵ�ǰ���Ҫ�����������룡");
		}
	}
	String inputMouth = reader.readLine();
	System.out.println("�������·�[�磺7]��");
	for (int j = 0 ;j < inputMouth.length();j++){
		if(mouth < 1 || mouth >12){
			mouth = Integer.parseInt(intputMouth);
		}else{
			System.out.println("��������·ݲ��Ϸ������������룡");
		}
	}
	cdf.set(year,mouth,date);
	int MaximumDaysOfDate = cdf.getActualMaximum(Calendar.DATE);
	System.out.println("���������ݣ�"+year+"�ꡢ�·�:"+mouth+",���µ����������:"+MaximumDaysOfDate+"��.");
for(int i = 1;i<= MaximumDaysOfDate;i++){
	Document doc = incomeAndExpenditureChecklist(year ,month,i);
	if(doc!= null){
		BasicDBObject condition = new BasicDBObject();
		condition.put("date",new BasicDBObject("$eq",doc.get("date")));
		weixinChecklist.updateOne(condition ,new Document("$set",doc),new UpdateOptions().upsert(true));
	}
}
}