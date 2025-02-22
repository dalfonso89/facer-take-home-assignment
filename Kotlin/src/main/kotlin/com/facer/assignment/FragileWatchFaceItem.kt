package com.facer.assignment

class FragileWatchFaceItem(item: Item) : WatchFaceItem(item) {
    override fun updateQuality() {
        if (item.quality == 1) {
            item.quality = 0
        }

        if (item.quality > 0) {
            item.quality -= 2
        }

        super.updateSellIn()

        if (item.sellIn < 0 && item.quality > 0) {
            if (item.quality == 1) {
                item.quality = 0
            }

            if (item.quality > 0) {
                item.quality -= 2
            }
        }
    }
}