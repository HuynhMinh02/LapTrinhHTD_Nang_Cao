package buoi2;
public class Mammal {
    private MakingNoise speaker;

    public void setSpeaker(MakingNoise speaker) {
        this.speaker = speaker;
    }

    public Mammal (MakingNoise sp) {
        this.speaker = sp;
    }
    

    public Mammal() {
    }

    public String makeNoise(){
        return this.speaker.makeNoise();
    }
}
