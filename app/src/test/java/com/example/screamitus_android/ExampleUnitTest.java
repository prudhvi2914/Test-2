package com.example.screamitus_android;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
 //   @Test
//    public void addition_isCorrect() {
//        assertEquals(4, 2 + 2);
//    }
 int totaldays;
    int totalInfected;
    int noOfInfectedPerday;

    @Test
    public int testCase1( int day ){


        if(4 > 0){        //4>0


            totalInfected = 4 * 5;
            assertEquals(20,totalInfected);

            return 1;
        }else if (4 <= 0) {

            return -1;

        }


return totalInfected;

        }

    }


}