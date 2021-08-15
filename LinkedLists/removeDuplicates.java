/*4. Write a program to remove duplicates from a sorted linked list.
*/

class removeDuplicates{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	};
	void removeDuplicates(){
		Node curr = head;
		while (curr != null) {
			 Node temp = curr;
			while(temp!=null && temp.data==curr.data) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
	}
	public void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	 void printList(){
		 Node temp = head;
		 while (temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		 }
		 System.out.println();
	 }

	public static void main(String args[]){
		removeDuplicates r = new removeDuplicates();
		r.push(20);
		r.push(13);
		r.push(13);
		r.push(11);
		r.push(11);
		r.push(11);
		System.out.println("List before removal of duplicates");
		r.printList();

		r.removeDuplicates();

		System.out.println("List after removal of elements");
        r.printList();
	}
}