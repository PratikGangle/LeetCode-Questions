class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for(String a : word1){
            sb1.append(a);
        }
           
        for(String a : word2){
            sb2.append(a);
        }                
        return sb1.toString().equals(sb2.toString());
    }
}