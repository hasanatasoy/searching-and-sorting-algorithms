package SelectionSort

class SelectionSort {

    private var tmp  = 0
    private var min = 0

    // Best case = O(n^2), Worst case = O(n^2)
    // This algorithm works, select smallest index and put start of array
    // Then in best case or worst case external and internal loop always works
    fun sort( array: Array< Int >, arraySize: Int ) {
        for ( selectionIndex in 0 until arraySize - 1 ) {
            min = selectionIndex
            for ( compareIndex in selectionIndex + 1 until arraySize) {
                if(array[compareIndex] < array[min]){
                    min = compareIndex
                }
            }
            if(min != selectionIndex)
                swap( array, selectionIndex, min )
        }
    }

    private fun swap(array: Array<Int>, selectionIndex: Int, min: Int) {
        tmp = array[selectionIndex]
        array[selectionIndex] = array[min]
        array[min] = tmp
    }
}