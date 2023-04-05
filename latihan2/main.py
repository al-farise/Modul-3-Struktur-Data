class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Queue:
    def __init__(self):
        self.head = None

    def add_item(self, val):
        if (self.head == None):
            self.head = Node(val)
        else:
            current = self.head
            while current.next != None:
                current = current.next
            
            current.next = Node(val)
    
    def remove_item(self):  
        if (self.head == None):
            return
    
        next = self.head.next
        self.data = None
        self.next = None
        self.head = next

    def print_list(self):
        current = self.head
        while (current != None):
            print(current.data, end=" ")
            current = current.next
        print()
  
if __name__ == '__main__':
  
    numbers = Queue()

    numbers.add_item(8)
    numbers.add_item(7)
    numbers.add_item(1)
    numbers.print_list()

    numbers.remove_item()
    numbers.print_list()
    
    numbers.add_item(3)
    numbers.add_item(5)
    numbers.print_list()

    print()
