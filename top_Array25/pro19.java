// finding smallest and second smallest element in arry


class Barray19 {
    public static void main(String[] args) {
        int N = 6;
        int arr[] = {1, 2, 1, 3, 6, 7};

        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (arr[i] < firstMin) {
                secondMin = firstMin;
                firstMin = arr[i];
            } else if (arr[i] > firstMin &&arr[i] < secondMin) {
                secondMin = arr[i];
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("There is no second minimum element");
        } else {
            System.out.println("min: " + firstMin);
            System.out.println("Second min: " + secondMin);
        }
    }
}
