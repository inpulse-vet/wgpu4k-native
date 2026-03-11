package io.ygdrasil.wgpu

import androidx.test.filters.SmallTest
import com.sun.jna.Pointer
import org.junit.Test
import ffi.foreign.MemorySegment

@SmallTest
class TestMemorySegment {

    @Test
    fun testMemorySegment() {
        val memorySegment = MemorySegment(Pointer(0), 1)
        try {
            println(memorySegment)
        } catch (e: Throwable) {
            e.printStackTrace()
            assert(e !is InstantiationError) {
                "Failed!"
            }
        }
    }

}