package MergeSort

class MergeSort {

    private var tmp = 0
    private var middle = 0

    fun sort( array: Array< Int >, left: Int, right: Int){
        if(right>left){
            middle = ( right + left ) / 2
            sort( array, left, middle )
            sort( array, middle + 1, right )
            merge( array, left, middle, right )
        }

    }

    private fun merge( array: Array< Int >, left: Int, middle: Int, right: Int ) {

    }
}