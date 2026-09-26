class Solution {
    public int shipWithinDays(int[] weights, int days) {
    int max = 0, sum = 0;

    for (int weight : weights) {
        max = Math.max(max, weight);
        sum += weight;
    }

    int left = max;
    int right = sum;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (check(mid, weights, days)) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    return left;
}

public static boolean check(int capacity, int[] weights, int days) {
    int daysNeeded = 1;
    int currentWeight = 0;

    for (int weight : weights) {
        if (currentWeight + weight > capacity) {
            daysNeeded++;
            currentWeight = 0;
        }

        currentWeight += weight;
    }

    return daysNeeded <= days;
}
}