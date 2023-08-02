package org.example.Admin;

public class prompts implements Prompts{

  public prompts(){}

    @Override
    public void welcome() {
        System.out.println("                                                     \n" +
                " .--.      .                              .    .     \n" +
                ":    :    _|_                             |    |     \n" +
                "|    |.  . |  .-. .--.  .  .    ._.-. .--.| .-.| .--.\n" +
                ":    ;|  | | (.-' |      \\  \\  / (   )|   |(   | `--.\n" +
                " `--' `--`-`-'`--''       `' `'   `-' '   `-`-'`-`--'");
    }
}
