package Abstract;

public class MathBook implements IReadable{
    @Override
    public String read() {
        return "math is nice";
    }
}
