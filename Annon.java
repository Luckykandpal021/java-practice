import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@interface CricketPlayer {
}

@CricketPlayer

class Virat {
    private int innings;
    private int runs;

    private int getInnings() {
        return innings;
    }

    private void setInning(int innings) {
        this.innings = innings;
    }

    private int getRun() {
        return runs;
    }

    private void setRun(int runs) {
        this.runs = runs;
    }
}

class Cricket extends Virat {
}

public class Annon {

}
