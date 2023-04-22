class draft {  
    // заполнение массива
    public static void main(String[] args) { 
        int a = 100;
        int k = 0;
        for (int j = 1; j < a; j++) {
            k = 0;
            for (int i = 1; i < j+1; i++) {
                if (j % i == 0) {
                    k++;
                }
            }
            if (k == 2) {
                System.out.println(j);
            }
        }
    }

}
