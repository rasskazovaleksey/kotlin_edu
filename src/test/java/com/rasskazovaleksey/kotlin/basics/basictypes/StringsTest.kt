package com.rasskazovaleksey.kotlin.basics.basictypes

import org.junit.Assert
import org.junit.Test

class StringsTest {

    private val s = Strings()

    @Test
    fun `run hello in a loop gives each letter`() {
        s.hello.forEachIndexed { index, char ->
            Assert.fail()
        }
    }

    @Test
    fun `helloWorld string is "Hello, World!"`() {
        Assert.fail()
    }

    @Test
    fun `sayHello("Alex") returns "Hello, Alex!"`() {
        Assert.fail()
    }

    @Test
    fun `poem contains() Freddy`(){
        Assert.fail()
    }
}