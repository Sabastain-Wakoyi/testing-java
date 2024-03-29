public class Assignment2 {

    public static class Result {
        int left;
        int right;
        int middle;

        public Result(int left, int right, int middle) {
            this.left = left;
            this.right = right;
            this.middle = middle;
        }
    }

    public static Result findMaximumSubarray(int[] prices, int low, int high) {
        if (low == high) {
            return new Result(low, high, prices[low]);
        } else {
            int mid = (low + high) / 2;
            Result leftResult = findMaximumSubarray(prices, low, mid);
            Result rightResult = findMaximumSubarray(prices, mid + 1, high);
            Result crossResult = findMaxCrossingSubarray(prices, low, mid, high);

            if (leftResult.middle >= rightResult.middle && leftResult.middle >= crossResult.middle) {
                return leftResult;
            } else if (rightResult.middle >= leftResult.middle && rightResult.middle >= crossResult.middle) {
                return rightResult;
            } else {
                return crossResult;
            }
        }
    }

    public static Result findMaxCrossingSubarray(int[] prices, int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        int maxLeft = 0;
        for (int i = mid; i >= low; i--) {
            sum += prices[i];
            if (sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        int maxRight = 0;
        for (int i = mid + 1; i <= high; i++) {
            sum += prices[i];
            if (sum > rightSum) {
                rightSum = sum;
                maxRight = i;
            }
        }

        return new Result(maxLeft, maxRight, leftSum + rightSum);
    }

    public static void main(String[] args) {
        int[] prices = {100, 113, 85, 105,102,86,81,101,94,101,94,101,79,94,90,97};
        int[] changes = {13, -3, -25, 20, -3,-16,-23,18, 20,-7,12,-5,-22,15,-5,7};

        Result result = findMaximumSubarray(changes, 0, changes.length - 1);
        System.out.println("Maximum Subarray: ");
        System.out.println("Left index: " + result.left);
        System.out.println("Right index: " + result.right);
        System.out.println("Middle index: " + result.middle);
    }
}
