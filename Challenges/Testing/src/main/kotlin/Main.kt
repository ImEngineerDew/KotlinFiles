import java.util.Scanner;

fun sumAplusB (a:Int, b: Int): Int
{
    return a+b;
}

fun main(args: Array<String>)
{
    val obj_var = Scanner (System.`in`);

    print("Write your value of A: ");
    val valA = obj_var.nextInt();

    print("Write your valur of B: ");
    val valB = obj_var.nextInt();

    val answer = sumAplusB(valA,valB);

    print(answer);

}