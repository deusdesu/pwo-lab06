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
public class LucasGenerator extends FibonacciGenerator {
/**    
* Ciąg Lucasa
* @see <a href="https://en.wikipedia.org/wiki
ucas_number">Wikipedia</a>
 */
  public LucasGenerator() {
    current = new BigDecimal(2);
    f_2 = new BigDecimal(2);
  }
  @Override
  public void reset() {
    super.reset();
    current = new BigDecimal(2);
    f_2 = new BigDecimal(2);
  }
  @Override
  public BigDecimal nextTerm() {
    if (lastIndex == 0) {
      lastIndex++;
      return new BigDecimal(2);
    }
    return super.nextTerm();
  }
}