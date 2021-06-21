public class MyThread implements Runnable {
    private int sec;

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    private int min;


    @Override
    public void run() {
        try {
            while (min >= 0) {
                Thread.sleep(1000);
                System.out.println("Min " + min + ", Sec " + sec);
                sec -= 1;
                if (sec == 0) {
                    min -= 1;
                    sec = 59;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
