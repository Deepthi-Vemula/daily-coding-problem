// for uintptr_t
#include <stdint.h>
#include <iostream>

using namespace std;

/*
 * Good morning! 
 * Here's your coding interview problem for today.
 * This problem was asked by Google.
 * An XOR linked list is a more memory efficient doubly linked list. 
 * Instead of each node holding next and prev fields, it holds a field named both, 
 * which is an XOR of the next node and the previous node. 
 * Implement an XOR linked list; it has an add(element) which adds the element to the end, 
 * and a get(index) which returns the node at index.
 * If using a language that has no pointers (such as Python), 
 * you can assume you have access to get_pointer and dereference_pointer functions 
 * that converts between nodes and memory addresses.
 */
struct Node {
	int data;
	// XOR of next and prev
	Node* both;
};

class XORLinkedList {
private:
	Node* head;
	Node* tail;
	// XOR function for Node pointers
	Node* XOR(Node* a, Node* b);

public:
	// Constructor to initialize an empty
	// list
	XORLinkedList();

	// Insert a node at the tail of the list
	void add(int data);

    //Get the node at the index i
    Node* get(int i);
};

XORLinkedList::XORLinkedList()
{
	head = tail = nullptr; // Initialize head and tail to
						// nullptr for an empty list
}

Node* XORLinkedList::XOR(Node* a, Node* b)
{
	return (
	
		// XOR operation for Node pointers
		Node*)((uintptr_t)(a) ^ (uintptr_t)(b));
}

void XORLinkedList::add(int data)
{
	Node* new_node = new Node();
	new_node->data = data;
	new_node->both = XOR(tail, nullptr);

	if (tail) {
		tail->both
			= XOR(XOR(tail->both, nullptr), new_node);
	}
	else {
		// If the list was empty, the new
		// node is both the head and the
		// tail
		head = new_node;
	}
	// Update the tail to the new node
	tail = new_node;
}

Node* XORLinkedList::get(int i)
{
    Node* curr = head;
    Node* prev = nullptr;
    Node* next;
    int j = 0;
    while (curr != nullptr && j < i) {
        next = XOR(prev, curr->both);
        prev = curr;
        curr = next;
        j++;
    }
    return curr;
}


int main()
{
	XORLinkedList list;
	list.add(30);
	list.add(40);
    list.add(50);
    list.add(60);
    list.add(70);

    cout << list.get(0)->data << endl;
    cout << list.get(1)->data << endl;
    cout << list.get(2)->data << endl;
	return 0;
}
