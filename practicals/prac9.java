/*
Write a program to create a “distance” class with methods where
distance is computed in terms of feet and inches,
 how to create objects of a class and to see the use of this pointer

*/
class Prac9
{
  public static void main(String args[])
  {
    Distance d1 = new Distance();
    Distance d2 = new Distance(3,2);
    d1.changetofeet();
    d2.changetofeet();
    System.out.println("d1.distance = "+ d1.distance);
    System.out.println("d2.distance = "+ d2.distance);
    System.out.println("d1.feet = "+ d1.feet);
    System.out.println("d2.feet = "+ d2.feet);
  }
}

class Distance
{
  double feet;

  double distance;

Distance()
{
  this.feet=this.distance=0.0;
}

Distance(double ft,double inc)
{
  this.feet= ft;
  this.distance=inc;
}
//copy constructor
Distance(Distance obj)
{
  this.distance = obj.distance;
  this.feet = obj.feet;
}

  public void changetofeet()
  {
    this.feet = this.distance*3280.839895;
    System.out.println("Distance of invoked object : "+this.feet+"feet  "+this.distance+"km");
    // feet = kilometers × 3280.839895
  }
}
