package com.jamascript.lexer;

public class PrintlnToken implements Token 
{
    public boolean equals(final Object other) {
        return other instanceof PrintlnToken;
    }

    public int hashCode() {
        return 24;
    }

    public String toString() {
        return "println";
    }
    
}
