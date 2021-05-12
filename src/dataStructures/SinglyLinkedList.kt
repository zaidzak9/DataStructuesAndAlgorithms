package dataStructures

import java.lang.IllegalArgumentException

data class Node<T>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String {
        return if (next != null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}

private class LinkedList<T> {
    private var head:Node<T>? = null
    private var tail:Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        if (isEmpty()) {
            return "Empty list"
        } else {
            return head.toString()
        }
    }

    /*In the case in which you’re pushing into an empty list, the new node is both the head and tail of the list.
    Since the list now has a new node, you increment the value of size.*/
    fun insertHead(value:T){
        head = Node(value = value,next = head)
        if (tail == null){
            tail = head
        }
        size++
    }

    fun insertTail(value:T){
        if (isEmpty()){
            insertHead(value)
        }
        tail?.next = Node(value = value)

        tail = tail?.next
        size++
    }

    /*
    You create a new reference to head and keep track of the current number of traversals.
    Using a while loop, you move the reference down the list until you reach the desired index.
    Empty lists or out-of-bounds indexes will result in a null return value.
     */
    fun insertRandomNodeAt(index:Int):Node<T>?{
        var currentNode = head
        var currentIndex = 0
        if (isEmpty() || index < 0){
            throw IllegalArgumentException("Array is empty")
        }
        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode
    }

    fun insert(value: T, afterNode: Node<T>): Node<T> {
        if (tail == afterNode) {
            insertTail(value)
            return tail!!
        }
        val newNode = Node(value = value, next = afterNode.next)
        afterNode.next = newNode
        size++
        return newNode
    }

    fun removeHead(): T? {
        if (!isEmpty()) size--
        val result = head?.value
        head = head?.next
        if (isEmpty()) {
            tail = null
        }

        return result
    }

    fun removeLast(): T? {
        val head = head ?: return null
        if (head.next == null) return removeHead()
        size--

        var prev = head
        var current = head

        var next = current.next
        while (next != null) {
            prev = current
            current = next
            next = current.next
        }

        prev.next = null
        tail = prev
        return current.value
    }

    fun removeAfter(node: Node<T>): T? {
        val result = node.next?.value

        if (node.next == tail) {
            tail = node
        }

        if (node.next != null) {
            size--
        }

        node.next = node.next?.next
        return result
    }


}

fun main(args: Array<String>) {
    val list = LinkedList<Int>()
}

