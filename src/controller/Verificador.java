package controller;

public class Verificador implements IObservador {

  @Override
  public void update(int num) {
    if (isEven(num)) {
      System.out.println(num + " é par");
    } else {
      System.out.println(num + " é ímpar");
    }
  }

  public boolean isEven(int num) {
    return num % 2 == 0;
  }

}
