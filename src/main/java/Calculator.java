public class Calculator {

    private int value_1;
    private int value_2;
    private double double_1;
    private double double_2;


    public Calculator(int value_1, int value_2, double double_1, double double_2){
        this.value_1 = value_1;
        this.value_2 = value_2;
        this.double_1 = double_1;
        this.double_2 = double_2;
    }

    public int addFunction(){
        return (this.value_1 + this.value_2);
    }

    public int subtractFunction(){
        return (this.value_1 - this.value_2);
    }

    public int multiplyFunction(){
        return (this.value_1 * this.value_2);
    }

    public double divideFunction(){
        return (this.double_1 / this.double_2);
    }
}
