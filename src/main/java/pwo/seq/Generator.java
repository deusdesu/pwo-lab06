/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.seq;

import pwo.utils.SequenceGenerator;
import java.math.BigDecimal;
/**
 *
 * @author Maciej Rak
 */
abstract class Generator implements SequenceGenerator {
    /**
     * index ostatniego wyrazu ciągu
     */
  protected int lastIndex = 0;
 
    /**
    * aktualna liczba w ciągu
    */
   protected BigDecimal current = null;
     /**
     * pierwszy wyraz ciągu
     */
     protected BigDecimal f_1 = null;
    /**
     * drugi wyraz ciągu
    */
     protected BigDecimal f_2 = null;
    /**
     * trzeci wyraz ciągu, wykorzystywany w TribonacciGenerator
    */
     protected BigDecimal f_3 = null;
  @Override
  public void reset() {
    lastIndex = 0;
  }
  @Override
  public final BigDecimal getTerm(int i) {
    if (i < 0) throw new IllegalArgumentException();
    if (i < lastIndex) reset();
    while (lastIndex <= i) nextTerm();
    return current;
  }
}