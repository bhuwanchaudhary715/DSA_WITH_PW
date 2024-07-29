class Main{

    public static void main(String[] args) {


        int n=134;
        String s = Integer.toString(n);

        int len = s.length();

        int sum=0;

        for (int i=0;i<len;i++){

            int rem = n % 10;
            n = n/10;
            sum += Math.pow(rem,len);

        }

        System.out.println(sum);




    }
}