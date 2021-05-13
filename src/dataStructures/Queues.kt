package dataStructures

import java.lang.IllegalArgumentException
import java.util.LinkedList

val queue = LinkedList<String>()

/*
    Linear data structure , similar to stack, there are 2 main functions
    ENQUEUE - Add new element to last/end of que
    DEQUEUE - remove element from start/begin of que

    Time Complexity
    ENQUEUE/DEQUEUE/PEEKING/IsEmpty --> 0(1) Constant time
    contains/removal --> 0(N)

    peeking means to look at the value of the first element
 */
fun main(){
    enqueue("Z")
    enqueue("A")
    enqueue("I")
    enqueue("D")
    println(queue)
    println(peek().toString())
    dequeue()
    println(queue)
    println(contains("A"))
    removal("I")
    println(queue)
}

private fun dequeue(){
    if (queue.isEmpty()){
        throw IllegalArgumentException("Queue is empty")
    }else {
        queue.removeFirst()
    }
}

private fun enqueue(element : String){
    if (element.isNullOrEmpty()){
        throw IllegalArgumentException("Element should be valid")
    }else {
        queue.addLast(element)
    }
}

private fun peek():String{
    if (queue.isEmpty()){
        throw IllegalArgumentException("Queue is empty")
    }else {
        return queue.first
    }
    return ""
}

private fun contains(element : String):Boolean{
    if (queue.isEmpty()){
        throw IllegalArgumentException("Queue is empty")
    }else {
        return queue.contains(element)
    }
   return false
}

private fun removal(element : String){
    if (queue.contains(element)){
        queue.remove()
    }
}


