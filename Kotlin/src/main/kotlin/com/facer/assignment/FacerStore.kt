package com.facer.assignment

class FacerStore(var items: List<Item>) {

    fun updateQuality() {
        for (i in items.indices) {
            val currentItem = when (items[i].name) {
                "Passes to Watchface Conference" -> ConferenceWatchFaceItem(items[i])
                "Fragile Watch" -> FragileWatchFaceItem(items[i])
                "Legendary Watch Face" -> LegendaryWatchFaceItem(items[i])
                "Vintage Rolex" -> VintageWatchFaceItem(items[i])
                else -> WatchFaceItem(items[i])
            }
            currentItem.updateQuality()
        }
    }

}

