package org.example.Admin;

public class prompt implements Prompts{

  public prompt(){}

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
