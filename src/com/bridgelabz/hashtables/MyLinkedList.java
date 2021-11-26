package com.bridgelabz.hashtables;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public INode<K> search(K key) {
		INode<K> myNode = head;
		while (myNode != null && myNode.getNext() != null) {
			if (myNode.getKey().equals(key)) {
				return myNode;
			}
			myNode = myNode.getNext();
		}
		return null;
	}

	public void append(INode<K> currentNode) {
		if (this.head == null) {
			this.head = currentNode;
		}
		if (this.tail == null)
			this.tail = currentNode;
		else {
			this.tail.setNext(currentNode);
			this.tail = currentNode;
		}
	}

	public INode<K> delete(K key) {
		INode<K> myNode = head;
		INode<K> prev = null;
		while (myNode != null && myNode.getNext() != null) {
			prev = myNode;
			if (myNode.getKey().equals(key)) {
				prev.setNext(myNode.getNext());
			}
			myNode = myNode.getNext();
		}
		return myNode;
	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + ", tail=" + tail + "]";
	}

}