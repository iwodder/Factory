package com.wodder.jeep;

import com.wodder.jeep.parts.MidrangeJeepParts;
import com.wodder.jeep.parts.PremiumJeepParts;
import com.wodder.jeep.parts.StockJeepParts;

public class RealJeepStore extends JeepStore {

    @Override
    protected Jeep orderJeep(JeepTypes type) {
        switch (type) {
            case STOCK:
                return new Jeep(new StockJeepParts(), JeepTypes.STOCK);
            case MID_RANGE:
                return new Jeep(new MidrangeJeepParts(), JeepTypes.MID_RANGE);
            case PREMIUM:
                return new Jeep(new PremiumJeepParts(), JeepTypes.PREMIUM);
            default:
                throw new IllegalArgumentException("Cannot make that kind of Jeep!");
        }
    }
}
