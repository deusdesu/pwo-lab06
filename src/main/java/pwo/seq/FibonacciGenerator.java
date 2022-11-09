/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.seq;
import java.math.BigDecimal;

public class FibonacciGenerator extends Generator {
/**
* Ciąg Fibonacciego
* @see <a href="https://pl.wikipedia.org/wiki
i%C4%85g_Fibonacciego">Wikipedia</a>
 *
 * 
 * @author Maciej Rak
 */
  public FibonacciGenerator() {
    current = new BigDecimal(0);
    
    f_1 = new BigDecimal(1);
    
    f_2 = new BigDecimal(0);
  }

  @Override
  public void reset() {
    super.reset();
    current = new BigDecimal(0);
    f_1 = new BigDecimal(1);
    f_2 = new BigDecimal(0);
  }
  @Override
  public BigDecimal nextTerm() {
    if (lastIndex > 1) {
      current = f_1.add(f_2);
      f_2 = f_1;
      f_1 = current;
    } else if (lastIndex == 1) {
      current = new BigDecimal(1);
    } else {
      current = new BigDecimal(0);
    }
    lastIndex++;
    return current;
  }
}