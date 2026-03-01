// Problem: Find largest element in array
// Time Complexity: O(n)
// Space Complexity: O(1)

class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 89, 45};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest);
    }
}