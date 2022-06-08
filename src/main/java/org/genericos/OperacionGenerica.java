package org.genericos;

public class OperacionGenerica <T extends Number>{
    T x;
    T y;
    public OperacionGenerica(T x, T y){
        this.x = x;
        this.y = y;
    }

    public Number sumar(){
        return x.doubleValue() + y.doubleValue();
    }
    public Number restar(){
        return x.doubleValue() - y.doubleValue();
    }
    public Number multiplicar(){
        return x.doubleValue() * y.doubleValue();
    }
    public Number dividir(){
        return x.doubleValue() / y.doubleValue();
    }

}

