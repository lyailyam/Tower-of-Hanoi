
package csci152.impl;

import csci152.adt.Stack;

public class TowerOfHanoi {

	private Stack<Integer>[] post = new ArrayStack[3];
	private int numMoves = 0;
	
	public TowerOfHanoi(int numDiscs) {
            
            post[0] = new ArrayStack();
            post[1] = new ArrayStack();
            post[2] = new ArrayStack();
            for (int i = numDiscs; i > 0; i--) {
                post[0].push(i);
            }
	}
	
	public void moveDisc(int from, int to) throws Exception {
            if (from < 0 || to < 0 || from > 2 || to > 2 || 
                    post[from].getSize() == 0) {
                throw new Exception ("move cannot be executed");
            }
            if (post[to].getSize() != 0) {
                int x = post[from].pop();
                int y = post[to].pop();
                post[from].push(x);
                post[to].push(y);
            if (x > y) {
                throw new Exception ("No disk may be placed on top of a smaller disk");
            }
            }
            post[to].push(post[from].pop());
            numMoves++;
	}
	
	public boolean isFinished() {
                if (post[0].getSize() == 0 && post[1].getSize() == 0) {
                    return true;
                }
		return false;
	}
	
	public int getNumMoves() {
		return numMoves;
	}
        
	
	public String toString() {
		return "post[0]: " + post[0] + "\n" + 
                       "post[1]: " + post[1] + "\n" +
                       "post[2]: " + post[2];
	}
	
}
