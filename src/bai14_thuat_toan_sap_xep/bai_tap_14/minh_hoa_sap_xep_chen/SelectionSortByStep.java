package bai14_thuat_toan_sap_xep.bai_tap_14.minh_hoa_sap_xep_chen;

public class SelectionSortByStep {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    // codes below here
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            /* Find the minimum in the list[i..list.length-1] */

            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    System.out.println("Swap " + currentMin + " with " + list[j]);
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }


            /* Swap list[i] with list[currentMinIndex] if necessary */
            if (currentMinIndex != i) {
//                System.out.println("Swap " + list[currentMinIndex] + " with " + list[i]);
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
            System.out.print("List after the  " + (int)(i+1) + "' sort: ");
            for (double value : list) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        for (double value : list) {
            System.out.print(value + "\t");
        }
        System.out.println("\nBegin sort processing...");
        selectionSort(list);

    }
}

