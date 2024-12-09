interface caterpillar {
    fun eat(): String
}

class BasicCaterpillar : caterpillar {
    override fun eat(): String {
        return "The Very Hungry Caterpillar is eating"
    }
}

class PearDecorator(private val caterpillar: caterpillar) : caterpillar {
    override fun eat(): String {
        return "${caterpillar.eat()} one pear"
    }
}

class AppleDecorator(private val caterpillar: caterpillar) : caterpillar {
    override fun eat(): String {
        return "${caterpillar.eat()} two apples"
    }
}

class BananaDecorator(private val caterpillar: caterpillar) : caterpillar {
    override fun eat(): String {
        return "${caterpillar.eat()} three bananas"
    }
}

fun main () {
    val basicCaterpillar = BasicCaterpillar()
    val pearCaterpillar = PearDecorator(basicCaterpillar)
    val appleCaterpillar = AppleDecorator(basicCaterpillar)
    val bananaCaterpillar = BananaDecorator(basicCaterpillar)
    val bananaAndAppleCaterpillar = BananaDecorator(PearDecorator(basicCaterpillar))

    println(basicCaterpillar.eat())
    println(pearCaterpillar.eat())
    println(appleCaterpillar.eat())
    println(bananaCaterpillar.eat())
    println(bananaAndAppleCaterpillar.eat())
}