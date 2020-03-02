package com.gildedrose.item;

import com.gildedrose.Item;

public class BackstageItem extends Item {
    public BackstageItem(int sell_in, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sell_in, quality);
    }

    @Override
    protected void updateQualityExpired() {
        quality = 0;
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
