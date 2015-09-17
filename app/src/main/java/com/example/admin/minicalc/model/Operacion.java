package com.example.admin.minicalc.model;

/**
 * Created by Admin on 20/06/2015.
 */
public class Operacion {
    private Integer sExpression;

    public Operacion(){
        sExpression = 0;
    }

    public int EjecutarSuma(int n1,int n2){
        sExpression = n1+n2;

        return sExpression;
    }

    public int EjecutarResta(int n1,int n2){
        sExpression = n1-n2;

        return sExpression;
    }

}
