class Solution {
    public boolean backspaceCompare(String s, String t) {
                Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for(int i=0;i<s.length();i++)
        {

            if(!s1.isEmpty() && s.charAt(i)=='#') // if # comes delete one element
            {
                s1.pop();
            }
                        else if(s.charAt(i)=='#') // if stack is empty # is dosen't effect on string'
            {
            }
            else{
                s1.push(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++)
        {

            if(!s2.isEmpty() && t.charAt(i)=='#')
            {
                s2.pop();
            }
                        else if(t.charAt(i)=='#')
            {
            }
            else{
                s2.push(t.charAt(i));
            }
        }
        return s1.equals(s2);  // compare both stack
    }
}
