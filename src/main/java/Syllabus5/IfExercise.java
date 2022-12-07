package Syllabus5;

import java.util.Scanner;

public class IfExercise {

    public static void main(String[] args) {

        char a='a'; char e='e'; char i='i'; char o='o'; char u='u';
        char A='A'; char E='E'; char I='I'; char O='O'; char U='U';

        char b='b';   char k='k';   char s='s';      char B='b';   char K='K';   char S='S';
        char c='c';   char l='l';   char t='t';      char C='C';   char L='L';   char T='T';
        char d='d';   char m='m';   char v='v';      char D='D';   char M='M';   char V='V';
        char f='f';   char n='n';   char w='w';      char F='F';   char N='N';   char W='W';
        char g='g';   char p='p';   char x='x';      char G='G';   char P='P';   char X='X';
        char j='j';   char q='q';   char y='y';      char J='J';   char Q='Q';   char Y='Y';
        char h='h';   char r='r';   char z='z';      char H='H';   char R='R';   char Z='Z';

        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a single character from the alphabet: ");
        char chr= scr.next().charAt(0);

        if (chr==a || chr==e || chr==i || chr==o || chr==u || chr==A || chr==E || chr==I ||chr==O || chr==U)
            System.out.println(chr+ ": is VOWEL");


        else if (chr==b || chr==c || chr==d || chr==f || chr==g || chr==j || chr==h || chr==k ||chr==l || chr==m
                || chr==n || chr==p || chr==q || chr==r || chr==s || chr==t || chr==v || chr==w ||chr==x || chr==y || chr==z
                || chr==B || chr==C || chr==D || chr==F || chr==G || chr==J || chr==H || chr==K ||chr==L || chr==M || chr==N
                || chr==P || chr==Q || chr==R || chr==S || chr==T || chr==V || chr==W ||chr==X || chr==Y || chr==Z)
            System.out.println(chr+ ": is CONSONANT");


        else
            System.out.println("ERROR!");
    }
}

