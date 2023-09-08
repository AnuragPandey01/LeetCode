class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack =  new Stack<>();
        boolean ans = true;

        for(int i =0; i<s.length(); i++){

            char curr = s.charAt(i);

            if(curr == '(' || curr == '{' || curr =='['){
                stack.push(curr);
            }else{

                if(stack.isEmpty()){
                    ans = false;
                    break;
                }
                char a = stack.pop();
                boolean matched = isMatching(a,curr);

                if(!matched){
                    ans = false;
                    break;
                }
            }
        }

        if(!stack.isEmpty()){
            return false;
        }

        return ans;
    }

    public static boolean isMatching(char a, char b){

        if(a == '(' &&  b == ')'){
            return true;
        }else if( a == '{' && b == '}'){
            return true;
        }else if( a ==  '[' && b == ']'){
            return true;
        }

        return false;
    }
}