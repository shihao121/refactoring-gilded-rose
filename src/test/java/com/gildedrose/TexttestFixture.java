package com.gildedrose;

import com.gildedrose.item.AgedBrieItem;
import com.gildedrose.item.BackstageItem;
import com.gildedrose.item.SulfurasItem;

public class TexttestFixture {
    public static void main(String[] args) {
        printItems(args);
    }

    private static void printItems(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new AgedBrieItem(2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new SulfurasItem(0, 80), //
                new SulfurasItem(-1, 80),
                new BackstageItem(15, 20),
                new BackstageItem(10, 49),
                new BackstageItem(5, 49),
                new BackstageItem(1, 20),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 3;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.update_quality();
        }
    }

}
