package beyblade;

public class BeybladeFactory {
    public static Beyblade produceBeyblade (String beybladeType){
        switch (beybladeType){
            case "Dragon":
                return new Dragon("Takao",800,300,"Blue Dragon","Talking Monster");
            case "Dranzer":
                return new Dranzer("Kai",600,400,"Red Bird");
            case "Drayga":
                return new Drayga("Rel",800,250,"White Tiger");
            case "Draciel":
                return new Draciel("Max",400,100,"Black Turtle");

        }return null;
    }
}
