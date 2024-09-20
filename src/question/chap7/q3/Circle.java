package question.chap7.q3;

public class Circle {
  double radius;

  double getRadius(){
    return radius;
  }

  double computeArea(){
    return radius * radius * Math.PI;
  }

  double computePerimeter(){
    return 2 * Math.PI * radius;
  }

  void setRadius(double radius) {
    this.radius = radius;
  }
}
