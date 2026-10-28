class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        int n = asteroids.length;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            int e = 0;
            if (asteroids[i] > 0) {
                s.push(asteroids[i]);
            } else {
                if (s.isEmpty() || s.peek() < 0)
                    s.push(asteroids[i]);
                else {
                    while (!s.isEmpty() && s.peek() > 0 && s.peek() < -asteroids[i]) {
                        s.pop();
                    }
                    if (s.isEmpty() || s.peek() < 0)
                        s.push(asteroids[i]);
                    else if (!s.isEmpty() && s.peek() == -asteroids[i])
                        s.pop();
                }
            }
        }

        return s.stream().mapToInt(Integer::intValue).toArray();
    }
}