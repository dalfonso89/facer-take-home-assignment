package com.facer.assignment

class VintageWatchFaceItem(item: Item) : WatchFaceItem(item) {
    override fun updateQuality() {
        if (item.quality < 50) {
            item.quality += 1
        }

        super.updateSellIn()

        if (item.sellIn < 0 && item.quality < 50) {
            item.quality += 1
        }
    }
}
