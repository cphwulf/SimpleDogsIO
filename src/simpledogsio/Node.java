/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledogsio;
class Node {
	private Dog data;
	private Node next;

	Node(Dog d) { 
		this.data = d;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getNext() {
		return this.next;
	}

	public Dog getData() {
		return this.data;
	}
	
}