package com.facer.assignment

import com.facer.assignment.com.facer.assignment.WatchFace

open class WatchFaceItem(val item: Item) : WatchFace {
    override fun updateQuality() {
        if (item.quality > 0) {
            item.quality -= 1
        }

        updateSellIn()

        if (item.sellIn < 0 && item.quality > 0) {
            item.quality -= 1
        }
    }

    override fun updateSellIn() {
        item.sellIn -= 1
    }
}