package by.bntu.fitr.poisit.sleepwalkers.controller;

import by.bntu.fitr.poisit.sleepwalkers.model.entity.Footwear;
import by.bntu.fitr.poisit.sleepwalkers.model.entity.Good;
import by.bntu.fitr.poisit.sleepwalkers.model.entity.Suit;
import by.bntu.fitr.poisit.sleepwalkers.model.entity.WorkingWear;
import by.bntu.fitr.poisit.sleepwalkers.model.logic.ShoppingCartHelper;
import by.bntu.fitr.poisit.sleepwalkers.view.Printer;

public class ShopTest {
    public static void main(String[] args) {
        WorkingWear a = new WorkingWear(new WorkingWear(22));
        System.out.println(a.getPrice());
    }
}
