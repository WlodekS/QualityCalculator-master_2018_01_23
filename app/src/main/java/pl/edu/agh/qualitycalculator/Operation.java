package pl.edu.agh.qualitycalculator;

public enum Operation {
    SUM {
        @Override
        public String toString() {
            return "plus";
        }
    },
    SUBTRACT {
        @Override
        public String toString() {
            return "minus";
        }
    },
    MULTIPLY {
        @Override
        public String toString() {
            return "multiplied by";
        }
    },
    DIVIDE {
        @Override
        public String toString() {
            return "divided by";
        }
    },
    AA {
        @Override
        public String toString() {
            return "AA by";
        }
    }
}
