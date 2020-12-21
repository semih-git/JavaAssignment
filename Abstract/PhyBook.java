package Abstract;

public class PhyBook implements IReadable{
    @Override
    public String read() {
        return "psychology is nice";
    }
}
