package uralmost

class Ingredient {
    String name
    int weight
    Dish dish
    static belongsTo = Dish
}
