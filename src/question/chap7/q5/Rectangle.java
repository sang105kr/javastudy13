package question.chap7.q5;

public class Rectangle {
  private double length;
  private double width;

  /**
   * 사각형 넓이 구하기
   * @return 넚이
   */
  double calculateArea() {
    return length * width;
  }

  /**
   * 사각형 둘레 구하기
   * @return 둘레
   */
  double calculatePerimeter() {
    return 2 * (length + width);
  }


  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }
}
