package RaghuSir.javaPrograms.Collections.Maps;

public class Product {
    int pid;
    String pname;
    int qty;

    Product(int pid, String pname, int qty) {
        this.pid = pid;
        this.pname = pname;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", qty=" + qty +
                '}';
    }

  @Override
    public int hashCode() {
        return pid;    // TO get the unique id elements in the map
  }

  @Override
    public boolean equals(Object obj) {
        Product p = (Product)obj;
        return this.pid == p.pid;
  }
}
