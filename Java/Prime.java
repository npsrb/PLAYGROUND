class Prime {
    public static void main(String[] args) {
        int check_me = 3;
        boolean isPrime = true;
        for (int i = 2; i < check_me; i++) {
            if (check_me % i == 0) {
                isPrime = false;
            }
        }
        String result = (isPrime == true) ? " IS A PRIME" : "IS NOT PRIME";
        System.out.println(check_me + result);
    }
}