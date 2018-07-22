class GFG
{
    public static void main (String[] args)
    {
 
        // creating two threads
        ThreadJoining t1 = new ThreadJoining();
        ThreadJoining t2 = new ThreadJoining();
        ThreadJoining t3 = new ThreadJoining();
 
        // thread t1 starts
        t1.start();
 
        // This suspends the current (main) thread until t1 has completed.
        try
        {
            System.out.println("Current Thread: "
                  + Thread.currentThread().getName());
            t1.join();
        }
 
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                                "been caught" + ex);
        }
 
        // t2 starts
        t2.start();
 
        // Suspend main thread (preventing t3 from starting) until t2 completes
        try
        {
            System.out.println("Current Thread: "
                 + Thread.currentThread().getName());
            t2.join();
        }
 
        catch(Exception ex)
        {
            System.out.println("Exception has been" +
                                    " caught" + ex);
        }
 
        t3.start();
 
        // Suspend main thread until t3 completes
        try
        {
            System.out.println("Current Thread: "
                 + Thread.currentThread().getName());
            t3.join();
        }
 
        catch(Exception ex)
        {
            System.out.println("Exception has been" +
                                    " caught" + ex);
        }
    }
}