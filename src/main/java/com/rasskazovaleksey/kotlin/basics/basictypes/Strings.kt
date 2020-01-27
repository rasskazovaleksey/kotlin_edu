package com.rasskazovaleksey.kotlin.basics.basictypes

// Step 3.
class Strings {

    val hello = "Hello"
    val world = "World"
    val helloWorld = "$hello, $world!"
    val poem = """
        One, Two, Freddy's Coming For You
        Three, Four Better Lock Your Door
        Five, Six Grab A Crucifix
        Nine, Ten Never Sleep Again
    """.trimIndent()

    fun sayHello(name: String) = "$hello, $name"
}