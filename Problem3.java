class Problem3{
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(600851475143L));
    }
    static int largestPrimeFactor(long num){
        int max = 0;
        int current = 2;
        while (num != 1) {
            if(num % current == 0){
                num = num / current;
                max = Math.max(current, max);
            }else{
                current++;
            }
        }
        return max;
    }
}