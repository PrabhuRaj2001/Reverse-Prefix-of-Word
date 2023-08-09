package sample;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class lettcode {

    public static void main(String[] args) {
    	
    	
    		String a ="abcd";
    		char c='z';
    		int pos=0;
    		
    		for(int i=0;i<a.length();i++)
    		{
    			if(a.charAt(i)==c)
    			{
    				pos=i;
    				break;
    			}
    		}
    		
    		char chars[]=a.toCharArray();
    		String finals="";
    		int k=0;
    		for(int i=pos;i>=0;i--)
    		{
    			chars[k++]=a.charAt(i);
    			
    		}
    		
    		for(int i=0;i<a.length();i++)
    		{
    			finals=finals+chars[i];
    		}
    		
    		System.out.println(finals);
    	
    }

	
}
