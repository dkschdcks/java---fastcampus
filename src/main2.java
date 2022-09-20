public class main2 {

    public static void main(String[] args) {

        int i = 10;
        float f = 12.34f;
        double d = 56.78;
        char c = 'a';
        String s = "Hello World";
        boolean b = true;

/*		printf 출력이유
		month: 1~12
		day : 1~30
		int month = 1;
		int day = 1;
		System.out.printf("month = , args)*/

        System.out.printf("%d\n", i);
        System.out.printf("%10d\n", i);
        System.out.printf("%-10d\n", i);
        System.out.printf("%010d\n", i);
        System.out.printf("%o\n", i);
        System.out.printf("%x\n", i);
        System.out.printf("%X\n", i);
        System.out.printf("%n");
        System.out.println();

        System.out.printf("%f\n", f);
        System.out.printf("%.2f\n", f);
        System.out.printf("%.8f\n", f);
        System.out.printf("%5.2f\n", f);
        System.out.printf("%5.2f\n", f);
        System.out.printf("%e\n", f);
        System.out.printf("%E\n", f);
        System.out.printf("%30.3e\n",f);
        System.out.printf("%30.3E\n",f);
        System.out.println();

        System.out.printf("%c\n",c);
        System.out.printf("%C\n",c);
        System.out.printf("%30c\n",c);
        System.out.printf("%30C\n",c);
        System.out.println();


        System.out.printf("%s\n",s);
        System.out.printf("%S\n",s);
        System.out.printf("%30s\n",s);
        System.out.printf("%30S\n",s);
        System.out.println();

        System.out.printf("%b\n",b);
        System.out.printf("%B\n",b);
        System.out.printf("%30b\n",b);
        System.out.printf("%30B\n",b);
        System.out.println();

        System.out.printf("%d\n", 12345);
        System.out.printf("%f\n", 12.34);
        System.out.printf("%c\n", 'a');
        System.out.printf("%s\n", "a");
        System.out.printf("%b\n", true);
        System.out.println();

        System.out.printf("%c", i);
        System.out.printf("%d", b);

        System.out.printf("%a", i);
        System.out.printf("%k", i);
        System.out.printf("%q", i);


    }

}

