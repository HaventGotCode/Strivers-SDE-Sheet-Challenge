package com.practice.array;

import com.practice.tags.difficulty.Easy;
import com.practice.tags.resources.Blind75Arrays;
import com.practice.tags.resources.Creek300;
import com.practice.tags.resources.Grind75;
import com.practice.tags.resources.StriverSheetArrays;

public class BestTimeToBuyAndSellStock121 implements Easy, Creek300, Blind75Arrays, Grind75, StriverSheetArrays {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        BestTimeToBuyAndSellStock121 obj = new BestTimeToBuyAndSellStock121();
        System.out.println(obj.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int profitIfSoldToday = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            profitIfSoldToday = Math.max(profitIfSoldToday, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return profitIfSoldToday;
    }
}
