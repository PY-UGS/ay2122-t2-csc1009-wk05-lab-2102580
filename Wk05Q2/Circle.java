public class Circle extends Shape{

    public Circle(float dim1, double dim2){
        super(dim1, dim2);
    }

    public double area(){
        System.out.println("Inside Area for Circle.");
        return(getPI()*getDim1()*getDim2());
    }
    
}
