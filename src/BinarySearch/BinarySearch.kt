package BinarySearch

import Logger

class BinarySearch {

    private var left: Int = 0
    private var right: Int = 0
    private var middle: Int = 0

    // Best case = O(1), Worst case = O(log n)
    // Best case explanation: We can find in first step, what we are looking for
    // Example: Target value can be in middle index and that function find it in first step
    // Worst case explanation: Lets say n = array.size = 16 and this algorithm is contuniously dividing as follows - >
    // n/2, n/2^2, n/2^3, n/2^4..., n/2^k = 1 --> n = 2^k and this means k equals us step size. Lets leave k alone
    // logn = k and this means we found target value in last step and this is worst case
    fun findIndex( targetArray: Array< Int >, target: Int , targetArraySize: Int ): Int {
        right = targetArraySize - 1
        while (right >= left){
            middle = (right + left) / 2
            when {
                targetArray[middle] == target -> return middle
                targetArray[middle] > target -> findIndex(targetArray, target, middle)
                else -> left = middle + 1
            }
        }
        Logger.showTerminalMessage("Target number not in array")
        return -1
    }
}