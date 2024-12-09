function cocktailPrototype(name, ingredients) {
    function text() {
        console.log(`Cocktail: ${this.name}\nIngredients: ${this.ingredients.join(', ')})`)
    }
    return {
        name,
        ingredients,
        text,
    };
}

const frenchMartiniPrototype = cocktailPrototype('French Martini', ['Vodka', 'Chambord', 'Pineapple Juice', 'Licor 75']);
const darkAndStormyPrototype = cocktailPrototype('Dark and Stormy', ['Dark Rum', 'Ginger Beer', 'Lime juice']);
const whiskySourPrototype = cocktailPrototype('Whisky Sour', ['Bourbon', 'Lemon Juice', 'Sugar Syrup']);

const frenchMartini = Object.create(frenchMartiniPrototype);
frenchMartini.name = 'French Martini';
frenchMartini.ingredients.pop();

const darkAndStormy = Object.create(darkAndStormyPrototype);
darkAndStormy.name = 'Dark and Stormy';

const whiskySour = Object.create(whiskySourPrototype);
whiskySour.name = 'Whisky Sour';
whiskySour.ingredients.push('Egg White');

frenchMartini.text();
darkAndStormy.text();
whiskySour.text();
