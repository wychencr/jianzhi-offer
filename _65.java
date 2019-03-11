import java.util.HashMap;

/**
 * 65 不用加减乘除做加法
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号
 *
 * 解题思路：
 * 两个数相加，不考虑进位，0加1为1，1加1为0，0加0为0，这可以等同于异或；
 * 两个数相加，考虑进位，仅当两个数都为1时，才会产生进位，这可以等同于相与，再左移一位；
 * 运用递归，可以计算出两个数的和
 */

public class _65 {
    public int Add(int num1,int num2) {
        return num2 == 0 ? num1 : Add(num1 ^ num2, (num1 & num2) << 1);
    }
}
