class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        HashMap<Character, Character> open = new HashMap<>();
        open.put('{', '}');
        open.put('(', ')');
        open.put('[', ']');

        HashMap<Character, Character> close = new HashMap<>();
        close.put('}', '{');
        close.put(')', '(');
        close.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (open.containsKey(c)) {
                stack.push(c);
                continue;
            }

            if (close.containsKey(c)) {
                if (close.get(c).equals(stack.peek())) {
                    stack.pop();
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}
