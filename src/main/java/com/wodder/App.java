package com.wodder;

import com.wodder.jeep.Jeep;
import com.wodder.jeep.JeepTypes;
import com.wodder.jeep.RealJeepStore;

import java.util.Scanner;
import java.util.function.Consumer;

public class App {
    private static final Scanner s = new Scanner(System.in);
    private static final RealJeepStore jeepStore = new RealJeepStore();
    private static Jeep jeep;

    public static void main(String[] args) {
        printWelcome();
        while (true) {
            chooseJeep();
            printJeep();
            buyAnother();
        }
    }

    private static void printWelcome() {
        System.out.println("=======================================");
        System.out.println("==         A Real Jeep Store         ==");
        System.out.println("=======================================");
        System.out.println();
        System.out.println("Leave any time by typing exit");
        System.out.println();
    }

    private static void chooseJeep() {
        System.out.println("What kind of Jeep would you like?");
        printJeepChoices();
        getChoice(jeepChoice);
    }

    private static void printJeep() {
        System.out.println("That's a great looking jeep!");
        System.out.println();
        System.out.println(jeep.description());
    }

    private static void buyAnother() {
        System.out.println();
        if (noMore("Do you want another jeep? (y/n)")) {
            exitApp();
        }
    }

    private static void printJeepChoices() {
        System.out.println();
        System.out.println("1) Stock");
        System.out.println("2) Mid-range");
        System.out.println("3) Premium");
    }

    private static final Consumer<String> jeepChoice =
            s -> {
                int i = Integer.parseInt(s);
                switch (i) {
                    case 1:
                        jeep = jeepStore.buildJeep(JeepTypes.STOCK);
                        break;
                    case 2:
                        jeep =jeepStore.buildJeep(JeepTypes.MID_RANGE);
                        break;
                    case 3:
                        jeep = jeepStore.buildJeep(JeepTypes.PREMIUM);
                        break;
                    default:
                        throw new IllegalArgumentException(String.format("No jeep type for choice %d", i));
                }
            };

    private static void getChoice(Consumer<String> choiceConsumer) {
        while (true) {
            try {
                choiceConsumer.accept(getInput());
                break;
            } catch (NumberFormatException pe) {
                System.out.println("Please enter a number");
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
    }

    private static boolean noMore(String out) {
        System.out.println(out);
        while (true) {
            try {
                return no();
            } catch (IllegalArgumentException iea) {
                System.out.println(iea.getMessage());
            }
        }
    }

    private static boolean no() {
        return !yesNo(getInput());
    }

    private static boolean yesNo(String in) {
        if ("y".equalsIgnoreCase(in)) {
            return true;
        } else if ("n".equalsIgnoreCase(in)) {
            return false;
        } else {
            throw new IllegalArgumentException("Please enter 'y' or 'n'");
        }
    }

    private static String getInput() {
        System.out.print("> ");
        String in = s.next();
        if (in.equalsIgnoreCase("exit")) {
            exitApp();
        }
        return in;
    }

    private static void exitApp() {
        if (jeep == null) {
            System.out.println("You should have picked a Jeep!");
        } else {
            System.out.println("Goodbye... enjoy your new ride!");
        }
        System.exit(0);
    }
}
