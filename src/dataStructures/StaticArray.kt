package dataStructures

/*Static arrays are a organized length of arrays which are indexable,
used for temporary storage
access - 0(1)
search - 0(n)
Deletion/Insertion/Append - does not exist
Static arrays are not appendable , insertable or deletable */

fun main(){
    val size = 5
    val staticArray = ArrayList<String>(size)
    for (i in 0 until size-1) {
        staticArray.add(readLine().toString())
    }
    for (i in 0 until staticArray.size) {
       print(staticArray[i])
    }

}