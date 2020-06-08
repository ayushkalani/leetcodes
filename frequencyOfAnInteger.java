// https://www.geeksforgeeks.org/count-number-of-occurrences-or-frequency-in-a-sorted-array/
public class frequencyOfAnInteger {

  public static int firstBinarySearch(int[] elements, int l, int r, int element) {
    if (r < l)
      return -1;
    int mid = l + ( r - l) / 2;
    if (element == elements[mid]) {
      if (mid == 0)
        return 0;
      int i = mid - 1;
      while (i >= 0) {
        if (element == elements[i]) {
          i--;
        } else {
          return i + 1;
        }
      }
    }

    if (element > elements[mid]) {
      return firstBinarySearch(elements, mid + 1, r, element);
    }
    return firstBinarySearch(elements, l, mid - 1, element);
  }

  public static int lastBinarySearch(int[] elements, int l, int r, int element) {
    if (r < l)
      return -1;
    int mid = l + ( r - l) / 2;
    if (element == elements[mid]) {
      if (mid == elements.length - 1)
        return elements.length;
      int i = mid + 1;
      while (i < elements.length) {
        if (element == elements[i]) {
          i++;
        } else {
          return i - 1;
        }
      }
    }

    if (element > elements[mid]) {
      return lastBinarySearch(elements, mid + 1, r, element);
    }
    return lastBinarySearch(elements, l, mid - 1, element);
  }

  public static int getOccurence(int[] arr, int target) {
    int first = firstBinarySearch(arr, 0, arr.length - 1, target);
    if (first == -1)
      return -1;
    int last = lastBinarySearch(arr, 0, arr.length - 1, target);
    return (last - first) + 1;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 3, 3, 3, 3, 4, 5 };
    System.out.println(getOccurence(arr, 3));
  }

}