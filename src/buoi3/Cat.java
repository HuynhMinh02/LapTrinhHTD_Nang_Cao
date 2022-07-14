package buoi3;

public class Cat extends Manmal {
    // composition
    CatNoise behaviour = new CatNoise(); 
    // Cat van dang khoi tao hanh vi tao tineg on cua Cat

    // Meo khong nen ket hop voi mo-dun cap thap CatNOise

    // lop Cat khong ne khoi tao hanh vi tao ra tieng on cua no nhung thay vao do nhan duoc hanh vi  thong qu TIEM

    public String makeNoise(){
        return behaviour.makeNoise();
    }
}
