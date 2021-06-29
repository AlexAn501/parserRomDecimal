package com.javarush.task.task37.task3714;
import org.junit.Test;
import org.junit.Assert;

public class TestSolution {
    @Test
    public void testEquals() {
        Object[][] testCases = {{"IV", 4}, {"VI", 6}, {"VIII", 8}, {"IX", 9}, {"XV", 15}, {"XL", 40},
                {"XLII", 42}, {"LX", 60}, {"LXXX", 80}, {"LXXXIII", 83}, {"XCIV", 94}, {"XC", 90},
                {"CL", 150}, {"CCLXXXIII", 283}, {"DCCC", 800}, {"MCMLXXXVIII", 1988}, {"MMDCLXXXIII", 2683},
                {"MMDDCCLLXXVVII", 3332}, {"MMMD", 3500}};
        for (Object[] tc : testCases) Assert.assertEquals(Solution.romanToInteger((String) tc[0]), (int) tc[1]);
    }
}
//Для записи чисел в римской системе используются два правила:
//
//1) каждый меньший знак, поставленный слева от большего, вычитается из него;
//
//2) каждый меньший знак, поставленный справа от большего, прибавляется к нему.

//3 если знаки равны они складываются.

// написать значимость символов

//I — означает «один» (1);
//
//V — означает «пять» (5);
//
//X — означает «десять» (10);
//
//L — означает «пятьдесят» (50);
//
//C — означает «сто» (100);
//
//D — означает «пятьсот» (500);
//
//M — означает «тысяча» (1000);