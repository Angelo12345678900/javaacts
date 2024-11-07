public class Tasksheet120 {

    public static void main(String[] args) {
        // Example call to the cumulativeSum method
        int totalSum = cumulativeSum(4, 5, 10);
        System.out.println("Total sum of cumulative sums is " + totalSum);
    }

    /**
     * Method to calculate the cumulative sum for each parameter and
     * return the total sum of these cumulative sums.
     * 
     * @param numbers Variable arguments of integer type
     * @return The sum of all cumulative sums
     */
    public static int cumulativeSum(int... numbers) {
        int totalSum = 0;

        for (int num : numbers) {
            int cumulativeSum = 0;

            // Calculate the cumulative sum for the current number
            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }

            System.out.println("Cumulative sum for " + num + " is: " + cumulativeSum);
            totalSum += cumulativeSum;
        }

        return totalSum;
    }
}
