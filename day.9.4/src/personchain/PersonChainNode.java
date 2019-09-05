package personchain;
//单链表节点实体
public class PersonChainNode {
private Person person;//节点的属性，及节点的数据域部分
private PersonChainNode pChain;//下一个节点，立即节点链域

//获取这个节点的属性
public Person getPerson(){
	return this.person;
}

//获取这个节点的下一个节点
public PersonChainNode getNextNode(){
	return this.pChain;
}
	//设置这个节点的下一个节点
	public void setNextNode(PersonChainNode pcn){
		this.pChain = pcn;
	}
	
	//定义构造方法
	public PersonChainNode(Person p,PersonChainNode pc){
		this.person = p;
		this.pChain = pc;
	}
	public PersonChainNode(Person p){
		this.person = p;
	}
}

