// class MedianArray {
//     public static int [] merging(int a1[], int a2[]) {
//         int mer[] = new int[a1.length + a2.length];
//         for (int i = 0; i < a1.length; i++) {
//             mer[i] = a1[i];
//         }
//         for (int i = 0; i < a2.length; i++) {
//             mer[a1.length + i] = a2[i];
//         }
        
//         // Printing Merged Array
//         System.out.println("Merged Array:");
//         for (int num : mer) {
//             System.out.print(num + "\t");
//         }
//         System.out.println("\nSorted Array:");

//         // Sorting Merged Array (Bubble Sort)
//         for (int i = 0; i < mer.length; i++) {
//             for (int j = 0; j < mer.length - 1 - i; j++) {
//                 if (mer[j] > mer[j + 1]) {
//                     int temp = mer[j];
//                     mer[j] = mer[j + 1];
//                     mer[j + 1] = temp;
//                 }
//             }
//         }
//         return mer;
//     }

//     public static void main(String[] args) {
//         int[] a1 = {1, 2, 3};
//         int[] a2 = {4, 8, 6};
//        int mer[] = merging(a1, a2);
//         for (int num : mer) {
//             System.out.print(num + "\t");
//         }

//         int midnum = mer.length/2;
//         if(midnum %2 == 1){
//             double median = mer[midnum] ;
//             System.out.println(median);
//         }
//         else{
//             double median1 = midnum-1;
//             double median2 = midnum;
//             double median = (median1+median2)/2;
//             System.out.println(median);
//         }

//     }
// }

class MedianArray {
    public static double merging(int[] a1, int[] a2) {
        int[] mer = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            mer[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            mer[a1.length + i] = a2[i];
        }

        // Printing Merged Array
        System.out.println("Merged Array:");
        for (int num : mer) {
            System.out.print(num + "\t");
        }
        System.out.println("\nSorted Array:");

        // Sorting Merged Array (Bubble Sort)
        for (int i = 0; i < mer.length; i++) {
            for (int j = 0; j < mer.length - 1 - i; j++) {
                if (mer[j] > mer[j + 1]) {
                    int temp = mer[j];
                    mer[j] = mer[j + 1];
                    mer[j + 1] = temp;
                }
            }
        }
         for (int num : mer) {
            System.out.print(num + "\t");
        }
        System.out.println();

        int midnum = mer.length / 2;
        if (mer.length % 2 == 1) {
            double median = mer[midnum];
           
            return median;
        } else {
            double median1 = mer[midnum - 1];
            double median2 = mer[midnum];
            double median = (median1 + median2) / 2;
            
            return median;
        }
        
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 8, 6};
        double ans =merging(a1, a2); 
        System.out.println(ans);
       
    }
}

