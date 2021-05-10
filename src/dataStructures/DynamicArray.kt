package dataStructures

/*dynamic arrays can grow ,shrink in size when needed
access - 0(1)
search - 0(n)
Deletion/Insertion/Append - 0(1)
 */
import java.lang.IllegalArgumentException
var capacity = 0
var dynamicArray = ArrayList<String>(capacity)
fun main(){
}

fun inputDynamicArray(capacity: Int){
    if (capacity<0){
        throw IllegalArgumentException("Illegal capacity $capacity")
    }else{
        dynamicArray = ArrayList(capacity)
    }
}

fun returnArraySize():Int = dynamicArray.size

fun returnArrayValueAtIndex(index : Int):Any = dynamicArray[index]

fun reSizeArray(value:String){
    if (dynamicArray.size == capacity){
        capacity *= 2
        var newDynamicArray = ArrayList<String>(capacity)
        newDynamicArray.addAll(dynamicArray)
        dynamicArray.addAll(newDynamicArray)
        print("The new size of Dynamic array is $capacity")
    }
}

fun removeElementAtIndex(arrayIndex:Int){
    if (arrayIndex >= capacity || arrayIndex < 0){
        throw IllegalArgumentException("Illegal array value $arrayIndex")
    }else{
        var originalCapacity = capacity
        dynamicArray.removeAt(arrayIndex)
        capacity -= 1
        if (originalCapacity < capacity/2){
            //optional
            var newDynamicArray = ArrayList<String>(capacity)
            //create new array of new sizes
        }
    }
}

