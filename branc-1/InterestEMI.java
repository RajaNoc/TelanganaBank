class CalculateSimpleInterest
{
    public static void main(String s[])
    {
        double principal = 5000; // Rs. 5000
        double time = 2; // 2 years
        double rate = 11.25; // 11.25 % per annum
    
        double interest = calculateInterest( principal, time, rate ); // LINE A
    
        printSummary( principal, time, rate, interest );
    }
    
    public static double calculateInterest(double principal, double time, double rate) // LINE B
    {
        double result = principal * time * rate / 100.0; // LINE C
        return result;
    }
    
    public static void printSummary(double p, double t, double r, double interest)
    {
        System.out.print("Interest for Rs " + p + " for " + t + " years ");
        System.out.print("at the rate of " + r + "% p.a. is Rs " + interest);
    }
}