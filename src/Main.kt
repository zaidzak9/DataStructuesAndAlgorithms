fun main() {
    println(reverse(-340))
}

//Leetcode return array of indexes which equal to a number
fun twoSum(nums: IntArray, target: Int): IntArray {
   for (i in nums.indices){
       for (j in i+1 until nums.size){
           if (nums[j] == target - nums[i]) {
               return intArrayOf(i, j)
           }
       }
   }
    throw IllegalArgumentException("No two sum solution")
}

//create a array with numbers which sum to a total
fun answerreturn():ArrayList<Int>{
    val array1 = arrayListOf<Int>(1,2,4,5,6,7)
    val answer =10
    val array2 = arrayListOf<Int>()
    for(i in 0 until array1.size){
        for (j in i+1 until array1.size){
            if (array1.get(i)+array1.get(j) == answer){
                array2.add(array1[i])
                array2.add(array1[j])
            }
        }
    }
    return array2
}

//print an number in reverse order,ignore minus and if last digit is zero
fun reverse(x: Int): Int {
    var size = 0
    var arrayNum = arrayListOf<String>()
    var numberString : String= x.toString()
    println(numberString.length)
    for (i in numberString){
        size++
        var character = i.toString()
        if (!(size == numberString.length && character == "0")){
            arrayNum.add(i.toString())
        }
    }
    for (i in arrayNum){
        println(i)
    }


    return x
}

