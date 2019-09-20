package mx.itesm.tc1018.lineards;

public class QueueManager {
	
	int [] queue = new int[10];
	private int front;
	private int rear;

	public QueueManager(int [] input) {
		this.queue = input;
		front = 0;
		rear = 0;
	}
	
	public void printQueue() {
		for(int i = 0; i < queue.length; i++)
			System.out.print(queue[i] + ";");			
	}
	
	
	public void enqueue(int n) throws Exception {
		if(rear < queue.length) {			
			queue[rear] = n;	
			rear++;
		}
		else {
			throw new Exception("Out of capacity");
		}
		
	}
	
	public int dequeue() {
		
		if(front < queue.length && front <=rear) {				
			int result = queue[front] ;
		    if(rear == front) {
					rear = 0;
					front = 0;
				}
				front ++;
				return result;
		}		
		else 
			return -1;
	}
	
	
	public static void main(String[] args) throws Exception {
		
		int test[] = {0, 0,0,0,0,0,0,0,0,0};
		QueueManager qTest = new QueueManager(test);
		qTest.enqueue(3);
		qTest.enqueue(5);
		qTest.enqueue(8);
		qTest.enqueue(23);
		qTest.printQueue();
		
		System.out.println("First three numbers are: " + qTest.dequeue() 
							+ "; " + qTest.dequeue()  + "; " + qTest.dequeue() );
		// TODO Auto-generated method stub

	}

}
