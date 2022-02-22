package com.pacheco.mee_3;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;
import java_cup.runtime.Symbol;
import java.io.InputStream;


%%

%class Lexer
%type java_cup.runtime.Symbol
%line
%column

%{
    private ComplexSymbolFactory symbolFactory;

    public Lexer(ComplexSymbolFactory f, InputStream is) {
        this(is);
        symbolFactory = f;
    }

    public Symbol symbol(String name, int type) {
        return symbolFactory.newSymbol(name, type);
    }

    public Symbol symbol(String name, int type, Double value) {
        return symbolFactory.newSymbol(name, type, value);
    }
%}

digit   = [0-9]
number  = {digit}+(.{digit}+)?
space   = [ \t\n]

%eofval{
    return symbolFactory.newSymbol("EOF",sym.EOF);
%eofval}

%%

"+"         { return symbol("ADD", sym.ADD); }
{number}    { return symbol("NUMBER", sym.NUMBER, Double.valueOf(yytext())); }
"-"         { return symbol("MINUS", sym.MINUS); }
"*"         { return symbol("MULT", sym.MULT); }
"/"         { return symbol("DIV", sym.DIV); }
"**"        { return symbol("POW", sym.POW); }
"("         { return symbol("O_BRACKET", sym.O_BRACKET); }
")"         { return symbol("C_BRACKET", sym.C_BRACKET); }
{space}     {}
.           { System.out.println(String.format("error: unexpected char |%s|\n", yytext())); }

