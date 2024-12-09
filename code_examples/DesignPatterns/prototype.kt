class CocktailPrototype(var name: String, var ingredients: MutableList<String>) {
    fun text() {
        println("Cocktail: $name \nIngredients: ${ingredients.joinToString(", ")}")
    }
}

fun main() {
    val frenchMartiniPrototype = CocktailPrototype("French Martini", mutableListOf("Vodka", "Chambord", "Pineapple Juice", "Licor 75"))
    val darkAndStormyPrototype = CocktailPrototype("Dark and Stormy", mutableListOf("Dark Rum", "Lemons", "Ginger Beer", "Bitters"))
    val whiskeySourPrototype = CocktailPrototype("Whiskey Sour", mutableListOf("Bourbon", "Egg White", "Sugar Syrup", "Lemon Juice"))

    val frenchMartini = CocktailPrototype(frenchMartiniPrototype.name, frenchMartiniPrototype.ingredients.toMutableList())
    frenchMartini.ingredients.remove("Licor 75")
    frenchMartini.text()

    val darkAndStormy = CocktailPrototype(darkAndStormyPrototype.name, darkAndStormyPrototype.ingredients.toMutableList())
    darkAndStormy.ingredients.add("Lime Wedge")
    darkAndStormy.ingredients.remove("Lemons")
    darkAndStormy.text()

    val whiskeySour = CocktailPrototype(whiskeySourPrototype.name, whiskeySourPrototype.ingredients.toMutableList())
    whiskeySour.text()
}
