package HomeworkWeek3;

public class Wall {

    private double width;
    private double height;

    public static void main(String[] args) {
        Wall test = new Wall(5,4);
        System.out.println("area= " + test.getArea());
        test.setHeight(-1.5);
        System.out.println("width= " + test.getWidth());
        System.out.println("height= " + test.getHeight());
        System.out.println("area= " + test.getArea());

    }
    // Constructors
    public Wall() {
    }
    public Wall(double width,double height){
        this.width=width;
        this.height=height;
        if (width<0){
            this.width=0;
        }
        if (height<0){
            this.height=0;
        }
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setWidth(double width) {
        if (width<0){
            this.width=0;
        } else {
            this.width = width;
        }
    }
    public void setHeight(double height) {
        if (height<0){
            this.height=0;
        } else {
            this.height = height;
        }
    }

    // Extra Methods
    public double getArea(){
        return (this.height*this.width);
    }

}
