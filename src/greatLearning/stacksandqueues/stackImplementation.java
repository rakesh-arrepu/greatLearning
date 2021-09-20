package greatLearning.stacksandqueues;

class StackImplement {
	static final int Size_of_stack = 1000;
	int current_pointer;
	int a[] = new int[Size_of_stack]; // Maximum size of Stack

	StackImplement() {
		current_pointer = -1;
	}

	boolean push(int x) {
		if (current_pointer >= (Size_of_stack - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++current_pointer] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}

	int pop() {
		if (current_pointer < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a[current_pointer--];
			return x;
		}
	}

	void printStack() {
		for (int i = current_pointer; i >= 0; i--) {
			System.out.print(" " + a[i]);
		}
	}
}

// Driver code
class stackImplementation {
	public static void main(String args[]) {
		StackImplement s = new StackImplement();
		s.push(2);
		s.push(45);
		s.push(65);
		s.push(21);
		System.out.println(s.pop() + " Popped from stack");
		System.out.print("Elements present in stack :");
		s.printStack();
	}
}