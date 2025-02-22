package com.facer.assignment

class ConferenceWatchFaceItem(item: Item) : WatchFaceItem(item) {
    override fun updateQuality() {
        if (item.quality < 50) {
            item.quality += 1
        }

        if (item.quality < 50) {
            if (item.sellIn < 11) {
                item.quality += 1
            }

            if (item.sellIn < 6) {
                item.quality += 1
            }
        }

        super.updateSellIn()

        if (item.sellIn < 0) {
            item.quality = 0
        }
    }
}