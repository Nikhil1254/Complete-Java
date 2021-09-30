public class varargsDemo {

    public static int sum(int... nums) {
        int sum = 0;
        for (int ele : nums)
            sum += ele;
        return sum;
    }
    //There can be only one vararg for a method.
    //vararg should be last argument in a method.

    public static void main(String[] args) {
        long x = 12000403040506l;
        System.out.println(x);
        System.out.println(sum(5, 6));
        System.out.println(sum(11, 12, 23));
        System.out.println(sum());
        System.out.println(sum(12));
    }
}