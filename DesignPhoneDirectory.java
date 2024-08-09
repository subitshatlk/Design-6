//TC - O(1)
//SC - O(n)
class PhoneDirectory {
    Queue<Integer> q;
    HashSet<Integer> set;
    public PhoneDirectory(int maxNumbers) {
        q = new LinkedList<>();
        set = new HashSet<>();
        for(int i = 0; i < maxNumbers;i++){
            q.add(i);
            set.add(i);
        }
        
    }
    //Tc - O(1)
    public int get() {
        while(!q.isEmpty()){
            int polled = q.poll();
            set.remove(polled);
            return polled;
        }
        return -1;
    }
    //TC - O(1)
    public boolean check(int number) {
        return set.contains(number);
        
    }
    //TC - O(1)
    public void release(int number) {
        if(!set.contains(number)){
            q.add(number);
            set.add(number);
        }
    }
}

/**
 * Your PhoneDirectory object will be instantiated and called as such:
 * PhoneDirectory obj = new PhoneDirectory(maxNumbers);
 * int param_1 = obj.get();
 * boolean param_2 = obj.check(number);
 * obj.release(number);
 */