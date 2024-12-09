class MarioState {
    stateBehaviour() {}
    accessorize() {}
}

class BaseMode extends MarioState {
    stateBehaviour() {
        return "It's-a me, Mario!";
    }

    accessorize() {
        return "Blue Overalls";
    }
}

class DriverMode extends MarioState {
    stateBehaviour() {
        return "Ready to race!";
    }

    accessorize() {
        return "Race Car";
    }
}

class DoctorMode extends MarioState {
    stateBehaviour() {
        return "Dr. Mario at your service!";
    }

    accessorize() {
        return "Stethoscope";
    }
}

class TennisMode extends MarioState {
    stateBehaviour() {
        return "Ready to serve!";
    }

    accessorize() {
        return "Tennis Racket";
    }
}

class FightMode extends MarioState {
    stateBehaviour() {
        return "Combat stance activated!";
    }

    accessorize() {
        return "Fire Flower";
    }
}

class Mario {
    constructor(current) {
        this.current = current;
    }

    text() {
        return `${this.current.stateBehaviour()} \n Now equipped with a ${this.current.accessorize()}`;
    }
}

const baseMario = new Mario(new BaseMode());
const raceMario = new Mario(new DriverMode());
const doctorMario = new Mario(new DoctorMode());
const tennisMario = new Mario(new TennisMode());
const fightMario = new Mario(new FightMode());

console.log(baseMario.text());
console.log(raceMario.text());
console.log(doctorMario.text());
console.log(tennisMario.text());
console.log(fightMario.text());
