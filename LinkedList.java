class LinkedList{
	Node head;
    class Node{
		 String data;
		 Node next;
		 
		 Node(String data){
			 this.data = data;
			 this.next = null;
		 }
	}
	
	public void addFirst(String data){
		Node newNode = new Node(data);
		if(head == null){
			 head = newNode ;
			 return ;
		}
		//Node newNode = head ;
		newNode.next = head;
		head = newNode ;
	}
	
	public void addLast(String data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode ;
			return ;
		}
		Node currNode = head;
		while(currNode.next != null){
			currNode = currNode.next ;
		}
		currNode.next = newNode;
	}
	
	public void printList(){
		if(head == null){
			System.out.println("List is empty");
			return ;
		}
	       Node currNode = head;
		while(currNode != null){
			System.out.print(currNode.data+"->");
			currNode = currNode.next ;
		}
		System.out.println("NULL");
		Node newNode = currNode.next;
	    currNode.next = newNode;
	}		
	
	public void deleteFirst(){
		if(head == null){
			System.out.println("lsit is empty");
			return ;
		}
		head = head.next;
	}
	
	public void deleteLast(){
		if(head == null){
			System.out.println("list is empty");
			return ;
		}
		if(head.next == null){
			head = null;
			return ;
		}
		Node secondLast = head ;
		Node lastNode = head.next;
		while(lastNode.next != null){
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}
			
   public static void main(String args[]){
   
     LinkedList LL = new LinkedList();
	   LL.addFirst("hey");
	   LL.addFirst("I");
	   LL.addFirst("am");
	   LL.addFirst("Sonali");
	   
	   LL.printList();
	   LL.addLast("Vishwakarma");
	   
	   LL.printList();
   }
   
}