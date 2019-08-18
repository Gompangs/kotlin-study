package main.java.ch1

data class Person(val id: Int, var name: String, val descriptiopn: String? = null) {
    // var : READ/WRITE 가능
    // val : READ-ONLY
}