package com.gildedrose.item;

import com.gildedrose.Item;

public class AgedBrieItem extends Item {
    public AgedBrieItem(int sell_in, int quality) {
        super("Aged Brie", sell_in, quality);
    }

    @Override
    protected void updateQualityExpired() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    protected void updateQualityAndSellIn() {
        if (quality < 50) {
            quality = quality + 1;
        }
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            updateQualityExpired();
        }
    }
}
