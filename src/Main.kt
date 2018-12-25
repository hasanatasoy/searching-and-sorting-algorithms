import BinarySearch.BinarySearch
import InsertionSort.InsertionSort

fun main(args:Array<String>){

    var testArray = arrayOf( 44 )

    //testBinarySearch(testArray)
    //testInsertionSort(testArray)

 }

fun testInsertionSort(array: Array<Int>){
    var insertionSearch = InsertionSort()
    var arraySize = array.size
    insertionSearch.sort( array, arraySize )
    for (count in array){
        println(count)
    }
}
fun testBinarySearch(array: Array<Int>){
    var binarySearch = BinarySearch()
    var arraySize = array.size
    for (target in 0 until arraySize){
        var index = binarySearch.findIndex( array, array[target], arraySize )
        println(index)
    }
}
