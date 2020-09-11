package com.wodder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.wodder.jeep.Jeep;
import com.wodder.jeep.JeepTypes;
import com.wodder.jeep.parts.MidrangeJeepParts;
import com.wodder.jeep.parts.PremiumJeepParts;
import com.wodder.jeep.parts.StockJeepParts;
import org.junit.Test;

public class AppTest {

    @Test
    public void has_premium_type() {
        assertTrue(JeepTypes.isValidType("premium"));
        assertTrue(JeepTypes.isValidType("premiUm"));
    }

    @Test
    public void has_mid_range_type() {
        assertTrue(JeepTypes.isValidType("mid-range"));
        assertTrue(JeepTypes.isValidType("Mid-range"));
    }

    @Test
    public void has_stock_type() {
        assertTrue(JeepTypes.isValidType("STOCK"));
        assertTrue(JeepTypes.isValidType("stock"));
    }

    @Test
    public void proper_premium_description() {
        Jeep j = new Jeep(new PremiumJeepParts(), JeepTypes.PREMIUM);
        assertEquals("Premium Jeep was built specially for you with a premium suspension, premium rear bumper, premium front bumper, premium cb-radio, and a set of premium 35\" tires!", j.description());
    }

    @Test
    public void proper_mid_range_description() {
        Jeep j = new Jeep(new MidrangeJeepParts(), JeepTypes.MID_RANGE);
        assertEquals("Mid-range Jeep was built specially for you with a premium suspension, midrange rear bumper, midrange front bumper, stock cb-radio, and a set of stock 33\" tires!", j.description());
    }

    @Test
    public void proper_stock_description() {
        Jeep j = new Jeep(new StockJeepParts(), JeepTypes.STOCK);
        assertEquals("Stock Jeep was built specially for you with a stock suspension, stock rear bumper, stock front bumper, stock cb-radio, and a set of stock 33\" tires!", j.description());
    }
}
