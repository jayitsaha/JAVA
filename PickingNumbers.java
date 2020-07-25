///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package hackerrank;
//
//import java.util.Scanner;
//import java.util.HashMap;
//import java.util.List;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
///**
// *
// * @author Jayit
// */
//public class PickingNumbers {
//    
////    private static int pickingnumbers(int n ,int [] arr){
////        
////        Map<Integer,Integer> rightMap = new HashMap<>();
////        
////        for(int item:arr){
////            rightMap.put(item,rightMap.getOrDefault(item, 0)+1);
////        }
////      
////        Set<Integer> set = new HashSet<>();
////        for(int item:arr){
////            
////            set.add(item);
////            
////        }
////
////        
////        int len = set.size();
////        
////        int results[] = new int[len];
////        int i=0;
////        for(int item:set){
//////            System.out.println(item);
////
////            results[i++] = item;
////        }
////        int max = 0;
////        for(int j=1;j<=len;j++){
////            
////            System.out.println(j+ "  " +rightMap.get(j));      
////            if(rightMap.containsKey(j) && rightMap.containsKey(j+1)){
////                
////                if(rightMap.get(j) + rightMap.get(j+1) > max){
////                    
////                        max = rightMap.get(j) + rightMap.get(j+1);
////                }
////            }
////                
////        }
////        
////        
////        return max;
////        
////        
////        
////        
////        
////        
////    }
//    
//    public static int pickingNumbers(List<Integer> a) {
//		int frequency[] = new int[101];
//		int result = Integer.MIN_VALUE;
//
//		for (int i = 0; i < a.size(); i++) {
//			int index=a.get(i);
//			frequency[index]++; //frequency[index]=frequency[index]+1
//		}
//
//		for (int i = 1; i <= 100; i++) {
//			result = Math.max(result, frequency[i] + frequency[i - 1]);
//		}
//		return result;
//
//	}
//    
//    
//    
//    
//    
//    public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//                int a[] = new int[n];
//		for (int i = 0; i < n; i++) {
//                    a[i] = sc.nextInt();
//		}
//                
//                int result = pickingnumbers(n,a);
//                
//                System.out.println(result);
//                
//		
//		sc.close();
//	}
//    
//    
//}
public static int pickingNumbers(List<Integer> a) {
        int frequency[] = new int[101];
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < a.size(); i++) {
            int index=a.get(i);
            frequency[index]++; //frequency[index]=frequency[index]+1
        }

        for (int i = 1; i <= 100; i++) {
            result = Math.max(result, frequency[i] + frequency[i - 1]);
        }
        return result;

    }
        
        
        
        
        
    

}

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(sc.nextInt());
        }

        int result = Result.pickingNumbers(list);
        System.out.println(result);
        sc.close();

    }
}