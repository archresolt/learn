package personchain;

public class PersonChain {
	private PersonChainNode head;// ͷ�ڵ�
	private int chainSize;// �����С

	public int getSize() {
		return this.chainSize;
	}

	public PersonChainNode getHead() {
		return this.head;
	}

	//��ӽڵ�,ͷ������
		public void addNode(Person p){
			if(head!=null){//�����ͷ�ڵ㣬����µ�ͷ�ڵ㣬ȡ��֮ǰͷ�ڵ�
				head = new PersonChainNode(p,head);
				chainSize ++;		
			}
			else{//���û��ͷ�ڵ㣬ֱ�����һ���½ڵ�
				head = new PersonChainNode(p);
				chainSize ++;
			}
		}

		//��ӽڵ㣬�ӵ�indexλ�ò���
		public void addNodeIndex(Person p,int index){
			if(index==0){//�����0λ�ò��룬����ͷ������
				addNode(p);
			}
			else{
				if(index>chainSize){//indexλ�ó�����������
					System.out.println("�����������Ľڵ���:"+chainSize+",����������Ҫ���������λ�á�");
				}
				else{
					int count=0;
					for(PersonChainNode pcn=head;pcn!=null;pcn=pcn.getNextNode()){//��������
						count++;
						if(count == index){//�ҵ�indexλ�õĽڵ㣬��ʱ���pcn������ڵ��ǰһ���ڵ�
							PersonChainNode pcn1 = new PersonChainNode(p,pcn.getNextNode());//�½ڵ�pcn1����һ���ڵ���pcn�ڵ����һ���ڵ�
							pcn.setNextNode(pcn1);//pcn����һ���ڵ����µĽڵ�pcn1
						}
					}
				}
			}
			
		}



	// ɾ���ڵ�
	public void deleteNode(int index) {
		if (index > chainSize - 1) {
			// ������������
			System.out.println("�����������ڵ���" + chainSize + "����������");
		} else {
			if (index == 0) {
				// ɾ��ͷ�ڵ�»�
				head = head.getNextNode();// ֱ�Ӱ�ͷ�ڵ�ĺ�һ���ڵ���ͷ�ڵ�
				chainSize = chainSize - 1;
			} else {

			
				
				
				if (index == chainSize - 1) {// �����ɾ�����һ���ڵ�
					int count = 0;
					for (PersonChainNode pcn = head; pcn != null; pcn = pcn
							.getNextNode()) {
						count++;
						if (count == index) {
							pcn.setNextNode(null);// �������ڶ����ڵ㣬����һ���ڵ�����Ϊ��
						}
					}
				} else {// ɾ���м�ڵ�
					int count = 0;
					for (PersonChainNode pcn = head; pcn != null; pcn = pcn
							.getNextNode()) {
						count++;
						if (count == index) {
							pcn.setNextNode(pcn.getNextNode().getNextNode());
							// pcn.getNextNode().setNextNode(null);
						}
					}
				}
			}
		}
	}
}