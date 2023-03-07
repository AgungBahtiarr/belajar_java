public class insertionSorting {
  public static void main(String[] args) {
    int[] data = new int[10];

    for (int i = 0; i < data.length; i++) {
      data[i] = (int) (Math.random() * 10 + 1);
    }

    for (int i = 0; i < data.length; i++) {
      System.out.print(data[i] + " ");
    }

    System.out.println();

    int n = data.length;
    int key, j;
    for (int i = 1; i < n; i++) {
      key = data[i];
      j = i - 1;

      while (j >= 0 && data[j] > key) {
        data[j + 1] = data[j];
        j = j - 1;
      }
      data[j + 1] = key;

      System.out.print("Proses ke- " + i + " : ");
      for (int r = 0; r < data.length; r++) {
        System.out.print(data[r] + ",");
      }
      System.out.println("\n");
    }

  }
}
