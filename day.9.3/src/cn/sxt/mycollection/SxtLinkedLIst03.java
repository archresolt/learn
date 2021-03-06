package cn.sxt.mycollection;

public class SxtLinkedLIst03 {
/*
 * 自定义一个链表
 * 增加remove
 */
	public class SxtLinkedList03{
		private Node first;
		private Node last;
		private int size ;
		
		public void remove(int index){
			Node temp = getNode(index);
			
			if(temp != null){
				Node up = temp.previous;
				Node down = temp.next;
				if(up!= null){
					up.next = down;
				}
				if(down!= null){
					down.previous = up;
				}
				//被删除的元素是第一个元素是
				if(index == 0){
					first = down;
			}
				//被删除的元素是最后一个元素
				if (index == size-1){
					last = up;
				}
				size--;
		}
	}
		//[]
		//["a","b","c","d","e","f"]
		public Object get(int index){
			if(index<0 || index > size -1){
				throw new RuntimeException("索引数字不合法"+ index);
				
			}
			Node temp = getNode(index);
			return temp != null ? temp.element:null;
		}
		public Node getNode(int index){
			Node temp = null;
			if(index<=(size >>1)){
				
			
			for (int i = 0;i < index;i++){
				temp = temp.next;
			}
			}else{
				temp = last;
				for(int i = size -1;i>index;i--){
					temp = temp.previous;
				}
			}
			return temp;
		}
	}
	}
