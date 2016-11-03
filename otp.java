import java.util.Random;

public class otp
{
    static char[] generateOtp(int len)
    {
        System.out.println("your OTP:");
        String nums = "0123456789";
        Random rnd = new Random();
        char[] otp = new char[len];
        int index = 0;
        for(int i=0;i<len;i++)
        {
            otp[i] = nums.charAt(rnd.nextInt(nums.length()));
        }
        return otp;
    }
    public static void main(String args[])
    {
        int length = 4;
        System.out.println(generateOtp(length));
    }
}