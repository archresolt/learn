package personchain;

public class PersonChain {
	private PersonChainNode head;// 头节点
	private int chainSize;// 链表大小

	public int getSize() {
		return this.chainSize;
	}

	public PersonChainNode getHead() {
		return this.head;
	}

	//添加节点,头部插入
		public void addNode(Person p){
			if(head!=null){//如果有头节点，添加新的头节点，取代之前头节点
				head = new PersonChainNode(p,head);
				chainSize ++;		
			}
			else{//如果没有头节点，直接添加一个新节点
				head = new PersonChainNode(p);
				chainSize ++;
			}
		}

		//添加节点，从第index位置插入
		public void addNodeIndex(Person p,int index){
			if(index==0){//如果从0位置插入，即从头部插入
				addNode(p);
			}
			else{
				if(index>chainSize){//index位置超出链表容量
					System.out.println("超出链表最大的节点数:"+chainSize+",请重新输入要插入的索引位置。");
				}
				else{
					int count=0;
					for(PersonChainNode pcn=head;pcn!=null;pcn=pcn.getNextNode()){//遍历链表
						count++;
						if(count == index){//找到index位置的节点，这时候的pcn是这个节点的前一个节点
							PersonChainNode pcn1 = new PersonChainNode(p,pcn.getNextNode());//新节点pcn1的下一个节点是pcn节点的下一个节点
							pcn.setNextNode(pcn1);//pcn的下一个节点变成新的节点pcn1
						}
					}
				}
			}
			
		}



	// 删除节点
	public void deleteNode(int index) {
		if (index > chainSize - 1) {
			// 超出链表容量
			System.out.println("超出链表最大节点数" + chainSize + "请重新输入");
		} else {
			if (index == 0) {
				// 删除头节点德华
				head = head.getNextNode();// 直接把头节点的后一个节点变成头节点
				chainSize = chainSize - 1;
			} else {

			
				
				
				if (index == chainSize - 1) {// 如果是删除最后一个节点
					int count = 0;
					for (PersonChainNode pcn = head; pcn != null; pcn = pcn
							.getNextNode()) {
						count++;
						if (count == index) {
							pcn.setNextNode(null);// 将倒数第二个节点，的下一个节点设置为空
						}
					}
				} else {// 删除中间节点
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