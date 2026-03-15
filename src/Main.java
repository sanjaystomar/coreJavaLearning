//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        if (args.length != 0) {
            for(String str: args) {
                System.out.println("Happy New Year 2026 @" + str);
            }
        } else {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
            System.out.printf("Hello and welcome!");

            for (int i = 1; i <= 5; i++) {
                //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
                // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
                System.out.println("i = " + i);
                sum(i, 1);
            }
        }
    }

    private static int sum(int a, int b) {
        int c = a + b;
        ab(a);
        return c;
    }

    private static void ab(int a) {
        System.out.println(a);
    }
}