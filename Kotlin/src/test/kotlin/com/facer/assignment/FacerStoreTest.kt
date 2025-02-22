package com.facer.assignment

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FacerStoreTest {
    @Test
    fun testWatchFaceDegradeSingleDay() {
        val items = listOf(
            Item("Seiko Watch", 10, 20),
            Item("Casio Watch", 5, 7)
        )
        val app = FacerStore(items)
        app.updateQuality()

        assertEquals(9, app.items[0].sellIn)
        assertEquals(19, app.items[0].quality)

        assertEquals(4, app.items[1].sellIn)
        assertEquals(6, app.items[1].quality)
    }

    @Test
    fun testWatchFaceDegradeMultipleDays() {
        val days = 10
        val items = listOf(
            Item("Seiko Watch", 10, 20),
            Item("Casio Watch", 5, 7)
        )
        val app = FacerStore(items)
          for (i in 0..days - 1) {
            app.updateQuality()
        }

        assertEquals(0, app.items[0].sellIn)
        assertEquals(10, app.items[0].quality)

        assertEquals(-5, app.items[1].sellIn)
        assertEquals(0, app.items[1].quality)
    }

    @Test
    fun testVintageWatchFaceDegradeSingleDay() {
        val items = listOf(Item("Vintage Rolex", 2, 0))
        val app = FacerStore(items)
        app.updateQuality()

        assertEquals(1, app.items[0].sellIn)
        assertEquals(1, app.items[0].quality)
    }

    @Test
    fun testVintageWatchFaceDegradeMultipleDays() {
        val days = 10
        val items = listOf(Item("Vintage Rolex", 2, 0))
        val app = FacerStore(items)
          for (i in 0..days - 1) {
            app.updateQuality()
        }

        assertEquals(-8, app.items[0].sellIn)
        assertEquals(18, app.items[0].quality)
    }

    @Test
    fun testLegendaryWatchFaceDegradeSingleDay() {
        val items = listOf(
            Item("Legendary Watch Face", 0, 80),
            Item("Legendary Watch Face", -1, 80)
        )
        val app = FacerStore(items)
        app.updateQuality()

        assertEquals(0, app.items[0].sellIn)
        assertEquals(80, app.items[0].quality)

        assertEquals(-1, app.items[1].sellIn)
        assertEquals(80, app.items[1].quality)
    }

    @Test
    fun testLegendaryWatchFaceDegradeMultipleDays() {
        val days = 10
        val items = listOf(
            Item("Legendary Watch Face", 0, 80),
            Item("Legendary Watch Face", -1, 80)
        )
        val app = FacerStore(items)
          for (i in 0..days - 1) {
            app.updateQuality()
        }

        assertEquals(0, app.items[0].sellIn)
        assertEquals(80, app.items[0].quality)

        assertEquals(-1, app.items[1].sellIn)
        assertEquals(80, app.items[1].quality)
    }

    @Test
    fun testConferenceWatchFaceDegradeSingleDay() {
        val items = listOf(
            Item("Passes to Watchface Conference", 15, 20),
            Item("Passes to Watchface Conference", 10, 49),
            Item("Passes to Watchface Conference", 5, 49)
        )
        val app = FacerStore(items)
        app.updateQuality()

        assertEquals(14, app.items[0].sellIn)
        assertEquals(21, app.items[0].quality)

        assertEquals(9, app.items[1].sellIn)
        assertEquals(50, app.items[1].quality)

        assertEquals(4, app.items[2].sellIn)
        assertEquals(50, app.items[2].quality)
    }

    @Test
    fun testConferenceWatchFaceDegradeMultipleDays() {
        val days = 10
        val items = listOf(
            Item("Passes to Watchface Conference", 15, 20),
            Item("Passes to Watchface Conference", 10, 49),
            Item("Passes to Watchface Conference", 5, 49)
        )
        val app = FacerStore(items)
          for (i in 0..days - 1) {
            app.updateQuality()
        }

        assertEquals(5, app.items[0].sellIn)
        assertEquals(35, app.items[0].quality)

        assertEquals(0, app.items[1].sellIn)
        assertEquals(50, app.items[1].quality)

        assertEquals(-5, app.items[2].sellIn)
        assertEquals(0, app.items[2].quality)
    }

    @Test
    fun testFragileWatchFaceDegradeSingleDay() {
        val items = listOf(Item("Fragile Watch", 3, 6))
        val app = FacerStore(items)
        app.updateQuality()

        assertEquals(2, app.items[0].sellIn)
        assertEquals(4, app.items[0].quality)
    }

    @Test
    fun testFragileWatchFaceDegradeMultipleDays() {
        val days = 10
        val items = listOf(Item("Fragile Watch", 3, 6))
        val app = FacerStore(items)
        for (i in 0..<days) {
            app.updateQuality()
        }

        assertEquals(-7, app.items[0].sellIn)
        assertEquals(0, app.items[0].quality)
    }
}
