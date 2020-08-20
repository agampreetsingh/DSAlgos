package codeArena;

import java.util.*;
class firstFight {
    public static void main(String args[] ) throws Exception {
        /*Scanner scn=new Scanner(System.in);
        int test=scn.nextInt();
        for(int t=0;t<test;t++){
            int a0=scn.nextInt();
            int a1=scn.nextInt();
            int n=scn.nextInt();
            int[] a=new int[n];
            a[0]=a0;
            a[1]=a1;
            int mod=scn.nextInt();
            for(int i=2;i<a.length;i++){
                a[i]=(a[i-1]+a[i-2])%mod;
            }
            
            System.out.println(maxForce(a));
        }
*/    
    	System.out.println(getChar('z',2));
    	}

    public static char getChar(char ch, int n) {
		char rv;
		int x=ch;
		if(x+n>122) {
			rv=(char) ((((x+n)-122)%25)+97);
		}
		else
			rv=(char) (x+n);
		
		return rv;
	}
    public static long maxForce(int[] a){
        Map<Integer,Integer> map=new HashMap<>();
        long force=0;
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i]))
                map.put(a[i],map.get(a[i])+1);
            else
                map.put(a[i],1);
            }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            force+=Math.pow((int)pair.getValue(), 2);
            it.remove(); 
        }
        return force;
        }
       
    
}
