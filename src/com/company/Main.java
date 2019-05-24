package com.company;

import java.awt.image.ReplicateScaleFilter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a character:");
        char character = (char) System.in.read();
        character = ReplaceThatShit(character);
        System.out.println("Now it's:" + character);
    }





    private static char ReplaceThatShit(char character){

        switch(character){
            case 'a':
                character = 'z';
                break;
            case 'b':
                character = 'y';
                break;
            case 'c':
                character = 'x';
                break;
            case 'd':
                character = 'w';
                break;
            case 'e':
                character = 'v';
                break;
            case 'f':
                character = 'u';
                break;
            case 'g':
                character = 't';
                break;
            case 'h':
                character = 's';
                break;
            case 'i':
                character = 'r';
                break;
            case 'j':
                character = 'q';
                break;
            case 'k':
                character = 'p';
                break;
            case 'l':
                character = 'o';
                break;
            case 'm':
                character = 'n';
                break;
            case 'n':
                character = 'm';
                break;
            case 'o':
                character = 'l';
                break;
            case 'p':
                character = 'k';
                break;
            case 'q':
                character = 'j';
                break;
            case 'r':
                character = 'i';
                break;
            case 's':
                character = 'h';
                break;
            case 't':
                character = 'g';
                break;
            case 'u':
                character = 'f';
                break;
            case 'v':
                character = 'e';
                break;
            case 'w':
                character = 'd';
                break;
            case 'x':
                character = 'c';
                break;
            case 'y':
                character = 'b';
                break;
            case 'z':
                character = 'a';
                break;
            default:
                break;
        }

        return(character);
    }
}
