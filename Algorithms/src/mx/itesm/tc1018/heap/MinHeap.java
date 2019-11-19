package mx.itesm.tc1018.heap;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MinHeap {
	  private int capacity = 5;
	  private int heap[];
	  private int size;

	  public MinHeap() {
	    heap = new int[capacity];
	  }

	  public boolean isEmpty() {
	    return size == 0;
	  }

	 

	  /***********************************
	        Heap helpers
	  ***********************************/

	  private void heapifyDown() {
	    /*
	      We will bubble down the item just swapped to the "top" of the heap
	      after a removal operation to restore the heap
	    */
	    int index = 0;

	    /*
	      Since a binary heap is a complete binary tree, if we have no left child
	      then we have no right child. So we continue to bubble down as long as
	      there is a left child.
	      
	      A non-existent left child immediately tells us that a right child does
	      not exist.
	    */
	    while (hasLeftChild(index)) {
	      /*
	        By default assume that left child is smaller. If a right
	        child exists see if it can overtake the left child by
	        being smaller
	      */
	      int smallerChildIndex = getLeftChildIndex(index);
	      if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
	        smallerChildIndex = getRightChildIndex(index);
	      }

	      /*
	        If the item we are sitting on is < the smaller child then
	        nothing needs to happen & sifting down is finished.
	        
	        But if the smaller child is smaller than the node we are
	        holding, we should swap and continue sifting down.
	      */
	      if (heap[index] < heap[smallerChildIndex]) {
	        break;
	      } else {
	        swap(index, smallerChildIndex);
	      }

	      // Move to the node we just swapped down
	      index = smallerChildIndex;
	    }
	  }

	  // Bubble up the item we inserted at the "end" of the heap
	  private void siftUp() {
	    /*
	      We will bubble up the item just inserted into to the "bottom"
	      of the heap after an insert operation. It will be at the last index
	      so index 'size' - 1
	    */
	    int index = size - 1;

	    /*
	      While the item has a parent and the item beats its parent in
	      smallness, bubble this item up.
	    */
	    while (hasParent(index) && heap[index] < parent(index)) {
	      swap(getParentIndex(index), index);
	      index = getParentIndex(index);
	    }
	  }

	  /************************************************
	    Helpers to access our array easily, perform
	    rudimentary operations, and manipulate capacity
	  ************************************************/

	  private void swap(int indexOne, int indexTwo) {
	    int temp = heap[indexOne];
	    heap[indexOne] = heap[indexTwo];
	    heap[indexTwo] = temp;
	  }

	  // If heap is full then double capacity
	  private void ensureExtraCapacity() {
	    if (size == capacity) {
	      heap = Arrays.copyOf(heap, capacity * 2);
	      capacity *= 2;
	    }
	  }

	  private int getLeftChildIndex(int parentIndex) {
	    return 2 * parentIndex + 1;
	  }

	  private int getRightChildIndex(int parentIndex) {
	    return 2 * parentIndex + 2;
	  }

	  private int getParentIndex(int childIndex) {
	    return (childIndex - 1) / 2;
	  }

	  private boolean hasLeftChild(int index) {
	    return getLeftChildIndex(index) < size;
	  }

	  private boolean hasRightChild(int index) {
	    return getRightChildIndex(index) < size;
	  }

	  private boolean hasParent(int index) {
	    return index != 0 && getParentIndex(index) >= 0;
	  }

	  private int leftChild(int index) {
	    return heap[getLeftChildIndex(index)];
	  }

	  private int rightChild(int index) {
	    return heap[getRightChildIndex(index)];
	  }

	  private int parent(int index) {
	    return heap[getParentIndex(index)];
	  }

	  /***********************************************/

	  private void printUnderlyingArray() {
	    System.out.print("[ ");
	    for (int item: heap) {
	      System.out.print(item + " ");
	    }
	    System.out.print("]");
	  }
	}