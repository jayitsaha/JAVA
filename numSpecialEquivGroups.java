class Solution {
    class WordMap{
        int i;
        HashMap<String,List<Character>> map;
        boolean added = false;
        
        WordMap(int i){
            this.i = i;
            this.map = new HashMap<>(); 
        }
    }
    
    public int numSpecialEquivGroups(String[] words) {
         List<WordMap> wmList = new ArrayList<>();
        for(int i = 0; i<words.length; i++){
            WordMap wm = new WordMap(i);
            wmList.add(wm);
            String word = words[i];
            for(int j=0; j<word.length(); j++){
                if((j+1)%2 != 0){
                    if(wm.map.get("odd") == null)
                        wm.map.put("odd",new ArrayList<Character>());
                    wm.map.get("odd").add(word.charAt(j));
                }
                else{
                    if(wm.map.get("even") == null)
                        wm.map.put("even",new ArrayList<Character>());
                    wm.map.get("even").add(word.charAt(j));
                }
            }
            Collections.sort(wm.map.get("odd"));
            
            if(wm.map.get("even")!=null)
                Collections.sort(wm.map.get("even"));
        }
        
        Map<String,List<String>> res = new HashMap<>();
        
        for(int i = 0; i<wmList.size(); i++){
            String s = words[wmList.get(i).i];
            List<Character> oddList1 = wmList.get(i).map.get("odd");
            List<Character> evenList1 = wmList.get(i).map.get("even");
            
            if(!wmList.get(i).added)
            	res.put(s,new ArrayList<>());
            else
            	continue;
            
            for(int j =i+1; j<wmList.size(); j++){
            	String t = words[wmList.get(j).i];
                List<Character> oddList2 = wmList.get(j).map.get("odd"); 
                List<Character> evenList2 = wmList.get(j).map.get("even");
                
                 if(oddList1.equals(new ArrayList<>(oddList2)) 
                    && (evenList1 != null && evenList1.equals(new ArrayList<>(evenList2)))){
                	 res.get(s).add(t);
                	 wmList.get(j).added = true;
                 }
            }
        }
        return res.size();
    }
}
