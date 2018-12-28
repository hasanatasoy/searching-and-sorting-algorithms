package BubbleSort


class BubbleSort {

    private var tmp = 0
    private var flag = 0

    // Best case = O(n), Worst case = O(n^2)
    // Best case explanation: If array already sorted then np we good
    // Because extarnal for will work one times thanks to flag and internal for will work n times
    // Worst case explanation: If array not sorted than extarnal for will work n times, internal for will work n-i times
    // ----> for n = 3 >> step by step { for i = 0 , j = 0,1,2 }, { for i = 1 , j = 0,1 }, { for i = 2 , j = 0 }
    // ----> for i = 0 >> 3 times + for i = 1 >> 2 times + for i = 2 >> 1 times
    // ----> 3+2+1 = Program will work 6 times than we can say (n * n + 1) / 2
    // ----> = (n^2 + n) /2 >> We can neglect "n" and "/2" if arraySize is based on large numbers then O(n^2)
    fun sort( array: Array< Int >, arraySize: Int ) {
        for( i in 0 until arraySize ) {
            flag = 1
            for( j in 1 until arraySize - i ) {
                if( array[j-1] > array[j]){
                    tmp = array[j]
                    array[j] = array[j-1]
                    array[j-1] = tmp
                    flag = 0
                }
            }
            if( flag == 1 ){
                break
            }
        }
    }
}