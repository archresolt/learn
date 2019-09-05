package personchain;
//������ڵ�ʵ��
public class PersonChainNode {
private Person person;//�ڵ�����ԣ����ڵ�������򲿷�
private PersonChainNode pChain;//��һ���ڵ㣬�����ڵ�����

//��ȡ����ڵ������
public Person getPerson(){
	return this.person;
}

//��ȡ����ڵ����һ���ڵ�
public PersonChainNode getNextNode(){
	return this.pChain;
}
	//��������ڵ����һ���ڵ�
	public void setNextNode(PersonChainNode pcn){
		this.pChain = pcn;
	}
	
	//���幹�췽��
	public PersonChainNode(Person p,PersonChainNode pc){
		this.person = p;
		this.pChain = pc;
	}
	public PersonChainNode(Person p){
		this.person = p;
	}
}

