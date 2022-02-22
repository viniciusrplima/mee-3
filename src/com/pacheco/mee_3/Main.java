package com.pacheco.mee_3;


public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            throw new Exception("You must give a file to parse: mee2 <file>");
        }

        Parser parser = new Parser(args[0]);
        parser.parse();
    }
}
