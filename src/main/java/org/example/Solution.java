package org.example;

public class Solution {
    public boolean lemonadeChange(int[] bills) {
        //create counters for $5 and $10 bill
        int five = 0;
        int ten = 0;
        //iterate through the given array
        for (int bill : bills) {
            //add to the counter if the customer pays with a $5 bill
            if (bill == 5) {
                five++;
                //deal with the case when the customer pays with a $10 bill
            } else if (bill == 10) {
                //case when there is no $5 bill left
                if (five < 1) {
                    return false;
                    //case when there are $5 bills left
                } else {
                    five--;
                    ten++;
                }
                //deal with the case when the customer pays with a $20 bill
            } else {
                //case when the customer won't get the correct change
                if (five < 1 || (ten == 0 && five < 3)) {
                    return false;
                    //case when the customer will get the correct change
                } else {
                    //case when there is no $10 bill left
                    if (ten == 0) {
                        five = five - 3;
                        //case when there are $10 bills left
                    } else {
                        ten--;
                        five--;
                    }
                }
            }
        }
        return true;
    }
}
