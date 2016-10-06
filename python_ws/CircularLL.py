	# Hello World program in Python
class Node:
    	
        def __init__(self,data):
            self.data=data
            self.next=None
    
class CircularLL:
        
        def __init__(self):
            self.head=None
        
        def push(self,data):
            ptr=Node(data)
            ptr.next=self.head
            
            temp=self.head
            
            if self.head is not None:
                while(temp.next!=self.head):
                    temp=temp.next
                temp.next=ptr
            else:
                ptr.next=ptr
            
            self.head = ptr
        
        def printlist(self):
            temp = self.head
            
            if self.head is not None:
                while(temp.next!=self.head):
                    print(temp.data)
                    temp=temp.next
    
    
cllist = CircularLL()
    
cllist.push(3)
cllist.push(4)
cllist.push(32)
cllist.push(312)
    
cllist.printlist()
    
#print "Hello World!\n"
