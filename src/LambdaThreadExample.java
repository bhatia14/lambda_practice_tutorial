class LambdaThreadExample{
    public static void main(String ar[]) {
        Runnable runnable = ()->{
            for(int i=0;i<10;i++)
                System.out.println("child thread");

        };
        Thread th = new Thread(runnable);
        th.start();
        for(int i=0;i<10;i++)
            System.out.println("parent thread");
    }
}