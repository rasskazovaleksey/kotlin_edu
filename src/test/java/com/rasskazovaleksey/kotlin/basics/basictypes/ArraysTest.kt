package com.rasskazovaleksey.kotlin.basics.basictypes

import org.junit.Assert
import org.junit.Test

class ArraysTest {

    private val arrays = Arrays()

    @Test
    fun `array1 is not the same as array2`() {
        Assert.fail()
    }

    @Test
    fun `each value of array1 is the same as each value of array2 at same position`() {
        arrays.array1.forEachIndexed { index, value ->
            Assert.assertTrue(value == arrays.array2[index])
        }
    }
}