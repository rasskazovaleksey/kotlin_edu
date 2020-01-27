package com.rasskazovaleksey.kotlin.basics.basictypes

import org.junit.Assert
import org.junit.Test

class NumbersTest {

    private val numbers = Numbers()

    @Test
    fun `byte is 56`() {
        Assert.assertTrue(numbers.byte == 56.toByte())
    }

    @Test
    fun `short is 10000`() {
        Assert.fail()
    }

    @Test
    fun `int is 1_000_000`() {
        Assert.fail()
    }

    @Test
    fun `long is greater then 100 and less then 1001`(){
        Assert.fail()
    }

    @Test
    fun `float is not equal double`() {
        Assert.fail()
    }

    @Test
    fun `double is between 3 point 11 and 4 point 0`() {
        Assert.fail()
    }

    @Test
    fun `kotlin can convert any number to other number with to*** function`() {
        /**
         * Don't forget if smaller number converts to bigger, it stays the same
         * if bigger number converts to small it cuts
         */
        val n = 1_000_000.1111111111111111
        Assert.assertTrue(n.toInt() == 0)
        Assert.fail("toDouble")
        Assert.fail("toFloat")
        Assert.fail("toLong")
        Assert.fail("toInt")
        Assert.assertTrue(n.toShort() == 16960.toShort())
        Assert.fail("toByte")
        Assert.fail("toString")
        Assert.fail("toChar")
    }

    @Test
    fun `long not equals int`() {
        Assert.fail()
    }
}