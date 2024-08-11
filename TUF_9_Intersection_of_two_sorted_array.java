import java.util.ArrayList;

public class Intersection_of_two_sorted_array {
    public static void main(String[] args) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};

        ArrayList<Integer> Intersection = FindIntersection(arr1, arr2, n, m);

        System.out.println(Intersection);
    }

    static ArrayList<Integer> FindIntersection(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0;
        ArrayList<Integer> Intersection = new ArrayList<>();
        int visited[] = new int[Math.max(n, m)];

        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                if (visited[i] == 0) {
                    Intersection.add(arr1[i]);
                    visited[i] = 1; // Mark as visited
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Intersection;
    }
}
