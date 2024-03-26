class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(String token : tokens){
            switch(token){
                    case "+" -> stack.push(stack.pop() + stack.pop());
                    case "-" -> {
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.push(b-a);
                    }
                    case "*" -> stack.push(stack.pop() * stack.pop());
                    case "/" -> {
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.push(b/a);
                    }
                    default -> stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop();
    }
}