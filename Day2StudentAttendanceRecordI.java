class Solution {
    public boolean checkRecord(String s) {
        int absents=0;
        int lateDays=0;
        
        for(int i=0; i<s.length(); i++){
            for(int j = i+2; j<s.length();j++){
                if(s.charAt(j-2)=='L' && s.charAt(j-1)=='L' && s.charAt(j)=='L' ) return false;
            }
            
            
            if(s.charAt(i)=='A'){
                absents++;
                if(absents==2){
                    return false;
                }
            }
        }
           return true;
            
        }
    }
