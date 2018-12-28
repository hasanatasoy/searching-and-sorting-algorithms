package InsertionSort

class InsertionSort {

    private var key = 0
    private var previousIndex = 0

    // Best case = O(n), Worst case = O(n^2)
    // Best case explanation: If array already sorted then we are cool
    // We don't need while loop just for loop turns n-1 times
    // Worst case explanation: If array order reverse then we have things to do
    // Example: count than for each selectionIndex --> [1,0]+[2,1,0]+[3,2,1,0]...+[n,n-1,n-2..]=(n*(n+1))/2 = (n^2+n)/2
    // O((n^2+n)/2) We can neglect "n" and "/2" if arraySize is based on large numbers then O(n^2)
    fun sort( array: Array< Int >, arraySize:Int ) {
        for ( selectionIndex in 1 until arraySize ){
            key = array[selectionIndex]
            previousIndex = selectionIndex - 1
            // you should write first "previousIndex >= 0" in while otherwise you can get exception
            // example: array[-1]
            while ( previousIndex >= 0 && array[previousIndex] > key ) {
                array[previousIndex + 1] = array[previousIndex]
                previousIndex--
            }
            array[previousIndex + 1] = key
        }
    }
}