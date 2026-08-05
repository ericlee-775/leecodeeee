class Solution {
    public boolean isValid(String s) {
        char[] p = new char[s.length()];
        int index=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}'){
                if(index>0&&p[index-1]=='('&&s.charAt(i)==')'){
                    index--;
                }
                else if(index>0&&p[index-1]=='['&&s.charAt(i)==']'){
                    index--;
                }
                else if(index>0&&p[index-1]=='{'&&s.charAt(i)=='}'){
                    index--;
                }
                else{
                    return false;
                }
            }
            else{
                p[index]=s.charAt(i);
                index++;
            }
        }
        if(index==0){
            return true;
        }else{
            return false;
        }
    }
}