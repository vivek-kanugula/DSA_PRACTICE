class StockSpanner {

    ArrayDeque<Pair> a ;
    int ind;
    public StockSpanner() {
        a = new ArrayDeque<>();
        ind = -1;
    }
    
    public int next(int price) {
        ind++;
        while(!a.isEmpty() && a.peek().ele <= price)
        {
            a.pop();
        }
        int id = a.isEmpty() ? -1 : a.peek().ind;
        a.push(new Pair(price,ind));
        return ind-id;
    }
}

class Pair{

    int ele;
    int ind;
    Pair(int e , int i){
        ele = e;
        ind = i;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */