class MinStack {

    Long min = Long.MAX_VALUE;
    ArrayDeque<Long> ad ;
    public MinStack() {
        ad = new ArrayDeque<>();
    }
    
    public void push(int value) {
        
        Long val = (long)value;
        if(ad.isEmpty())
        {
            ad.push(val);
            min = val;
        }
        else
        {
            if(min > val)
            {
                ad.push(2*val-min);
                min = val;
            }
            else
            {
                ad.push(val);
            }
        }
    }
    
    public void pop() {
        
        if(!ad.isEmpty())
        {
            long val = ad.pop();
            if(val < min)
            {
                min = 2*min-val;
            }
        }
    }
    
    public int top() {
        
        if(ad.peek() < min)
            return min.intValue();
        return ad.peek().intValue();
    }
    
    public int getMin() {
        
        return min.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */