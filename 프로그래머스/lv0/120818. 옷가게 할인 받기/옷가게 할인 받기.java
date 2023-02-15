class Solution {
    public int solution(int price) {
        double discount = 1.0;
        if(price < 100000) discount = 1;
        else if(100000 <= price && price < 300000) discount = 0.95;
        else if(300000 <= price && price < 500000) discount = 0.9;
        else discount = 0.8;
        return (int)(price * discount);
//         if(price >= 500000) price = (int)(price * 0.8);
//         else if(price >= 300000) price = (int)(price * 0.9);
//         else if(price >= 100000) price = (int)(price * 0.95);
//         return price;
    }
}