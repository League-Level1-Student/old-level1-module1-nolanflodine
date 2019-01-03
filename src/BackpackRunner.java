
public class BackpackRunner {
public static void main(String[] args) {
Backpack b=new Backpack();
Pencil p=new Pencil();
b.putInBackpack(p);
p.write();
Ruler r=new Ruler();
b.putInBackpack(r);
r.measure();
Textbook t=new Textbook();
b.putInBackpack(t);
t.read();
b.log();
b.goToSchool();
}
}
