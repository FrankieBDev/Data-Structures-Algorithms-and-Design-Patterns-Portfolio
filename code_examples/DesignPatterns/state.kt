// Updated State interface
interface MarioState {
    fun stateBehaviour(): String
    fun accessorize(): String
}

class BaseMode : MarioState {
    override fun stateBehaviour(): String {
        return "It's-a me, Mario!"
    }
    override fun accessorize(): String {
        return "Blue Overalls"
    }
}

class DriverMode : MarioState {
    override fun stateBehaviour(): String {
        return "Ready to race!"
    }
    override fun accessorize(): String {
        return "Race Car"
    }
}

class DoctorMode : MarioState {
    override fun stateBehaviour(): String {
        return "Dr. Mario at your service!"
    }
    override fun accessorize(): String {
        return "Stethoscope"
    }
}

class TennisMode : MarioState {
    override fun stateBehaviour(): String {
        return "Ready to serve!"
    }
    override fun accessorize(): String {
        return "Tennis Racket"
    }
}

class FightMode : MarioState {
    override fun stateBehaviour(): String {
        return "Combat stance activated!"
    }
    override fun accessorize(): String {
        return "Fire Flower"
    }
}

class Mario(var current: MarioState) {
    fun text(): String {
        return "${current.stateBehaviour()} \n Now equipped with a ${current.accessorize()}"
    }
}

fun main() {
    val baseMario = Mario(BaseMode())
    val raceMario = Mario(DriverMode())
    val doctorMario = Mario(DoctorMode())
    val tennisMario = Mario(TennisMode())
    val fightMario = Mario(FightMode())

    println(baseMario.text())
    println(raceMario.text())
    println(doctorMario.text())
    println(tennisMario.text())
    println(fightMario.text())
}
