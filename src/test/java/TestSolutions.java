import org.example.Solution;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolutions {
    @Test
    void testRange1(){
        int[] nums = {0,1,3,4,1,2,2,5,3};
        int[] exx = {5,6};
        int[] actual = Solution.searchRange(nums, 2);
        //System.out.println();
        assertArrayEquals(exx, actual);
    }

    @Test
    void testRange2(){
        int[] nums = {0,1,3,4,1,2,2,5,3};
        int[] exx = {0,0};
        int[] actual = Solution.searchRange(nums, 0);
        assertArrayEquals(exx, actual);
    }

    @Test
    void testRange3(){
        int[] nums = {0,1,1,4,1,2,2,5,3};
        int[] exx = {-1,-1};
        int[] actual = Solution.searchRange(nums, 9);
        assertArrayEquals(exx, actual);
    }

    @Test
    void testRange4(){
        int[] nums = {0,1,1,4,1,2,2,5,3};
        int[] exx = {1,4};
        int[] actual = Solution.searchRange(nums, 1);
        assertArrayEquals(exx, actual);
    }

    @Test
    void testRange5(){
        int[] nums = {1,1,1,1,1,2,2,5,0};
        int[] exx = {0,4};
        int[] actual = Solution.searchRange(nums, 1);
        assertArrayEquals(exx, actual);
    }


    @Test
    void testSum1(){
        int[] nums = {1,3,4,5,6};
        int[] exx = {0,1};
        int[] actual = Solution.twoSum(nums,4);
        assertArrayEquals(exx, actual);
    }

    @Test
    void testSum2(){
        int[] nums = {-1,3,4,5,6};
        int[] exx = {0,1};
        int[] actual = Solution.twoSum(nums,2);
        assertArrayEquals(exx, actual);
    }

    @Test
    void testSum3(){
        int[] nums = {0,2,4,-1,6};
        int[] exx = {0,3};
        int[] actual = Solution.twoSum(nums,-1);
        assertArrayEquals(exx, actual);
    }

    @Test
    void testSum4(){
        int[] nums = {0,2,99,1,6};
        int[] exx = {2,3};
        int[] actual = Solution.twoSum(nums,100);
        assertArrayEquals(exx, actual);
    }

    @Test
    void testSum5(){
        int[] nums = {0,2,7,1,6};
        int[] exx = {-1,-1};
        int[] actual = Solution.twoSum(nums,15);
        assertArrayEquals(exx, actual);
    }

    @Test
    void testLen1(){
        assertEquals(3, Solution.maxLen("pwwkew"));
    }
    @Test
    void testLen2(){
        assertEquals(1, Solution.maxLen("bbbbb"));
    }
    @Test
    void testLen3(){
        assertEquals(3, Solution.maxLen("kekw"));
    }
    @Test
    void testLen4(){
        assertEquals(3, Solution.maxLen("kegggkw"));
    }
    @Test
    void testLen5(){
        assertEquals(9, Solution.maxLen("lopniMoyPupochek"));
    }



}
