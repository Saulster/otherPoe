
package poe;
/* 
This program, when run, displays a login screen with the ability to login a user or register a new user

*/
public class POE
{

    public static void main(String[] args)
    {
// APPLYING BEST PRACTICE - OUR STATIC MAIN METHOD ONLY 
// CALLS A WORKER CLASS TO IMPLEMENT THE PROGRAM LOGIC
     worker work = new worker();//this calls the follwing methods from the main class
      work.mainThread();//this is the class called from the main class
    }
    
}
