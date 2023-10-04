
# Good morning! 
# Here's your coding interview problem for today.
# This problem was asked by Google.
# An XOR linked list is a more memory efficient doubly linked list. 
# Instead of each node holding next and prev fields, it holds a field named both, which is an XOR of the next node and the previous node. 
# Implement an XOR linked list; it has an add(element) which adds the element to the end, and a get(index) which returns the node at index.
# If using a language that has no pointers (such as Python), 
# you can assume you have access to get_pointer and dereference_pointer functions that converts between nodes and memory addresses.
 

# In Python garbage collector collect nodes and decrease the reference count of the object of a node 
# when the object of the node is XORed, 
# Python thinks there is no way to access the node 
# so we used the __in which we store objects of node just for preventing it to become garbage.
class Node:
    def __init__(self, val):
        self.val = val
        self.both = 0

class XorLinkedList:
    def __init__(self):
        self.head = self.tail = None
        self.__nodes = []

    def add(self, element):
        node = Node(element)
        if self.head is None:
            self.head = self.tail = node
        else:
            self.tail.both = id(node) ^ self.tail.both
            node.both = id(self.tail)
            self.tail = node
        self.__nodes.append(node)
    
    def get(index):
        prev_id = 0
        node = self.head
        for i in range(index):
            next_id = prev_id ^ node.both
            if next_id:
                prev_id = id(node)
                node = _get_obj(next_id)
            else:
                raise IndexError('Linked list index out of range')
        return node