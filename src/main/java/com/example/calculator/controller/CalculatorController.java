package com.example.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/calculate")
    @ResponseBody
    public CalculatorResponse calculate(@RequestBody CalculatorRequest request) {
        double result = 0;
        
        switch (request.getOperation()) {
            case "sumar":
                result = request.getNum1() + request.getNum2();
                break;
            case "restar":
                result = request.getNum1() - request.getNum2();
                break;
            case "multiplicar":
                result = request.getNum1() * request.getNum2();
                break;
            case "dividir":
                if (request.getNum2() == 0) {
                    return new CalculatorResponse(0, "Error: No se puede dividir por cero");
                }
                result = request.getNum1() / request.getNum2();
                break;
            default:
                return new CalculatorResponse(0, "Operación no válida");
        }
        
        return new CalculatorResponse(result, null);
    }
}

class CalculatorRequest {
    private double num1;
    private double num2;
    private String operation;

    public double getNum1() { return num1; }
    public void setNum1(double num1) { this.num1 = num1; }
    
    public double getNum2() { return num2; }
    public void setNum2(double num2) { this.num2 = num2; }
    
    public String getOperation() { return operation; }
    public void setOperation(String operation) { this.operation = operation; }
}

class CalculatorResponse {
    private double result;
    private String error;

    public CalculatorResponse(double result, String error) {
        this.result = result;
        this.error = error;
    }

    public double getResult() { return result; }
    public void setResult(double result) { this.result = result; }
    
    public String getError() { return error; }
    public void setError(String error) { this.error = error; }
}