public class standardDeviation {
    public static void main(String[] args) {
        double[] list = {10, 12, 23, 23, 16, 23, 21, 16};
        double sd = standardDeviation(list);
        System.out.println("Standard Deviation is: " + sd);
    }

public static double standardDeviation (double[] list)
{
    // Finding mean of list
    double sum = 0.0;
    for (double i: list) {
        sum += i;
    }
    int length = list.length;
    double mean = sum/length;

    // calculate standard deviation 0 =
    double standardDeviation = 0.0;
    for (double num: list) {
        standardDeviation += Math.pow(num - mean, 2);
    }
    standardDeviation = Math.sqrt(standardDeviation/length);
    return standardDeviation;
}
}