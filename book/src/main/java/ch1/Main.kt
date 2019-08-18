package main.java.ch1

import kotlin.test.assertNotEquals

fun main(args: Array<String>) {
    // list 선언 및 변수 초기화(new 안써도됨)
    val persons = listOf(Person(1, "gompang"), Person(2, "fungi"))

    // list 원소 instance 비교(실제 다른 객체인지)
    // array에서 원소 선택 시 get(1) -> array[1] 로 바로 접근 가능(좋네)
    assertNotEquals(persons[0].hashCode(), persons[1].hashCode())

    // list에서 max를 lambda 조건식으로 조건준 뒤에 추출
    val max = persons.maxBy { p -> p.id }

    // Array toString 테스트
    println(persons)

    // 문자열 표현식
    println("max인 사람은 $max")

    val number = 100
    // 안됨(val은 재할당 불가)
//    number = 200

    var number2 = 100
    number2 = 200

    // var 로 선언된 field에 대해서는 재할당이 가능
    persons[0].name = "gompappppppppp"

    println(persons)
}