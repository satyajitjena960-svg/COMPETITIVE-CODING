class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        
        
        for(int x:a){
            
            map.put(x,map.getOrDefault(x,0)+1);
            
        }
        for(int x:b){
            if(map.containsKey(x)&&map.get(x)>0){
                result.add(x);
                map.put(x,map.get(x)-1);
                
            }
        }
        
        Collections.sort(result);
        return result;
    }
}