package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String reversed = "";
        while (number > 0){
           reversed += number % 10;
           number = number / 10;
        }
        System.out.println(reversed);
    }
}
