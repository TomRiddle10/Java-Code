import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;
public class Graph1 {
    static ArrayList<ArrayList<Integer>> gph=new ArrayList<>();
    static void createGraph(int ver){
        for(int i=0;i<ver;i++){
            gph.add(new ArrayList<>());
        }
    }
    static void addEdge(int src, int dest){
        gph.get(src).add(dest);
        gph.get(dest).add(src);
    }
    static void BFS(int src, int ver){
        boolean[] visited=new boolean[ver];
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        visited[src]=true;
        while(!q.isEmpty()){
            int data=q.poll();
            System.out.print(data+" ");
            for(int neighbour: gph.get(src)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                }
            }
        }
    }
    static void DFS(int src) {
    Deque<Integer> st = new ArrayDeque<>();
    boolean[] visited = new boolean[gph.size()];

    st.push(src);
    visited[src] = true;

    while (!st.isEmpty()) {
        int curr = st.peek();
        System.out.print(curr + " ");

        boolean found = false;

        for (int next : gph.get(curr)) {
            if (!visited[next]) {
                st.push(next);
                visited[next] = true;
                found = true;
                break; 
            }
        }

        if (!found) {
            st.pop(); 
        }
    }
}
    static boolean containsEdge(int src,int dest){
        return gph.get(src).contains(dest);
    }

    static void deleteEdge(int src,int dest){
        
        gph.get(src).remove(Integer.valueOf(dest));
        gph.get(dest).remove(Integer.valueOf(src));
    }


    public static void main(String[] args){
        createGraph(6);
        addEdge(0, 1);
        addEdge(0,5);
        addEdge(1,2);
        addEdge(1,5);
        addEdge(2,3);
        addEdge(3,4);
        addEdge(3,5);
        System.out.println("");
        BFS(0,6);
        System.out.println("");
        System.out.println("");
        DFS(0);
        System.out.println(containsEdge(0, 1));
        deleteEdge(0, 5);
        System.out.println(containsEdge(0, 5));
    }
}
