package edu.fengli.demo4;


import java.util.*;

/**
 * @author Administrator
 */
public class T448 {
    private static StringBuilder target;
    private static StringBuilder state;
    static Set<String> allState = new HashSet<String>();

    /**
     * 持有状态、内容的内部类
     */
    private static class StateAndLevel{
        StringBuilder state;
        int level;
        int pos;

        public StateAndLevel(StringBuilder state, int level, int pos) {
            this.state = state;
            this.level = level;
            this.pos = pos;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        state = new StringBuilder(scanner.nextLine());
        target = new StringBuilder(scanner.nextLine());

        dfs();
    }

    private static void dfs() {
        Queue<StateAndLevel> queue = new LinkedList<StateAndLevel>();
        StateAndLevel e = new StateAndLevel(state, 0, state.indexOf("*"));
        queue.add(e);
        allState.add(state.toString());

        while (! queue.isEmpty()){
            StateAndLevel front = queue.poll();
            StringBuilder state = front.state;
            int level = front.level;

            if (target.toString().equals(state.toString())) {
                System.out.println(level);
                break;
            }
            int pos = front.pos;
            
            for (int i = -3; i <= 3; i++) {
                if (i == 0) {continue;}
                StringBuilder newState = new StringBuilder(state);
                if (pos + i >= 0 && pos + i < state.length() ) {
                    swap(newState, pos, pos + i);
                    if (!allState.contains(newState.toString())){
                        StateAndLevel e1 = new StateAndLevel(newState, level + 1, pos + i);
                        queue.add(e1);
                        allState.add(newState.toString());
                    }
                }
            }
        }
    }

    private static void swap(StringBuilder newState, int pos, int i) {
        char t = newState.charAt(pos);
        newState.setCharAt(pos, newState.charAt(i));
        newState.setCharAt(i, t);
    }

}
