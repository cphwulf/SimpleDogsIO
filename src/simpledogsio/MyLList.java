package simpledogsio;
public class MyLList {
	Node head = null;
	
	public void add(Dog dog) {
		if (head == null) {
			Node myFirstNode = new Node(dog);
			head = myFirstNode;
		} else {
			Node myNode = new Node(dog);
			//first set present headnode to next
			myNode.setNext(head);
			//insert this node as head
			head = myNode;
		}
	}
	public void findInLList(String name) {
		Node currNode = this.head;
		while (currNode != null) {
			if (currNode.getData().getName().equals(name)) {
				System.out.println("Got dog named " + name);
			}
			//and now on to the next node
			currNode = currNode.getNext();
		}
	}
	
	public void printList() {
		Node currNode = this.head;
		while (currNode != null) {
			System.out.println("Node: " + currNode.getData());
			currNode = currNode.getNext();
		}
	}
}