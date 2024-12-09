class VeryHungryCaterpillar {
    eat() {
        return "The Very Hungry Caterpillar is eating";
    }
}

class BasicCaterpillar extends VeryHungryCaterpillar {}

class PearDecorator extends BasicCaterpillar {
    constructor(caterpillar) {
        super();
        this.caterpillar = caterpillar;
    }

    eat() {
        return `${this.caterpillar.eat()}  one pear.`;
    }
}

class AppleDecorator extends BasicCaterpillar {
    constructor(caterpillar) {
        super();
        this.caterpillar = caterpillar;
    }

    eat() {
        return `${this.caterpillar.eat()} two apples.`;
    }
}

class BananaDecorator extends BasicCaterpillar {
    constructor(caterpillar) {
        super();
        this.caterpillar = caterpillar;
    }

    eat() {
        return `${this.caterpillar.eat()} three bananas.`;
    }
}

const basicCaterpillar = new BasicCaterpillar();
const pearCaterpillar = new PearDecorator(basicCaterpillar);
const appleCaterpillar = new AppleDecorator(basicCaterpillar);
const bananaCaterpillar = new BananaDecorator(basicCaterpillar);
const bananaAndAppleCaterpillar = new BananaDecorator(new AppleDecorator(basicCaterpillar));

console.log(basicCaterpillar.eat());
console.log(pearCaterpillar.eat());
console.log(appleCaterpillar.eat());
console.log(bananaCaterpillar.eat());
console.log(bananaAndAppleCaterpillar.eat());
