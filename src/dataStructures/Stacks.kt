package dataStructures

import java.lang.IllegalArgumentException
import java.util.LinkedList

val stack = LinkedList<String>()
/*
 Stack is linear data structure having 2 primary functions - PUSH AND POP
 We only have access to TOP of stack as it follows LIFO(Last In First Out)

 Pushing/Popping/Peeking 0(1)
 Searching 0(n)
 size 0(1)
 */
fun main(){
    pushElement("z")
    pushElement("a")
    pushElement("i")
    pushElement("d")
    println("Pushed some elements : $stack")
    popElement()
    popElement()
    println("Popped some elements : $stack")
}

private fun pushElement(element: String){
    if (element.isNullOrEmpty()){
        throw IllegalArgumentException("Element should be valid")
    }else {
        stack.addLast(element)
    }
}

private fun popElement(){
    if (stack.isEmpty()){
        throw IllegalArgumentException("Stack is empty")
    }else {
        stack.removeLast()
    }
}