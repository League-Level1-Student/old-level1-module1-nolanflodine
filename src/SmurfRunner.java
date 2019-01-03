
public class SmurfRunner {
public static void main(String[] args) {
Smurf h=new Smurf("Handy Smurf");
String Handy=h.getName();
System.out.println(Handy);
h.eat();
Smurf  p=new Smurf("Papa Smurf");
String PapaSmurf=p.getName();
System.out.println(PapaSmurf);
PapaSmurf=p.getHatColor();
System.out.println(PapaSmurf);
PapaSmurf=p.isGirlOrBoy();
System.out.println(PapaSmurf);
Smurf s=new Smurf("Smurfette");
String Smurfette=s.getName();
System.out.println(Smurfette);
Smurfette=s.getHatColor();
System.out.println(Smurfette);
Smurfette=s.isGirlOrBoy();
System.out.println(Smurfette);
}
}
