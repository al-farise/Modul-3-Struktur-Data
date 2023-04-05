class Stack:
    def __init__(self):
        self.stack = []
        self.length = 0

    def __len__(self):
        return self.length
    
    def addItem(self, item):
        self.stack.append(item)
        self.length +1
    
    def removeItem(self):
        length = self.length
        self.stack.pop(length - 1)
        length - 1
    
    def peekItem(self):
        return self.stack[self.length - 1]
    
    def searchItem(self, item):
        for i in self.stack:
            if i == item:
                return True
        return False

    def print(self):
        print(self.stack)

if __name__ == '__main__':
    st = Stack()

    st.addItem('Bottom')
    st.addItem('Middle')
    st.addItem('Top')
    st.print()

    st.removeItem()
    st.print()

    st.addItem('Top')
    st.addItem('High')
    st.print()

    print(st.searchItem('Low'))
                