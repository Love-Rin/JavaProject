package com.java.test;

public class PrimeNumber {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
        int count = 0;// ��¼��������
        label:
        for (int i = 2; i <= 200000; i++) {
            int k = (int) Math.sqrt(i);
            for (int j = 2; j <= k; j++) {
                if (i % j == 0) {
                    continue label;
                }
            }
            count = count+i;
        }
        long stop = System.currentTimeMillis();
        System.out.println("��ʱ = " + (stop - start));
        System.out.println("�������ܺ� = " + count);

	}

}
