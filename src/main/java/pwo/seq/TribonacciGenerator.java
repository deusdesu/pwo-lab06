/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.seq;
import java.math.BigDecimal;
/**
 *
 * @author Maciej Rak
 */
public class TribonacciGenerator extends FibonacciGenerator {
/**
 * Ciąg Tribonacciego
 * @see <a href="https://pl.wikipedia.org/
ki/Ci%C4%85g_Fibonacciego#Ci%C4%85g_%E2%80%9
ribonacciego%E2%80%9D">Wikipedia</a>
 */
  public TribonacciGenerator() {
    f_3 = new BigDecimal(0);
  }

  @Override
  public void reset() {
    super.reset();
    f_3 = new BigDecimal(0);
  }

  @Override
  public BigDecimal nextTerm() {
    if (lastIndex > 2) {
      current = f_1.add(f_2).add(f_3);
      f_3 = f_2;
      f_2 = f_1;
      f_1 = current;
    } else if (lastIndex == 2) {
      current = new BigDecimal(1);
    } else {
      current = new BigDecimal(0);
    }
    lastIndex++;
    return current;
  }

}