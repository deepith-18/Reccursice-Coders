package RaghuSir.javaPrograms.Queue;

public class Pen implements Comparable<Pen> {
    String color;
    Double price;

    public Pen(String color, Double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public  int compareTo(Pen other){
        return this.color.compareTo(other.color); // Double.compare(this.color,other.color); if want Descending put - negative (-this.color,-other.color)
    }
}

