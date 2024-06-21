public class BonusMilesService {
    public int calculate(int price) { // входной параметр: price типа "int" цена билета.
        int miles; // Переменная для количества милей.
        int percentInKopecks = 20;//стоимость одной бонусной мили.
        miles = price / percentInKopecks;//расчет кол-ва милей за покупку билета.
        return miles;// возвращает рассчитанное кол-во милей
    }
}