package digits;

import com.github.moneytostr.MoneyToStr;

public class TextNumberFormatter {

    public static void main(String[] args) {
        MoneyToStr moneyToStr = new MoneyToStr(MoneyToStr.Currency.RUR, MoneyToStr.Language.RUS, MoneyToStr.Pennies.NUMBER);
        System.out.println(moneyToStr.convert(8741951.0));
    }
}
