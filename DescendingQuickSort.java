public class DescendingQuickSort {

    // Method for partition of Quick Sort
    int partition(int intArray[], int start, int end){

        // For the pivot we are using the last index or end of the array.
        int pivot = intArray[end];

        // i is used to denote the index of the smaller element.
        // i = -1 because in the if statement that is nested in the for loop it starts by automatically incrementing i
        // Thus i will  be incremented to index 0 below.
        int i = (start - 1);

        // Starting at the start of the array and ending at the end of the array, incrementing once after each loop
        for (int j = start; j <= end; j++) {
            // If the current element that we are on is less than pivot
            if (intArray[j] > pivot)
            {
                i++; // Used to increment through indexes


                // Swapping intArray[i] and intArray[j]

                // Store the original value of index i in temp so that we don't lose it
                int temp = intArray[i];
                // Now change the value of index i to the value of index j
                intArray[i] = intArray[j];
                // Finish the swap by storing the original value of index i (that we put in temp) into j
                intArray[j] = temp;

                System.out.println("DEBUG: If statement in partition was ran");
            }
        }

        // Swapping intArray[i+1] and intArray[end]/pivot

        // Store the value of index i+1 into temp
        int temp = intArray[i+1];
        // Now set the value of index i+1 to the value of the index at the end of the array which was our pivot
        intArray[i+1] = intArray[end];
        // Finish the swap by taking the original value of i+1 and making it the new end of the array or pivot
        intArray[end] = temp;

        System.out.println("DEBUG: Partition method completed");
        return i+1;
    }

    void descQuickSort(int intArray[], int start, int end){

        if (start < end)
        {

            int partitionIndex = partition(intArray, start, end);

            // Recursively sort elements before partition and after partition
            descQuickSort(intArray, start, partitionIndex-1);
            descQuickSort(intArray, partitionIndex+1, end);
        }

        System.out.println("DEBUG: descQuickSort completed");
    }

}
