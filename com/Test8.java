package com;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Test8 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<Date> list = new ArrayList<Date>();
        for(int i=1;i<=3;i++){
            System.out.println("请输入第"+i+"个日期:");
            String line = scanner.nextLine();
            Date date = sdf.parse(line);
            list.add(date);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }


}
