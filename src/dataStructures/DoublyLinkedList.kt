package dataStructures

class DoublyNode<T>(value: T) {
    var value: T = value
    var next: DoublyNode<T>? = null
    var previous: DoublyNode<T>? = null
}

class DoublyLinkedList<T> {
    private var head: DoublyNode<T>? = null
    var isEmpty: Boolean = head == null
    fun first(): DoublyNode<T>? = head
    fun last(): DoublyNode<T>? {
        var node = head
        if (node != null) {
            while (node?.next != null) {
                node = node?.next
            }
            return node
        } else {
            return null
        }
    }

    fun count(): Int {
        var node = head
        if (node != null) {
            var counter = 1
            while (node?.next != null) {
                node = node?.next
                counter += 1
            }
            return counter
        } else {
            return 0
        }
    }

    fun nodeAtIndex(index: Int): DoublyNode<T>? {
        if (index >= 0) {
            var node = head
            var i = index
            while (node != null) {
                if (i == 0) return node
                i -= 1
                node = node.next
            }
        }
        return null
    }

    fun append(value: T) {
        var newNode = DoublyNode(value)
        var lastNode = this.last()
        if (lastNode != null) {
            newNode.previous = lastNode
            lastNode.next = newNode
        } else {
            head = newNode
        }
    }

    fun removeAll() {
        head = null
    }

    fun removeNode(node: DoublyNode<T>): T {
        val prev = node.previous
        val next = node.next
        if (prev != null) {
            prev.next = next
        } else {
            head = next
        }
        next?.previous = prev
        node.previous = null
        node.next = null
        return node.value
    }

    fun removeLast(): T? {
        val last = this.last()
        if (last != null) {
            return removeNode(last)
        } else {
            return null
        }
    }

    fun removeAtIndex(index: Int): T? {
        val node = nodeAtIndex(index)
        if (node != null) {
            return removeNode(node)
        } else {
            return null
        }
    }

    override fun toString(): String {
        var s = "["
        var node = head
        while (node != null) {
            s += "${node.value}"
            node = node.next
            if (node != null) {
                s += ", "
            }
        }
        return s + "]"
    }
}

fun main(args: Array<String>) {
    var ll = DoublyLinkedList<String>()
    ll.append("John")
    println(ll)
    ll.append("Carl")
    println(ll)
    ll.append("Zack")
    println(ll)
    ll.append("Tim")
    println(ll)
    ll.append("Steve")
    println(ll)
    ll.append("Peter")
    println(ll)
    println("first item: ${ll.first()?.value}")
    println("last item: ${ll.last()?.value}")
    println("second item: ${ll.first()?.next?.value}")
    println("penultimate item: ${ll.last()?.previous?.value}")
    println("4th item: ${ll.nodeAtIndex(3)?.value}")
    println(" the list has ${ll.count()} items")
}