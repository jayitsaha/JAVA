/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jayit
 */
public class DynamicArray {
    
    
//    VERY IMPORTANT CONCEPTS
//    So To make a  2D List ...make a 1D list say seqList
//    Now each instance of seqList will contain another List say seq 
//    So seqList is a List of List thus List<List<Integer>> 
//    And each instance 
List<Integer> seq = new ArrayList<Integer>();
List<List<Integer>> seqList = new ArrayList<List<Integer>>();
int lastAns = 0;


public DynamicArray(int N){
    
    for(int i=0;i<=N;i++){
        
        seq = new ArrayList<Integer>();
        seqList.add(seq);
        
        
    }
    
}


void appendValue(int x,int y,int N){
    
    int rowIndex = (x ^ lastAns) % N;
    List<Integer> seq = seqList.get(rowIndex);
    
    seq.add(y);
}


private void printValue(int x, int y,int N){
    
    int colIndex = 0;
    int rowIndex = (x^lastAns) % N;
    List<Integer> seq = seqList.get(rowIndex);
    colIndex = y % seq.size();
    lastAns = seq.get(colIndex);
    System.out.println(lastAns);
}

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		DynamicArray da = new DynamicArray(N);
		for (int i = 0; i < Q; i++) {
			int queryType = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (queryType == 1) {
				da.appendValue(x, y, N);
			} else {
				da.printValue(x, y, N);
			}

		}
		sc.close();
	}



}
