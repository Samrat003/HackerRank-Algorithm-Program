package prep;
public class Solution {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        java.util.List<Integer> missing = new java.util.ArrayList<Integer>();
        Integer t = 0;

        int n = sc.nextInt();
        java.util.Map<Integer, Integer> arr = new java.util.HashMap<Integer, Integer>();
        for(int i=0;i<n;i++) {
            t = sc.nextInt();
            if(arr.containsKey(t)) {
                Integer temp = (Integer) arr.get(t);
                arr.put(t, ++temp);
            } else
                arr.put(t, 1);
        }
        
        int m = sc.nextInt();
        java.util.Map<Integer, Integer> brr = new java.util.HashMap<Integer, Integer>();
        for(int i=0;i<m;i++) {
            t = sc.nextInt();
            if(brr.containsKey(t)){
                Integer temp = (Integer) brr.get(t);
                brr.put(t, ++temp);
            } else
                brr.put(t, 1);
        }
        
        for(java.util.Map.Entry<Integer, Integer> i : brr.entrySet()) {

            if(!arr.containsKey(i.getKey()) && !missing.contains(i.getKey()))
                missing.add(i.getKey());
            
            if((arr.get(i.getKey()) != i.getValue()) && !missing.contains(i.getKey()))
                missing.add(i.getKey());
        }

        java.util.Collections.sort(missing);

        for(Integer i : missing)
            System.out.print(i + " ");
    }
}