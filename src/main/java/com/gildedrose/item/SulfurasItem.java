package com.gildedrose.item;

import com.gildedrose.Item;

public class SulfurasItem extends Item {
    public SulfurasItem(int sell_in, int quality) {
        super("Sulfuras, Hand of Ragnaros", sell_in, quality);
    }

    @Override
    protected void updateQualityAndSellIn() {
    }

    @Override
    protected void updateQualityExpired() {
    }
}
