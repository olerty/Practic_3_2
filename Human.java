public class Human {
    public static void main(String[] args){
        Human human = new Human();
        human.tell();
    }

    public void tell(){
        Leg leg = new Leg();
        Head head = new Head();
        Hand hand = new Hand();
        hand.setHeft(10);
        head.setDiametr(10);
        leg.setLength(20);

        System.out.println("Моя рука весит: " + hand.getHeft() + "\nМоя нога в длину: " + leg.getLength() + "\nДиаметр моей головы: " + head.getDiametr());
    }

    private class Leg{
        private float length = 0;
        public float getLength() {return length;}
        public void setLength(float length){this.length = length;}
    }

    private class Head{
        private int diametr = 0;

        public int getDiametr() {return diametr;}
        public void setDiametr(int diametr) {this.diametr = diametr;}
    }

    private class Hand{
        private int heft = 0;

        public int getHeft() {return heft;}
        public void setHeft(int heft) {this.heft = heft;}
    }
}
