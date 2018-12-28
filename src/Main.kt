import BinarySearch.BinarySearch
import BubbleSort.BubbleSort
import InsertionSort.InsertionSort
import MergeSort.MergeSort
import SelectionSort.SelectionSort

fun main(args:Array<String>){

    var testArray = arrayOf( 3, 1, 4, 2, 5, 7, 23, 8, 72 )
    var arraySize = testArray.size
    //testBinarySearch( testArray, arraySize )
    //testInsertionSort( testArray, arraySize )
    //testBubbleSort( testArray, arraySize )
    //testMergeSort( testArray, arraySize )
    //testSelectionSort(testArray, arraySize)

 }
fun testSelectionSort( array: Array<Int>, arraySize: Int ) {
    val selectionSort = SelectionSort()
    selectionSort.sort( array, arraySize )
    for(count in array){
        println(count)
    }
}
fun testBubbleSort( array: Array< Int >, arraySize: Int ) {
    val bubbleSort = BubbleSort()
    bubbleSort.sort( array, arraySize )
    for(count in array){
        println(count)
    }
}
fun testMergeSort( array: Array<Int>, arraySize: Int ){
    val mergeSort = MergeSort()
    mergeSort.sort( array, 0, arraySize-1 )
    for(count in array){
        println(count)
    }
}
fun testInsertionSort( array: Array<Int>, arraySize: Int ){
    val insertionSearch = InsertionSort()
    insertionSearch.sort( array, arraySize )
    for (count in array){
        println(count)
    }
}
fun testBinarySearch( array: Array<Int>, arraySize: Int ){
    val binarySearch = BinarySearch()
    for (target in 0 until arraySize){
        val index = binarySearch.findIndex( array, array[target], arraySize )
        println(index)
    }
}
