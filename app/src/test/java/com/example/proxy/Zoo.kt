package com.example.proxy

/**
 * @date:2019/3/19
 * @author:junl
 * @Foreword：但行好事，莫问前程，只需努力每一天。
 * @Desc:
 */

interface Animal {
    fun bark()
}
class Dog:Animal {
    override fun bark() {
        println("wang")
    }
}

/**
 * by 关键字
 */
class Zoo(animal: Animal) : Animal by animal
fun main(args: Array<String>) {
    Zoo(Dog()).bark()
}