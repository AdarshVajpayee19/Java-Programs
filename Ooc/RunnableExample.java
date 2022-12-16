class RunnableExample implements Runnable{​

    public void run(){​
 
       System.out.println("Thread is running for Runnable Implementation");​
 
    }​
 
    public static void main(String args[]){​
 
       RunnableExample runnable=new RunnableExample();​
 
       Thread t1 = new Thread(runnable);​
 
       t1.start();​
 
    }​
 
 }​
